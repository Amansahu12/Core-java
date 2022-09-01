package ncs;

import java.util.Scanner;

public class NewMethod {
	public static void main(String[] args) {
		NewMethod n = new NewMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int i = sc.nextInt();
		System.out.println("Enter second number : ");
		int j = sc.nextInt();

		 n.modular(i , j);
		n.operator(i , j);
	}

	public void modular(int i, int j) {
		System.out.println("modular is");
		System.out.println(i % j);
	}

	public void operator(int i, int j) {

		String s = (i % 2 == 0) ? "good luck" : "bad luck";
		System.out.println(s);
	}
}
