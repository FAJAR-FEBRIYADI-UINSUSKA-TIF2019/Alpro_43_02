package ch08;

import java.util.Arrays;

public class ResponsiBoyerMoore {
    public static int[] deltaPola(String pola) {
        int jum_karakter = 256;
        int panjang_pola = pola.length();
        int[] karakter = new int[jum_karakter];
        Arrays.fill(karakter, -1);
        for (int i = 0; i < panjang_pola; i++) {
            karakter[pola.charAt(i)] = i;
        }
        return karakter;
    }

    public static int iniBoyermoore(String pola, String kalimat) {
        int[] karakter = deltaPola(pola);
        int panjang_pola = pola.length();
        int panjang_kalimat = kalimat.length();
        int p = panjang_pola - 1;
        int q;
        while (p < panjang_kalimat) {
            q = panjang_pola - 1;
            while (kalimat.charAt(p) == pola.charAt(q)) {
                q--;
                p--;
                if (q < 0) {
                    return (p + 1);
                }
            }
            int dariKanan = karakter[kalimat.charAt(p)];
            int pergeseran = q - dariKanan;
            p += pergeseran;
        }
        return -1;
    }
	
    public static void main(String[] args) {
        String pola = "apun";
        String kalimat = "dimanapun" + "kapanpun" + "siapapun" + "walaupun" + "mengapapun";
		System.out.println("Kalimat : \n" + kalimat);
		System.out.println("");
		System.out.println("Pola : \n" + pola);
		System.out.println("");
        System.out.println("Boyer Moore String Search = " + iniBoyermoore(pola, kalimat));
    }
}