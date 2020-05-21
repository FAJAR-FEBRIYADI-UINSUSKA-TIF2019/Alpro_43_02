package ch03;

import java.util.Scanner;

public class ResponsiTertinggiTiga {
    public static void main (String[] args){
		
		Scanner input = new Scanner (System.in);
		System.out.print ("Masukkan Nilai Yang Pertama : ");
		int x = input.nextInt();
		System.out.print ("Masukkan Nilai Yang Kedua : ");
		int y = input.nextInt();
		System.out.print ("Masukkan Nilai Yang Ketiga : ");
		int z = input.nextInt();
        
        if (x>y && x>z) {
            System.out.println ("Nilai Pertama Lebih Besar dari Nilai Kedua dan Nilai Ketiga");
		}else if (y>z){
			System.out.println ("Nilai Kedua Lebih Besar dari Nilai Pertama dan Nilai Ketiga");
        }else{
            System.out.println ("Nilai Ketiga Lebih Besar dari Nilai Pertama dan Nilai Kedua");
            
        }
   
    }
    
}
