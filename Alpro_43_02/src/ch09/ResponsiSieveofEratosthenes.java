package ch09;

import java.util.Scanner;
 
public class ResponsiSieveofEratosthenes {

    private int[] inibilPrima(int pri) {
        int[] angka = new int[pri + 1];
        for (int i = 2; i <= Math.sqrt(pri); i++) {
            if (angka[i] == 0) {
                for (int k = i * i; k <= pri; k += i) {
                    angka[k] = 1;
                }
            }
        }
        return angka;
    }
	
    public void tunjukBilprima(int pri) {
        int[] tunjuk_prima = inibilPrima(pri);
        tunjukkan(tunjuk_prima);
    }
	
    public void tunjukkan(int[] tunjuk_prima) {
        System.out.print("\nSieve of Eratosthenes (Bilangan-Bilangan Prima) : ");
        for (int i = 2; i < tunjuk_prima.length; i++)
            if (tunjuk_prima[i] == 0)
                System.out.print(i+" ");
        System.out.println();
    }
	
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ResponsiSieveofEratosthenes eratosthenes = new ResponsiSieveofEratosthenes();
        System.out.print("Masukkan Sembarang Angka : ");
        int p = input.nextInt();
        eratosthenes.tunjukBilprima(p);        
    }
}