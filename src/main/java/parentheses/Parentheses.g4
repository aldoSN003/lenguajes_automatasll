grammar Parentheses;

mrule:OPEN nested CLOSE EOF;
nested: (OPEN|CLOSE)* ;
OPEN:'(';
CLOSE:')';