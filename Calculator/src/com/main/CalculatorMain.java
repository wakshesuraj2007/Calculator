package com.main;


import com.DAO.CalculatorImplementation;
import java.util.*;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculatorImplementation c = new CalculatorImplementation();
		char ch;
		do {
			System.out.print("Enter the first number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter the second number: ");
			int num2 = sc.nextInt();
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Addition :" + num1 + num2);
				break;
			case 2:
				System.out.println("substraction :" + (num1-num2) );

				break;
			case 3:
				System.out.println("multiplication :" + num1*num2);
				break;
			case 4:
				System.out.println("dividation :" + num1/num2);
				break;
			default:
				System.out.println("Invalid Input..");
			}
			System.out.print("Do you want to continue (Y/N): ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		sc.close();
	}
}
