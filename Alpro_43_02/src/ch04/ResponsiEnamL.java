package ch04;

import java.util.Arrays;

public class ResponsiEnamL {
	public static void main (String[] args) {
		int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println ("Nilai Dalam Arrays : " + Arrays.toString(angka));
		
		int banyak = angka.length;
		int henti = banyak - 1;
		
		System.out.println("\nJumlah Angka Dengan Angka Setelahnya Hasil Penjumlahannya Bernilai Genap Dalam Array : ");
		for (int i = 0; i < banyak; i++) {
			if (i == henti) {
			}else{
				int selisih =  angka[i+1] + angka[i];
				int selisih2 = selisih;
				if (selisih2 % 2 == 0) {
				System.out.print (selisih2 + " ");
				}
			}
		}
		System.out.println("");	
	}
}