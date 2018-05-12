package test;

import java.util.Scanner;
public class BuckyAveraging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		
		while(counter < 10) {
			grade = input.nextInt();
			total= total + grade;
			counter++;
			
		}
		
		average = total/10;
		System.out.println("your answer is " + average);
	}
	
	

}
