import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class StringOutputStream {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		// Basic character stream for full name
		StringWriter fullnameCharStream = new StringWriter();
		// Augments character stream (full name) with print();
		PrintWriter fullnameOSS = new PrintWriter(fullnameCharStream);
		
		// Basic Character Stream for age
		StringWriter ageCharStream = new StringWriter();
		// Augments character stream (age) with print()
		PrintWriter ageOSS = new PrintWriter(ageCharStream);
		
		String playerFirstName;		// Player First name
		String playerLastName;		// Player Last name
		String playerFullName;		// Player Full name
		String ageStr;				// Age (String)
		int userAge;				// Age
		
		// Prompt user for input
		System.out.print("Enter \" firstname lastname age\": \n   ");
		playerFirstName = scnr.next();
		playerLastName = scnr.next();
		userAge = scnr.nextInt();
		
		// Writes formatted string to buffer, copies from
		// underlying char buffer.
		fullnameOSS.print(playerLastName + ", " + playerFirstName);
		playerFullName = fullnameCharStream.toString();
		
		// Output parsed input
		System.out.println("\n   Full name: " + playerFullName);
		
		// Writes int age as character to buffer
		ageOSS.print(userAge);
		
		// Appends (minor) to object if less than 21, then
		// copies buffer into String.
		if (userAge < 21) {
			ageOSS.print("  (minor)");
		}
		
		ageStr = ageCharStream.toString();
		
		// Output String
		System.out.println("   Age: " + ageStr);
		
		scnr.close();

	}

}
