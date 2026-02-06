grammar Calc;
p:exp EOF;
exp: exp op =('*'|'/') exp      #MD
     | exp op = ('+'|'-') exp   #SR
     | INT                      #NUM
     | '(' exp ')'              #PA
     ;

INT: [0-9]; // QUE ACEPTE NUMEROS NEGATIVOS/Y DE DOS DIGITOS
WS : [ /n]->skip;