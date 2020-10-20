
lexer grammar YsLexer;

/*
* Lexer Rules
*/

VARIABLE : '[车速]' | '[天气]' | '[时间]' | '[企业ID]' | '[用户ID]';             // 数字变量
NUMBER : [1-9][0-9]*|[0]|([0-9]+[.][0-9]+) ;     // 数字
STRING : '"' ('\\"'|.)*? '"' ; // 字符串

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
MOD : '%' ;
GREATE_THAN : '>' ;
GREATE_EQUAL_THAN : '>=' ;
LESS_THAN : '<' ;
LESS_EQUAL_THAN : '<=' ;
EQUAL : '==' ;
TRUE : 'true' ;
FALSE : 'false' ;
NOT_EQUAL : '!=' ;
LOGICAL_AND : '&&' ;
LOGICAL_OR : '||' ;
LOGICAL_NOT : '!' ;
LEFT_PAREN : '(' ;
RIGHT_PAREN : ')' ;
LEFT_CURLY : '{' ;
RIGHT_CURLY : '}' ;
CR : '\n' ;
IF : 'if' ;
ELSE : 'else' ;
ELSEIF : 'else if' ;
SEMICOLON : ';' ;
DOUBLE_QUOTATION : '"' ;
RETURN : 'return' ;

LINE_COMMENT : '//' .*? '\n' -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;