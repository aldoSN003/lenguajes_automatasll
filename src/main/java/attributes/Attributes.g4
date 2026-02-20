grammar Attributes;
s returns [int c]
@init {$c=0;}
:
let {$c++;}
(com let {$c++;})*
term EOF
{System.out.println($c);};

let:Let;
Let:[a-z];
com:',';
term:';';
