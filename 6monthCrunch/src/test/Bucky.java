package test;

import java.util.Random;

public class Bucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int freq[] = new int[10];

		for (int roll = 1; roll < 1000000; roll++) {
			++freq[1 + rand.nextInt(9)];

		}
		System.out.println("Face\tFrequency");

		for (int face = 0; face < freq.length; face++) {
			System.out.println("" + face + "\t" + freq[face]);	
		
		
		}
	}

}
