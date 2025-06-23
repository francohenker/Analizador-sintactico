import java_cup.runtime.Symbol;

%%
%class AnalizadorLexico
%unicode
%cup
%line
%column

%%
"inicio"        { return new Symbol(sym.INICIO); }
"fin"           { return new Symbol(sym.FIN); }
"entero"        { return new Symbol(sym.ENTERO); }
"si"            { return new Symbol(sym.SI); }
"sino"          { return new Symbol(sym.SINO); }
"mientras"      { return new Symbol(sym.MIENTRAS); }
"leer"          { return new Symbol(sym.LEER); }
"imprimir"      { return new Symbol(sym.IMPRIMIR); }
"intercambiar"  { return new Symbol(sym.INTERCAMBIAR); }
"=="            { return new Symbol(sym.IGUAL); }
"!="            { return new Symbol(sym.DIFERENTE); }
"<="            { return new Symbol(sym.MENORIGUAL); }
">="            { return new Symbol(sym.MAYORIGUAL); }
"="             { return new Symbol(sym.ASIG); }
"<"             { return new Symbol(sym.MENOR); }
">"             { return new Symbol(sym.MAYOR); }
"+"             { return new Symbol(sym.SUMA); }
"-"             { return new Symbol(sym.RESTA); }
"*"             { return new Symbol(sym.MULT); }
"/"             { return new Symbol(sym.DIV); }
"("             { return new Symbol(sym.PARIZQ); }
")"             { return new Symbol(sym.PARDER); }
"{"             { return new Symbol(sym.LLAVEIZQ); }
"}"             { return new Symbol(sym.LLAVEDER); }
";"             { return new Symbol(sym.PUNTOYCOMA); }
","             { return new Symbol(sym.COMA); }
[0-9]+          { return new Symbol(sym.NUMERO, Integer.parseInt(yytext())); }
[a-zA-Z][a-zA-Z0-9_]* { return new Symbol(sym.IDENT, yytext()); }
[ \t\r\n]+      { /* ignorar espacios y saltos */ }
.               { System.err.println("Caracter no reconocido: " + yytext()); }
