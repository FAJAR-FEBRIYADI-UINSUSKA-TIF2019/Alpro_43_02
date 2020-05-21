package ch04;

import java.util.Arrays;

public class ResponsiEnamH {
	public static void main (String[] args) {
		int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println ("Nilai Dalam Arrays : " + Arrays.toString(angka));
		int total = 0;
		for (int i = 0; i < angka.length; i++) {
		total += angka[i];
		}
		System.out.println ("\nJumlah Nilai Dalam Array = " + total);
		System.out.println ("Jumlah Data Dalam Array = " +angka.length);
	}
}