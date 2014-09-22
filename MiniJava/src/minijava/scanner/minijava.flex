/*
 * JFlex specification for the lexical analyzer for a simple demo language
 * Change this into the scanner for your implementation of MiniJava.
 */


package minijava.scanner;

%%

%class Scanner
%type Token

%{
    public String lexema;
%}

/*comentarios*/
    Comment = {NormalComment} | {EndOfLineComment} | {DocComment}    
    NormalComment = "/*" + [^*] ~"*/" | "/*" "*" + "/"
    EndOfLineComment = "//" + {InputCharacter}* + {LineTerminator}?
    DocComment    = "/*" "*" + [^*] ~"*/"

/*identifiers*/
    Identifier = [a-zA-Z][a-zA-Z0-9_]*

/*integer*/
    Integer = 0 | [1-9][0-9]*

/* Helper definitions */
    WhiteSpace = {LineTerminator} | [ \t\f]
    LineTerminator =  \n | \r\n
    InputCharacter = [^\r\n]

%%

/* Token definitions */

/* reserved words */
/* (reserved words take precedence over identifiers) */
    "boolean"                   {return Token.BOOLEAN; }
    "class"                     {return Token.CLASS;   }
    "extends"                   {return Token.EXTENDS; }
    "new"                       {return Token.NEW;     }
    "int"                       {return Token.INT;     } 
    "if"                        {return Token.IF;      }
    "else"                      {return Token.ELSE;    }
    "public"                    {return Token.PUBLIC;  }
    "return"                    {return Token.RETURN;  }
    "void"                      {return Token.VOID;    }
    "static"                    {return Token.STATIC;  }
    "while"                     {return Token.WHILE;   }
    "this"                      {return Token.THIS;    }
  
/*boolean literals*/
    "true"                      {return Token.TRUE;}
    "false"                     {return Token.FALSE;}

/*separators*/
    "("                         {return Token.LPAREN;   }
    ")"                         {return Token.RPAREN;   }
    "{"                         {return Token.LBRACE;   }
    "}"                         {return Token.RBRACE;   }
    "["                         {return Token.LBRACK;   }
    "]"                         {return Token.RBRACK;   }
    ";"                         {return Token.SEMICOLON;}
    ","                         {return Token.COMMA;    }
    "."                         {return Token.DOT;      }

/* operators */
    "="                         {return Token.EQ;       }
    "<"                         {return Token.LT;       }
    "!"                         {return Token.NOT;      }
    "&&"                        {return Token.AND_AND;  }
    "+"                         {return Token.PLUS;     }
    "-"                         {return Token.MINUS;    }
    "*"                         {return Token.MULT;     }

/*comments*/
    {Comment}+                  { /* ignore */ }

/*whitespace*/
    {WhiteSpace}                { /* ignore */ }

/*others*/
    "String"                    {return Token.STRING;  }
    "main"                      {return Token.MAIN;    }
    "length"                    {return Token.LENGTH;  }
    "System.out.println"        {return Token.SYSTEM_OUT_PRINTLN; }

/* identifiers */
    {Identifier}                {lexema = yytext(); return Token.IDENTIFIER; }

/*int literals*/
    {Integer}                   {lexema = yytext(); return Token.INTEGER; }


/* lexical errors (put last so other matches take precedence) */
.   {return Token.ERROR; }