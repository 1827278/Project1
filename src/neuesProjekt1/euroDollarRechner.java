package neuesProjekt1;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class euroDollarRechner {

	public static void main(String[] args) throws IOException{
		// declaration of unknown
		Scanner scan = new Scanner(System.in);
		int currency;
		String currency1;
		float euro;
		String euro1;
		float dollar;
		String dollar1;
		boolean again;
		String x;
		int i = 0;
		
		
		do {
			
			// decide Euro or Dollar
			System.out.println("Wählen Sie 1 für Euro in Dollar oder 2 für Dollar in Euro aus:");
			currency1 = scan.nextLine();
			currency = Integer.parseInt(currency1);

			// If Euro
			if (currency == 1) {
				System.out.println("Geben Sie einen Betrag in Euro ein:");
				euro1 = scan.nextLine();
				euro = Float.parseFloat(euro1);
				System.out.println(euro * 1.34);
				System.out.println("Weiter Umrechnung benötigt? Ja/Nein");
				x = scan.nextLine();
				if (x.equals("J"))
						{
					again=true;
						}
				else if (x.equals("N"))
				{
					again=false;
				}
				else {
					again=false;
				}
				}
			
			// If Dollar
			else if (currency == 2) {
				System.out.println("Geben Sie einen Betrag in Dollar ein:");
				dollar1 = scan.nextLine();
				dollar = Float.parseFloat(dollar1);
				System.out.println(dollar / 1.34);
				System.out.println("Weitere Umrechnung benötigt?");
				x = scan.nextLine();
				if (x.equals("J"))
						{
					again=true;
						}
				else if (x.equals("N"))
				{
					again=false;
					break;
				}
				else {
					again=false;
				}
			}
			// Else Error
			else {
				System.out.println("Error\nBitte Warten...");
				System.out.println("Weitere Umrechnung benötigt?");
				x = scan.nextLine();
				if (x.equals("J"))
						{
					again=true;
						}
				else if (x.equals("N"))
				{
					again=false;
					break;
				}
				else {
					again=false;
				}

				
				 }
			
		}while(again=true);
	
	
	}
	}
