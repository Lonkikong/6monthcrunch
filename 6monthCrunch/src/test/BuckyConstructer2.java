package test;

public class BuckyConstructer2 {
	
	public void name(String name) {
		girlName=name;
	}
	private String girlName;
	
public void setName(String name) {
	
	girlName = name;
	
}
	public String getName () {
		return girlName;
		
		
	}
		public void saying(){
			System.out.printf("my first girlfriend was %s\n",getName());
			
		}
}
