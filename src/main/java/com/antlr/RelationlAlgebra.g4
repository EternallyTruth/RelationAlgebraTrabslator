grammar RelationlAlgebra;

prog:start+
    ;
start
    : (expr ';')+                     #relationExpr
    | (initialRelation';')+           #createTable
    ;

initialRelation
    :relation '(' attrlistinitial ')'
    ;

attrlistinitial : attribute':'domain (',' attribute':'domain)*
                ;
expr: relation                                                 #formExpr
    | '(' expr ')'                                             #bracketExpr
    | expr UNION expr                                          #union
    | expr INTERSECTION expr                                   #intersection
    | expr DIFFERENCE expr                                     #difference
    | expr DIVISION expr                                       #division
    | SELECTION ('['condlist']')* '('expr')'                   #selection
    | PROJECTION '['attrlist']' '('expr')'                     #projection
    | expr CARTESIAN_PRODUCT expr                              #cartesianProduct
    | expr NATURAL_JOIN expr                                   #naturalJoin
    | expr JOIN expr '[' condlist ']'                          #join
    | RENAME '('oldname')' ('['attrlist']')* '('newname')'     #rename
    | ALIAS  '('expr')' AS newname                             #alias
    ;

//属性的数据类型(域)
domain
    : CHAR'('NUMBER')'                    #stringDomain
    | INT                                 #intDomain
    ;
//关系名字
oldname
    : (IDENTIFIER)+                       #oldnameIdentifier
    ;
newname
    : IDENTIFIER                          #newnameIdentifier
    ;
//属性列表
attrlist: attribute (',' attribute)*
        ;

//条件表达式
condlist
    : condlist OR condlist		          #orCondlist
	| condlist AND condlist		          #andCondlist
	| NOT condlist					      #notCondlist
	| '(' condlist ')'					  #bracketsCondlist
	| compared comparator compared		  #comparedCondlist
;

//比较运算符
comparator
    : EQUAL				                  #equal
	| NOT_EQUAL					          #nonEqual
	| GREATER_THAN				          #greaterThan
	| GREATER_EQUAL				          #greaterEqual
	| LESS_THAN					          #lessThan
	| LESS_EQUAL				          #lessEqual
	| MATCH                               #patternMatch
;
//比较因子,可以是数值、字符串、甚至是关系标量
compared
    : attribute		                      #attributeCompared
	| STRING		                      #stringCompared
	| NUMBER				              #numberCompared
;

//关系、属性标识符
relation
    : IDENTIFIER		                  #relationIdentifier
;

attribute
    : IDENTIFIER		                  #attributeIdentifier
;

//词法规则
// 关系运算符
PROJECTION:			'PROJECTION'   	     | 'projection' 		| 'PROJECT'			| 'project';
SELECTION:			'SELECTION'    	     | 'selection' 			| 'SELECT'			| 'select';
UNION:				'UNION'        	     | 'union'				| 'U'               | '∪';
DIFFERENCE:			'DIFFERENCE'   	     | 'difference'			| '-';
CARTESIAN_PRODUCT:	'CARTESIAN PRODUCT'  | 'cartesian product'	| 'PRODUCT'  		| 'product'		| 'X' 	| 'x';
INTERSECTION: 		'INTERSECTION' 	     | 'intersection'		| 'INTERSECT'		| 'intersect'   | 'n';
NATURAL_JOIN:		'NATURAL JOIN' 	     | 'natural join' 	    |'*';
JOIN:				'JOIN'		    	 | 'join';
DIVISION:			'DIVISION'	    	 | 'division'			| '/'               | '÷';
RENAME:             'RENAME'             | 'rename';
ALIAS:              'ALIAS'              | 'alias'              | '->';
AS:                  'AS'                | 'as'    ;
//比较运算符
EQUAL:			'=';
NOT_EQUAL: 		'!=' | '<>';
GREATER_THAN:	'>';
GREATER_EQUAL:	'>=';
LESS_THAN:		'<';
LESS_EQUAL:		'<=';
MATCH:           'LIKE' | 'like' | 'NOT LIKE' | 'not like';

//逻辑运算符
// BOOLEAN OPERATORS
AND: 	'AND' | 'and' | '&' | '^';
OR:  	'OR'  | 'or'  | '|' | 'v';
NOT:	'NOT' | 'not' | '~';

//字符串、数字以及关系和关系属性标识符
CHAR
    :'CHAR'     | 'char'
    | 'VACHAR'  | 'vachar'
    ;
INT
    : 'INT'     | 'int'
    | 'INTRGER' | 'integer'
    ;
STRING:	    '"' (.)*? '"' | '\'' (.)*? '\'' | '\'' (.)*? '\'';
IDENTIFIER: [a-zA-Z]+([0-9] | [a-zA-Z] | '_')* ('.' ([a-zA-Z]+([0-9] | [a-zA-Z] | '_')*)+ )?;//注意匹配TABLE.ATTRIBUTE
NUMBER:    	[0-9]+;
WS:         [ \t\r\n]+ -> skip;

//注释
COMMENT:   		'/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:   '//' ~[\r\n]* -> channel(HIDDEN);

