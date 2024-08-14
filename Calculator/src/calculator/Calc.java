package calculator;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		System.out.println("Java Console Calculator");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Please enter two to perform calculator");
		
		System.out.println("\n First Number: ");
		
		int num1 = sc.nextInt();
		
		System.out.println("\n Second Number: ");
		int num2 = sc.nextInt();
		System.out.println("\n Select between (*,/,+,-)\n Type out the character in a single letter: ");
		
		String op = sc.next();
		
		
		switch(op) {
		case "*":
			System.out.println("\n Your result: "+(num1*num2));
			break;
			
		case "/":
			System.out.println("\n Your result: "+(num1/num2));
			break;
			
		case "+":
			System.out.println("\n Your result: "+(num1+num2));
			break;
			
		case "-":
			System.out.println("\n Your result: "+(num1/num2));
			break;
			
		default: 
			System.out.println("\n Please select a valid character");
			
			
		}
	
		
		sc.close();
		
	}
	

}
