package test;

public class BuckyMultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int firstarray[][]={ {8,9,5,6,4},{12,14,16,18,19}};
			int secondarray[][]= {{30,40,50},{42},{4,5,6}};
	}
	public static void display(int x[][]) {
		for(int row=0;row<x.length;row++) {
			for(int columm=0;column<x[row].length;column++) {
				System.out.print(x[row][column]+"\t");
				
			}
			
		}
		
	}
}
