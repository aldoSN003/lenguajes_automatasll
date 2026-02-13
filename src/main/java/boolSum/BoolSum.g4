grammar BoolSum;

p: var cond EOF;
var: 'entero' ID '=' INT;
cond: 'si' expr;
expr: ID op=('>' | '<' | '==') INT #COMP;
ID: [a-zA-Z] [a-zA-Z0-9]*;
INT: '-'? [0-9]+; // Esta expresion permite ingresar numeros enteros de cualquier longitud (inlcuyendo negativos)
WS: [ \t\r\n]+ -> skip;
/*
¿Como verificar que la variable declarada sea la misma en la comparacion?
 ejemplo:
  entero a=23 si b<10


*/