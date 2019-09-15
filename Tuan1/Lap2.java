package Tuan_1;

import java.util.Scanner;

public class lab_2 {
	public static Scanner sr = new Scanner(System.in);

	// Phương trình bậc 1
	public static void superlativeEquation(float a, float b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Equations countless solutions!");
			} else {
				System.out.println("The equation has no solution!");
			}
		} else {
			System.out.println("The equation has solutions: " + (-b / a));
		}
	}

	// Phương trình bậc 2
	public static void quadraticEquation2(float a, float b, float c) {
		// Kiểm tra các số
		if (a == 0) {
			if (b == 0) {
				System.out.println("The equation has no solution!");
			} else {
				System.out.println("The equation has 1 solution: " + "x = " + (-c / b));
			}
			return;
		}
		// Tính delta
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;
		// Tính nghiệm
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("The equation has 2 solutions: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("The equation has a double solution: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("The equation has no solution!");
		}

	}

	//Tính tiền điện
	public static void calculateElectricBill(int powerNumber) {
		if (powerNumber < 50) {
			System.out.println("The bill is: " + powerNumber * 1000);
		} else {
			System.out.println("The bill is: " + (50 * 1000 + (powerNumber - 50) * 1200));
		}
	}

	public static void main(String[] args) {
		System.out.println("------------------Menu------------------");
		System.out.println("1. Solve the first order equation");
		System.out.println("2. Solve the quadratic equation");
		System.out.println("3. Calculate electricity bill");
		System.out.println("4. Exit");
		
		int numberChoice = 0;
		while (numberChoice != 4) {
			System.out.print("Your choice: ");
			numberChoice = sr.nextInt();
			switch (numberChoice) {
			case 1: {
				System.out.print("Enter number a: ");
				float a = sr.nextFloat();
				
				System.out.print("Enter number b: ");
				float b = sr.nextFloat();
				
				superlativeEquation(a,b);
				break;
			}
			case 2: {
				
				System.out.print("Enter number a: ");
				float a = sr.nextFloat();
				
				System.out.print("Enter number b: ");
				float b = sr.nextFloat();
				
				System.out.print("Enter number c: ");
				float c = sr.nextFloat();
				
				quadraticEquation2(a,b,c);
				break;
			}
			case 3: {
				System.out.print("Enter your power electric number: ");
				int powerNumber = sr.nextInt();
				
				calculateElectricBill(powerNumber);
				break;
			}
			default: {
				System.out.println("Have a good day ^^");
				break;
			}
			}
			
		}
		
	}
}