grammar Assign;
assign : ID OP expr ';'
         | ID OP expr ';' ;
ID : [a-z]+ ;
expr : NUMBER ;
OP: '='|':=';
NUMBER : [1-9][0-9]*|[0]|([0-9]+[.][0-9]+) ;
WS : [ \t\r\n]+ -> skip ;