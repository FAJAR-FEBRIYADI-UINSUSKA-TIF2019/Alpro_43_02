package ch04;

import java.util.Arrays;

public class ResponsiEnamG {
	public static void main (String[] args) {
		int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println ("Nilai Dalam Arrays : " + Arrays.toString(angka));
		
		System.out.print("\nBilangan Kelipatan Lima Yang Sebelumnya Kelipatan 5 Dalam Array : " );
		for (int i = 0; i < angka.length; i++) {
		if ((angka[i] % 5 == 0 && angka[i] % 10 != 0) && (angka[i] % 5 == 0))  {
				System.out.print (angka[i] + " ");
			}
		}
		System.out.println ("");
	}
}