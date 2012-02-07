/*
 * $Id$
 * 
 * Copyright $Date$
 * Author: Konstantin Nekrasov
 */

header {
package php.parser.antlr;
}
class PhpLexer extends Lexer;
options {
  exportVocab=Php;

  k=3;
  charVocabulary='\u0000'..'\uFFFE';
  caseSensitive = true;
  caseSensitiveLiterals = false;
}        

tokens {
    LITERAL_abstract=       "abstract"      ;
    LITERAL_while   =       "while"         ;
    LITERAL_do      =       "do"            ;
    LITERAL_for     =       "for"           ;
    LITERAL_function=       "function"      ;
    LITERAL_switch  =       "switch"        ;
    LITERAL_case    =       "case"          ;
    LITERAL_default =       "default"       ;
    LITERAL_if      =       "if"            ;
    LITERAL_else    =       "else"          ;
    LITERAL_elseif  =       "elseif"        ;
    LITERAL_foreach =       "foreach"       ;
    LITERAL_goto    =       "goto";
    LITERAL_throw   =       "throw";
    LITERAL_return  =       "return";
    LITERAL_try     =       "try";
    LITERAL_catch   =       "catch";
    LITERAL_break   =       "break";
    LITERAL_continue=       "continue";
    LITERAL_finally =       "finally";

    LITERAL_int     =       "int";    
    LITERAL_long    =       "long";
    LITERAL_double  =       "double";
    LITERAL_float   =       "float";
    LITERAL_string  =       "string";
    LITERAL_object  =       "object";
    LITERAL_bool    =       "bool";
    LITERAL_boolean =       "boolean";
    LITERAL_resource=       "resource";
    LITERAL_array   =       "array";


    LITERAL_print   =       "print";
    LITERAL_new     =       "new";
    LITERAL_clone   =       "clone";
    LITERAL_void    =       "void";
    LITERAL_class   =       "class";
    LITERAL_public  =       "public";
    LITERAL_use     =       "use";
    LITERAL_namespace
                    =       "namespace";
    LITERAL_protected
                    =       "protected";
    LITERAL_private =       "private";
    LITERAL_final   =       "final";
    LITERAL_const   =       "const";
    LITERAL_static  =       "static";
    LITERAL_interface
                    =       "interface";
    LITERAL_implements
                    =       "implements";
    LITERAL_extends =       "extends";
    LITERAL_require =       "require";
    LITERAL_require_once =  "require_once";
    LITERAL_include =       "include";
    LITERAL_include_once =       "include_once";
    LITERAL_define  =       "define";
    LITERAL_true    =       "true";
    LITERAL_false   =       "false";
    LITERAL_echo    =       "echo";
    LITERAL_die     =       "die";
    LITERAL_exit    =       "exit";
    LITERAL_endwhile=       "endwhile";
    LITERAL_endif   =       "endif";
    LITERAL_endfor  =       "endfor";
    LITERAL_endforeach =    "endforeach";
    LITERAL_endswitch  =    "endswitch";
    LITERAL_and     =       "and";
    LITERAL_or      =       "or";
    LITERAL_xor     =       "xor";
    LITERAL_as      =       "as";
    LITERAL_instanceof
                    =       "instanceof";
    LITERAL_var     =       "var";
    LITERAL_declare =       "declare";
    LITERAL_self    =       "self";
    LITERAL_parent  =       "parent";
    LITERAL_global  =       "global";
    LITERAL_list    =       "list";
}

{
  private ParsingState state;
  public void setParserState(ParsingState state) {
    this.state = state;
  }
}

DOG             :       "@";
IDENTICAL       :       {LA(3) == '='}? "===";

EQUAL           :       {LA(3) != '='}? "==";

LESS            :       "<";

GREATER         :       ">";

LE              :       {LA(2) == '='}? "<=";

GE              :       ">=";

NONIDENT        :       {LA(3) == '='}? "!==";

NE              :       "!=" | ({LA(1) == '<' && LA(2) == '>'}? "<>");

PLUS_ASS        :       "+=";

MINUS_ASS       :       "-=";

MULT_ASS        :       "*=";

AND_ASS         :       "&=";

OR_ASS          :       "|=";

XOR_ASS         :       "^=";

DIV_ASS         :       "/=";

SHL_ASS         :       {LA(2) == '='}? "<<=";

SHR_ASS         :       {LA(2) == '='}? ">>=";

DOT_ASS         :       ".=";

MOD_ASS         :       "%=";


PLUS            :       "+";

MINUS           :       "-";

ASTERISK        :       "*";

SLASH           :       "/";

MOD             :       "%";

LAND            :       "&&";

BAND            :       "&";


INC             :       "++";

DEC             :       "--";

DOT             :       ".";

MMBR            :       "->";

DOUBLECOLON     :       "::";

SHL             :       {LA(3) != '<'}? "<<";

SHR             :       ">>";

ASSIGN  :       "=";

LOR     :       "||";

BOR     :       "|";    

BXOR    :       "^";

BW_NOT  :       "~";

QUESTION:       "?";

LPAREN  :       "(";

RPAREN  :       ")";    

LCURLY  :       "{";

RCURLY  :       "}";

LBRACK  :       "[";

RBRACK  :       "]";


COMMA   :       ",";

SEMI    :       ";";

COLON   :       ":";

ASSOCIATE
        :       "=>";

LNOT    :       "!";


protected LETTER : ('A'..'Z') | ('a'..'z') | ('_') | ( '\u007f'..'\u00ff');
protected DIGIT :        '0'..'9';
protected DIGIT_NOZERO : '1'..'9';
protected ESCAPE: '\\' . ;
protected BUCK  : "$";

