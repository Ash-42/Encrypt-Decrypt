// This class encrypts the string of encrypted morse code
// To the cipher code using a Key 
// The key is represented in the EncryptUsingKey method using a switch statement

public class MorseToCypher
{
    private static char EncryptUsingKey(String MorseSnippet)   // Each trigraph is then converted into
    {                                                         //  a random character using a key
        switch(MorseSnippet)
        {
            case("..."):
                return 'R';
            case("..-"):
                return 'o';
            case("..x"):
                return 'U';
            case(".-."):
                return 'n';
            case(".--"):
                return 'D';
            case(".-x"):
                return 't';
            case(".x."):
                return '@';
            case(".x-"):
                return 'b';
            case(".xx"):
                return 'L';
            case("-.."):
                return 'e';
            case("-.-"):
                return 'C';
            case("-.x"):
                return '*';
            case("--."):
                return '#';
            case("---"):
                return 'X';
            case("--x"):
                return '&';
            case("-x."):
                return '%';
            case("-x-"):
                return 'G';
            case("-xx"):
                return 'P';
            case("x.."):
                return 'q';
            case("x.-"):
                return '!';
            case("x.x"):
                return 'W';
            case("x-."):
                return 'k';
            case("x--"):
                return 'M';
            case("x-x"):
                return '?';
            case("xx."):
                return '~';
            case("xx-"):
                return 'Z';
            case("xxx"):
                return 'a';  
        }
        return ' ';
    }

    public String EncryptToCypherCode(String MorseString)      // The entire morse string is
    {                                                         // segmented into strings of 3 morse
        int len = MorseString.length();                      // characters each (trigraph/trigram)
        char [] CipherCharacterList = new char[len/3];
        for(int i = 0; (i + 2) < len; i += 3)
        {
            String MorseSnippet = String.format("%c%c%c", MorseString.charAt(i), MorseString.charAt(i+1), MorseString.charAt(i+2));
            char CipherCharacter = EncryptUsingKey(MorseSnippet);
            CipherCharacterList[i/3] = CipherCharacter; 
        }
        String CipherText = new String(CipherCharacterList);
        return CipherText;
    }

}