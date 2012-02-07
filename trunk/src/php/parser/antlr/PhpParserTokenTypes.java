// $ANTLR 2.7.7 (2006-11-01): "php.g" -> "PhpParser.java"$

package php.parser.antlr;

import php.parser.antlr.ParsingState;

public interface PhpParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int LITERAL_abstract = 4;
	int LITERAL_while = 5;
	int LITERAL_do = 6;
	int LITERAL_for = 7;
	int LITERAL_function = 8;
	int LITERAL_switch = 9;
	int LITERAL_case = 10;
	int LITERAL_default = 11;
	int LITERAL_if = 12;
	int LITERAL_else = 13;
	int LITERAL_elseif = 14;
	int LITERAL_foreach = 15;
	int LITERAL_goto = 16;
	int LITERAL_throw = 17;
	int LITERAL_return = 18;
	int LITERAL_try = 19;
	int LITERAL_catch = 20;
	int LITERAL_break = 21;
	int LITERAL_continue = 22;
	int LITERAL_finally = 23;
	int LITERAL_print = 24;
	int LITERAL_new = 25;
	int LITERAL_clone = 26;
	int LITERAL_void = 27;
	int LITERAL_class = 28;
	int LITERAL_public = 29;
	int LITERAL_use = 30;
	int LITERAL_namespace = 31;
	int LITERAL_protected = 32;
	int LITERAL_private = 33;
	int LITERAL_final = 34;
	int LITERAL_const = 35;
	int LITERAL_static = 36;
	int LITERAL_interface = 37;
	int LITERAL_implements = 38;
	int LITERAL_extends = 39;
	int LITERAL_require = 40;
	int LITERAL_require_once = 41;
	int LITERAL_include = 42;
	int LITERAL_include_once = 43;
	int LITERAL_define = 44;
	int LITERAL_echo = 45;
	int LITERAL_die = 46;
	int LITERAL_exit = 47;
	int LITERAL_endwhile = 48;
	int LITERAL_endif = 49;
	int LITERAL_endfor = 50;
	int LITERAL_endforeach = 51;
	int LITERAL_endswitch = 52;
	int LITERAL_and = 53;
	int LITERAL_or = 54;
	int LITERAL_xor = 55;
	int LITERAL_as = 56;
	int LITERAL_instanceof = 57;
	int LITERAL_var = 58;
	int LITERAL_declare = 59;
	int LITERAL_self = 60;
	int LITERAL_parent = 61;
	int LITERAL_global = 62;
	int LITERAL_list = 63;
	int DOG = 64;
	int IDENTICAL = 65;
	int EQUAL = 66;
	int LESS = 67;
	int GREATER = 68;
	int LE = 69;
	int GE = 70;
	int NONIDENT = 71;
	int NE = 72;
	int PLUS_ASS = 73;
	int MINUS_ASS = 74;
	int MULT_ASS = 75;
	int AND_ASS = 76;
	int OR_ASS = 77;
	int XOR_ASS = 78;
	int DIV_ASS = 79;
	int SHL_ASS = 80;
	int SHR_ASS = 81;
	int DOT_ASS = 82;
	int MOD_ASS = 83;
	int PLUS = 84;
	int MINUS = 85;
	int ASTERISK = 86;
	int SLASH = 87;
	int MOD = 88;
	int LAND = 89;
	int BAND = 90;
	int INC = 91;
	int DEC = 92;
	int DOT = 93;
	int MMBR = 94;
	int DOUBLECOLON = 95;
	int SHL = 96;
	int SHR = 97;
	int ASSIGN = 98;
	int LOR = 99;
	int BOR = 100;
	int BXOR = 101;
	int BW_NOT = 102;
	int QUESTION = 103;
	int LPAREN = 104;
	int RPAREN = 105;
	int LCURLY = 106;
	int RCURLY = 107;
	int LBRACK = 108;
	int RBRACK = 109;
	int COMMA = 110;
	int SEMI = 111;
	int COLON = 112;
	int ASSOCIATE = 113;
	int LNOT = 114;
	int LETTER = 115;
	int DIGIT = 116;
	int DIGIT_NOZERO = 117;
	int ESCAPE = 118;
	int BUCK = 119;
	int IDENT = 120;
	int VARIABLE = 121;
	int VAR_START = 122;
	int COMPOUND_VAR_START = 123;
	int HEREDOC = 124;
	int DOUBLE_SLASH = 125;
	int SHARP = 126;
	int SL_COMMENT = 127;
	int SL_SHARP_COMMENT = 128;
	int ML_COMMENT = 129;
	int NEWLINE = 130;
	int SPACE = 131;
	int TAB = 132;
	int BSLASH = 133;
	int STRING = 134;
	int PHP_START = 135;
	int PHP_END = 136;
	int EXPONENT = 137;
	int NUMBER = 138;
	int PARAMETERS = 139;
	int PARAMETER_DEF = 140;
	int ELIST = 141;
	int EXPR = 142;
	int FUNCTION_DEF = 143;
	int FUNCTION_BODY = 144;
	int FOR_INIT = 145;
	int FOR_CONDITION = 146;
	int FOR_ITERATOR = 147;
	int COLON_SLIST = 148;
	int LABEL = 149;
	int TYPE_CAST = 150;
	int CLASS_BODY = 151;
	int MODIFIERS = 152;
	int MEMBER_DEF = 153;
	int FUNC_CALL = 154;
	int TYPE = 155;
	int VARIABLE_DEF = 156;
	int CASE_GROUP = 157;
	int SLIST = 158;
	int POST_INC = 159;
	int POST_DEC = 160;
	int ARRAY_DECLARATOR = 161;
	int ARRAY_INIT = 162;
	int ARRAY_ELEM = 163;
	int ARRAY_INDEX = 164;
	int UNARY_PLUS = 165;
	int UNARY_MINUS = 166;
	int REFERENCE = 167;
	int IDENTIFIER = 168;
	int INDEX_OP = 169;
	int CHAR_ACCESS = 170;
	int INDIRECT_VAR_ID = 171;
	int CONST_ID = 172;
	int VAR_ID = 173;
	int BAND_ASS = 174;
	int BOR_ASS = 175;
	int BNOT = 176;
	int LITERAL_true = 177;
	int LITERAL_false = 178;
	int LITERAL_null = 179;
	int LITERAL_array = 180;
	int LITERAL_int = 181;
	int LITERAL_float = 182;
	int LITERAL_double = 183;
	int LITERAL_object = 184;
	int LITERAL_string = 185;
	int LITERAL_bool = 186;
	int LITERAL_boolean = 187;
	int LITERAL_resource = 188;
}
