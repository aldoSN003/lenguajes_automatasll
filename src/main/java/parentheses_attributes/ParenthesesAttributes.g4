grammar ParenthesesAttributes;



s returns [int c]
@init {$c=0;}
:
(OPEN{$c++;} | CLOSE {$c--;})+
EOF
{
if($c==0){
    System.out.println("Correcto");
} else{System.out.println("Incorrecto");}
}
;

OPEN:'(';
CLOSE:')';