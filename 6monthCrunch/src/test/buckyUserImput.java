package test;

import java.util.Scanner;

 class buckyUserImput{
	
 public static void main(String args [] ) {
		Scanner batman = new Scanner (System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = batman.nextDouble();
		System.out.println("Enter second num: ");
		snum = batman.nextDouble();
		answer= fnum + snum;
		System.out.println (answer);
		
		batman.close();
		
		
		
		
		
	}
}