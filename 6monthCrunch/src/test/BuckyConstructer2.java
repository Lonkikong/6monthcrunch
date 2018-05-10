package test;

public class BuckyConstructer2 {
	
	private String girlName;
	
	public BuckyConstructer2(String name) {
		girlName=name;
	}

	public void name(String name) {
		girlName = name;
	}

	public void setName(String name) {

		girlName = name;

	}

	public String getName() {
		return girlName;

	}
	private boolean getSomeShit() {
		return true;
	}

	public void saying() {
		System.out.printf("my first girlfriend was %s\n, %s, %s %s %s\n", getName(),"Liang","Ich","bin","Batman");

	}public void saying2() {
		System.out.println("my Second girlfriend was "+ getName() + " and "+getSomeShit()+" she´s gay");
		
	}
}
