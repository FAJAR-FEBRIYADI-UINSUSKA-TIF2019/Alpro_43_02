package ch04;

import java.util.Arrays;

public class ResponsiEnamN {
	public static void main (String[] args) {
		int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println ("Nilai Dalam Arrays : " + Arrays.toString(angka));
		int total = 0;
		
		System.out.println ("\nJumlah Angka-Angka Di Dalam Array Tersebut Dengan Seluruh Angka-Angka Sebelumnya : ");
		for (int i = 0; i < angka.length; i++) {
			total += angka[i];
			System.out.print (total + " ");
		}
		System.out.println("");
	}
}