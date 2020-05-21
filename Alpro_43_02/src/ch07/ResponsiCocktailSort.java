package ch07;

import java.util.Arrays;

public class ResponsiCocktailSort { 
 
	static int disimpankan;  
	static void iniCocktailsort(int p[], int q) {  
    boolean bertukar = true;  
    int awal = 0;
	int i; 

    while (bertukar) {  
    bertukar = false;  
    for (i = awal; i < (q-1); i++) {  
            if (p[i] > p[i+1]) {  
            disimpankan = p[i];  
			p[i]=p[i+1];  
			p[i+1]=disimpankan;                  
			bertukar = true;  
            }  
        }		
	if (!bertukar)  
		break;
	bertukar = false;  
	for (i = (q-1) - 1; i >= awal; i--) {  
     if (p[i] > p[i+1]) {  
        disimpankan = p[i];  
		p[i]=p[i+1];  
		p[i+1]=disimpankan;  
		bertukar = true;  
        }  
    }  
    awal++;  
    }  
}  

public static void main(String[] args) {   
    int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}, i;
    System.out.println("Nilai Dalam Array : ");
    System.out.println(Arrays.toString(angka) + "\n");	
    int q = angka.length;  
    iniCocktailsort(angka, q);  
    System.out.println("Cocktail Shaker Sort :");  
    for (i = 0; i < q; i++)  
        System.out.print(angka[i]+" ");  
		System.out.println();  
    }  
}  