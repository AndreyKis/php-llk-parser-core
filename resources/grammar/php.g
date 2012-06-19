/*
 * $Id$
 * Author: Konstantin Nekrasov
 *
 * First lines of this appeared in November 2011
 */

header {
package php.parser.antlr;

import php.parser.antlr.ParsingState;
}

class PhpParser extends Parser;
options {
  buildAST = true;
  importVocab=Php;
  defaultErrorHandler=false; 
  k=2;
}

tokens{         
  PARAMETERS;
  PARAMETER_DEF;
  ELIST;  
  EXPR;   
  FUNCTION_DEF;
  FUNCTION_BODY;
  FOR_INIT; 
  FOR_CONDITION;
  FOR_ITERATOR;
  COLON_SLIST;
  LABEL;
  TYPE_CAST;
  CLASS_BODY;
  MODIFIERS;
  MEMBER_DEF;
  FUNC_CALL;
  TYPE;
  VARIABLE_DEF;
  CASE_GROUP;
  SLIST;
  POST_INC;
  POST_DEC;
  ARRAY_DECLARATOR;
  ARRAY_INIT;
  ARRAY_ELEM;
  ARRAY_INDEX;
  UNARY_PLUS;
  UNARY_MINUS;
  REFERENCE; 
  IDENTIFIER;
  INDEX_OP;
  CHAR_ACCESS;
  INDIRECT_VAR_ID;
  CONST_ID;
  VAR_ID;
}


{
  private ParsingState state;

  public void setParserState(ParsingState state) {
    this.state = state;
  }
  private boolean metAbstractModifier;
}

program: 
  (statement)* EOF;

declaration: 
    functionDeclaration
  | (IDENT COLON) => labelDeclaration
  | classDeclaration
  | interfaceDeclaration
  ;

statement:
    ifStatement
  | switchStatement
  | whileStatement
  | doWhileStatement
  | forStatement
  | foreachStatement
  | echoStatement
  | printStatement
  | breakStatement
  | continueStatement
  | returnStatement
  | gotoStatement
  | declareStatement
  | throwStatement
  | globalStatement
  | staticStatement
  | tryCatchStatement
  | emptyStatement
  | declaration 
  | block
  | expression[true, true] SEMI
  ;

