package ch06;

import java.util.Arrays;

public class ResponsiInsertionSort {
    
    public static void iniInsertionsort(int[] angka) {
        
        for (int i = 1; i < angka.length; i++) {
            int disimpankan = angka[i];
            int p;
            for (p = i-1; p >= 0 && angka[p] > disimpankan; p--) {
                angka[p+1] = angka[p];
                }
            angka[p+1] = disimpankan;
            }
        }
    
    public static void main (String [] args){
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		System.out.println("Nilai Dalam Array : ");
        System.out.println(Arrays.toString(angka));
		System.out.println("");
		System.out.println("Insertion Sort : ");
        ResponsiInsertionSort.iniInsertionsort(angka);
        for (int i = 0; i < angka.length; i++) {
		  System.out.print(angka[i] + " ");
          }
		System.out.println("");
    }
 }