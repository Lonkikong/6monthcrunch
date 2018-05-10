package roliDemo;

public class Human {

	private int alter;
	private boolean weiblich;
	private int gewicht = 9999999;
	
	public Human(int a, boolean w, int g) {
		this.alter=a;
		this.weiblich=w;

	}
	public void atmen() {
		System.out.println("Ich atme");
	}
	public void pissen() {
		System.out.println("Ich pisse");
	}
	public void whoami() {
		System.out.println("Ich bin "+weiblich+", "+alter+" Jahre alt und wiege "+gewicht+" kg");
	}
	public void grunzen() {
		System.out.println("grunz grunz");
	}
}
