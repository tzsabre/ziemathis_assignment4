package ziemathis_p1;

public class Encrypter {
	

	public static int[] encrypt (int x ) {
	
		int[] y = new int[4];
		int first;
		int second;
		int third;
		int fourth;
		
		//isolating each digit to a variable.
		//Isolates the forth digit by getting the remainder of the whole number divided by 10
		//Continue through the rest of the digits by dividing by increasing multiples of 10 first.
		//The last digit is found by dividing by 1000
		fourth = x % 10;
		third = (x / 10) % 10;
		second = (x / 100) % 10;
		first = x / 1000;
		
		//adding 7 to each digit and then getting the remainder of that number divided by 10
		fourth =  (fourth + 7) % 10;
		third =  (third + 7) % 10;
		second =  (second + 7) % 10;
		first =  (first + 7) % 10;
		
		//swapping the fist and third digits and swapping the second and forth digits. Assigning value to y
		y[0] = third;
		y[1] = fourth;
		y[2] = first;
		y[3] = second;

		
		return y;
	}
}