package ziemathis_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	
	static int answer;
	static int userAnswer;

		public static void main (String[] args) {
			
		quiz();
}
		
		public static void quiz() {
			
			System.out.println("Multiplication Practice");
			SecureRandom sr = new SecureRandom();
		       int num1 = sr.nextInt(10);
		       int num2 = sr.nextInt(10);
		       answer = num1 * num2;
		       String q = "How much is "+num1+" times "+num2;
			askQuestion(q);
			
			while (!isAnswerCorrect()) {
			readResponse();
			
			if (isAnswerCorrect()) {
				
				displayCorrectAnswer();
			}
			
			else {
				displayCorrectResponse();
			}
			
			}
		}
		
		private static String askQuestion(String q) {
			
		       System.out.println(q);
		       return q;
			
		}
		
		public static int readResponse() {
			
			Scanner scan = new Scanner(System.in);
			userAnswer = scan.nextInt();
			
			return userAnswer;
		}
		
		public static boolean isAnswerCorrect() {
			
			if( userAnswer == answer) {
				return true;
			}
			
			else 
			{
				return false;
			}
		}
		
		public static void displayCorrectAnswer() {
			
			SecureRandom sr = new SecureRandom();
			int num3 = sr.nextInt(4)+1;
			
			switch (num3) {
			
			case 1 :
			System.out.println("Very Good!");
			break;
			
			case 2 :
				System.out.println("Excellent!");
				break;
				
			case 3 :
				System.out.println("Nice Work!");
				break;
				
			case 4 :
				System.out.println("Keep up the good work!");
				break;
				
			}
		}
		
		public static void displayCorrectResponse() {
			
			SecureRandom sr = new SecureRandom();
			int num4 = sr.nextInt(4)+1;
			
			switch (num4) {
			
			case 1 :
				System.out.println("No. Please try again.");
			break;
			
			case 2 :
				System.out.println("Wrong. Try once more.");
				break;
				
			case 3 :
				System.out.println("Don't give up!");
				break;
				
			case 4 :
				System.out.println("No, Keep trying.");
				break;
				
			}
		}

		
}

