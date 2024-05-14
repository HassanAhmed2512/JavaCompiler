// $ANTLR 3.4 C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g 2024-05-14 08:55:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FinalProjectLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int Boolean=4;
    public static final int COMMENT=5;
    public static final int Class=6;
    public static final int Expression=7;
    public static final int Forloop=8;
    public static final int Identifier=9;
    public static final int IfStatement=10;
    public static final int MainFunction=11;
    public static final int Modifier=12;
    public static final int NormalFunction=13;
    public static final int Numbers=14;
    public static final int OP=15;
    public static final int Print=16;
    public static final int Statement=17;
    public static final int Variables=18;
    public static final int WS=19;
    public static final int WhileStatement=20;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public FinalProjectLexer() {} 
    public FinalProjectLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FinalProjectLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:2:7: ( '!' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:3:7: ( '(' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:3:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:4:7: ( ')' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:4:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:5:7: ( ',' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:5:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:6:7: ( '.' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:6:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:7:7: ( ';' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:7:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:8:7: ( '=' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:8:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:9:7: ( 'Booleanean' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:9:9: 'Booleanean'
            {
            match("Booleanean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:10:7: ( 'String' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:10:9: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:11:7: ( 'System.out.' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:11:9: 'System.out.'
            {
            match("System.out."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:12:7: ( '[' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:12:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:13:7: ( ']' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:14:7: ( 'char' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:14:9: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:15:7: ( 'class' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:15:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:16:7: ( 'double' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:16:9: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:17:7: ( 'else' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:17:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:18:7: ( 'extends' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:18:9: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:19:7: ( 'for' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:19:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:20:7: ( 'if' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:20:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:21:7: ( 'int' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:21:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:22:7: ( 'main' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:22:9: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:23:7: ( 'new' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:23:9: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:24:7: ( 'return' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:24:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:25:7: ( 'static' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:25:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:26:7: ( 'this' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:26:9: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:27:7: ( 'voIdentifier' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:27:9: 'voIdentifier'
            {
            match("voIdentifier"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:28:7: ( 'while' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:28:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:29:7: ( '{' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:29:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:30:7: ( '}' )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:30:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "Print"
    public final void mPrint() throws RecognitionException {
        try {
            int _type = Print;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:148:7: ( 'println' | 'print' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='p') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='r') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='i') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='n') ) {
                            int LA1_4 = input.LA(5);

                            if ( (LA1_4=='t') ) {
                                int LA1_5 = input.LA(6);

                                if ( (LA1_5=='l') ) {
                                    alt1=1;
                                }
                                else {
                                    alt1=2;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:148:9: 'println'
                    {
                    match("println"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:148:19: 'print'
                    {
                    match("print"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Print"

    // $ANTLR start "Modifier"
    public final void mModifier() throws RecognitionException {
        try {
            int _type = Modifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:149:9: ( 'public' | 'private' | 'protected' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='p') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='u') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='r') ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3=='i') ) {
                        alt2=2;
                    }
                    else if ( (LA2_3=='o') ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:149:11: 'public'
                    {
                    match("public"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:149:22: 'private'
                    {
                    match("private"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:149:34: 'protected'
                    {
                    match("protected"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Modifier"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:150:8: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:150:10: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:150:18: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Boolean"

    // $ANTLR start "Numbers"
    public final void mNumbers() throws RecognitionException {
        try {
            int _type = Numbers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:151:8: ( ( '0' .. '9' )+ )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:151:10: ( '0' .. '9' )+
            {
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:151:10: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Numbers"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:152:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:152:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:152:42: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='$'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "OP"
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:3: ( ( '&&' | '||' | '==' | '!=' | '<' | '<=' | '>' | '>=' | '+' | '-' | '*' | '/' | '%' | '++' | '--' | '=' | '+=' | '-=' | '*=' | '/=' ) )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:5: ( '&&' | '||' | '==' | '!=' | '<' | '<=' | '>' | '>=' | '+' | '-' | '*' | '/' | '%' | '++' | '--' | '=' | '+=' | '-=' | '*=' | '/=' )
            {
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:5: ( '&&' | '||' | '==' | '!=' | '<' | '<=' | '>' | '>=' | '+' | '-' | '*' | '/' | '%' | '++' | '--' | '=' | '+=' | '-=' | '*=' | '/=' )
            int alt6=20;
            switch ( input.LA(1) ) {
            case '&':
                {
                alt6=1;
                }
                break;
            case '|':
                {
                alt6=2;
                }
                break;
            case '=':
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3=='=') ) {
                    alt6=3;
                }
                else {
                    alt6=16;
                }
                }
                break;
            case '!':
                {
                alt6=4;
                }
                break;
            case '<':
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5=='=') ) {
                    alt6=6;
                }
                else {
                    alt6=5;
                }
                }
                break;
            case '>':
                {
                int LA6_6 = input.LA(2);

                if ( (LA6_6=='=') ) {
                    alt6=8;
                }
                else {
                    alt6=7;
                }
                }
                break;
            case '+':
                {
                switch ( input.LA(2) ) {
                case '+':
                    {
                    alt6=14;
                    }
                    break;
                case '=':
                    {
                    alt6=17;
                    }
                    break;
                default:
                    alt6=9;
                }

                }
                break;
            case '-':
                {
                switch ( input.LA(2) ) {
                case '-':
                    {
                    alt6=15;
                    }
                    break;
                case '=':
                    {
                    alt6=18;
                    }
                    break;
                default:
                    alt6=10;
                }

                }
                break;
            case '*':
                {
                int LA6_9 = input.LA(2);

                if ( (LA6_9=='=') ) {
                    alt6=19;
                }
                else {
                    alt6=11;
                }
                }
                break;
            case '/':
                {
                int LA6_10 = input.LA(2);

                if ( (LA6_10=='=') ) {
                    alt6=20;
                }
                else {
                    alt6=12;
                }
                }
                break;
            case '%':
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:6: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:13: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:20: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:27: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:34: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:40: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:47: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:53: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:60: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:66: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:72: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:78: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:84: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:90: '++'
                    {
                    match("++"); 



                    }
                    break;
                case 15 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:97: '--'
                    {
                    match("--"); 



                    }
                    break;
                case 16 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:104: '='
                    {
                    match('='); 

                    }
                    break;
                case 17 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:110: '+='
                    {
                    match("+="); 



                    }
                    break;
                case 18 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:117: '-='
                    {
                    match("-="); 



                    }
                    break;
                case 19 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:124: '*='
                    {
                    match("*="); 



                    }
                    break;
                case 20 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:153:131: '/='
                    {
                    match("/="); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:154:8: ( ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* ) )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:154:12: ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* )
            {
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:154:12: ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='/') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='*') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='/') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:154:13: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:154:18: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:154:46: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match("*/"); 



                    skip();

                    }
                    break;
                case 2 :
                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:154:70: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); 



                    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:154:75: (~ ( '\\n' | '\\r' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    skip();

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:155:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:155:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:155:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | Print | Modifier | Boolean | Numbers | Identifier | OP | COMMENT | WS )
        int alt11=37;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:10: T__21
                {
                mT__21(); 


                }
                break;
            case 2 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:16: T__22
                {
                mT__22(); 


                }
                break;
            case 3 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:22: T__23
                {
                mT__23(); 


                }
                break;
            case 4 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:28: T__24
                {
                mT__24(); 


                }
                break;
            case 5 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:34: T__25
                {
                mT__25(); 


                }
                break;
            case 6 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:40: T__26
                {
                mT__26(); 


                }
                break;
            case 7 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:46: T__27
                {
                mT__27(); 


                }
                break;
            case 8 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:52: T__28
                {
                mT__28(); 


                }
                break;
            case 9 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:58: T__29
                {
                mT__29(); 


                }
                break;
            case 10 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:64: T__30
                {
                mT__30(); 


                }
                break;
            case 11 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:70: T__31
                {
                mT__31(); 


                }
                break;
            case 12 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:76: T__32
                {
                mT__32(); 


                }
                break;
            case 13 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:82: T__33
                {
                mT__33(); 


                }
                break;
            case 14 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:88: T__34
                {
                mT__34(); 


                }
                break;
            case 15 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:94: T__35
                {
                mT__35(); 


                }
                break;
            case 16 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:100: T__36
                {
                mT__36(); 


                }
                break;
            case 17 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:106: T__37
                {
                mT__37(); 


                }
                break;
            case 18 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:112: T__38
                {
                mT__38(); 


                }
                break;
            case 19 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:118: T__39
                {
                mT__39(); 


                }
                break;
            case 20 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:124: T__40
                {
                mT__40(); 


                }
                break;
            case 21 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:130: T__41
                {
                mT__41(); 


                }
                break;
            case 22 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:136: T__42
                {
                mT__42(); 


                }
                break;
            case 23 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:142: T__43
                {
                mT__43(); 


                }
                break;
            case 24 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:148: T__44
                {
                mT__44(); 


                }
                break;
            case 25 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:154: T__45
                {
                mT__45(); 


                }
                break;
            case 26 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:160: T__46
                {
                mT__46(); 


                }
                break;
            case 27 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:166: T__47
                {
                mT__47(); 


                }
                break;
            case 28 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:172: T__48
                {
                mT__48(); 


                }
                break;
            case 29 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:178: T__49
                {
                mT__49(); 


                }
                break;
            case 30 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:184: Print
                {
                mPrint(); 


                }
                break;
            case 31 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:190: Modifier
                {
                mModifier(); 


                }
                break;
            case 32 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:199: Boolean
                {
                mBoolean(); 


                }
                break;
            case 33 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:207: Numbers
                {
                mNumbers(); 


                }
                break;
            case 34 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:215: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 35 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:226: OP
                {
                mOP(); 


                }
                break;
            case 36 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:229: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 37 :
                // C:\\Users\\HP\\Desktop\\CompilerProject\\FinalProject.g:1:237: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\40\5\uffff\1\41\2\34\2\uffff\14\34\2\uffff\1\34\3\uffff"+
        "\1\35\3\uffff\12\34\1\103\13\34\1\uffff\10\34\1\130\1\34\1\uffff"+
        "\1\132\1\34\1\134\14\34\1\152\2\34\1\155\1\34\1\uffff\1\34\1\uffff"+
        "\1\160\1\uffff\2\34\1\163\1\164\11\34\1\uffff\1\176\1\34\1\uffff"+
        "\1\34\1\164\1\uffff\2\34\2\uffff\1\34\1\u0084\1\u0086\4\34\1\u008b"+
        "\1\34\1\uffff\1\u008d\1\34\1\u008f\1\u0090\1\34\1\uffff\1\34\1\uffff"+
        "\2\34\1\u0095\1\34\3\uffff\1\u0097\2\uffff\1\34\1\u0086\1\u0095"+
        "\1\34\1\uffff\1\34\1\uffff\4\34\1\u0095\1\u009f\1\34\1\uffff\1\34"+
        "\1\u00a2\1\uffff";
    static final String DFA11_eofS =
        "\u00a3\uffff";
    static final String DFA11_minS =
        "\1\11\1\75\5\uffff\1\75\1\157\1\164\2\uffff\1\150\1\157\1\154\1"+
        "\141\1\146\1\141\2\145\1\164\1\150\1\157\1\150\2\uffff\1\162\3\uffff"+
        "\1\52\3\uffff\1\157\1\162\1\163\2\141\1\165\1\163\1\164\1\162\1"+
        "\154\1\44\1\164\1\151\1\167\1\164\1\141\1\151\1\165\1\111\2\151"+
        "\1\142\1\uffff\1\154\1\151\1\164\1\162\1\163\1\142\2\145\1\44\1"+
        "\163\1\uffff\1\44\1\156\1\44\1\165\1\164\1\163\1\145\1\144\1\154"+
        "\1\156\1\164\1\154\1\145\1\156\1\145\1\44\1\163\1\154\1\44\1\156"+
        "\1\uffff\1\145\1\uffff\1\44\1\uffff\1\162\1\151\2\44\2\145\1\164"+
        "\1\141\1\145\1\151\1\141\1\147\1\155\1\uffff\1\44\1\145\1\uffff"+
        "\1\144\1\44\1\uffff\1\156\1\143\2\uffff\1\156\2\44\1\164\2\143\1"+
        "\156\1\44\1\56\1\uffff\1\44\1\163\2\44\1\164\1\uffff\1\156\1\uffff"+
        "\1\145\1\164\1\44\1\145\3\uffff\1\44\2\uffff\1\151\2\44\1\145\1"+
        "\uffff\1\141\1\uffff\1\146\1\144\1\156\1\151\2\44\1\145\1\uffff"+
        "\1\162\1\44\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\75\5\uffff\1\75\1\157\1\171\2\uffff\1\154\1\157\1\170\1"+
        "\157\1\156\1\141\2\145\1\164\1\162\1\157\1\150\2\uffff\1\165\3\uffff"+
        "\1\57\3\uffff\1\157\1\162\1\163\2\141\1\165\1\163\1\164\1\162\1"+
        "\154\1\172\1\164\1\151\1\167\1\164\1\141\1\151\1\165\1\111\1\151"+
        "\1\157\1\142\1\uffff\1\154\1\151\1\164\1\162\1\163\1\142\2\145\1"+
        "\172\1\163\1\uffff\1\172\1\156\1\172\1\165\1\164\1\163\1\145\1\144"+
        "\1\154\1\166\1\164\1\154\1\145\1\156\1\145\1\172\1\163\1\154\1\172"+
        "\1\156\1\uffff\1\145\1\uffff\1\172\1\uffff\1\162\1\151\2\172\2\145"+
        "\1\164\1\141\1\145\1\151\1\141\1\147\1\155\1\uffff\1\172\1\145\1"+
        "\uffff\1\144\1\172\1\uffff\1\156\1\143\2\uffff\1\156\2\172\1\164"+
        "\2\143\1\156\1\172\1\56\1\uffff\1\172\1\163\2\172\1\164\1\uffff"+
        "\1\156\1\uffff\1\145\1\164\1\172\1\145\3\uffff\1\172\2\uffff\1\151"+
        "\2\172\1\145\1\uffff\1\141\1\uffff\1\146\1\144\1\156\1\151\2\172"+
        "\1\145\1\uffff\1\162\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\3\uffff\1\13\1\14\14\uffff\1\34\1\35"+
        "\1\uffff\1\41\1\42\1\43\1\uffff\1\45\1\1\1\7\26\uffff\1\44\12\uffff"+
        "\1\23\24\uffff\1\22\1\uffff\1\24\1\uffff\1\26\15\uffff\1\15\2\uffff"+
        "\1\20\2\uffff\1\25\2\uffff\1\31\1\40\11\uffff\1\16\5\uffff\1\33"+
        "\1\uffff\1\36\4\uffff\1\11\1\12\1\17\1\uffff\1\27\1\30\4\uffff\1"+
        "\37\1\uffff\1\21\7\uffff\1\10\2\uffff\1\32";
    static final String DFA11_specialS =
        "\u00a3\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\1\2\uffff\1\34\2\35\1\uffff"+
            "\1\2\1\3\2\35\1\4\1\35\1\5\1\36\12\33\1\uffff\1\6\1\35\1\7\1"+
            "\35\2\uffff\1\34\1\10\20\34\1\11\7\34\1\12\1\uffff\1\13\1\uffff"+
            "\1\34\1\uffff\2\34\1\14\1\15\1\16\1\17\2\34\1\20\3\34\1\21\1"+
            "\22\1\34\1\32\1\34\1\23\1\24\1\25\1\34\1\26\1\27\3\34\1\30\1"+
            "\35\1\31",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\42",
            "\1\43\4\uffff\1\44",
            "",
            "",
            "\1\45\3\uffff\1\46",
            "\1\47",
            "\1\50\13\uffff\1\51",
            "\1\53\15\uffff\1\52",
            "\1\54\7\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62\11\uffff\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "\1\66\2\uffff\1\67",
            "",
            "",
            "",
            "\1\70\4\uffff\1\70",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115\5\uffff\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\131",
            "",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\133",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143\7\uffff\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\153",
            "\1\154",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\156",
            "",
            "\1\157",
            "",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\1\161",
            "\1\162",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\177",
            "",
            "\1\u0080",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "\1\u0083",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\13"+
            "\34\1\u0085\16\34",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u008c",
            "",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u008e",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0091",
            "",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0096",
            "",
            "",
            "",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "",
            "",
            "\1\u0098",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0099",
            "",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\34\13\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | Print | Modifier | Boolean | Numbers | Identifier | OP | COMMENT | WS );";
        }
    }
 

}