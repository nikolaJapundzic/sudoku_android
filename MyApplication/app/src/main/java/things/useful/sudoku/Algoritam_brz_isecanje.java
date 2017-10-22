package things.useful.sudoku;

import java.util.ArrayList;
import java.util.Random;


public class Algoritam_brz_isecanje extends Algoritam_brz {
	
	public static int procenatKolikoFaliUTabeli;
	public static int[] totaleNizSaIzuzetimBreojevima = totaleNiz;
	
	
	public static int [] generisanjeNizaSudokusaIzuzetim() {
		//totaleNiz = generisanjeNizaSudoku();
		
		//int procenatPopunjenostiTabele = 50;
		
		int kolikoSeOduzima = totaleNizSaIzuzetimBreojevima.length * procenatKolikoFaliUTabeli;
		kolikoSeOduzima /= 100;
		kolikoSeOduzima = 81 - kolikoSeOduzima;
		
		int brojac = 0;
		ArrayList <Integer> zaIzuzimanje = new ArrayList <Integer>();
		
		Random rand = new Random();
			
		while (brojac < kolikoSeOduzima) {
			int  n = rand.nextInt(80) + 0;
			if(!zaIzuzimanje.contains(n)) {
				zaIzuzimanje.add(n);
				brojac++;
			}
		}
		for( int i = 0; i < zaIzuzimanje.size(); i++) {
			totaleNizSaIzuzetimBreojevima[zaIzuzimanje.get(i)] = 0;
		}
		
		return totaleNizSaIzuzetimBreojevima;
	}

}


//int  n = rand.nextInt(9) + 1;