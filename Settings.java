package Gruppe5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Properties;

public class Settings {

	public Settings() throws FileNotFoundException, IOException{
		ControllFile();
		Load();
	}
	
	/**
	 * Functions : 
	 *  ~ ControllFile(); - Wenn die Config nicht vorhanden ist, wird sie gespeichert
	 *  ~ Save(); - Config wird neu überschrieben und mit den geladenen/geänderten Variabeln gespeichert
	 *  ~ Load(); - Config wird geladen
	 *  ~ Average();  - Die Durschnittsgewinnchance pro Spiel wird berechnet 
	 *     percent_average_win_lose - Chance in % für Spieler1
	 *     P2_percent_average_win_lose - Chance in % für Spieler2
	 *  ~ ChangePlayerName("NeuerName" , 1)  Spielername ändern 1 = Spieler 1 wird geändert ; 2 = Spieler 2 wird geändert
	 */
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */

	public static void main(String[] args) throws FileNotFoundException, IOException{
	}
	
	static String Player1 = "Player1";
	static String Player2 = "Player2";
	
	public static String percent_average_win_lose;
	public static String P2_percent_average_win_lose;
	
	static String Gamename = "Tic Tac Toe";
	static int GameID = 0;
	public static double LoadedWins = 0.0;
	public static double NewWins = 0.0;
	public static double LoadedLoses = 0.0;
	public static double NewLoses = 0.0;
	static boolean file;
	
	public static double P2_LoadedWins = 1.0;
	public static double P2_NewWins = 2.0;
	public static double P2_LoadedLoses = 0.0;
	public static double P2_NewLoses = 1.0;
	
	public static double AllWins = NewWins + LoadedWins; 
	public static double AllLoses = NewLoses + LoadedLoses;
	
	public static double P2_AllWins = NewWins + LoadedWins; 
	public static double P2_AllLoses = NewLoses + LoadedLoses;

	public static double average_win_lose;
	public static double P2_average_win_lose;
	
	public static String SaveGameID = String.valueOf(GameID);
	public static String SaveWins = String.valueOf(LoadedWins+NewWins);
	public static String SaveLoses = String.valueOf(LoadedLoses+NewLoses);

	public static String P2_SaveWins = String.valueOf(LoadedWins+NewWins);
	public static String P2_SaveLoses = String.valueOf(LoadedLoses+NewLoses);
	
	public static void ControllFile() throws FileNotFoundException, IOException{
		// Wird überprüft, ob datei existiert
		File Setting = new File("Config");
		if(!Setting.exists()){
			file = true;
			Save();
		} else{
			file = false;

		}
	}

	public static void Save() throws FileNotFoundException, IOException{

		// New Settings
		Properties props = new Properties();

		// Values are set
		props.setProperty("Gamename", Gamename);
		props.setProperty("Player1", Player1);
		props.setProperty("Player2", Player2);
		props.setProperty("GameID", SaveGameID);
		props.setProperty("Wins", SaveWins);
		props.setProperty("Loses", SaveLoses);
		props.setProperty("P2_Wins", P2_SaveWins);
		props.setProperty("P2_Loses", P2_SaveLoses);

		// Setting is going to be saved
		props.store(new FileOutputStream(new File("Config")), "Gamesettings");
	}

	public static void Load() throws FileNotFoundException, IOException{

		Properties props = new Properties();

		// Load from "Config"
		props.load(new FileInputStream("Config"));

		// Load saved Settings
		Gamename = props.getProperty("Gamename");
		Player1 = props.getProperty("Player1");
		Player2 = props.getProperty("Player2");
		GameID = Integer.parseInt(props.getProperty("GameID"));
		LoadedWins = Float.parseFloat(props.getProperty("Wins"));
		LoadedLoses = Float.parseFloat(props.getProperty("Loses"));
		
		P2_LoadedWins = Float.parseFloat(props.getProperty("P2_Wins"));
		P2_LoadedLoses = Float.parseFloat(props.getProperty("P2_Loses"));
		
		AllWins = NewWins + LoadedWins; 
		AllLoses = NewLoses + LoadedLoses;
		
		P2_AllWins = P2_NewWins + P2_LoadedWins; 
		P2_AllLoses = P2_NewLoses + P2_LoadedLoses;

	}

	// Function to calculate the average Win/Lose percentage [ 1 = Player 1 / 2 = Player 2 ]
	public static double Average(int Player){
			
		if(AllWins+AllLoses == 0 || P2_AllLoses + P2_AllWins == 0) {
			System.out.println("Error at calculating Average Win/Lose");
			System.out.println("Maybe no games were played");
		} else {
			
			average_win_lose = (AllLoses / (AllWins + AllLoses));
			P2_average_win_lose = (P2_AllLoses / (P2_AllWins + P2_AllLoses));
			
		percent_average_win_lose = NumberFormat.getPercentInstance().format( average_win_lose );
		P2_percent_average_win_lose = NumberFormat.getPercentInstance().format( P2_average_win_lose ); }
		
		return average_win_lose;	
	}
	
	// Function to change the PlayerNames
	public String ChangePlayerName(String NewPlayer, int playerID){
		if(playerID == 1){
		Player1 = NewPlayer;
		} else {
		Player2 = NewPlayer;
		}
		
		return NewPlayer;
	}
}
