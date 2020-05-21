package ch04;

import java.util.Arrays;

public class ResponsiEnamF {
	public static void main (String[] args) {
		int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println ("Nilai Dalam Arrays : " + Arrays.toString(angka));
		
		System.out.print("\nBilangan Ganjil Diapit Angka Genap Dalam Array : " );
		for (int i = 0; i < angka.length-1; i++) {
			if (angka[i] % 2 != 0 && angka[i] % 2 != 0) {
				System.out.print (angka[i] + " ");
			}
		}
		System.out.println ("");
	}
}