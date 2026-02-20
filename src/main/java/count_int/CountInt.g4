grammar CountInt;

//s: (INT COMMA)* INT SEMICOLON EOF #MRULE;
//INT:[0-9]+;
//COMMA:',';
//SEMICOLON:';';



s returns [int sum]
@init { $sum = 0; }
:
  (n0=INT { $sum += Integer.parseInt($n0.text); } COMMA)*
  n1=INT { $sum += Integer.parseInt($n1.text); }

  SEMICOLON  {System.out.println($sum);}EOF

;

INT: [0-9]+;
COMMA: ',';
SEMICOLON: ';';

