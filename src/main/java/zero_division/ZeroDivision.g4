grammar ZeroDivision;

s returns [float r]
@init {$r = 0.0f;} :
    d0=INT
    op=DIV
    d1=INT
    EOF
    {
        float n0 = Float.parseFloat($d0.getText());
        float n1 = Float.parseFloat($d1.getText());

        if (n1 == 0.0f) {
            System.out.println("Error: division por cero");
            $r = -1.0f;
        } else {
            $r = n0 / n1;
            System.out.println("Correcto: " + $r);
        }
    }
    ;

INT : [0-9]+;
DIV : '/';
WS  : [ \t\r\n]+ -> skip;