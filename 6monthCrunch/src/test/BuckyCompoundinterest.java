package test;

class BuckyCompoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double Amount;
			double principal =10000;
			double rate= .01;
			
			for(int day= 1;day<20;day++) {
				Amount= principal*Math.pow(1+rate, day);
					System.out.println(day + "  "+ Amount);
	
	}
	}
}
