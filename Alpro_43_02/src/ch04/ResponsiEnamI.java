package ch04;

import java.util.Arrays;

public class ResponsiEnamI {
	public static void main (String[] args) {
		int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println ("Nilai Dalam Arrays : " + Arrays.toString(angka));
		
		System.out.println ("\nSelisih Angka dengan Angka Setelahnya Dalam Array : ");
		int banyak = angka.length;
		int henti = banyak - 1;
		for (int i = 0; i < banyak; i++) {
			if (i == henti) {
			}else{
				int selisih =  angka[i+1] - angka[i];
				System.out.print (selisih + " ");
			}	
		}
		System.out.println ("");
	}
}