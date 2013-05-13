package methoden;

public class hausaufgabe_13_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}
	
	// 1.) Methode, die 2 Zahlen addiert
	public static float addiere(double a, double b){
		float ergebnis = (float) (a + b);
		return ergebnis;
	}
	
	// 2.) Methode, die 2 Zahlen subtrahiert
	public static float subtrahiere(double a, double b){
		float ergebnis = (float) (a - b);
		return ergebnis;
	}
	
	// 3.) Methode, die 2 Zahlen multipliziert
	public static float multipliziere(double a, double b){
		float ergebnis = (float) (a * b);
		return ergebnis;
	}
	
	// 4.) Methode, die 2 Zahlen dividiert
	public static float dividiere(double a, double b){
		float ergebnis = (float) (a / b);
		return ergebnis;
	}
	
	// 5.) Optionen der Methode einlesen, berechnen und ausgeben
	private static float rechne(double a, String z, double b){
		float ergebnis = 0;
		
		switch(z){
		case "+" :
			ergebnis = (float) (a + b);
			break;
		case "-" :
			ergebnis = (float) (a - b);
			break;
		case "/":
			ergebnis = (float) (a / b);
			break;
		case "*":
			ergebnis = (float) (a * b);
			break;
		default : 
			System.out.println("Die Eingabe des Rechenzeichens konnte nicht erkannt werden");
		}
		
		// Ausgabe auf der Konsole mit entsprechender Rechenfolge
		System.out.println(a + " " + z + " " + b  + " = " + ergebnis);
		
		// Ergebnis wird zurückgegeben
		return ergebnis;
		}
	
	// 6. Berechnung des Volumens eines Kegels
	private static float kegel(double radius, double hoehe){
		double pi = 3.14159265358979323846264338327950288419716939937510582097494459;
		float ergebnis = (float) ( 0.33333334 * pi *  (radius * radius)  * hoehe   );
		System.out.println("Das Volumen eines Kegels mit dem Radius " + radius + " und der Höhe " + hoehe + " beträgt " + ergebnis);
		return ergebnis;
	}

}
