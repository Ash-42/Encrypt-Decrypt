import java.util.ArrayList;

public class MorseToPlainText
{
    private static char TrigramToChar(String MorseSnippet)
    {
        switch(MorseSnippet)
        {
            case ".-": 
                return 'a'; 
            case "-...": 
                return 'b'; 
            case "-.-.": 
                return 'c'; 
            case "-..": 
                return 'd'; 
            case ".": 
                return 'e'; 
            case "..-.": 
                return 'f'; 
            case "--.": 
                return 'g'; 
            case "....": 
                return 'h'; 
            case "..": 
                return 'i'; 
            case ".---": 
                return 'j'; 
            case "-.-": 
                return 'k'; 
            case ".-..": 
                return 'l'; 
            case "--": 
                return 'm'; 
            case "-.": 
                return 'n'; 
            case "---": 
                return 'o'; 
            case ".--.": 
                return 'p'; 
            case "--.-": 
                return 'q'; 
            case ".-.": 
                return 'r'; 
            case "...": 
                return 's'; 
            case "-": 
                return 't'; 
            case "..-": 
                return 'u'; 
            case "...-": 
                return 'v'; 
            case ".--": 
                return 'w'; 
            case "-..-": 
                return 'x'; 
            case "-.--": 
                return 'y'; 
            case "--..": 
                return 'z';
            case "-----":
                return 'A';
            case ".....":
                return 'B';
            case "....-":
                return 'C';    
            case "...-.":
                return 'D';    
            case "...--":
                return 'E';    
            case "..-..":
                return 'F';
            case "..-.-":
                return 'G';
            case "..--.":
                return 'H';    
            case "..---":
                return 'I';    
            case ".-...":
                return 'J';    
            case ".-..-":
                return 'K';    
            case ".-.-.":
                return 'L';    
            case ".-.--":
                return 'M';    
            case ".--..":
                return 'N';    
            case ".--.-":
                return 'O';    
            case ".---.":
                return 'P';    
            case ".----":
                return 'Q';    
            case "-....":
                return 'R';    
            case "-...-":
                return 'S';    
            case "-..-.":
                return 'T';    
            case "-..--":
                return 'U';    
            case "-.-..":
                return 'V';    
            case "-.-.-":
                return 'W';    
            case "-.---":
                return 'X';    
            case "--...":
               return 'Y';    
            case "--..-":
                return 'Z';    
            case "--.-.":
                return '.';    
            case "--.--":
               return ',';    
            case "---..":
                return '!';    
            case "---.-":
                return ':';    
            case "----.":
                return '@';    
            case "......":
                return '-';
            case ".....-":
                return '0';    
            case "....-.":
               return '1';    
            case "....--":
                return '2';    
            case "...-..":
                return '3';    
            case "...-.-":
               return '4';    
            case "...--.":
                return '5';    
            case "...---":
                return '6';    
            case "..-...":
               return '7';    
            case "..-..-":
                return '8';    
            case "..-.-.":
                return '9';    
            case "..-.--":
               return '/';    
            case "..--..":
                return ';'; 
            case "":
                return ' ';
            }
        return ' ';
    }

    public String DecryptMorse(String MorseCode)
    {
        ArrayList<Character> PlainTextChars = new ArrayList<Character>(1);
        ArrayList<Integer> IndexOfSpaces = new ArrayList<Integer>(1);
        int len = MorseCode.length();
        for(int i = 0; i < len; i++)
        {
            if (MorseCode.charAt(i) == 'x')
            {
                IndexOfSpaces.add(i);
            }
        }
        char FirstChar = TrigramToChar(MorseCode.substring(0, IndexOfSpaces.get(0)));
        PlainTextChars.add(FirstChar);
        for(int i = 0; i + 1 < IndexOfSpaces.size(); i++)
        {
            String MorseSnippet = MorseCode.substring(IndexOfSpaces.get(i) + 1, IndexOfSpaces.get(i + 1));
            PlainTextChars.add(TrigramToChar(MorseSnippet));
        }
        char LastChar = TrigramToChar(MorseCode.substring(IndexOfSpaces.get(IndexOfSpaces.size() - 1) + 1));
        PlainTextChars.add(LastChar);
        String PlainText = PlainTextChars.toString().substring(1, 3 * PlainTextChars.size() - 1).replaceAll(", ", "");
        return PlainText;
    }

}