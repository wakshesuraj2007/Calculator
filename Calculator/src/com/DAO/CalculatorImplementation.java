package com.DAO;

import java.util.*;
import com.bean.*;

public class CalculatorImplementation implements calculator_details {
	Scanner sc = new Scanner(System.in);
	CalculatorInfo calculator;

	public CalculatorImplementation() {

	}

	public void add() {
		System.out.println("enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("enter 2st number");
		int num2 = sc.nextInt();
		System.out.println("Addition :" + num1 + num2);

	}

	public void substract() {
		System.out.println("enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("enter 2st number");
		int num2 = sc.nextInt();

		System.out.println("substraction :" + (num1 - num2));

	}

	public void multi() {
		System.out.println("enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("enter 2st number");
		int num2 = sc.nextInt();

		System.out.println("multiplication :" + num1 * num2);

	}

	public void divide() {
		System.out.println("enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("enter 2st number");
		int num2 = sc.nextInt();

		System.out.println("dividation :" + num1 / num2);

	}
}
