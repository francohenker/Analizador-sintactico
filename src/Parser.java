
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\054\000\002\002\004\000\002\002\006\000\002\002" +
    "\005\000\002\003\004\000\002\003\003\000\002\004\005" +
    "\000\002\004\007\000\002\005\005\000\002\005\003\000" +
    "\002\006\004\000\002\006\003\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\010\006\000\002\011\007" +
    "\000\002\011\011\000\002\012\007\000\002\013\007\000" +
    "\002\014\007\000\002\015\011\000\002\016\005\000\002" +
    "\016\003\000\002\017\003\000\002\017\003\000\002\020" +
    "\005\000\002\024\003\000\002\024\003\000\002\024\003" +
    "\000\002\024\003\000\002\024\003\000\002\024\003\000" +
    "\002\021\005\000\002\021\005\000\002\021\003\000\002" +
    "\022\005\000\002\022\005\000\002\022\003\000\002\023" +
    "\003\000\002\023\003\000\002\023\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\133\000\004\004\005\001\002\000\004\002\135\001" +
    "\002\000\020\006\012\007\025\011\021\012\016\013\022" +
    "\014\023\037\006\001\002\000\004\021\130\001\002\000" +
    "\024\005\ufff1\007\ufff1\010\ufff1\011\ufff1\012\ufff1\013\ufff1" +
    "\014\ufff1\033\ufff1\037\ufff1\001\002\000\022\005\ufff7\007" +
    "\ufff7\011\ufff7\012\ufff7\013\ufff7\014\ufff7\033\ufff7\037\ufff7" +
    "\001\002\000\024\005\ufff5\007\ufff5\010\ufff5\011\ufff5\012" +
    "\ufff5\013\ufff5\014\ufff5\033\ufff5\037\ufff5\001\002\000\004" +
    "\037\120\001\002\000\024\005\ufff2\007\ufff2\010\ufff2\011" +
    "\ufff2\012\ufff2\013\ufff2\014\ufff2\033\ufff2\037\ufff2\001\002" +
    "\000\024\005\ufff6\007\ufff6\010\ufff6\011\ufff6\012\ufff6\013" +
    "\ufff6\014\ufff6\033\ufff6\037\ufff6\001\002\000\024\005\ufff4" +
    "\007\ufff4\010\ufff4\011\ufff4\012\ufff4\013\ufff4\014\ufff4\033" +
    "\ufff4\037\ufff4\001\002\000\004\030\114\001\002\000\020" +
    "\006\ufffd\007\ufffd\011\ufffd\012\ufffd\013\ufffd\014\ufffd\037" +
    "\ufffd\001\002\000\020\006\012\007\025\011\021\012\016" +
    "\013\022\014\023\037\006\001\002\000\004\030\105\001" +
    "\002\000\004\030\101\001\002\000\004\030\073\001\002" +
    "\000\020\005\072\007\025\011\021\012\016\013\022\014" +
    "\023\037\006\001\002\000\004\030\027\001\002\000\024" +
    "\005\ufff3\007\ufff3\010\ufff3\011\ufff3\012\ufff3\013\ufff3\014" +
    "\ufff3\033\ufff3\037\ufff3\001\002\000\010\030\033\036\030" +
    "\037\035\001\002\000\032\015\uffd8\016\uffd8\017\uffd8\020" +
    "\uffd8\022\uffd8\023\uffd8\024\uffd8\025\uffd8\026\uffd8\027\uffd8" +
    "\031\uffd8\034\uffd8\001\002\000\022\015\066\016\070\017" +
    "\062\020\064\022\063\023\065\024\057\025\055\001\002" +
    "\000\032\015\uffd9\016\uffd9\017\uffd9\020\uffd9\022\uffd9\023" +
    "\uffd9\024\uffd9\025\uffd9\026\uffd9\027\uffd9\031\uffd9\034\uffd9" +
    "\001\002\000\010\030\033\036\030\037\035\001\002\000" +
    "\004\031\043\001\002\000\032\015\uffd7\016\uffd7\017\uffd7" +
    "\020\uffd7\022\uffd7\023\uffd7\024\uffd7\025\uffd7\026\uffd7\027" +
    "\uffd7\031\uffd7\034\uffd7\001\002\000\032\015\uffdc\016\uffdc" +
    "\017\uffdc\020\uffdc\022\uffdc\023\uffdc\024\uffdc\025\uffdc\026" +
    "\037\027\040\031\uffdc\034\uffdc\001\002\000\010\030\033" +
    "\036\030\037\035\001\002\000\010\030\033\036\030\037" +
    "\035\001\002\000\032\015\uffda\016\uffda\017\uffda\020\uffda" +
    "\022\uffda\023\uffda\024\uffda\025\uffda\026\uffda\027\uffda\031" +
    "\uffda\034\uffda\001\002\000\032\015\uffdb\016\uffdb\017\uffdb" +
    "\020\uffdb\022\uffdb\023\uffdb\024\uffdb\025\uffdb\026\uffdb\027" +
    "\uffdb\031\uffdb\034\uffdb\001\002\000\020\007\025\011\021" +
    "\012\016\013\022\014\023\032\046\037\006\001\002\000" +
    "\024\005\uffef\007\uffef\010\052\011\uffef\012\uffef\013\uffef" +
    "\014\uffef\033\uffef\037\uffef\001\002\000\024\005\uffe8\007" +
    "\uffe8\010\uffe8\011\uffe8\012\uffe8\013\uffe8\014\uffe8\033\uffe8" +
    "\037\uffe8\001\002\000\016\007\025\011\021\012\016\013" +
    "\022\014\023\037\006\001\002\000\020\007\025\011\021" +
    "\012\016\013\022\014\023\033\050\037\006\001\002\000" +
    "\024\005\uffe9\007\uffe9\010\uffe9\011\uffe9\012\uffe9\013\uffe9" +
    "\014\uffe9\033\uffe9\037\uffe9\001\002\000\022\005\ufff8\007" +
    "\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8\033\ufff8\037\ufff8" +
    "\001\002\000\020\007\025\011\021\012\016\013\022\014" +
    "\023\032\046\037\006\001\002\000\024\005\uffee\007\uffee" +
    "\010\uffee\011\uffee\012\uffee\013\uffee\014\uffee\033\uffee\037" +
    "\uffee\001\002\000\010\024\057\025\055\031\056\001\002" +
    "\000\010\030\033\036\030\037\035\001\002\000\032\015" +
    "\uffd6\016\uffd6\017\uffd6\020\uffd6\022\uffd6\023\uffd6\024\uffd6" +
    "\025\uffd6\026\uffd6\027\uffd6\031\uffd6\034\uffd6\001\002\000" +
    "\010\030\033\036\030\037\035\001\002\000\032\015\uffde" +
    "\016\uffde\017\uffde\020\uffde\022\uffde\023\uffde\024\uffde\025" +
    "\uffde\026\037\027\040\031\uffde\034\uffde\001\002\000\032" +
    "\015\uffdd\016\uffdd\017\uffdd\020\uffdd\022\uffdd\023\uffdd\024" +
    "\uffdd\025\uffdd\026\037\027\040\031\uffdd\034\uffdd\001\002" +
    "\000\010\030\uffe0\036\uffe0\037\uffe0\001\002\000\010\030" +
    "\uffe2\036\uffe2\037\uffe2\001\002\000\010\030\uffdf\036\uffdf" +
    "\037\uffdf\001\002\000\010\030\uffe1\036\uffe1\037\uffe1\001" +
    "\002\000\010\030\uffe4\036\uffe4\037\uffe4\001\002\000\010" +
    "\030\033\036\030\037\035\001\002\000\010\030\uffe3\036" +
    "\uffe3\037\uffe3\001\002\000\012\024\057\025\055\031\uffe5" +
    "\034\uffe5\001\002\000\004\002\uffff\001\002\000\004\037" +
    "\074\001\002\000\004\035\075\001\002\000\004\037\076" +
    "\001\002\000\004\031\077\001\002\000\004\034\100\001" +
    "\002\000\024\005\uffea\007\uffea\010\uffea\011\uffea\012\uffea" +
    "\013\uffea\014\uffea\033\uffea\037\uffea\001\002\000\010\030" +
    "\033\036\030\037\035\001\002\000\010\024\057\025\055" +
    "\031\103\001\002\000\004\034\104\001\002\000\024\005" +
    "\uffeb\007\uffeb\010\uffeb\011\uffeb\012\uffeb\013\uffeb\014\uffeb" +
    "\033\uffeb\037\uffeb\001\002\000\010\030\033\036\030\037" +
    "\035\001\002\000\004\031\107\001\002\000\020\007\025" +
    "\011\021\012\016\013\022\014\023\032\046\037\006\001" +
    "\002\000\024\005\uffed\007\uffed\010\uffed\011\uffed\012\uffed" +
    "\013\uffed\014\uffed\033\uffed\037\uffed\001\002\000\020\006" +
    "\ufffe\007\ufffe\011\ufffe\012\ufffe\013\ufffe\014\ufffe\037\ufffe" +
    "\001\002\000\020\005\113\007\025\011\021\012\016\013" +
    "\022\014\023\037\006\001\002\000\004\002\000\001\002" +
    "\000\004\037\115\001\002\000\004\031\116\001\002\000" +
    "\004\034\117\001\002\000\024\005\uffec\007\uffec\010\uffec" +
    "\011\uffec\012\uffec\013\uffec\014\uffec\033\uffec\037\uffec\001" +
    "\002\000\006\034\122\035\121\001\002\000\004\037\124" +
    "\001\002\000\020\006\ufffc\007\ufffc\011\ufffc\012\ufffc\013" +
    "\ufffc\014\ufffc\037\ufffc\001\002\000\006\034\126\035\125" +
    "\001\002\000\006\034\ufff9\035\ufff9\001\002\000\004\037" +
    "\127\001\002\000\020\006\ufffb\007\ufffb\011\ufffb\012\ufffb" +
    "\013\ufffb\014\ufffb\037\ufffb\001\002\000\006\034\ufffa\035" +
    "\ufffa\001\002\000\010\030\033\036\030\037\035\001\002" +
    "\000\024\015\066\016\070\017\062\020\064\022\063\023" +
    "\065\024\057\025\055\034\uffe7\001\002\000\004\034\uffe6" +
    "\001\002\000\004\034\134\001\002\000\024\005\ufff0\007" +
    "\ufff0\010\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0\033\ufff0" +
    "\037\ufff0\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\133\000\004\002\003\001\001\000\002\001\001\000" +
    "\026\003\017\004\016\006\023\007\007\010\013\011\010" +
    "\012\014\013\025\014\012\015\006\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\024" +
    "\004\110\006\111\007\007\010\013\011\010\012\014\013" +
    "\025\014\012\015\006\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\020\007\050\010\013\011" +
    "\010\012\014\013\025\014\012\015\006\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\020\033\021\030\022" +
    "\035\023\031\001\001\000\002\001\001\000\004\024\066" +
    "\001\001\000\002\001\001\000\010\021\053\022\035\023" +
    "\031\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\023\041\001\001\000\004\023\040\001" +
    "\001\000\002\001\001\000\002\001\001\000\022\007\044" +
    "\010\013\011\010\012\014\013\025\014\012\015\006\016" +
    "\043\001\001\000\002\001\001\000\002\001\001\000\022" +
    "\006\046\007\007\010\013\011\010\012\014\013\025\014" +
    "\012\015\006\001\001\000\020\007\050\010\013\011\010" +
    "\012\014\013\025\014\012\015\006\001\001\000\002\001" +
    "\001\000\002\001\001\000\022\007\044\010\013\011\010" +
    "\012\014\013\025\014\012\015\006\016\052\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\022\060\023\031" +
    "\001\001\000\002\001\001\000\006\022\057\023\031\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\021\070\022\035\023\031\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\021" +
    "\101\022\035\023\031\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\020\105\021\030\022" +
    "\035\023\031\001\001\000\002\001\001\000\022\007\044" +
    "\010\013\011\010\012\014\013\025\014\012\015\006\016" +
    "\107\001\001\000\002\001\001\000\002\001\001\000\020" +
    "\007\050\010\013\011\010\012\014\013\025\014\012\015" +
    "\006\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\005\122\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\017\132\020\131\021\130" +
    "\022\035\023\031\001\001\000\004\024\066\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // programa ::= INICIO lista_declaraciones lista_sentencias FIN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // programa ::= INICIO lista_sentencias FIN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // lista_declaraciones ::= lista_declaraciones declaracion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_declaraciones",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // lista_declaraciones ::= declaracion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_declaraciones",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declaracion ::= ENTERO IDENT PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // declaracion ::= ENTERO IDENT COMA lista_variables PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // lista_variables ::= lista_variables COMA IDENT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_variables",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // lista_variables ::= IDENT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_variables",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // lista_sentencias ::= lista_sentencias sentencia 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_sentencias",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // lista_sentencias ::= sentencia 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_sentencias",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // sentencia ::= sentencia_asignacion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // sentencia ::= sentencia_si 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // sentencia ::= sentencia_mientras 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // sentencia ::= sentencia_leer 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // sentencia ::= sentencia_imprimir 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // sentencia ::= sentencia_intercambiar 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // sentencia_asignacion ::= IDENT ASIG expresion PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia_asignacion",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // sentencia_si ::= SI PARIZQ expresion_relacional PARDER bloque 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia_si",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // sentencia_si ::= SI PARIZQ expresion_relacional PARDER bloque SINO bloque 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia_si",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // sentencia_mientras ::= MIENTRAS PARIZQ expresion_relacional PARDER bloque 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia_mientras",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // sentencia_leer ::= LEER PARIZQ IDENT PARDER PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia_leer",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // sentencia_imprimir ::= IMPRIMIR PARIZQ expresion_aritmetica PARDER PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia_imprimir",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // sentencia_intercambiar ::= INTERCAMBIAR PARIZQ IDENT COMA IDENT PARDER PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia_intercambiar",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // bloque ::= LLAVEIZQ lista_sentencias LLAVEDER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("bloque",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // bloque ::= sentencia 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("bloque",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expresion ::= expresion_aritmetica 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expresion ::= expresion_relacional 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // expresion_relacional ::= expresion_aritmetica operador_relacional expresion_aritmetica 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion_relacional",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // operador_relacional ::= IGUAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operador_relacional",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // operador_relacional ::= DIFERENTE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operador_relacional",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // operador_relacional ::= MENOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operador_relacional",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // operador_relacional ::= MAYOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operador_relacional",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // operador_relacional ::= MENORIGUAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operador_relacional",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // operador_relacional ::= MAYORIGUAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operador_relacional",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expresion_aritmetica ::= expresion_aritmetica SUMA termino 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion_aritmetica",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expresion_aritmetica ::= expresion_aritmetica RESTA termino 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion_aritmetica",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // expresion_aritmetica ::= termino 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion_aritmetica",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // termino ::= termino MULT factor 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("termino",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // termino ::= termino DIV factor 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("termino",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // termino ::= factor 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("termino",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // factor ::= NUMERO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("factor",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // factor ::= IDENT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("factor",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // factor ::= PARIZQ expresion_aritmetica PARDER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("factor",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
