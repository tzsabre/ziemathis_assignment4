package ziemathis_p1;

public class Decrypter {

	public static int[] decrypt (int x) {
		int[] y = new int[4];
		int first;
		int second;
		int third;
		int fourth;
		
		//isolating each digit to a variable
		//Isolates the forth digit by getting the remainder of the whole number divided by 10
		//Continue through the rest of the digits by dividing by increasing multiples of 10 first.
		//The last digit is found by dividing by 1000
		fourth = x % 10;
		third = (x / 10) % 10;
		second = (x / 100) % 10;
		first = x / 1000;
		
		//swapping the fist and third digits and swapping the second and forth digits. Assigning value to the array y
		y[0] = third;
		y[1] = fourth;
		y[2] = first;
		y[3] = second;
		
		//add 3 and the gets the remainder of dividing by 10 to decrypt the number
		y[0] = (y[0] + 3) % 10;
		y[1] = (y[1] + 3) % 10;
		y[2] = (y[2] + 3) % 10;
		y[3] = (y[3] + 3) % 10;
		
		return y;
	}
}
