package ziemathis_problem1;

import java.util.Scanner;
import java.security.SecureRandom;


public class CAI1 {
	
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
			
			System.out.println("Very Good!");
		}
		
		public static void displayCorrectResponse() {
			
			System.out.println("No. Please try again.");
		}

		
}