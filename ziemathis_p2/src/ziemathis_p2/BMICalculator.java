package ziemathis_p2;

import java.util.Scanner;

public class BMICalculator {
	
	Scanner scan = new Scanner(System.in);

	//array where one value will be weight and the other is height
	static double [] data = new double[2];

	static double bmi;
	
	static String bmiCategory;

	static int ch;
	
	public double[] readUserData() {
		
		System.out.println("BMI Calculator");
		//Asks the user for the type of data
		readUnitType();
		//Reads whether the data will be imperial or metric
		readMeasurementData();
		//returns data array to the main function
		return data;
	}
	
	private int readUnitType() {
		
		System.out.println("1. BMI = (703 * WeightInPounds) / HeightInInches ^2");
		System.out.println("2. BMI = WeightInKilograms / HeightInMeter^2");
		//Loop will continue until user submits valid input
		while (ch != 1 && ch != 2) {
		System.out.print("Which formula you like to use 1 or 2: ");
		Scanner scan = new Scanner(System.in);
		ch = scan.nextInt();
		}
		
		return ch;
	}
	
	private double[] readMeasurementData() {
		
		//Program takes user input and goes to the imperial or metric method accordingly
		if (ch == 1) {
			readImperialData();
	}
		else if (ch == 2) {
			readMetricData();
		}

		return data;
	}
	
	private double[] readMetricData() {
		
		
		
		System.out.print("\nPlease enter your weight in Kilograms: ");
		data[0] = scan.nextDouble();
		//exits function if negative number is inputed
		if (data[0] < 0.00) {
			System.out.print("Error exit program.");
			System.exit(0);
		}
		
		System.out.print("\nPlease enter your height in Meters: ");
		data[1] = scan.nextDouble();
		//exits function if negative number is inputed
		if (data[1] < 0.00) {
			System.out.print("Error exit program.");
			System.exit(0);
		}
		
		return data;
	}
	
	private double[] readImperialData() {
		
		
		System.out.print("\nPlease enter your weight in Pounds: ");
		data[0] = scan.nextDouble();
		//exits function if negative number is inputed
		if (data[0] < 0.00) {
			System.out.print("Error exit program.");
			System.exit(0);
		}
		
		System.out.print("\nPlease enter your height in Inches: ");
		data[1] = scan.nextDouble();
		//exits function if negative number is inputed
		if (data[1] < 0.00) {
			System.out.print("Error exit program.");
			System.exit(0);
		}
		
		return data;
	}

	public String calculateBmi() {
		//703 * weight in pounds over height in inches squared
		if (ch == 1) {
			bmi = (703 * data[0]) / Math.pow(data[1], 2);
		}
		//weight in kilograms over height in meters squared
		else if (ch ==2 ) {
			bmi = data[0] / Math.pow(data[1], 2);
		}
		
		calculateBmiCategory();

		return bmiCategory;
	}
	
	private String calculateBmiCategory() {
		//Puts the bmi into its appropriate category
		if (bmi < 18.5) {
			bmiCategory = "Underweight";
		}
		
		else if (bmi < 25 && bmi >= 18.5) {
			bmiCategory = "Normal weight";
		}
		
		else if (bmi < 30 && bmi >= 25) {
			bmiCategory = "Overweight";
		}
		
		else if (bmi >= 30) {
			bmiCategory = "Obesity";
		}
		//Returns the string bmiCategory to the calculateBMI and then to the main function
		return bmiCategory;
	}
	
	public void displayBmi() {
		
		//BMICalculator contains a public instance method called getWeight
		getWeight();
		//BMICalculator contains a public instance method called setWeight
		setWeight(0);
		//BMICalculator contains a public instance method called getHeight
		getHeight();
		//BMICalculator contains a public instance method called setHeight
		setHeight(0);
		//BMICalculator contains a public instance method called getBmi
		getBmi();
		//BMICalculator contains a public instance method called getBmiCategory
		getBmiCategory();

		//Displays the BMI categories and their values
		System.out.println("\nBMI Categories and Values");
		System.out.println("Underweight <= 18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
		//Displays the users BMI and Category
		System.out.print("\nUser Bmi: " );
		System.out.print(bmi);
		
		System.out.print("\nUser Bmi Categroy: " );
		System.out.print(bmiCategory);
	}
	
	public double getWeight() {
		
		return data[0];
		
	}
	
	private void setWeight(double userWeight) {
		
		this.data[0] = userWeight;

	}
	
	public double getHeight() {
		
		return data[1];
		
	}
	
	private void setHeight(double userHeight) {
		
		this.data[1] = userHeight;
		
	}
	
	public double getBmi() {
		
		return bmi;
		
	}
	
	public String getBmiCategory() {
		
		return bmiCategory;
		
	}
	
	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();   
	}
}