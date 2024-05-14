grammar FinalProject;

options {
	output=AST;
}

tokens {
        Class;
        MainFunction;
        NormalFunction;
        Variables;
        Statement;
        Expression;
        Forloop;
        IfStatement;
        WhileStatement;
}

@members {
String s="";
}

start: classes* ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

finally { s = s + "Exit..."+"\n"; }

classes   : (Modifier? 'class' Identifier ('extends' Identifier)? '{' variables* mainFunction? normalFunctions* '}')
            -> ^(Class Modifier? 'class' Identifier ('extends' Identifier)? '{' variables* mainFunction? normalFunctions* '}');

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

variables: type  (Identifier (',' Identifier)* ('=' expression)? ';')
            -> ^(Variables type  Identifier (',' Identifier)* ('=' expression)? ';' );

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


mainFunction: (Modifier 'static' type 'main' '(' type Identifier ')' '{' variables* statement* '}') 
            -> ^(MainFunction Modifier 'static' type 'main' '(' type Identifier ')' '{' variables* statement* '}');

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

normalFunctions: ( Modifier?  type  Identifier '(' ( type  Identifier  ( ','  type  Identifier  )* )? ')' '{'  variables* statement* 'return'  expression  ';'  '}')
            -> ^(NormalFunction Modifier?  type  Identifier '(' ( type  Identifier  ( ','  type  Identifier  )* )? ')' '{'  variables* statement* 'return'  expression  ';'  '}');

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


type:   ('int' '[' Numbers? ']' |'int' |
        'Booleanean' '[' Numbers? ']' |'Booleanean' |
        'double' '[' Numbers? ']' |'double' |
        'char' '[' Numbers? ']' |'char' |
        'String' '[' Numbers? ']' |'String' |
        'voIdentifier' |
        Identifier) ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

statement: (statement1 | statement2 | statement3 | ifStatement | whileStatement | forloop | printStatement) ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

statement1: ('{'  statement* '}') ->^(Statement '{'  statement* '}') ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

statement2: (Identifier  '='  expression  ';') -> ^(Statement Identifier  '='  expression  ';' ) ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

statement3: (Identifier  '['  expression  ']'  '='  expression  ';') -> ^(Statement Identifier  '['  expression  ']'  '='  expression  ';' ) ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

ifStatement: ('if'  '(' expression ')'  statement  'else'  statement) -> ^(IfStatement 'if'  '(' expression ')'  statement  'else'  statement) ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

whileStatement: ('while'  '(' expression ')'  statement) -> ^(WhileStatement 'while'  '(' expression ')'  statement) ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

forloop: ('for' '(' variables expression ';' expression ')' statement) -> ^(Forloop 'for' '(' variables expression ';' expression ')' statement) ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

printStatement: ('System.out.' Print '(' expression ')' ';') -> ^(Statement 'System.out.' Print '(' expression ')' ';' );

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

expression:( expression1 expression2*) -> ^(Expression expression1 expression2*) ;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

expression2: (OP expression1? 
                |'[' expression ']' 
                | '.' Identifier ('(' (expression (',' expression)*)? ')')? );

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

expression1:  ( Numbers 
                | Boolean 
                | Identifier 
                | 'this' 
                | 'new' 'int' '[' expression ']'
                |'new' Identifier '(' ')'
                | '!' expression 
                | '(' expression ')' );

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

Print : 'println'|'print' ;
Modifier: 'public' | 'private' | 'protected' ;
Boolean: 'true'| 'false';
Numbers: '0'..'9'+;
Identifier  : ('a'..'z'|'A'..'Z'|'_'|'$')('a'..'z'|'A'..'Z'|'_'|'$'|'0'..'9')* ;
OP: ('&&' | '||' | '==' | '!=' | '<' | '<=' | '>' | '>=' | '+' | '-' | '*' | '/' | '%' | '++' | '--' | '=' | '+=' | '-=' | '*=' | '/=' );
COMMENT:   ('/*' ( options {greedy=false;} : . )* '*/' {skip();} |   '//' ~('\n'|'\r')* {skip();});
WS  : (' '|'\t'|'\n'|'\r')+ {skip();} ;