package test;

public class Lonkikong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "5";
		String input2= "7";
		System.out.println(berechneDieSumme(Integer.parseInt(input1),Integer.parseInt(input2)));
	}
	
	private static int berechneDieSumme(int x, int y) {
		int retval=0;
		retval=x+y;
		return retval;
	}

}

