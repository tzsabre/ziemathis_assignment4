package ziemathis_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {

	
	static int answer;
	static int userAnswer;
	static int rAPercent = 0;
	static int difficulty;
	static int type;
	static String q = null;

		public static void main (String[] args) {
			
		quiz();
}
		
		public static void quiz() {
			
			readDifficulty();
			readProblemType();
			
			int rightAnswer = 0;
			
			System.out.println("Practice Problems");
			
			for (int i = 0; i < 10; i++) {
				
			
			generateQuestionArgument();
			
			askQuestion(q);
			
			readResponse();
			
			if (isAnswerCorrect()) {
				
				displayCorrectAnswer();
				rightAnswer++;
				
			}
			
			else {
				displayCorrectResponse();
			}
		}
			
			rAPercent = (rightAnswer / 10) * 100;
			displayCompletionMessage();
		}
		
		public static int readDifficulty() {
			
			System.out.println("Please choose a difficulty 1, 2 3, or 4: ");
			Scanner scan = new Scanner(System.in);
			difficulty = scan.nextInt();
			
			return difficulty;
		}
		
		public static int readProblemType() {
			
			System.out.println("Problem Types");
			System.out.println("Type 1 Addition");
			System.out.println("Type 2 Multiplication");
			System.out.println("Type 3 Subtraction");
			System.out.println("Type 4 Division, for division do not include a decimal or remainder");
			System.out.println("Type 5 Mixture");
			System.out.println("Please choose a difficulty 1, 2, 3, 4, or 5: ");
			
			Scanner scan = new Scanner(System.in);
			type = scan.nextInt();
			
			return type;
		}
		
		public static void generateQuestionArgument(){
			
			SecureRandom sr = new SecureRandom();
			
			if (difficulty == 1) {
			       int num1 = sr.nextInt(10);
			       int num2 = sr.nextInt(10);
			       
			       if (type == 5){
			    	   
			    	   int num3 = sr.nextInt(4)+1;
			    	   
			    	   	if (num3 == 1) {
			    	   		answer = num1 + num2;
			    	   		q = "How much is "+num1+" plus "+num2;
			       		}
			       
			       		if (num3 == 2) {
			       			answer = num1 * num2;
			    	   		q = "How much is "+num1+" times "+num2;
			       		}
			       
			       		if (num3 == 3) {
			    	   		answer = num1 - num2;
			    	   		q = "How much is "+num1+" minus "+num2;
			       		}
			       
			       		if (num3 == 4) {
			    	   		answer = num1 / num2;
			    	   		q = "How much is "+num1+" divided "+num2;
			       		}
			       }
			       
			       else {
			    	   
			    	   if (type == 1) {
			    	   		answer = num1 + num2;
			    	   		q = "How much is "+num1+" plus "+num2;
			       		}
			       
			       		if (type == 2) {
			       			answer = num1 * num2;
			    	   		q = "How much is "+num1+" times "+num2;
			       		}
			       
			       		if (type == 3) {
			    	   		answer = num1 - num2;
			    	   		q = "How much is "+num1+" minus "+num2;
			       		}
			       
			       		if (type == 4) {
			    	   		answer = num1 / num2;
			    	   		q = "How much is "+num1+" divided "+num2;
			       		}
			    	   
			       }
			       
				}
			
			
			
			
				
				if (difficulty == 2) {
				       int num1 = sr.nextInt(100);
				       int num2 = sr.nextInt(100);
				       
				       if (type == 5){
				    	   
				    	   int num3 = sr.nextInt(4)+1;
				    	   
				    	   	if (num3 == 1) {
				    	   		answer = num1 + num2;
				    	   		q = "How much is "+num1+" plus "+num2;
				       		}
				       
				       		if (num3 == 2) {
				       			answer = num1 * num2;
				    	   		q = "How much is "+num1+" times "+num2;
				       		}
				       
				       		if (num3 == 3) {
				    	   		answer = num1 - num2;
				    	   		q = "How much is "+num1+" minus "+num2;
				       		}
				       
				       		if (num3 == 4) {
				    	   		answer = num1 / num2;
				    	   		q = "How much is "+num1+" divided "+num2;
				       		}
				       }
				       
				       else {
				    	   
				    	   if (type == 1) {
				    	   		answer = num1 + num2;
				    	   		q = "How much is "+num1+" plus "+num2;
				       		}
				       
				       		if (type == 2) {
				       			answer = num1 * num2;
				    	   		q = "How much is "+num1+" times "+num2;
				       		}
				       
				       		if (type == 3) {
				    	   		answer = num1 - num2;
				    	   		q = "How much is "+num1+" minus "+num2;
				       		}
				       
				       		if (type == 4) {
				    	   		answer = num1 / num2;
				    	   		q = "How much is "+num1+" divided "+num2;
				       		}
				    	   
				       }
					}
				
				
				
				
				
				
				if (difficulty == 3) {
				       int num1 = sr.nextInt(1000);
				       int num2 = sr.nextInt(1000);
				       
				       if (type == 5){
				    	   
				    	   int num3 = sr.nextInt(4)+1;
				    	   
				    	   	if (num3 == 1) {
				    	   		answer = num1 + num2;
				    	   		q = "How much is "+num1+" plus "+num2;
				       		}
				       
				       		if (num3 == 2) {
				       			answer = num1 * num2;
				    	   		q = "How much is "+num1+" times "+num2;
				       		}
				       
				       		if (num3 == 3) {
				    	   		answer = num1 - num2;
				    	   		q = "How much is "+num1+" minus "+num2;
				       		}
				       
				       		if (num3 == 4) {
				    	   		answer = num1 / num2;
				    	   		q = "How much is "+num1+" divided "+num2;
				       		}
				       }
				       
				       else {
				    	   
				    	   if (type == 1) {
				    	   		answer = num1 + num2;
				    	   		q = "How much is "+num1+" plus "+num2;
				       		}
				       
				       		if (type == 2) {
				       			answer = num1 * num2;
				    	   		q = "How much is "+num1+" times "+num2;
				       		}
				       
				       		if (type == 3) {
				    	   		answer = num1 - num2;
				    	   		q = "How much is "+num1+" minus "+num2;
				       		}
				       
				       		if (type == 4) {
				    	   		answer = num1 / num2;
				    	   		q = "How much is "+num1+" divided "+num2;
				       		}
				    	   
				       }
					}
				
				
				
				
				
				
				
				if (difficulty == 4) {
				       int num1 = sr.nextInt(10000);
				       int num2 = sr.nextInt(10000);
				       
				       if (type == 5){
				    	   
				    	   int num3 = sr.nextInt(4)+1;
				    	   
				    	   	if (num3 == 1) {
				    	   		answer = num1 + num2;
				    	   		q = "How much is "+num1+" plus "+num2;
				       		}
				       
				       		if (num3 == 2) {
				       			answer = num1 * num2;
				    	   		q = "How much is "+num1+" times "+num2;
				       		}
				       
				       		if (num3 == 3) {
				    	   		answer = num1 - num2;
				    	   		q = "How much is "+num1+" minus "+num2;
				       		}
				       
				       		if (num3 == 4) {
				    	   		answer = num1 / num2;
				    	   		q = "How much is "+num1+" divided "+num2;
				       		}
				       }
				       
				       else {
				    	   
				    	   if (type == 1) {
				    	   		answer = num1 + num2;
				    	   		q = "How much is "+num1+" plus "+num2;
				       		}
				       
				       		if (type == 2) {
				       			answer = num1 * num2;
				    	   		q = "How much is "+num1+" times "+num2;
				       		}
				       
				       		if (type == 3) {
				    	   		answer = num1 - num2;
				    	   		q = "How much is "+num1+" minus "+num2;
				       		}
				       
				       		if (type == 4) {
				    	   		answer = num1 / num2;
				    	   		q = "How much is "+num1+" divided "+num2;
				       		}
				    	   
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
		
		public static void displayCompletionMessage(){
			
			System.out.print("Your score is: ");
			System.out.println(rAPercent);
			if(rAPercent >= 75) {
		
			System.out.println("Congratulations, you are ready to go to the next level!");
			}
			
			else {
				
				System.out.println("Please ask your teacher for extra help.");
			}
		}
}
