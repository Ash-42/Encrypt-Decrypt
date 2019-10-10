import java.util.Scanner;

class EncryptDecrypt
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter E to encrypt.\nEnter D to decrypt.\nEnter X to exit.");
            char Choice = sc.next().charAt(0);
            sc.nextLine();
            while(Choice != 'X')
            {
                if (Choice == 'E')
                {
                    System.out.println("\nEnter the text to be encrypted: ");
                    String PlainTextInput = sc.nextLine();
                    PlainTextToMorse Encryptor1 = new PlainTextToMorse();   // Creates an object of the type PlainTextToMorse
                    String MorseCode1 = Encryptor1.EncryptToMorseCode(PlainTextInput); 
                    MorseToCypher Encryptor2 = new MorseToCypher();
                    String CypherCode = Encryptor2.EncryptToCypherCode(MorseCode1);
                    System.out.println("\nThe encrypted text is:\n" + CypherCode);
                }
                else if (Choice == 'D')
                {
                    System.out.println("\nEnter the text to be decrypted: ");
                    String CypherInput = sc.nextLine();
                    CypherToMorse Decryptor1 = new CypherToMorse();
                    String MorseCode2 = Decryptor1.DecryptCypher(CypherInput);
                    MorseToPlainText Decryptor2 = new MorseToPlainText();
                    String PlainTextOutput = Decryptor2.DecryptMorse(MorseCode2);
                    System.out.println("\nThe decrypted text is:\n" + PlainTextOutput);
                }
                System.out.println("\nEnter E to encrypt.\nEnter D to decrypt.\nEnter X to exit.");
                Choice = sc.next().charAt(0);
                sc.nextLine();
            }
            sc.close();
    }
}