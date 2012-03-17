/*
 * $Id$
 * 
 * Author: Konstantin Nekrasov
 *
 */

header {
  package php.parser.antlr;
  import php.parser.antlr.ParsingState;
}

class PhpOutTheCodeLexer extends Lexer;
options {
  importVocab=Php;
  charVocabulary='\u0000'..'\uFFFE';
  k = 3;
}

{
  private ParsingState state;

  public void setParserState(ParsingState state) {
    this.state = state;
  }
}

PHP_ECHO: 
  "<?=" 
  {
    state.getSelector().push("codelexer");
    $setType(LITERAL_echo);
  }
  ;

START_CODE:
  {LA(3) != '='}? "<?" (('p'|'P')  ('h' | 'H') ('p' | 'P'))?

  {
    state.getSelector().push("codelexer");
    $setType(PHP_START);
  }
  ;

protected
ANY:
  {!(LA(1) == '<' && LA(2) == '?')}? (
    | '\r' '\n'   {newline();}
    | '\r'      {newline();}
    | '\n'      {newline();}
    | ( ~('\n'|'\r') )
  )
  ;

TEXT:
  ( options {greedy=false;} : (
    {!(LA(1) == '<' && LA(2) == '?')}?
    (
      '\r' '\n'   {newline();}
      | '\r'      {newline();}
      | '\n'      {newline();}
      | '<'
      | ( . )
    )
  )*
  )
  {
    if ($getText.isEmpty() && LA(1) == EOF_CHAR) {
      $setType(EOF);
    }
  }
  (START_CODE)?
  ;
