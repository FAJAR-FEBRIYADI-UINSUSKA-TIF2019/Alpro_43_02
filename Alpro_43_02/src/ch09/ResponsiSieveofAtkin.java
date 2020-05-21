package ch09;

import java.util.Scanner;
 
public class  ResponsiSieveofAtkin {

    private boolean[] inibilPrima(int batasan) {
        boolean[] bilangan_prima = new boolean[batasan + 1];
        bilangan_prima[2] = true;
        bilangan_prima[3] = true;
        int hitung = (int) Math.ceil(Math.sqrt(batasan));
        for (int i = 1; i < hitung; i++) {
            for (int k = 1; k < hitung; k++) {
                int p = 4 * i * i + k * k;
                if (p <= batasan && (p % 12 == 1 || p % 12 == 5))
                    bilangan_prima[p] = !bilangan_prima[p];
					p = 3 * i * i + k * k;
                if (p <= batasan && p % 12 == 7)
                    bilangan_prima[p] = !bilangan_prima[p];
					p = 3 * i * i - k * k;
                if ((i > k) && (p <= batasan) && (p % 12 == 11))
                    bilangan_prima[p] = !bilangan_prima[p];
            }
        }
		
        for (int i = 5; i <= hitung; i++)
            if (bilangan_prima[i])
                for (int k = i * i; k < batasan; k += i * i)
                    bilangan_prima[k] = false;
        return bilangan_prima;
    }
	
    public void tunjukBilprima(int pri) {
        boolean[] tunjuk_prima = inibilPrima(pri);
        tunjukkan(tunjuk_prima);
    }
	
    public void tunjukkan(boolean[] tunjuk_prima) {
        System.out.print("\nSieve of Atkin (Bilangan-Bilangan Prima) : ");
        for (int i = 2; i < tunjuk_prima.length; i++)
            if (tunjuk_prima[i])
                System.out.print(i +" ");
        System.out.println();
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ResponsiSieveofAtkin atkin = new  ResponsiSieveofAtkin();
        System.out.print("Masukkan Sembarang Angka : ");
        int p = input.nextInt();
        atkin.tunjukBilprima(p);        
    }
}