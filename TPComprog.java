import java.util.ArrayList;
import java.util.Base64;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class TPComprog
{
    public static void main(String[] args) throws IOException
    {
    	ArrayList<String> word = new ArrayList<>(); //Used to fetch the element from the position of the list//
    	Scanner sc = new Scanner(System.in);
    	Boolean isDone = false; // Attempts to cancel execution of this task.
    	
    	while(!isDone) //Code block to be executed and returns true if this task completed//
    	{
    		String wordIN = sc.next();
    		if(!wordIN.equals(":q")) // When :q is entered, the program will stop//
    		{
    			byte[] encodedBytes = Base64.getEncoder().encode((wordIN + "\n").getBytes());
    			word.add(new String(encodedBytes));
    		}
    		else //If the statement is not true, then it will proceed in this code//
    		{
    			isDone = true;
    		}
    	}
    	
    	FileWriter fw = new FileWriter("Encrypted.pmab"); //This is the file name after decryption//
    	for(String a: word)
    	{
    		fw.write(a);    
    	}
    	
      	fw.close();  
       	
    }
}