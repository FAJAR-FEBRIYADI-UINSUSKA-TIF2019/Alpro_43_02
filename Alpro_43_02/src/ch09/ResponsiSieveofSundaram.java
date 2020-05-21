package ch09;

import java.util.*;

public class ResponsiSieveofSundaram {
	
    public static void main(String[] args) {   
       int[] bilangan_prima;      
       int besarArray;       
	   Scanner input = new Scanner(System.in);
       System.out.print("Masukkan Sembarang Angka : ");
       besarArray = input.nextInt();			
	   bilangan_prima = iniSievesundaram.caribilPrima(besarArray);   
	   System.out.print("Sieve of Sundaram (Bilangan Prima) : ");
       for (int prima : bilangan_prima) {
           System.out.print(prima + " ");
        }
       System.out.println();                   
    }    
	
    static public class iniSievesundaram {     
	public static int[] caribilPrima(int besarArray) {
		int p = besarArray / 2;
		boolean[] iniBilPrima = new boolean[besarArray];
		Arrays.fill(iniBilPrima, true);
		for (int i = 1; i < p; i++) {
			for (int k = i; k <= (p - i) / (2 * i + 1); k++) {
				iniBilPrima[i + k + 2 * i * k] = false;
                }
            }
			
			int[] bilangan_prima = new int[besarArray];
            int terlihat = 0;
			if (besarArray > 2) {
                bilangan_prima[terlihat++] = 2;
            }
			
			for (int i = 1; i < p; i++) {
                if (iniBilPrima[i]) {
                    bilangan_prima[terlihat++] = i * 2 + 1;
                }
            }
            return Arrays.copyOf(bilangan_prima, terlihat);
        }
    }
}