grammar C;

SCOMMENT: '//'.*?[\n] -> skip;
MCOMMENT: '/*'.+?'*/' -> skip;

program: main;

main: VOID MAIN LP RP LCB statement* RCB;

statement: declaration SEMI | assignment SEMI | expression SEMI | print SEMI | ifelse;

declaration: TYPE ID;

assignment:   ID ASSIGN expression;

expression:   expression op=(MUL | DIV) expression  #mulDivExp
            | expression op=(ADD | SUB) expression  #addSubExp
            | VALUE                                 #valueExp
            | ID                                    #idExp
            | LP expression RP                     #parenExp;

print: PRINT LP expression RP;

ifelse: ifblock elseifblock* elseblock?;

ifblock:      IF LP condition RP statement?            #ifNoBraces 
            | IF LP condition RP LCB statement* RCB   #ifBraces;

elseblock:  ELSE statement?             #elseNoBraces
            | ELSE LCB statement* RCB   #elseBraces;

elseifblock:      ELSE IF LP condition RP statement?          #elseifNoBraces
                | ELSE IF LP condition RP LCB statement* RCB  #elseifBraces;

condition:    condition lo condition    #condCond
            | LP condition RP           #parenCond
            | expression lo expression  #expCond
            | TRUE                      #trueCond
            | FALSE                     #falseCond;

lo: GREATHER | LESSER | EQUALS | GREATEQUAL | LESSEQUAL |  AND | OR;

VOID:   'void';
MAIN:   'main';
PRINT:  'printf';

IF:     'if';
ELSE:   'else';

GREATHER:   '>';
LESSER:     '<';
EQUALS:     '==';
GREATEQUAL: '>=';
LESSEQUAL:  '<=';
AND:        '&&';
OR:         '||';

LP:     '(';
RP:     ')';
LCB:    '{';
RCB:    '}';
SEMI:   ';';
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
TYPE:   'int';
ASSIGN: '=';
FALSE:  'false' | '0';
VALUE:  '-'?[0-9]+;
TRUE:   'true' | '1';
ID:     [a-zA-Z]+[a-zA-Z0-9]*;

BLANKS: [ \t\r\n]+ -> skip;