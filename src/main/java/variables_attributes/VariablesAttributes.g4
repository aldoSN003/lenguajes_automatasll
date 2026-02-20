grammar VariablesAttributes;


s  :
tipo ID EQUALS valor SEMICOLON
    {   if($tipo.text.equals("int")&& $valor.text.contains(".")) {
            System.out.println("Error, type int cannot contain . ");
        }  else if($tipo.text.equals("float") && !$valor.text.contains(".")){
          System.out.println("Error, type float must contain . ");
            } else{
                System.out.println("CORRECTO");
            }

    }
EOF;

tipo: 'int' | 'float';
valor: INT|FLOAT;

SEMICOLON:';';
EQUALS:'=';
ID: [a-zA-Z] [a-zA-Z0-9]*;
TYPE:'int'|'float';
DOT:'.';
FLOAT: INT DOT INT;
INT: '-'? [0-9]+;
WS : [ /n]->skip;

