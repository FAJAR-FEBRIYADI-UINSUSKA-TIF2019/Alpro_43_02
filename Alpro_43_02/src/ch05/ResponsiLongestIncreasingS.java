package ch05;

import java.util.Arrays;

public class ResponsiLongestIncreasingS {
	
   static int seluruhMaksimal; 
   static int iniIncreasing(int angka[], int banyak) {
	   
		if (banyak == 1) 
		return 1; 
		int h, akhirMaksimal = 1; 
		for (int i = 1; i < banyak; i++) { 
            h = iniIncreasing(angka, i); 
            if (angka[i-1] < angka[banyak-1] && h + 1 > akhirMaksimal) 
                akhirMaksimal = h + 1; 
        }
        if (seluruhMaksimal < akhirMaksimal) 
           seluruhMaksimal = akhirMaksimal; 
        return akhirMaksimal; 
   } 
  
    static int iniLongestincreasings(int angka[], int banyak) { 
        seluruhMaksimal = 1; 
		iniIncreasing(angka, banyak); 
        return seluruhMaksimal; 
    } 
	
    public static void main(String args[]) { 
        int angka[] = {30,55,17,66,43,70,61,80}; 
        int banyak = angka.length; 
		System.out.println("Nilai Dalam Array : ");
        System.out.println(Arrays.toString(angka) + "\n");
        System.out.println("Longest Increasing Subsequence : " + iniLongestincreasings(angka, banyak)); 
    } 
 } 