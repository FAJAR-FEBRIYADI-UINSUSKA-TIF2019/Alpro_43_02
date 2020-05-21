package ch06;

import java.util.Arrays;

public class ResponsiSelectionSort {
 
 public static void iniSelectionsort (int [] angka){
	for (int i = 0; i < angka.length - 1; i++){
     int arrayminim = angka[i];
     int array_minim_indek = i;
   
		for(int k = i + 1; k < angka.length; k++){
			if(arrayminim > angka[k]){
			arrayminim = angka[k];
			array_minim_indek = k;
			}
		}
   
		if(array_minim_indek != i){
		angka[array_minim_indek] = angka[i];
		angka[i] = arrayminim;
		}
	}
 }
 
 public static void main(String args []){
	 int angka [] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	 System.out.println("Nilai Dalam Array : ");
     System.out.println(Arrays.toString(angka));
	 System.out.println("");
	 System.out.println("Selection Sort : ");
	 ResponsiSelectionSort.iniSelectionsort(angka);
	 for (int i = 0; i < angka.length; i++){
		System.out.print(angka[i] + " ");
		}
	 System.out.println("");
	}
 }