package ch06;

import java.util.Arrays;

public class ResponsiBubbleSort {
	public static void main(String[] args) {
		
		int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		System.out.println("Nilai Dalam Array : ");
        System.out.println(Arrays.toString(angka));
		System.out.println("");
		System.out.println("Bubble Sort Array : ");
		for(int i = (angka.length - 1); i > 0; i--) {
			for(int k = 0; k < i; k++) {
				if(angka[k] > angka[(k + 1)]) {
					int disimpankan = angka[(k+1)];
					angka[(k+1)] = angka[k];
					angka[k] = disimpankan;
				}
			}
		}
		for(int i = 0; i < angka.length; i++) {
			System.out.print(angka[i] + " ");
		}
		System.out.println("");
	}
}