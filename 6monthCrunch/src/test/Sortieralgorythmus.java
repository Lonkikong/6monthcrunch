package test;
import java.util.Scanner;

public class Sortieralgorythmus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*AUFGABE: Sortiere einen String an Zahlen. Von 0 aufsteigend. Gib das Ergebnis anschließend in die Konsole aus. Verwende für den Input den vorgegebenen String "EINGABE"
		
		
	String Eingabe = "84846468468432456789098765434567890987543234567898654323456787654223456787654212346787654212345678754322346789865423467465";
	
	int position =0;
	while (true)
	{
	
		
		
		if(position!=0) {
			int zahlPosition =Integer.parseInt(""+Eingabe.charAt(position));
			int zahlDavor=Integer.parseInt(""+Eingabe.charAt(position-1));
			if(zahlDavor < zahlPosition) {
			
				String vorderteil = Eingabe.substring(0, position-1);
				String hinterteil = Eingabe.substring(position+1);
			
				Eingabe=vorderteil+zahlPosition+zahlDavor+hinterteil;
				System.out.println(Eingabe);
				position=0;
			}
		}
			
		position++;
		if(position==Eingabe.length()) {
			break;
		}
	}
	
		
}
}