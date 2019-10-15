import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.Base64;

public class TP2Comprog {
    public static void main(String[] args) throws IOException
    {
    	
    	Scanner sc = new Scanner(new File("Encrypted.pmab")); 

    	byte[] decodedBytes = Base64.getDecoder().decode(sc.next()); //This exchanges words to Base64//
		System.out.println(new String(decodedBytes)); //This is a set of codes that deals with decryption of the words that are entered in the encryption//
    	
    }
}