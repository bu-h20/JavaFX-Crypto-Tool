public class Morse {
    
    static int NUM_CHARS = 40;
   // private String original;
    private String mcode;
    private char[] regular;
    private char[] morse;
    private String decodedText;
Morse(String mcode){
this.mcode=mcode;
}
   
    // Takes a character, and converts it into morse code.
public String toMorse(char ch) {
    switch (ch) {
        case ' ':
            return " ";
        // Letters (uppercase and lowercase handled the same)
        case 'a': case 'A':
            return ".-";
        case 'b': case 'B':
            return "-...";
        case 'c': case 'C':
            return "-.-.";
        case 'd': case 'D':
            return "-..";
        case 'e': case 'E':
            return ".";
        case 'f': case 'F':
            return "..-.";
        case 'g': case 'G':
            return "--.";
        case 'h': case 'H':
            return "....";
        case 'i': case 'I':
            return "..";
        case 'j': case 'J':
            return ".---";
        case 'k': case 'K':
            return "-.-";
        case 'l': case 'L':
            return ".-..";
        case 'm': case 'M':
            return "--";
        case 'n': case 'N':
            return "-.";
        case 'o': case 'O':
            return "---";
        case 'p': case 'P':
            return ".--.";
        case 'q': case 'Q':
            return "--.-";
        case 'r': case 'R':
            return ".-.";
        case 's': case 'S':
            return "...";
        case 't': case 'T':
            return "-";
        case 'u': case 'U':
            return "..-";
        case 'v': case 'V':
            return "...-";
        case 'w': case 'W':
            return ".--";
        case 'x': case 'X':
            return "-..-";
        case 'y': case 'Y':
            return "-.--";
        case 'z': case 'Z':
            return "--..";

        // Numbers
        case '0':
            return "-----";
        case '1':
            return ".----";
        case '2':
            return "..---";
        case '3':
            return "...--";
        case '4':
            return "....-";
        case '5':
            return ".....";
        case '6':
            return "-....";
        case '7':
            return "--...";
        case '8':
            return "---..";
        case '9':
            return "----.";

        // Symbols
        case '.':
            return ".-.-.-";
        case ',':
            return "--..--";
        case '?':
            return "..--..";
        case '!':
            return "-.-.--";
        case ':':
            return "---...";
        case '\'':
            return ".----.";
        case '\"':
            return ".-..-.";
        case '-':
            return "-....-";
        case '/':
            return "-..-.";
        case '(':
            return "-.--.";
        case ')':
            return "-.--.-";
        case '=':
            return "-...-";
        case '@':
            return ".--.-.";
    }
    return ""; // إذا الحرف غير معروف
}

    
    // Converts the original string into morse code and returns.

    public String getMorseCode(String original ) {
        mcode = "";
        for (int i = 0; i < original.length(); i++) {
            mcode += toMorse(Character.toUpperCase(original.charAt(i))) + " ";
        }
        return mcode;
    }

   public static char morseToChar(String morse) {
    switch (morse) {
        case ".-":
            return 'A';
        case "-...":
            return 'B';
        case "-.-.":
            return 'C';
        case "-..":
            return 'D';
        case ".":
            return 'E';
        case "..-.":
            return 'F';
        case "--.":
            return 'G';
        case "....":
            return 'H';
        case "..":
            return 'I';
        case ".---":
            return 'J';
        case "-.-":
            return 'K';
        case ".-..":
            return 'L';
        case "--":
            return 'M';
        case "-.":
            return 'N';
        case "---":
            return 'O';
        case ".--.":
            return 'P';
        case "--.-":
            return 'Q';
        case ".-.":
            return 'R';
        case "...":
            return 'S';
        case "-":
            return 'T';
        case "..-":
            return 'U';
        case "...-":
            return 'V';
        case ".--":
            return 'W';
        case "-..-":
            return 'X';
        case "-.--":
            return 'Y';
        case "--..":
            return 'Z';

        // Numbers
        case "-----":
            return '0';
        case ".----":
            return '1';
        case "..---":
            return '2';
        case "...--":
            return '3';
        case "....-":
            return '4';
        case ".....":
            return '5';
        case "-....":
            return '6';
        case "--...":
            return '7';
        case "---..":
            return '8';
        case "----.":
            return '9';

        // Symbols
        case ".-.-.-":
            return '.';
        case "--..--":
            return ',';
        case "..--..":
            return '?';
        case "-.-.--":
            return '!';
        case "---...":
            return ':';
        case ".----.":
            return '\'';
        case ".-..-.":
            return '\"';
        case "-....-":
            return '-';
        case "-..-.":
            return '/';
        case "-.--.":
            return '(';
        case "-.--.-":
            return ')';
        case "-...-":
            return '=';
        case ".--.-.":
            return '@';
    }
    return '?'; // إذا الرمز غير معروف
}

      
public String getDecodedText() {
    decodedText="";
    String[] words = mcode.trim().split("   "); // 3 مسافات = تفصل كلمات

    for (int i = 0; i < words.length; i++) {
        String[] letters = words[i].split(" "); // مسافة وحدة = حرف

        for (int j = 0; j < letters.length; j++) {
            decodedText += morseToChar(letters[j]);
        }

        decodedText += " "; // بعد كل كلمة نحط مسافة
    }

    return decodedText.trim();
}


   
}
