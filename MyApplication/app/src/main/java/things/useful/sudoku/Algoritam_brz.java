package things.useful.sudoku;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;


public class Algoritam_brz extends AppCompatActivity {

	public static int[] niz1b= new int[9];
	
	public static int[] niz2_1b= new int[3];
	public static int[] niz2_2b= new int[3];
	public static int[] niz2_3b= new int[3];
	
	public static int[] niz3_1b= new int[3];
	public static int[] niz3_2b= new int[3];
	public static int[] niz3_3b= new int[3];
	
	public static int[] niz4_1b= new int[3];
	public static int[] niz4_2b= new int[3];
	public static int[] niz4_3b= new int[3];
	
	public static int[] niz5b= new int[9];
	
	public static int[] niz6_1b= new int[3];
	public static int[] niz6_2b= new int[3];
	public static int[] niz6_3b= new int[3];
	
	public static int[] niz7_1b= new int[3];
	public static int[] niz7_2b= new int[3];
	public static int[] niz7_3b= new int[3];
	
	public static int[] niz8_1b= new int[3];
	public static int[] niz8_2b= new int[3];
	public static int[] niz8_3b= new int[3];
	
	public static int[] niz9b= new int[9];
	
	
	public static int[] totaleNiz = new int[81];
    public static int [] niz5 = new int[81];


	

	
	public static void ispisNaEkranuCeleTabele() {
		for(int i = 0; i<9; i++) {
			System.out.print("[" + totaleNiz[i] + "]");
		}
		System.out.println();
		for(int i = 9; i<18; i++) {
			System.out.print("[" + totaleNiz[i] + "]");
		}
		System.out.println();
		for(int i = 18; i<27; i++) {
			System.out.print("[" + totaleNiz[i] + "]");
		}
		System.out.println();
		for(int i = 27; i<36; i++) {
			System.out.print("[" + totaleNiz[i] + "]");
		}
		System.out.println();
		for(int i = 36; i<45; i++) {
			System.out.print("[" + totaleNiz[i] + "]");
		}
		System.out.println();
		for(int i = 45; i<54; i++) {
			System.out.print("[" + totaleNiz[i] + "]");
		}
		System.out.println();
		for(int i = 54; i<63; i++) {
			System.out.print("[" + totaleNiz[i] + "]");
		}
		System.out.println();
		for(int i = 63; i<72; i++) {
			System.out.print("[" + totaleNiz[i] + "]");
		}
		System.out.println();
		for(int i = 72; i<81; i++) {
			System.out.print("[" + totaleNiz[i] + "]");
		}
		System.out.println();
		System.out.println();
	}
	
	
	public static int [] generisanjeNizaSudoku() {
		Random rand = new Random();
		boolean flag1 = true;
		int brojacFULL = 0;
		
		//FAZA 1 KVADRANTI 1,5,9
		int[] niz1a = {1,2,3,4,5,6,7,8,9};
		
		while(flag1) {
		niz1b = testRandoma(niz1a, niz1a.length);
		niz5b = testRandoma(niz1a, niz1a.length);
		niz9b = testRandoma(niz1a, niz1a.length);
		
		/*
		for(int i =0; i< niz1b.length; i++) {
			System.out.print(niz1b[i]);
		}
		System.out.println();
		for(int i =0; i< niz5b.length; i++) {
			System.out.print(niz5b[i]);
		}
		System.out.println();
		for(int i =0; i< niz9b.length; i++) {
			System.out.print(niz9b[i]);
		}
		System.out.println();
		System.out.println("Kocke 1, 5 i 9 su generisane.");
		//FAZA 1 KVADRANTI 1,5,9
		*/
		
		
		
		
		
		//FAZA 2 prva tri
		int brojac1 = 0;
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		while(brojac1 <3) {
			int  n = rand.nextInt(9) + 1;
			
			if(niz1b[0] != n &&
			   niz1b[1] != n &&
			   niz1b[2] != n &&
			   
			   niz5b[0+brojac1] != n &&
			   niz5b[3+brojac1] != n && 
			   niz5b[6+brojac1] != n){
				if(!lista1.contains(n)) {
					lista1.add(n);
				    brojac1++;
				}
			}
			brojacFULL++;
			if(brojacFULL > 1000) {
				break;
			}
		}
		 if(brojacFULL > 1000) {
			 brojacFULL = 0;
			 continue;
		 }
		
		
		for(int i =0; i< lista1.size(); i++) {
			niz2_1b[i] = lista1.get(i);
			//System.out.print(lista1.get(i));
		}
		/*System.out.println();		
		System.out.println("Prvi red je 2/3 generisan.");*/
		//FAZA 2 prva tri
		
		
		//FAZA 3 druga tri
				brojac1 = 0;
				ArrayList<Integer> lista2 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz1b[0] != n &&
					   niz1b[1] != n &&
					   niz1b[2] != n &&
					   
					   niz2_1b[0] != n &&
					   niz2_1b[1] != n &&
				       niz2_1b[2] != n &&
					   
					   niz9b[0+brojac1] != n &&
					   niz9b[3+brojac1] != n && 
					   niz9b[6+brojac1] != n){
						if(!lista2.contains(n)) {
							lista2.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista2.size(); i++) {
					niz3_1b[i] = lista2.get(i);
					//System.out.print(lista2.get(i));
				}
				/*System.out.println();		
				System.out.println("Prvi red je generisan.");*/
		//FAZA 3 druga tri
				
				
		//FAZA 4 druga tri
				brojac1 = 0;
				ArrayList<Integer> lista3 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz1b[3] != n &&
					   niz1b[4] != n &&
					   niz1b[5] != n &&
					   
					   niz2_1b[0+brojac1] != n &&
					   
					   niz5b[0+brojac1] != n &&
					   niz5b[3+brojac1] != n && 
					   niz5b[6+brojac1] != n){
						if(!lista3.contains(n) && !lista1.contains(n)) {
							lista3.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista3.size(); i++) {
					niz2_2b[i] = lista3.get(i);
					//System.out.print(lista3.get(i));
				}
				/*System.out.println();		
				System.out.println("Drugi red je 2/3 generisan.");*/
		//FAZA 4 druga tri
				
		//FAZA 5 druga tri
				brojac1 = 0;
				ArrayList<Integer> lista4 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz1b[3] != n &&
					   niz1b[4] != n &&
					   niz1b[5] != n &&
					   
					   niz2_2b[0] != n &&
					   niz2_2b[1] != n &&
				       niz2_2b[2] != n &&
				       
				       niz3_1b[0] != n &&
				       niz3_1b[1] != n &&
				       niz3_1b[2] != n &&
					   
					   niz9b[0+brojac1] != n &&
					   niz9b[3+brojac1] != n && 
					   niz9b[6+brojac1] != n){
						if(!lista4.contains(n) && !lista2.contains(n)) {
							lista4.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista4.size(); i++) {
					niz3_2b[i] = lista4.get(i);
					//System.out.print(lista4.get(i));
				}
				/*System.out.println();		
				System.out.println("Drugi red je generisan.");*/
		//FAZA 5 druga tri
				
		//FAZA 6 druga tri
				brojac1 = 0;
				ArrayList<Integer> lista5 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz1b[6] != n &&
					   niz1b[7] != n &&
					   niz1b[8] != n &&
					   
					   niz2_1b[0+brojac1] != n &&
					   niz2_2b[0+brojac1] != n &&
					   
					   niz5b[0+brojac1] != n &&
					   niz5b[3+brojac1] != n && 
					   niz5b[6+brojac1] != n){
						if(!lista5.contains(n) && !lista1.contains(n) && !lista3.contains(n)) {
							lista5.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista5.size(); i++) {
					niz2_3b[i] = lista5.get(i);
					//System.out.print(lista5.get(i));
				}
				/*System.out.println();		
				System.out.println("Treci red je 2/3 generisan.");*/
		//FAZA 6 druga tri
				
		//FAZA 7 druga tri
				brojac1 = 0;
				ArrayList<Integer> lista6 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz1b[6] != n &&
					   niz1b[7] != n &&
					   niz1b[8] != n &&
					   
					   niz2_3b[0] != n &&
					   niz2_3b[1] != n &&
					   niz2_3b[2] != n &&
					   
					   niz3_1b[0+brojac1] != n && 
					   niz3_2b[0+brojac1] != n &&
					   
					   niz9b[0+brojac1] != n &&
					   niz9b[3+brojac1] != n && 
					   niz9b[6+brojac1] != n){
						if(!lista6.contains(n) && !lista4.contains(n) && !lista2.contains(n)) {
							lista6.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista6.size(); i++) {
					niz3_3b[i] = lista6.get(i);
					//System.out.print(lista6.get(i));
				}
				/*System.out.println();		
				System.out.println("Treci red je generisan.");*/
		//FAZA 8 druga tri
				
				//FAZA 7 druga tri
				brojac1 = 0;
				ArrayList<Integer> lista7 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz5b[0] != n &&
					   niz5b[1] != n &&
					   niz5b[2] != n &&
					   
					   niz1b[0+brojac1] != n &&
					   niz1b[3+brojac1] != n && 
					   niz1b[6+brojac1] != n){
						if(!lista7.contains(n)) {
							lista7.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista7.size(); i++) {
					niz4_1b[i] = lista7.get(i);
					//System.out.print(lista7.get(i));
				}
				/*System.out.println();		
				System.out.println("Cetvrti red je 2/3 generisan.");*/
		//FAZA 8 druga tri
				
				
				
		//FAZA 9 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista8 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz5b[0] != n &&
					   niz5b[1] != n &&
					   niz5b[2] != n &&
					   
					   niz4_1b[0] != n &&
					   niz4_1b[1] != n &&
					   niz4_1b[2] != n &&
					   
					   niz3_1b[0+brojac1] != n &&
				       niz3_2b[0+brojac1] != n &&
					   niz3_3b[0+brojac1] != n &&
					   
					   niz9b[0+brojac1] != n &&
					   niz9b[3+brojac1] != n && 
					   niz9b[6+brojac1] != n){
						if(!lista8.contains(n)) {
							lista8.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista8.size(); i++) {
					niz6_1b[i] = lista8.get(i);
					//System.out.print(lista8.get(i));
				}
				/*System.out.println();		
				System.out.println("Cetvrti red je generisan.");*/
		//FAZA 9 druga tri
					
		//FAZA 10 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista9 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz5b[3] != n &&
					   niz5b[4] != n &&
					   niz5b[5] != n &&
					   
					   niz4_1b[0+brojac1] != n &&
				       					   
					   niz1b[0+brojac1] != n &&
					   niz1b[3+brojac1] != n && 
					   niz1b[6+brojac1] != n){
						if(!lista9.contains(n) && !lista7.contains(n)) {
							lista9.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista9.size(); i++) {
					niz4_2b[i] = lista9.get(i);
					//System.out.print(lista9.get(i));
				}
				/*System.out.println();		
				System.out.println("Peti red je 2/3 generisan.");*/
		//FAZA 10 druga tri
				
		//FAZA 11 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista10 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz3_1b[0+brojac1] != n &&
					   niz3_2b[0+brojac1] != n &&
					   niz3_3b[0+brojac1] != n &&
					   
					   niz6_1b[0+brojac1] != n &&
					   
					   niz4_2b[0] != n &&
					   niz4_2b[1] != n &&
					   niz4_2b[2] != n &&
					   
					   niz5b[3] != n &&
					   niz5b[4] != n &&
					   niz5b[5] != n &&
				       					   
					   niz9b[0+brojac1] != n &&
					   niz9b[3+brojac1] != n && 
					   niz9b[6+brojac1] != n){
						if(!lista10.contains(n) && !lista8.contains(n)) {
							lista10.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista10.size(); i++) {
					niz6_2b[i] = lista10.get(i);
					//System.out.print(lista10.get(i));
				}
				/*System.out.println();		
				System.out.println("Peti red je generisan.");*/
		//FAZA 11 druga tri
				
		//FAZA 12 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista11 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz1b[0+brojac1] != n &&
					   niz1b[3+brojac1] != n &&
					   niz1b[6+brojac1] != n &&
					   
					   niz4_1b[0+brojac1] != n &&
					   niz4_2b[0+brojac1] != n &&
				       					   
					   niz5b[6] != n &&
					   niz5b[7] != n && 
					   niz5b[8] != n){
						if(!lista11.contains(n) && !lista9.contains(n) && !lista7.contains(n)) {
							lista11.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista11.size(); i++) {
					niz4_3b[i] = lista11.get(i);
					//System.out.print(lista11.get(i));
				}
				/*System.out.println();		
				System.out.println("Sesti red je 2/3 generisan.");*/
		//FAZA 12 druga tri
				
        //FAZA 13 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista12 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz9b[0+brojac1] != n &&
					   niz9b[3+brojac1] != n &&
					   niz9b[6+brojac1] != n &&
					   
					   niz6_1b[0+brojac1] != n &&
					   niz6_2b[0+brojac1] != n &&
				       					   
					   niz3_1b[0+brojac1] != n &&
					   niz3_2b[0+brojac1] != n &&
					   niz3_3b[0+brojac1] != n){
						if(!lista12.contains(n) && !lista10.contains(n) && !lista8.contains(n)) {
							lista12.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista12.size(); i++) {
					niz6_3b[i] = lista12.get(i);
					//System.out.print(lista12.get(i));
				}
				/*System.out.println();		
				System.out.println("Sesti red je generisan.");*/
		//FAZA 13 druga tri
				
		//FAZA 14 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista13 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz1b[0+brojac1] != n &&
					   niz1b[3+brojac1] != n &&
					   niz1b[6+brojac1] != n &&
					   
					   niz4_1b[0+brojac1] != n &&
					   niz4_2b[0+brojac1] != n &&
					   niz4_3b[0+brojac1] != n &&
				       					   
					   niz9b[0] != n &&
					   niz9b[1] != n &&
					   niz9b[2] != n){
						if(!lista13.contains(n)) {
							lista13.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista13.size(); i++) {
					niz7_1b[i] = lista13.get(i);
					//System.out.print(lista13.get(i));
				}
				/*System.out.println();		
				System.out.println("Sedmi red je 2/3 generisan.");*/
		//FAZA 14 druga tri
				
        //FAZA 15 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista14 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz5b[0+brojac1] != n &&
					   niz5b[3+brojac1] != n &&
					   niz5b[6+brojac1] != n &&
					   
					   niz7_1b[0] != n &&
					   niz7_1b[1] != n &&
					   niz7_1b[2] != n &&
					   
					   niz2_1b[0+brojac1] != n &&
				       niz2_2b[0+brojac1] != n &&
					   niz2_3b[0+brojac1] != n &&
				       					   
					   niz9b[0] != n &&
					   niz9b[1] != n &&
					   niz9b[2] != n){
						if(!lista14.contains(n)) {
							lista14.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista14.size(); i++) {
					niz8_1b[i] = lista14.get(i);
					//System.out.print(lista14.get(i));
				}
				/*System.out.println();		
				System.out.println("Sedmi red generisan.");*/
		//FAZA 15 druga tri
				
        //FAZA 16 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista15 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz1b[0+brojac1] != n &&
					   niz1b[3+brojac1] != n &&
					   niz1b[6+brojac1] != n &&
					   
					   niz7_1b[0+brojac1] != n &&
					   
					   niz4_1b[0+brojac1] != n &&
					   niz4_2b[0+brojac1] != n &&
					   niz4_3b[0+brojac1] != n &&
				       					   
					   niz9b[3] != n &&
					   niz9b[4] != n &&
					   niz9b[5] != n){
						if(!lista15.contains(n)) {
							lista15.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista15.size(); i++) {
					niz7_2b[i] = lista15.get(i);
					//System.out.print(lista15.get(i));
				}
				/*System.out.println();		
				System.out.println("Osmi red je 2/3 generisan.");*/
		//FAZA 16 druga tri
				
        //FAZA 17 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista16 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz5b[0+brojac1] != n &&
					   niz5b[3+brojac1] != n &&
					   niz5b[6+brojac1] != n &&
					   
					   niz8_1b[0+brojac1] != n &&
					   
					   niz7_2b[0] != n &&
					   niz7_2b[1] != n &&
					   niz7_2b[2] != n &&
					   
					   niz2_1b[0+brojac1] != n &&
					   niz2_1b[0+brojac1] != n &&
					   niz2_1b[0+brojac1] != n &&
				       					   
					   niz9b[3] != n &&
					   niz9b[4] != n &&
					   niz9b[5] != n){
						if(!lista16.contains(n) && !lista14.contains(n)) {
							lista16.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista16.size(); i++) {
					niz8_2b[i] = lista16.get(i);
					//System.out.print(lista16.get(i));
				}
				/*System.out.println();		
				System.out.println("Osmi red je generisan.");*/
		//FAZA 17 druga tri
				
        //FAZA 18 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista17 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz1b[0+brojac1] != n &&
					   niz1b[3+brojac1] != n &&
					   niz1b[6+brojac1] != n &&
					   
					   niz4_1b[0+brojac1] != n &&
					   niz4_2b[0+brojac1] != n &&
					   niz4_3b[0+brojac1] != n &&
					   
					   niz7_1b[0+brojac1] != n &&
					   niz7_2b[0+brojac1] != n &&
				       					   
					   niz9b[6] != n &&
					   niz9b[7] != n &&
					   niz9b[8] != n){
						if(!lista17.contains(n) && !lista15.contains(n) && !lista13.contains(n)) {
							lista17.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista17.size(); i++) {
					niz7_3b[i] = lista17.get(i);
					//System.out.print(lista17.get(i));
				}
				/*System.out.println();		
				System.out.println("Deveti red 2/3 je generisan.");*/
		//FAZA 18 druga tri
				
        //FAZA 19 druga tri
				
				brojac1 = 0;
				ArrayList<Integer> lista18 = new ArrayList<Integer>();
				while(brojac1 <3) {
					int  n = rand.nextInt(9) + 1;
					
					if(niz5b[0+brojac1] != n &&
					   niz5b[3+brojac1] != n &&
					   niz5b[6+brojac1] != n &&
					   
					   niz2_1b[0+brojac1] != n &&
					   niz2_2b[0+brojac1] != n &&
					   niz2_3b[0+brojac1] != n &&
					   
					   niz8_1b[0+brojac1] != n &&
					   niz8_2b[0+brojac1] != n &&
					   
					   niz7_3b[0] != n &&
					   niz7_3b[1] != n &&
					   niz7_3b[2] != n &&
				       					   
					   niz9b[6] != n &&
					   niz9b[7] != n &&
					   niz9b[8] != n){
						if(!lista18.contains(n) && !lista16.contains(n) && !lista14.contains(n)) {
							lista18.add(n);
						    brojac1++;
						}
					}
					brojacFULL++;
					if(brojacFULL > 1000) {
						break;
					}
				}
				 if(brojacFULL > 1000) {
					 brojacFULL = 0;
					 continue;
				 }
				
				
				for(int i =0; i< lista18.size(); i++) {
					niz8_3b[i] = lista18.get(i);
					//System.out.print(lista18.get(i));
				}
				/*System.out.println();		
				System.out.println("Deveti red je generisan.");*/
				flag1 = false;
		//FAZA 19 druga tri
		}
		
		//int[] totaleNiz = new int [81];
		ArrayList<Integer> totaleNizLISTA = new ArrayList<Integer>();
		
		//PRVI BLOK
		for(int i = 0; i<3; i++) {
			totaleNizLISTA.add(niz1b[i]);
		}
		for(int i = 0; i<niz2_1b.length; i++) {
			totaleNizLISTA.add(niz2_1b[i]);
		}
		for(int i = 0; i<niz3_1b.length; i++) {
			totaleNizLISTA.add(niz3_1b[i]);
		}
		
		for(int i = 3; i<6; i++) {
			totaleNizLISTA.add(niz1b[i]);
		}
		for(int i = 0; i<niz2_2b.length; i++) {
			totaleNizLISTA.add(niz2_2b[i]);
		}
		for(int i = 0; i<niz3_2b.length; i++) {
			totaleNizLISTA.add(niz3_2b[i]);
		}
		
		for(int i = 6; i<9; i++) {
			totaleNizLISTA.add(niz1b[i]);
		}
		for(int i = 0; i<niz2_3b.length; i++) {
			totaleNizLISTA.add(niz2_3b[i]);
		}
		for(int i = 0; i<niz3_3b.length; i++) {
			totaleNizLISTA.add(niz3_3b[i]);
		}
		//DRUGI BLOK
		for(int i = 0; i<niz4_1b.length; i++) {
			totaleNizLISTA.add(niz4_1b[i]);
		}
		for(int i = 0; i<3; i++) {
			totaleNizLISTA.add(niz5b[i]);
		}
		for(int i = 0; i<niz6_1b.length; i++) {
			totaleNizLISTA.add(niz6_1b[i]);
		}
		
		for(int i = 0; i<niz4_2b.length; i++) {
			totaleNizLISTA.add(niz4_2b[i]);
		}
		for(int i = 3; i<6; i++) {
			totaleNizLISTA.add(niz5b[i]);
		}
		for(int i = 0; i<niz6_2b.length; i++) {
			totaleNizLISTA.add(niz6_2b[i]);
		}
		
		for(int i = 0; i<niz4_3b.length; i++) {
			totaleNizLISTA.add(niz4_3b[i]);
		}
		for(int i = 6; i<9; i++) {
			totaleNizLISTA.add(niz5b[i]);
		}
		for(int i = 0; i<niz6_3b.length; i++) {
			totaleNizLISTA.add(niz6_3b[i]);
		}
		//TRECI BLOK
		for(int i = 0; i<niz7_1b.length; i++) {
			totaleNizLISTA.add(niz7_1b[i]);
		}
		for(int i = 0; i<niz8_1b.length; i++) {
			totaleNizLISTA.add(niz8_1b[i]);
		}
		for(int i = 0; i<3; i++) {
			totaleNizLISTA.add(niz9b[i]);
		}
		
		for(int i = 0; i<niz7_2b.length; i++) {
			totaleNizLISTA.add(niz7_2b[i]);
		}
		for(int i = 0; i<niz8_2b.length; i++) {
			totaleNizLISTA.add(niz8_2b[i]);
		}
		for(int i = 3; i<6; i++) {
			totaleNizLISTA.add(niz9b[i]);
		}
		
		for(int i = 0; i<niz7_3b.length; i++) {
			totaleNizLISTA.add(niz7_3b[i]);
		}
		for(int i = 0; i<niz8_3b.length; i++) {
			totaleNizLISTA.add(niz8_3b[i]);
		}
		for(int i = 6; i<9; i++) {
			totaleNizLISTA.add(niz9b[i]);
		}
		
		//PUNJENJE NIZA IZ ARRAYLISTE
		for(int i = 0; i<totaleNizLISTA.size(); i++) {
			totaleNiz[i] = totaleNizLISTA.get(i);
            niz5[i] = totaleNizLISTA.get(i);
		}
		return totaleNiz;
	}
	
	
	
	private static int[] testRandoma(int[] niz, int duzinaNiza) {
		Random rand = new Random();
		
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		
		while(lista1.size()<niz.length) {
			int  n = rand.nextInt(niz.length) + 0;
			
			if(!lista1.contains(n)) {
				lista1.add(n);
			}
			
		}
		int[] nizRandom = new int[duzinaNiza];
		for(int i = 0; i<lista1.size(); i++) {
			nizRandom[i] = niz[lista1.get(i)];
		}		
		return nizRandom;
	}

}
