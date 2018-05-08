package test;

import java.util.Scanner;

public class java2 {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Your favorite Number: ");

		if (userInput.hasNextInt()) {
			int numEntered = userInput.nextInt();

			System.out.println(" you entered " + numEntered);

			int numEnteredTime2 = numEntered + numEntered;
			System.out.println(numEntered + " + " + numEntered + " = " + numEnteredTime2
					);
			
			int numEnteredMinus2= numEntered - 2;
			System.out.println(numEntered + " -2 = " + numEnteredMinus2);
			
			int numEnteredTimeSelf = numEntered * numEntered;
			System.out.println(numEntered + " * " + numEntered + " = " + numEnteredTimeSelf);
			
			int numEnteredremainder= numEntered % 2;
			System.out.println(numEntered + " % 2 = " + numEnteredremainder);
		
			numEntered += 2 ;
			numEntered -= 2 ;
	
			
			numEntered --;
			numEntered ++;
			
			
			
		
		} else {

			System.out.print("Enter an interger next time");

		}
	}
}