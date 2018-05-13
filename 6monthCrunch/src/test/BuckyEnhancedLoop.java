package test;

public class BuckyEnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int bucky[]= {2,3,4,5,6};
		int total=0;
		
		for(int x: bucky) {
			
		total+= x;
		}
		System.out.println(total);
	}

}
