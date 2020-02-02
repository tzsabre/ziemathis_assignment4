package ziemathis_p1;

import java.util.Scanner;
public class Application {

	public static void main (String[] args) {
		int data;
		int data1[];
		
		//Initializes and assigns value to input1 so while function runs.
		String input1;
		input1 = "a";
		
		
		//While function runs as long as user does not quit
		while (!input1.equals("q")) {
			
			//user choice to encrypt, decrypt or quit.
			System.out.println("Please enter e to encrypt a number, d to decrypt a number, or q to quit.");
			Scanner input = new Scanner(System.in);
			input1 = input.next();
			
			if (input1.equals("e")) {
		                                                      
		System.out.println("Please enter 4 digit number to encrypt:");
		
		Scanner encrypt = new Scanner(System.in);
		data = encrypt.nextInt();

		//Integer array is being assigned value from encrypter class
		data1 = Encrypter.encrypt (data);
		
		

		System.out.println("Encprypted Number is:");
		System.out.print(data1[0]);
		System.out.print(data1[1]);
		System.out.print(data1[2]);
		System.out.println(data1[3]);
			}
			
			if (input1.equals("d")) {
		System.out.println("Please enter 4 digit number to decrypt:");
		
		Scanner decrypt = new Scanner(System.in);
		data = decrypt.nextInt();

		//Integer array is being assigned value from decrypter class
		data1 = Decrypter.decrypt (data);
		
		//Prints values one at a time from an array to allow for a leading zero
		System.out.println("Decprypted Number is:");
		System.out.print(data1[0]);
		System.out.print(data1[1]);
		System.out.print(data1[2]);
		System.out.println(data1[3]);
			}
		}
	}
}
