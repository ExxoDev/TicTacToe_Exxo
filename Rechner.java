package Methoden_test;

public class rechnung {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x;
		int y;
		String zeichen = "+";
		
		int ergebnis = rechne(1,2, "+" );
		System.out.println(ergebnis);
	}

	
	
	private static int rechne(int a, int b, String z){
		int ergebnis = 0;
		
		switch(z){
		case "+" :
			ergebnis = a + b;
			break;
		case "-" :
			ergebnis = a - b;
			break;
		case "/":
			ergebnis = a / b;
			break;
		case "*":
			ergebnis = a * b;
			break;
		default : 
			System.out.println("Die Eingabe des Rechenzeichens konnte nicht erkannt werden");
		}
		
		return ergebnis;
	
	}

}
