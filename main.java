package Gruppe5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class main {

  /**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	
	private static String[] feld = new String[900];
	private static String var = "X";
	private static boolean win = false;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Settings x = new Settings();

		System.out.println(x.Gamename);
		
		Scanner scan = new Scanner(System.in);
		

		boolean wechsel = true;
		
		for(int i = 0; i <= 10; i++){
			
			überprüfen();
			
			if(win == true){
				break;
			}
			
		
			ausgabe();
			
		if(wechsel == true){
			System.out.print(x.Player1 + " wählt Feld : ");
			var = "X";
			}
		
		else{
			System.out.print(x.Player2 + " wählt Feld : ");
			var = "O";
		}
		
		// Wahl des Feldes
		
		int wahl = scan.nextInt(); 
		
		if(feld[wahl] != null){
			System.out.println("Das Feld wurde bereits gesetzt, bitte wähle ein anderes Feld");
		} else { 
		
		switch(wahl){
		case 1:
			feld[1] = var;
			break;
		case 2:
			feld[2] = var;
			break;
		case 3:
			feld[3] = var;
			break;
		case 4:
			feld[4] = var;
			break;
		case 5:
			feld[5] = var;
			break;
		case 6:
			feld[6] = var;
			break;
		case 7:
			feld[7] = var;
			break;
		case 8:
			feld[8] = var;
			break;
		case 9:
			feld[9] = var;
			break;
		default:
			System.out.println("Eingabe war falsch");
			System.exit(1);
			break;
		} // Ende der switch Anweisung
		
		// Wechsel des Boolean-Wertes
		if(wechsel == true){
			wechsel = false;}
		else{
			wechsel = true;
		}
		
		} // Ende der NULL kontrolle
		
		
			
		}	// Ende der for Schleife
	
		
	}
	
	static void l(){
		System.out.println();
	}
	
	static void überprüfen(){
		if(feld[1] == var && feld[2] == var && feld[3] == var){
			System.out.print("und gewinnt");
			win = true;
			} else if(feld[4] == var && feld[5] == var && feld[6] == var){
				System.out.print("und gewinnt");
				win = true;
				} else if(feld[7] == var && feld[8] == var && feld[9] == var){
					System.out.print("und gewinnt");
					win = true;
					} else if(feld[1] == var && feld[4] == var && feld[7] == var){
						System.out.print("und gewinnt");
						win = true;
						} else if(feld[2] == var && feld[5] == var && feld[8] == var){
							System.out.print("und gewinnt");
							win = true;
							} else if(feld[3] == var && feld[6] == var && feld[9] == var){
								System.out.print("und gewinnt");
								win = true;
								} else if(feld[1] == var && feld[5] == var && feld[9] == var){
									System.out.print("und gewinnt");
									win = true;
									} else if(feld[3] == var && feld[5] == var && feld[7] == var){
										System.out.print("und gewinnt");
										win = true;
										}
	}

	static void ausgabe(){
		l();
		System.out.println(feld[1] +"\t" + feld[2] + "\t" + feld[3]);
		l();
		System.out.println(feld[4] +"\t" + feld[5] + "\t" + feld[6]);
		l();
		System.out.println(feld[7] +"\t" + feld[8] + "\t" + feld[9]);
		l();
		l();
		
	}
}
