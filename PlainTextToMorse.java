// This class is dedicated to
// Converting the input string(plain text) to Morse code 

public class PlainTextToMorse
{

    private static String CharToMorse(char ch)       // This method converts a single character
    {                                               //  to its corresponding morse code string
        switch(ch)
        {
            case 'a': 
                return ".-"; 
            case 'b': 
                return "-..."; 
            case 'c': 
                return "-.-."; 
            case 'd': 
                return "-.."; 
            case 'e': 
                return "."; 
            case 'f': 
                return "..-."; 
            case 'g': 
                return "--."; 
            case 'h': 
                return "...."; 
            case 'i': 
                return ".."; 
            case 'j': 
                return ".---"; 
            case 'k': 
                return "-.-"; 
            case 'l': 
                return ".-.."; 
            case 'm': 
                return "--"; 
            case 'n': 
                return "-."; 
            case 'o': 
                return "---"; 
            case 'p': 
                return ".--."; 
            case 'q': 
                return "--.-"; 
            case 'r': 
                return ".-."; 
            case 's': 
                return "..."; 
            case 't': 
                return "-"; 
            case 'u': 
                return "..-"; 
            case 'v': 
                return "...-"; 
            case 'w': 
                return ".--"; 
            case 'x': 
                return "-..-"; 
            case 'y': 
                return "-.--"; 
            case 'z': 
                return "--..";
            case 'A':
                return "-----";
            case 'B':
                return ".....";
            case 'C':
                return "....-";    
            case 'D':
                return "...-.";    
            case 'E':
                return "...--";    
            case 'F':
                return "..-..";
            case 'G':
                return "..-.-";
            case 'H':
                return "..--.";    
            case 'I':
                return "..---";    
            case 'J':
                return ".-...";    
            case 'K':
                return ".-..-";    
            case 'L':
                return ".-.-.";    
            case 'M':
                return ".-.--";    
            case 'N':
                return ".--..";    
            case 'O':
                return ".--.-";    
            case 'P':
                return ".---.";    
            case 'Q':
                return ".----";    
            case 'R':
                return "-....";    
            case 'S':
                return "-...-";    
            case 'T':
                return "-..-.";    
            case 'U':
                return "-..--";    
            case 'V':
                return "-.-..";    
            case 'W':
                return "-.-.-";    
            case 'X':
                return "-.---";    
            case 'Y':
               return "--...";    
            case 'Z':
                return "--..-";    
            case '.':
                return "--.-.";    
            case ',':
               return "--.--";    
            case '!':
                return "---..";    
            case ':':
                return "---.-";    
            case '@':
                return "----.";    
            case '-':
                return "......";
            case '0':
                return ".....-";    
            case '1':
               return "....-.";    
            case '2':
                return "....--";    
            case '3':
                return "...-..";    
            case '4':
               return "...-.-";    
            case '5':
                return "...--.";    
            case '6':
                return "...---";    
            case '7':
               return "..-...";    
            case '8':
                return "..-..-";    
            case '9':
                return "..-.-.";    
            case '/':
               return "..-.--";    
            case ';':
                return "..--..";          
            case ' ':
                return "";
            }
        return "";
    }

    public String EncryptToMorseCode(String PlainText)         // Converts the entire input to the 
    {                                                         // corresponding morse code string (Calls the previous method)
        int len = PlainText.length();          
        String [] MorseCodeCharacters = new String[len];             
        for(int i = 0; i < len; i++)
        {
            String morseSnippet = CharToMorse(PlainText.charAt(i));
            MorseCodeCharacters[i] = morseSnippet;
        }
        String MorseCode = String.join("x", MorseCodeCharacters);
        if (MorseCode.length() % 3 == 1)
        {
            MorseCode += "xx";
        }
        else if (MorseCode.length() % 3 == 2)
        {
            MorseCode += Character.toString('x');
        }
        return MorseCode;
    }

}