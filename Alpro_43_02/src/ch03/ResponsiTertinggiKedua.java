package ch03;

import java.util.Scanner ;

public class ResponsiTertinggiKedua {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print ("Masukkan Bilangan Pertama : ");
		int x = input.nextInt();
		System.out.print ("Masukkan Bilangan Kedua : ");
		int y = input.nextInt();
		
		if (x > y) {
			System.out.println ("Bilangan Pertama Lebih Besar dari Bilangan Kedua");
		} else {
			System.out.println ("Bilangan Kedua Lebih Besar dari Bilangan Pertama");
		}
	}
}