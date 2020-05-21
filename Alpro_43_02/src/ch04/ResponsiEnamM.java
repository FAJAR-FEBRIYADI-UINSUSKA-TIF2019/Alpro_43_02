package ch04;

import java.util.Arrays;

public class ResponsiEnamM {
	public static void main (String[] args) {
		int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println ("Nilai Dalam Arrays : " + Arrays.toString(angka));
		
		int banyak = angka.length;
		int henti = banyak - 1;
		int total = 0;
		
		System.out.println("\nJumlah Angka Selisih Berdasarkan Selisih Angka-Angka dengan Angka Setelahnya Dalam Array (Point Responsi i) : ");
		for (int i = 0; i < banyak; i++) {
			if (i == henti) {
			}else{
				int selisih =  angka[i+1] - angka[i];
				total += selisih;	
			}		
		}
		System.out.println (total + " ");
	}
}