block: 
  LCURLY^ {#LCURLY.setType(SLIST);} 
  (statement)*
  RCURLY
  ;

ifStatement:
  LITERAL_if^ LPAREN expression[true, true] RPAREN 
  (
    (COLON) => 
      (   
        colonStatementList
        (options {greedy=true;}: elseifColonStatement)*
        (options {greedy=true;}: elseColonStatement)?
         LITERAL_endif
         SEMI
     )
    |
    (
      statement
      (options {greedy=true;}: elseifStatement)*
      (options {greedy=true;}: elseStatement)?
    )
  )
  ;

elseifStatement:
  LITERAL_elseif^ LPAREN expression[true, true] RPAREN statement
  ;

elseStatement:
  LITERAL_else^ statement
  ;

elseifColonStatement:
  LITERAL_elseif^ LPAREN 
  expression[true, true] 
  RPAREN
  colonStatementList
  ;

elseColonStatement:       
  LITERAL_else^ 
  colonStatementList                
  ;

colonStatementList:
  cln : COLON^ {#cln.setType(COLON_SLIST);}
  (statement)*
  ;

switchStatement:
  LITERAL_switch^ LPAREN expression[true, true] RPAREN 
  switchBody
  ;

defineStatementExpression:
  LITERAL_define^ 
  LPAREN expression[true, false] COMMA expression[true, false] RPAREN 
  ;

globalStatement:
  LITERAL_global^
  identifier (COMMA identifier)*
  SEMI
  ;
staticStatement:
  LITERAL_static^
  staticVarDefinition (COMMA staticVarDefinition)*
  SEMI
  ;

staticVarDefinition:
  identifier (ASSIGN^ expression[true, false])?
  ;

switchBody{
    boolean defaultIsMet = false;
  }:
  LCURLY
  (
      caseOption 
    | {!defaultIsMet}? defaultOption {
        defaultIsMet = true;
      }
  )*
  RCURLY
  ;

caseOption:
  LITERAL_case^ expression[true, true] (COLON | SEMI)
  (options {greedy=true;}: {LA(1) != LITERAL_default}? statement)*
  ;

defaultOption:
  LITERAL_default^ (COLON | SEMI) ( options {greedy=true;}: statement)*
  ;

breakStatement:
  LITERAL_break^ (NUMBER)? SEMI
  ;

continueStatement:
  LITERAL_continue^ (NUMBER)? SEMI
  ;

returnStatement:
  LITERAL_return^ (expression[true, true])? SEMI
  ;

requireStatementExpression:
  (LITERAL_require^ | LITERAL_require_once^) (expression[true, true])
  ;

includeStatementExpression:
  (LITERAL_include^ | LITERAL_include_once^) (expression[true, true])
  ;

gotoStatement:
  LITERAL_goto^ IDENT SEMI
  ;

dieStatementExpression:
  LITERAL_die^ 
  (
      (LPAREN RPAREN) => (LPAREN RPAREN)
    | (expression[true, true])
    |
  )
  ;

exitStatementExpression:
  LITERAL_exit^ (LPAREN (expression[false, true])?  RPAREN)?
  ;

declareStatement:
  LITERAL_declare^ LPAREN expression[true, true] RPAREN statement
  ;


tryCatchStatement:
  LITERAL_try^ block (catchBlock)* (finallyBlock)?
  ;

        
catchBlock:
  LITERAL_catch^ LPAREN paramListElement RPAREN block
  ;

finallyBlock:
  LITERAL_finally^  block 
  ;
listStatementExpression:
  LITERAL_list^ listParameters listInitializer 
  ; 

listParameters:
  LPAREN^ (expression[true, false])? (COMMA (expression[true, false])?)* RPAREN
  ;

listInitializer:
  ASSIGN^ expression[true, false]
  ;

emptyStatement:
  SEMI
  ;

whileStatement:
  LITERAL_while^ LPAREN expression[true, true] RPAREN
  (
    statement
  ) 
  |
  (
    colonStatementList  
    LITERAL_endwhile
    SEMI
  )
  ;

doWhileStatement:
  LITERAL_do^ statement LITERAL_while LPAREN expression[true, true] RPAREN 
  ;

forStatement:
  LITERAL_for^ LPAREN 
    (expression[true, true])? SEMI 
    (expression[true, true])? SEMI 
    (expression[true, true])?
  RPAREN 
  ( 
    (COLON) => (colonStatementList LITERAL_endfor SEMI)
    | statement
  )
  ;

foreachStatement:
  LITERAL_foreach^ 
  LPAREN
  foreachCondition
  RPAREN
  ( 
    (COLON) => (colonStatementList LITERAL_endforeach SEMI)
    | statement
  )
;


foreachCondition!:
  exp: expression[true, true] 
  las: LITERAL_as 
  exp2: expression[true, true]
  (  { #foreachCondition = #(#las, #exp, #exp2 ) ;}
  |
     ( assoc: ASSOCIATE exp3: expression[true, true] { #foreachCondition = #(#las, #exp, #(#assoc, #exp2, #exp3 ) ) ;}
     )
  )
  ;
echoStatement:
  LITERAL_echo^ (
    expression[true, true]
  )
  SEMI
  ;

printStatement:
  LITERAL_print^ (
    //the same to echo statement but without comma support.
    expression[true, false]
  )
  SEMI
  ;

throwStatement:
  LITERAL_throw^ expression[true, true] SEMI
  ;

labelDeclaration:
  IDENT COLON^ { #COLON.setType(LABEL);}
;

functionDeclaration!:
  fh:functionHeader b : functionBody  
  {#functionDeclaration = #( #fh, #b); }
  ;

functionHeader:
  LITERAL_function^ 
  (BAND {#BAND.setType(REFERENCE);})? 
  fname : baseIdentifier 
  LPAREN
  (pl : paramList)? 
  RPAREN
  ;

functionBody:
  lc: LCURLY^ {lc.setType(FUNCTION_BODY) ;}
  (statement)*
  RCURLY
  ;

paramList:
  paramListElement (COMMA paramListElement)*  
  ;

paramListElement!
        :       id : functionParameter
                { #paramListElement = #( [PARAMETER_DEF, "PARAMETER_DEF"], #id ) ;}
        ;

expressionList
        :       (expression[true, false] (COMMA expression[true, false])*) 
                { #expressionList = #( #[ELIST, "ELIST"], #expressionList); }
        ;

functionParameter:
  (
      (typeName identifier) => (typeName identifier)
    | (typeName BAND identifier) => (typeName BAND {#BAND.setType(REFERENCE);} identifier)
    | (BAND identifier) => (BAND {#BAND.setType(REFERENCE);} identifier)
    | identifier
  )
  (ASSIGN^ expression[true, false])?
  ;

interfaceDeclaration:
  LITERAL_interface^ className (implementsList | extendsMultiList)* 
    interfaceBody
  ;

interfaceBody:
  LCURLY^ {#LCURLY.setType(CLASS_BODY);}
  (interfaceMemberDefinition)* 
  RCURLY
  ;

interfaceMemberDefinition:
  memberModifiers
  (
    functionHeader
  | memberDataItems
  )
  SEMI
  { #interfaceMemberDefinition = #( #[MEMBER_DEF, ""], #interfaceMemberDefinition) ;}
  ;


classDeclaration:
  classModifier LITERAL_class^ className
  (
       (extendsList (implementsList)? ) 
     | (implementsList (extendsList)? )
     |
  )

  classBody 
  ;

classModifier:
  (LITERAL_abstract | LITERAL_final)*

  { #classModifier = #( #[MODIFIERS, ""], #classModifier ) ;}
  ;

extendsList:
  LITERAL_extends^ className
  ;

extendsMultiList:
  LITERAL_extends^ className (COMMA className)*
  ;

implementsList:
  LITERAL_implements^ className (COMMA className)*
  ;

className:       
  IDENT
  ;


classBody:
  LCURLY^ {#LCURLY.setType(CLASS_BODY);}
  (memberDefinition)*
  RCURLY
  ;

memberDefinition{
    metAbstractModifier = false;
  }:
  
  memberModifiers 
  (
    (LITERAL_function) => (
      {!metAbstractModifier}?
        functionDeclaration
        | (functionHeader SEMI)
    )
    | (memberDataDefinition)
  )
  { #memberDefinition = #( #[MEMBER_DEF, ""], #memberDefinition) ;}
  ;

memberDataDefinition:
  (LITERAL_var^)?
  memberDataItems
  SEMI
  ;

memberDataItems:
  memberDataItem
  (COMMA^ memberDataItem)*
  ;
  
memberDataItem:
  identifier (ASSIGN^ expression[true, false])?
  ;
  
memberModifiers:
  (  LITERAL_abstract { metAbstractModifier = true; }
  |  LITERAL_final
  |  LITERAL_public 
  |  LITERAL_protected 
  |  LITERAL_private
  |  LITERAL_static
  |  LITERAL_const
  )*
  { #memberModifiers = #([MODIFIERS, ""], #memberModifiers);}
  ;

/*      start rule for arithmetic, logic, bitwise, conditional expressions,
        function calls, assignments and array indexing
*/
expression[boolean imagNode, boolean allowComma]:
  (
    {allowComma}?
      logicalOrExpression[allowComma] (options {greedy=true;}: COMMA^ logicalOrExpression[allowComma])*
    | logicalOrExpression[allowComma]
  )
  { 
    if(imagNode) {
      #expression = #( #[EXPR, "EXPR"], #expression);
    }
  }
  ;

logicalOrExpression[boolean allowComma]:
  logicalXorExpression[allowComma] (LITERAL_or^ logicalXorExpression[allowComma])*
  ;

logicalXorExpression[boolean allowComma]:
  logicalAndExpression[allowComma] (LITERAL_xor^ logicalAndExpression[allowComma])*
  ;

logicalAndExpression[boolean allowComma]:
  ternaryExpression[allowComma] (LITERAL_and^ ternaryExpression[allowComma])*
  ;

ternaryExpression[boolean allowComma]:
  assignmentExpression[allowComma] 
  (
    QUESTION^ 
    expression[true, allowComma] 
    COLON
    expression[true, allowComma]
  )?
  ;

assignmentExpression[boolean allowComma]:
  booleanOrExpression[allowComma] (
    (   ASSIGN^
    |   PLUS_ASS^
    |   MINUS_ASS^
    |   MULT_ASS^
    |   AND_ASS^
    |   DIV_ASS^
    |   MOD_ASS^
    |   SHR_ASS^
    |   SHL_ASS^
    |   BAND_ASS^
    |   XOR_ASS^
    |   BOR_ASS^
    |   OR_ASS^
    |   DOT_ASS^
    )
  booleanOrExpression[allowComma])*
  ;

booleanOrExpression[boolean allowComma]:
  booleanAndExpression[allowComma] (LOR^ booleanAndExpression[allowComma])*
  ;

booleanAndExpression[boolean allowComma]:
  bitwiseOrExpression[allowComma] (LAND^ bitwiseOrExpression[allowComma])*
  ;

bitwiseOrExpression[boolean allowComma]:
  bitwiseXorExpression[allowComma] (BOR^ bitwiseXorExpression[allowComma])*
  ;

bitwiseXorExpression[boolean allowComma]:
  bitwiseAndExpression[allowComma] (BXOR^ bitwiseAndExpression[allowComma])*
  ;

bitwiseAndExpression[boolean allowComma]:
  equalityExpression[allowComma] (BAND^ equalityExpression[allowComma])*
  ;

equalityExpression[boolean allowComma]:
  compareExpression[allowComma] (
    ( NE^ 
      | EQUAL^
      | IDENTICAL^ 
      | NONIDENT^ 
    ) 
    compareExpression[allowComma])*
  ;

compareExpression[boolean allowComma]:
  shiftExpression[allowComma] (
      (  LE^ 
      |  LESS^ 
      |  GE^ 
      |  GREATER^
    ) 
  shiftExpression[allowComma])*
  ;

shiftExpression[boolean allowComma]:
  sumExpression[allowComma] ((SHL^ | SHR^ ) sumExpression[allowComma])*
  ;

sumExpression[boolean allowComma]:
  multiplExpression[allowComma] ( (PLUS^ | MINUS^ | DOT^)  multiplExpression[allowComma] )*
  ;

multiplExpression[boolean allowComma]:
  instanceofExpression[allowComma] ( (ASTERISK^|SLASH^|MOD^) instanceofExpression[allowComma])* 
  ;


instanceofExpression[boolean allowComma]:
  propertyAccessExpression[allowComma] ((LITERAL_instanceof^) propertyAccessExpression[allowComma])*
  ;

propertyAccessExpression[boolean allowComma]:
  typeCastExpression[allowComma]
  (MMBR^
    typeCastExpression[allowComma]
  )*
  ;

typeCastExpression[boolean allowComma]:
  (LPAREN typeName RPAREN expression[false, false])  => 
    (LPAREN^ typeName RPAREN { #LPAREN.setType(TYPE_CAST) ;} typeCastExpression[allowComma] ) 
  | (LNOT^ typeCastExpression[allowComma])
  | (DOG^ typeCastExpression[allowComma])
  | (BW_NOT^ typeCastExpression[allowComma] )
  | (MINUS^ {#MINUS.setType(UNARY_MINUS);} typeCastExpression[allowComma]) 
  | (PLUS^ {#PLUS.setType(UNARY_PLUS);} typeCastExpression[allowComma]) 
  | incrementExpression[allowComma]
  ;

incrementExpression[boolean allowComma]:
  (INC^ | DEC^)? functionCallExpression[allowComma] (
    (
        (INC^ {#INC.setType(POST_INC);} )
      | (DEC^ {#DEC.setType(POST_DEC);} )
     
    )*
  )
  ;

functionCallExpression[boolean allowComma]:
    listStatementExpression 
  | exitStatementExpression
  | requireStatementExpression
  | dieStatementExpression
  | defineStatementExpression
  | includeStatementExpression
  | (
      arrayAccessExpression[allowComma] 
      (
        LPAREN^ {#LPAREN.setType(FUNC_CALL);} 
        (options{greedy=true;}: expressionList)? 
        RPAREN
      )*
    )
  ;

arrayAccessExpression[boolean allowComma]:
  referenceExpression[allowComma] 
  (
    (LBRACK expression[true, allowComma] RBRACK) =>
      (
        LBRACK^ {#LBRACK.setType(INDEX_OP);}
        expression[true, allowComma]
        RBRACK
      )
    | (LBRACK^ RBRACK)
    | (LCURLY^ {#LCURLY.setType(CHAR_ACCESS);} expression[true, false] RCURLY)

  )*
  ;

referenceExpression[boolean allowComma]:
  (BAND^ {#BAND.setType(REFERENCE);})? 
  newExpression[allowComma]
  ;
  
newExpression[boolean allowComma]:
    (LITERAL_clone basicExpression[allowComma]) => 
      (LITERAL_clone basicExpression[allowComma])
  | (LITERAL_new^  basicExpression[allowComma]) => 
      (LITERAL_new^  basicExpression[allowComma])
  | (basicExpression[allowComma])
  ;

basicExpression[boolean allowComma]:
    (LITERAL_true )
  | (LITERAL_false  )
  | (LITERAL_null  )
  | (NUMBER)
  | (STRING)
  | (EXEC_STRING)
  | (HEREDOC)
  | arrayDefinition
  | identifier 
  | (LPAREN expression[false, allowComma] RPAREN)
  ;

identifier!:
  id: scopeResolutionExpression
  {#identifier = #(#[IDENTIFIER, "IDENTIFIER"], #id);}
  ;

scopeResolutionExpression:
  (baseIdentifier (DOUBLECOLON^ baseIdentifier)* )
  ;

baseIdentifier:
    LITERAL_parent
  | LITERAL_self
  | LITERAL_boolean
  | LITERAL_resource
  | LITERAL_string
  | LITERAL_bool
  | LITERAL_double
  | LITERAL_final
  | LITERAL_float
  | LITERAL_int
  | LITERAL_long
  | LITERAL_function
  | LITERAL_abstract
  | LITERAL_public
  | LITERAL_private
  | LITERAL_protected
  | LITERAL_print
  | LITERAL_clone
  | LITERAL_list
  | LITERAL_use
  | LITERAL_interface
  | LITERAL_return
  | LITERAL_object
  | LITERAL_default
  | LITERAL_namespace
  | LITERAL_class
  | LITERAL_var
  | LITERAL_array
  | LITERAL_new
  | IDENT
  | VARIABLE   
  | compositeIdentifier
  ;

arrayDefinition:
  LITERAL_array^ LPAREN arrayItemList RPAREN
  ;

arrayItemList:       
  arrayItem (COMMA arrayItem)*
  ;

arrayItem!:
  (exp : expression[true, false]
     (  
        (
           assoc: ASSOCIATE exp2: expression[true, false] 
           { #arrayItem = #( #[ARRAY_ELEM, "ARRAY_ELEM"], #( #assoc, #exp, #exp2 ) );
           }
        )
     |
        { #arrayItem = #( #[ARRAY_ELEM, "ARRAY_ELEM"], #exp );
        }
     )
  )? 
  ;

compositeIdentifier:
    
  (LCURLY expression[false, true] RCURLY) => 
      (LCURLY^ {#LCURLY.setType(INDIRECT_VAR_ID);} expression[false, true] RCURLY)
    | (COMPOUND_VAR_START^ expression[false, true] RCURLY)
  ;

typeName:
    LITERAL_int 
  | LITERAL_float
  | LITERAL_double
  | LITERAL_object
  | LITERAL_string
  | LITERAL_array
  | LITERAL_bool
  | LITERAL_long
  | LITERAL_boolean
  | LITERAL_resource
  | LITERAL_self
  | typeIdentifier
  ;

typeIdentifier:
  IDENT (DOUBLECOLON^ IDENT)*
  ;
