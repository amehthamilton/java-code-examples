import java.util.Scanner;

public class StringInputStream {
	
	public static void main (String[] args) {
		
		Scanner readingSS = null;		// Input string stream
		String userInfo;				// Input string
		String word1;					// Reading
		String word2;					// String
		String word3;					// Stream
		int words;						
		
		userInfo = "Reading String Stream 3";
		
		// Initialize scanner object with string
		readingSS = new Scanner(userInfo);
		
		// Parse words from String
		word1 = readingSS.next();
		word2 = readingSS.next();
		word3 = readingSS.next();
		words = readingSS.nextInt();
		
		// Output parsed values
		System.out.println("Word 1:\t" + word1);
		System.out.println("Word 2:\t" + word2);
		System.out.println("Word 3:\t" + word3);
		System.out.println("# of words: " + words);
		
		readingSS.close();
    
    /**
		 * The output should be:
		 * 
		 * 	Word 1:	Reading
		 *	Word 2:	String
		 *	Word 3:	Stream
		 *	# of words: 3
		 */
		
	}

}
