package ch07;

import java.util.Arrays;

 public class ResponsiMergeSort {

	 public static void iniMergesort(int[] merge, int bagian1, int bagian2) {
		 int p = bagian2 - bagian1; 
		 if (p <= 1)
		 return;
		 int bagianTengah = bagian1 + p/2;
		 iniMergesort(merge, bagian1, bagianTengah); 
		 iniMergesort(merge, bagianTengah, bagian2);		 
		 int[] disimpankan = new int[p]; 
		 int i = bagian1;
		 int j = bagianTengah;
		 for (int q = 0; q < p; q++) {
			 if (i == bagianTengah)
				disimpankan[q] = merge[j++];
			 else if (j == bagian2)
				disimpankan[q] = merge[i++];
			 else if (merge[j]<merge[i])
				disimpankan[q] = merge[j++];
			 else
				disimpankan[q] = merge[i++];
		}
		 for (int q = 0; q < p; q++)
			merge[bagian1+q] = disimpankan[q];
	}

 public static void main(String[] args) {
	 int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
     System.out.println("Nilai Dalam Array : ");
     System.out.println(Arrays.toString(angka) + "\n");	
	 int i;
	 int panjang = angka.length;
	 for (i = 0; i < panjang; i++);
	 iniMergesort(angka, 0, panjang);
	 System.out.println("Merge Sort : ");
	 for (i = 0; i < panjang; i++)
		System.out.print(angka[i]+" ");
		System.out.println();
	} 
}