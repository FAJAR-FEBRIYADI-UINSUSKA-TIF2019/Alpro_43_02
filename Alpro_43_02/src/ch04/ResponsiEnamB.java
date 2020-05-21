package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class ResponsiEnamB {
    public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.print ("Masukkan Nilai Di Yang Ingin Di Cari Dalam Array : ");
        int mencari = input.nextInt();
        boolean bukti = false;
		System.out.println ("Nilai Dalam Array : " + Arrays.toString(angka));
		
        for(int indeks=0; indeks < angka.length; indeks++){
                if (angka[indeks]==mencari){
                    System.out.println("Angka : " + mencari + "\nTerletak Indeks Ke : " + indeks);
                    bukti=true;
                }
            }
        if (bukti==false){
            System.out.println("Angka : " + mencari + " Tidak Ada Dalam Nilai Array  ");
        }      
    }	
}
		