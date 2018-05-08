package test;
import java.util.Scanner;

class buckyManyMethod{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		buckyManyMethod2 batguyObject = new buckyManyMethod2 () ;
		
		
		System.out.println("Enter Thy Name:");
		String temp = input.nextLine();
		
		
		batguyObject.setName(temp);
		batguyObject.saying();
		
		
		buckyManyMethod2 batguyObject2 = new buckyManyMethod2 () ;
		
		System.out.println(" Enter thy age: ");
		String temp2 = input.nextLine();
		
		
		batguyObject2.setName(temp2);
		batguyObject2.saying2();
		input.close();
	}
	
}