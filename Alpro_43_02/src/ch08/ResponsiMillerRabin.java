package ch08;

import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class ResponsiMillerRabin {
    public boolean inibilPrima(long p, int pengulangan){
        if (p == 0 || p == 1)
            return false;
        if (p == 2)
            return true;
        if (p % 2 == 0)
            return false;
        long q = p - 1;
        while (q % 2 == 0)
            q /= 2;

        Random acak = new Random();
        for (int i = 0; i < pengulangan; i++) {
            long j = Math.abs(acak.nextLong());            
            long k = j % (p - 1) + 1, disimpankan = q;
            long modulus = modulusPowpangkat(k, disimpankan, p);
            while (disimpankan != p - 1 && modulus != 1 && modulus != p - 1) {
                modulus = modulusMultiplykali(modulus, modulus, p);
                disimpankan *= 2;
            }
            if (modulus != p - 1 && disimpankan % 2 == 0)
                return false;
        }
        return true;        
    }

    public long modulusPowpangkat(long k, long l, long h) {
        long pasal = 1;
        for (int i = 0; i < l; i++) {
            pasal *= k;
            pasal %= h; 
        }
        return pasal % h;
    }

    public long modulusMultiplykali(long k, long l, long modulus) {
        return BigInteger.valueOf(k).multiply(BigInteger.valueOf(l)).mod(BigInteger.valueOf(modulus)).longValue();
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ResponsiMillerRabin rabin = new ResponsiMillerRabin();
        System.out.print("Masukkan Angka : ");
        long angka = input.nextLong();
        System.out.print("Masukkan Angka Pengulangan : ");
        int ulang = input.nextInt();
        boolean iniprima = rabin.inibilPrima(angka, ulang);
        if (iniprima)
            System.out.println("\n"+ angka +" PRIMA");
        else
            System.out.println("\n"+ angka +" BUKAN Prima (Campuran)");
    }
}
