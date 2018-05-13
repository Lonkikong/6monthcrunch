package test;

public class BuckySummingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bucky[]= {20,16,20};
		int sum=0;
		
		for(int counter=0;counter<bucky.length;counter++) {
			sum+=bucky[counter];
			
		}
		System.out.println("the sum of those number is" + sum);	
	}

}
