package test;

import java.util.Random;

public class BuckyRandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random dice = new Random ();
		int number;
		
		for(int counter =1; counter <= 10; counter ++) {
			number= 1+dice.nextInt(6);
			System.out.println(number + " ");
			
		}
	}

}
