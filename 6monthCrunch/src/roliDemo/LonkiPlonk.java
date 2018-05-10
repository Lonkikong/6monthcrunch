package roliDemo;

public class LonkiPlonk extends Human{

	private int alter;
	private boolean weiblich;
	private int gewicht;
	
	public LonkiPlonk(int a, boolean w, int g) {
		super(a, w, g);
		this.alter=a;
		this.weiblich=w;
		// TODO Auto-generated constructor stub
	}
	public void atmen() {
		System.out.println("Ich atme wie Batman");
	}
	public void pissen() {
		System.out.println("Ich pisse wie ein Neanderthaler");
	}
	public void whoami() {
		System.out.println("Ich bin "+weiblich+", "+alter+" Jahre alt und wiege "+gewicht+" kg und heiﬂe Lonkiplonk");
	}

}
