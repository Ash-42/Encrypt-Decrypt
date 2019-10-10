// This class decrypts the cypher code
// To a morse code

public class CypherToMorse
{
    private static String CharToMorse(char ch)
    {
        switch(ch)
        {
            case('R'):
                return "...";
            case('o'):
                return "..-";
            case('U'):
                return "..x";
            case('n'):
                return ".-.";
            case('D'):
                return ".--";
            case('t'):
                return ".-x";
            case('@'):
                return ".x.";
            case('b'):
                return ".x-";
            case('L'):
                return ".xx";
            case('e'):
                return "-..";
            case('C'):
                return "-.-";
            case('*'):
                return "-.x";
            case('#'):
                return "--.";
            case('X'):
                return "---";
            case('&'):
                return "--x";
            case('%'):
                return "-x.";
            case('G'):
                return "-x-";
            case('P'):
                return "-xx";
            case('q'):
                return "x..";
            case('!'):
                return "x.-";
            case('W'):
                return "x.x";
            case('k'):
                return "x-.";
            case('M'):
                return "x--";
            case('?'):
                return "x-x";
            case('~'):
                return "xx.";
            case('Z'):
                return "xx-";
            case('a'):
                return "xxx"; 
        }
        return "";
    }

    public String DecryptCypher(String CipherCode)
    {
        int len = CipherCode.length();
        String MorseCodeList[] = new String[len];
        for(int i = 0; i < len; i++)
        {
            String MorseSnippet = CharToMorse(CipherCode.charAt(i));
            MorseCodeList[i] = MorseSnippet;
        }
        String MorseCode = String.join("", MorseCodeList);
        return MorseCode;
    }

}