IDENT   options {testLiterals=false;}
  :
  (LETTER (LETTER | DIGIT)* ) 
  ;

VARIABLE: 
    (COMPOUND_VAR_START) => (COMPOUND_VAR_START {$setType(COMPOUND_VAR_START);})
  | (VAR_START IDENT)
  ;


protected VAR_START:
  (BUCK)+
  ;

protected COMPOUND_VAR_START:
  (BUCK)+ "{"
  ;

HEREDOC{
  StringBuilder quoteString = new StringBuilder();
  }:
  "<<<" {
    char c = LA(1);
    while (c == ' ' || c == '\t') {
      consume();
      c = LA(1);
    }

    while (c != '\n' && c != '\r' && c != EOF) {
      if (!Character.isLetterOrDigit(c) && c != '_') {
        throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
      }

      quoteString.append(c);
      consume();
      c = LA(1);
    }

	  if ((LA(1)=='\r') && (LA(2)=='\n')) {
      match('\r');
      match('\n');
      newline();
    }
    else if (LA(1) == '\r') {
      match('\r');
      newline();
    }
    else if (LA(1) == '\n') {
      match('\n');
      newline();
    }
    c = LA(1);
scanHeredoc:
    while (c != EOF) {
      int ndx = 0;
      c = LA(1);

      while (ndx < quoteString.length() && quoteString.charAt(ndx) == c) {
        consume();
        ndx += 1;
        c = LA(1);

        if (ndx == quoteString.length()) {
          char c2 = LA(2);
          if (!Character.isLetterOrDigit(c2) && c2 != '_') {
            break scanHeredoc; //Finish!
          }
        }
      }

      while (LA(1) != EOF) {
        if ((LA(1)=='\r') && (LA(2)=='\n')) {
          match('\r');
          match('\n');
          newline();
          break;
        }
        else if (LA(1) == '\r') {
          match('\r');
          newline();
          break;
        }
        else if (LA(1) == '\n') {
          match('\n');
          newline();
          break;
        }
        else {
          consume();
        }
      }


    }
    
    if (LA(1) == EOF) {
      throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
    }
  }
  ;
protected
  DOUBLE_SLASH: {LA(2) == '/'}? "//";

protected
  SHARP: '#';

SL_COMMENT:    
  DOUBLE_SLASH
        (
          {LA(2) != '>'}? '?'
          |  ~('?'|'\n'|'\r')
        )*
        ('\n'|'\r'('\n')?)?
        {
          if (LA(1) != '?') {
            newline();
          }
          $setType(Token.SKIP);
                 
        }
        ;


SL_SHARP_COMMENT:    
  SHARP
  (
    {LA(2) != '>'}? '?'
    |  ~('?'|'\n'|'\r')
  )*
  ('\n'|'\r'('\n')?)?
  {
    if (LA(1) != '?') {
      newline();
    }
    $setType(Token.SKIP);
           
  }
  ;
        
// multiple-line comments
ML_COMMENT
        :       "/*"
                (       /*      '\r' '\n' can be matched in one alternative or by matching
                                '\r' in one iteration and '\n' in another.  I am trying to
                                handle any flavor of newline that comes in, but the language
                                that allows both "\r\n" and "\r" and "\n" to all be valid
                                newline is ambiguous.  Consequently, the resulting grammar
                                must be ambiguous.  I'm shutting this warning off.
                         */
                        options {
                                generateAmbigWarnings=false;
                        }
                :
                        { LA(2)!='/' }? '*'
                |       '\r' '\n'               {$setType(Token.SKIP); newline();}
                |       '\r'                    {$setType(Token.SKIP); newline();}
                |       '\n'                    {$setType(Token.SKIP); newline();}
                |       ~('*'|'\n'|'\r')
                )*
                "*/"                  
                {$setType(Token.SKIP);}
        ; 


        

NEWLINE:        ('\r')? '\n' {newline(); $setType(Token.SKIP);};

SPACE   :       ' '{$setType(Token.SKIP);};

TAB     :       '\t'{$setType(Token.SKIP);}
        ;

BSLASH  :       '\\'
        ;


STRING  :
            ( 
             '\''
                (
                options {
                                generateAmbigWarnings=false;
                        }
                :

                        { LA(1) != '\''}? 
                (
                (ESCAPE) 
                |       '\r' '\n'               {newline();}
                |       '\r'                    {newline();}
                |       '\n'                    {newline();}
                |       ~('\n'|'\r')
                )
                )*
             '\''
            )            

            | 
            ( 
             '"'
                (
                options {
                                generateAmbigWarnings=false;
                        }
                :
                        { LA(1) != '"'}? 
                (
                (ESCAPE)
                |       '\r' '\n'               {newline();}
                |       '\r'                    {newline();}
                |       '\n'                    {newline();}
                |       ~('\n'|'\r')
                )
                )*
             '"'
            )            
            ;

PHP_START
        :       
                {LA(3) != '='}? "<?" ("php")?
                {$setType(Token.SKIP);}
        ; 



PHP_END
        :       "?>" 
          {
            $setType(SEMI); //I love this language...
            state.getSelector().pop();
          }
        ;

protected
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

NUMBER  :       ('0' (  /*only zero*/
                        |('x' ((DIGIT)|('A'..'F' | 'a'..'f'))+ /*hex like 0xA..*/  )
                        | (DOT (DIGIT)*  (EXPONENT)?    /*fraction with leading zero 0.124*/ )
                        | ( ('0'..'7')+                 /*octvalue 077*/  )))                    
                | (DIGIT_NOZERO (DIGIT)* (DOT (DIGIT)*)? (EXPONENT)? /*usual decimal value (integer or not)*/)
                | (DOT (DIGIT)+ (EXPONENT)? )
                ;


//=====================================================================================================



