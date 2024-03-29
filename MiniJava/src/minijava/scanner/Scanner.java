/* The following code was generated by JFlex 1.6.0 */

/*
 * JFlex specification for the lexical analyzer for a simple demo language
 * Change this into the scanner for your implementation of MiniJava.
 */


package minijava.scanner;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>/home/leeboy/NetBeansProjects/Compiler-Project/MiniJava/src/minijava/scanner/minijava.flex</tt>
 */
class Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\7\1\10\1\60\1\7\1\11\22\0\1\7\1\50\4\0"+
    "\1\51\1\0\1\35\1\36\1\2\1\52\1\44\1\53\1\45\1\1"+
    "\1\5\11\6\1\0\1\43\1\47\1\46\3\0\22\3\1\54\7\3"+
    "\1\41\1\0\1\42\1\0\1\4\1\0\1\16\1\12\1\20\1\24"+
    "\1\15\1\27\1\55\1\34\1\26\2\3\1\14\1\56\1\17\1\13"+
    "\1\30\1\3\1\32\1\21\1\23\1\31\1\33\1\25\1\22\1\57"+
    "\1\3\1\37\1\0\1\40\7\0\1\60\u1fa2\0\1\60\1\60\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\2\4\1\5\1\0\15\3"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\1\1\22\1\23\2\3"+
    "\1\5\1\0\13\3\1\24\4\3\1\25\3\3\2\5"+
    "\4\0\4\3\1\26\5\3\1\27\7\3\1\5\3\0"+
    "\1\5\2\3\1\30\3\3\1\31\1\32\4\3\1\33"+
    "\2\3\1\34\1\5\1\0\1\5\1\0\3\3\1\35"+
    "\1\3\1\36\1\37\4\3\1\5\1\0\1\3\1\40"+
    "\1\3\1\41\1\42\1\43\1\44\1\3\1\45\1\46"+
    "\13\0\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\61\0\223\0\61\0\304\0\61"+
    "\0\365\0\u0126\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c"+
    "\0\u027d\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\61\0\u03a3\0\61\0\61\0\u03d4\0\u0405\0\u0436"+
    "\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\u058d\0\u05be"+
    "\0\u05ef\0\u0620\0\u0651\0\u0682\0\223\0\u06b3\0\u06e4\0\u0715"+
    "\0\u0746\0\61\0\u0777\0\u07a8\0\u07d9\0\u080a\0\u083b\0\u086c"+
    "\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961\0\u0992\0\u09c3\0\223"+
    "\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\223\0\u0ae9\0\u0b1a"+
    "\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\142\0\u0c71"+
    "\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35\0\223\0\u0d66\0\u0d97\0\u0dc8"+
    "\0\223\0\223\0\u0df9\0\u0e2a\0\u0e5b\0\u0e8c\0\223\0\u0ebd"+
    "\0\u0eee\0\223\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\u0fe3\0\u1014"+
    "\0\u1045\0\223\0\u1076\0\223\0\223\0\u10a7\0\u10d8\0\u1109"+
    "\0\u113a\0\u116b\0\u119c\0\u11cd\0\223\0\u11fe\0\223\0\223"+
    "\0\223\0\223\0\u122f\0\223\0\223\0\u1260\0\u1291\0\u12c2"+
    "\0\u12f3\0\u1324\0\u1355\0\u1386\0\u13b7\0\u13e8\0\u1419\0\u144a"+
    "\0\61";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\2\10"+
    "\1\11\1\12\1\5\1\13\1\14\1\5\1\15\1\16"+
    "\1\17\1\5\1\20\1\5\1\21\1\22\1\23\1\24"+
    "\1\5\1\25\1\26\1\5\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\5\1\47\1\5\63\0"+
    "\1\50\1\51\61\0\4\5\3\0\23\5\17\0\4\5"+
    "\6\0\2\7\62\0\1\10\53\0\4\5\3\0\1\5"+
    "\1\52\21\5\17\0\4\5\4\0\4\5\3\0\3\5"+
    "\1\53\17\5\17\0\4\5\4\0\4\5\3\0\2\5"+
    "\1\54\5\5\1\55\12\5\17\0\4\5\4\0\4\5"+
    "\3\0\3\5\1\56\17\5\17\0\4\5\4\0\4\5"+
    "\3\0\2\5\1\57\20\5\17\0\4\5\4\0\4\5"+
    "\3\0\11\5\1\60\11\5\17\0\4\5\4\0\4\5"+
    "\3\0\20\5\1\61\1\5\1\62\17\0\4\5\4\0"+
    "\4\5\3\0\22\5\1\63\17\0\4\5\4\0\4\5"+
    "\3\0\5\5\1\64\7\5\1\65\5\5\17\0\4\5"+
    "\4\0\4\5\3\0\4\5\1\66\16\5\17\0\4\5"+
    "\4\0\4\5\3\0\17\5\1\67\3\5\17\0\4\5"+
    "\4\0\4\5\3\0\3\5\1\70\17\5\17\0\4\5"+
    "\4\0\4\5\3\0\1\5\1\71\21\5\17\0\4\5"+
    "\52\0\1\72\12\0\4\5\3\0\11\5\1\73\11\5"+
    "\17\0\3\5\1\74\4\0\4\5\3\0\4\5\1\75"+
    "\16\5\17\0\4\5\1\0\1\50\1\76\6\50\1\77"+
    "\1\100\47\50\1\101\1\102\1\103\56\101\3\0\4\5"+
    "\3\0\1\5\1\104\21\5\17\0\4\5\4\0\4\5"+
    "\3\0\5\5\1\105\15\5\17\0\4\5\4\0\4\5"+
    "\3\0\7\5\1\106\13\5\17\0\4\5\4\0\4\5"+
    "\3\0\11\5\1\107\11\5\17\0\4\5\4\0\4\5"+
    "\3\0\13\5\1\110\7\5\17\0\4\5\4\0\4\5"+
    "\3\0\4\5\1\111\16\5\17\0\4\5\4\0\4\5"+
    "\3\0\4\5\1\112\16\5\17\0\4\5\4\0\4\5"+
    "\3\0\17\5\1\113\3\5\17\0\4\5\4\0\4\5"+
    "\3\0\14\5\1\114\6\5\17\0\4\5\4\0\4\5"+
    "\3\0\14\5\1\115\6\5\17\0\4\5\4\0\4\5"+
    "\3\0\11\5\1\116\11\5\17\0\4\5\4\0\4\5"+
    "\3\0\2\5\1\117\20\5\17\0\4\5\4\0\4\5"+
    "\3\0\1\120\22\5\17\0\4\5\4\0\4\5\3\0"+
    "\11\5\1\121\11\5\17\0\4\5\4\0\4\5\3\0"+
    "\14\5\1\122\6\5\17\0\4\5\4\0\4\5\3\0"+
    "\20\5\1\123\2\5\17\0\4\5\4\0\4\5\3\0"+
    "\7\5\1\124\13\5\17\0\4\5\4\0\4\5\3\0"+
    "\14\5\1\125\6\5\17\0\4\5\1\0\1\50\1\76"+
    "\1\126\5\50\1\77\1\100\47\50\1\0\1\127\67\0"+
    "\1\77\50\0\2\101\1\130\60\101\1\131\57\101\1\132"+
    "\1\103\56\101\3\0\4\5\3\0\2\5\1\133\20\5"+
    "\17\0\4\5\4\0\4\5\3\0\23\5\17\0\1\5"+
    "\1\134\2\5\4\0\4\5\3\0\3\5\1\135\17\5"+
    "\17\0\4\5\4\0\4\5\3\0\3\5\1\136\17\5"+
    "\17\0\4\5\4\0\4\5\3\0\7\5\1\137\13\5"+
    "\17\0\4\5\4\0\4\5\3\0\11\5\1\140\11\5"+
    "\17\0\4\5\4\0\4\5\3\0\3\5\1\141\17\5"+
    "\17\0\4\5\4\0\4\5\3\0\7\5\1\142\13\5"+
    "\17\0\4\5\4\0\4\5\3\0\2\5\1\143\20\5"+
    "\17\0\4\5\4\0\4\5\3\0\7\5\1\144\13\5"+
    "\17\0\4\5\4\0\4\5\3\0\2\5\1\145\20\5"+
    "\17\0\4\5\4\0\4\5\3\0\17\5\1\146\3\5"+
    "\17\0\4\5\4\0\4\5\3\0\12\5\1\147\10\5"+
    "\17\0\4\5\4\0\4\5\3\0\14\5\1\150\6\5"+
    "\17\0\4\5\4\0\4\5\3\0\11\5\1\151\11\5"+
    "\17\0\4\5\4\0\4\5\3\0\5\5\1\152\15\5"+
    "\17\0\4\5\1\0\1\153\2\126\5\153\1\132\1\154"+
    "\47\153\1\101\1\77\1\130\57\101\1\155\1\130\57\101"+
    "\1\156\1\130\56\101\3\0\4\5\3\0\3\5\1\157"+
    "\17\5\17\0\4\5\4\0\4\5\3\0\11\5\1\160"+
    "\11\5\17\0\4\5\4\0\4\5\3\0\5\5\1\161"+
    "\15\5\17\0\4\5\4\0\4\5\3\0\7\5\1\162"+
    "\13\5\17\0\4\5\4\0\4\5\3\0\14\5\1\163"+
    "\6\5\17\0\4\5\4\0\4\5\3\0\3\5\1\164"+
    "\17\5\17\0\4\5\4\0\4\5\3\0\3\5\1\165"+
    "\17\5\17\0\4\5\4\0\4\5\3\0\14\5\1\166"+
    "\6\5\17\0\4\5\4\0\4\5\3\0\20\5\1\167"+
    "\2\5\17\0\4\5\4\0\4\5\3\0\5\5\1\170"+
    "\15\5\17\0\4\5\4\0\4\5\3\0\3\5\1\171"+
    "\17\5\17\0\4\5\1\0\1\153\1\126\1\172\5\153"+
    "\1\132\1\154\47\153\2\101\1\130\5\101\1\132\51\101"+
    "\1\156\1\131\57\101\1\153\1\173\56\101\3\0\4\5"+
    "\3\0\4\5\1\174\16\5\17\0\4\5\4\0\4\5"+
    "\3\0\22\5\1\175\17\0\4\5\4\0\4\5\3\0"+
    "\12\5\1\176\10\5\17\0\4\5\4\0\4\5\3\0"+
    "\6\5\1\177\14\5\17\0\4\5\4\0\4\5\3\0"+
    "\6\5\1\200\14\5\17\0\4\5\4\0\4\5\3\0"+
    "\5\5\1\201\15\5\17\0\4\5\4\0\4\5\3\0"+
    "\23\5\17\0\1\5\1\202\2\5\4\0\4\5\3\0"+
    "\23\5\17\0\2\5\1\203\1\5\1\0\1\153\1\76"+
    "\1\172\5\153\1\132\1\154\47\153\1\101\1\155\1\103"+
    "\56\101\3\0\4\5\3\0\5\5\1\204\15\5\17\0"+
    "\4\5\4\0\4\5\3\0\7\5\1\205\13\5\17\0"+
    "\4\5\4\0\4\5\3\0\23\5\10\0\1\206\6\0"+
    "\4\5\14\0\1\207\76\0\1\210\52\0\1\211\102\0"+
    "\1\212\43\0\1\213\62\0\1\214\54\0\1\215\51\0"+
    "\1\216\64\0\1\217\51\0\1\220\63\0\1\221\41\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5243];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\1\11\1\1\1\11"+
    "\1\0\15\1\14\11\1\1\2\11\3\1\1\0\20\1"+
    "\1\11\5\1\4\0\23\1\3\0\22\1\1\0\1\1"+
    "\1\0\14\1\1\0\12\1\13\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public String lexema;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { return Token.ERROR;
          }
        case 40: break;
        case 2: 
          { return Token.MULT;
          }
        case 41: break;
        case 3: 
          { lexema = yytext(); return Token.IDENTIFIER;
          }
        case 42: break;
        case 4: 
          { lexema = yytext(); return Token.INTEGER;
          }
        case 43: break;
        case 5: 
          { /* ignore */
          }
        case 44: break;
        case 6: 
          { return Token.LPAREN;
          }
        case 45: break;
        case 7: 
          { return Token.RPAREN;
          }
        case 46: break;
        case 8: 
          { return Token.LBRACE;
          }
        case 47: break;
        case 9: 
          { return Token.RBRACE;
          }
        case 48: break;
        case 10: 
          { return Token.LBRACK;
          }
        case 49: break;
        case 11: 
          { return Token.RBRACK;
          }
        case 50: break;
        case 12: 
          { return Token.SEMICOLON;
          }
        case 51: break;
        case 13: 
          { return Token.COMMA;
          }
        case 52: break;
        case 14: 
          { return Token.DOT;
          }
        case 53: break;
        case 15: 
          { return Token.EQ;
          }
        case 54: break;
        case 16: 
          { return Token.LT;
          }
        case 55: break;
        case 17: 
          { return Token.NOT;
          }
        case 56: break;
        case 18: 
          { return Token.PLUS;
          }
        case 57: break;
        case 19: 
          { return Token.MINUS;
          }
        case 58: break;
        case 20: 
          { return Token.IF;
          }
        case 59: break;
        case 21: 
          { return Token.AND_AND;
          }
        case 60: break;
        case 22: 
          { return Token.NEW;
          }
        case 61: break;
        case 23: 
          { return Token.INT;
          }
        case 62: break;
        case 24: 
          { return Token.ELSE;
          }
        case 63: break;
        case 25: 
          { return Token.TRUE;
          }
        case 64: break;
        case 26: 
          { return Token.THIS;
          }
        case 65: break;
        case 27: 
          { return Token.VOID;
          }
        case 66: break;
        case 28: 
          { return Token.MAIN;
          }
        case 67: break;
        case 29: 
          { return Token.CLASS;
          }
        case 68: break;
        case 30: 
          { return Token.WHILE;
          }
        case 69: break;
        case 31: 
          { return Token.FALSE;
          }
        case 70: break;
        case 32: 
          { return Token.LENGTH;
          }
        case 71: break;
        case 33: 
          { return Token.STATIC;
          }
        case 72: break;
        case 34: 
          { return Token.PUBLIC;
          }
        case 73: break;
        case 35: 
          { return Token.RETURN;
          }
        case 74: break;
        case 36: 
          { return Token.STRING;
          }
        case 75: break;
        case 37: 
          { return Token.BOOLEAN;
          }
        case 76: break;
        case 38: 
          { return Token.EXTENDS;
          }
        case 77: break;
        case 39: 
          { return Token.SYSTEM_OUT_PRINTLN;
          }
        case 78: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
