package ch03;

import java.util.Scanner;

public class ResponsiPembagiTerkecil {

    public static void main (String[]args){
        int bilangan,nilai,pembagi;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();
		bilangan = nilai;
		
		for (int i = 3; i <= bilangan; i++){
            if(bilangan%i == 0 && i != 2){
				pembagi = i;
				System.out.println("Nilai Pembagi Terkecil dari " + nilai + " " + "adalah " + pembagi);
				break;
            }
		}
	}
}
