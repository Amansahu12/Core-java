package ncs;

import java.util.Scanner;

public class MyCalculator {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();

		Scanner sc = new Scanner(System.in);
		System.out.println("Hello start calculator ");
		System.out.println("Enter first number : ");
		int k = sc.nextInt();
		System.out.println("Enter second number : ");
		int l = sc.nextInt();
		mc.addition(k, l);
		mc.substraction(k, l);
		mc.multiplacation(k, l);
		mc.divide(k, l);
		mc.modulas(k, l);
		mc.factorial(k);

	}

	public void addition(int i, int j) {

		System.out.println("addition is");
		System.out.println(i + j);
	}

	public void substraction(int i, int j) {

		System.out.println("substraction is ");
		System.out.println(i - j);

	}

	public void multiplacation(int i, int j) {

		System.out.println("multiplacation is ");
		System.out.println(i * j);
	}

	public void divide(double i, double j) {

		System.out.println("divide is ");
		System.out.println(i / j);
	}

	public void modulas(int i, int j) {
		System.out.println("modulas is");
		System.out.println(i % j);
	}

	public void factorial(int j) {

		int fact = 1;
		for (int i = 1; i <= j; i++) {
			fact = fact * i;
			// System.out.println("factorial is");
		}
		System.out.println("factorial is");
		System.out.println(fact);
	}

}
