package ch09;

public class ResponsiAKSPrimality {
	
    private static final long[] digit = new long[64];
 
    public static void main(String[] args) {
        for (int i = 0; i <= 1; i++) {
            koefisien(i);
            tunjukkan(i);
        }
        System.out.print("AKS Primality Test (Bilangan Prima) :");
        for (int i = 1; i < digit.length; i++)
            if (bilPrima(i))
                System.out.printf(" %d", i);
        System.out.println("");
    }
 
    static void koefisien(int p) {
        digit[0] = 1;
        for (int i = 0; i < p; digit[0] = - digit[0], i++) {
            digit[1+i] = 1;
            for (int k = i; k > 0; k--)
                digit[k] = digit[k-1] - digit[k];
        }
    }
 
    static boolean bilPrima(int p) {
        koefisien(p);
        digit[0]++;
        digit[p]--;
        int i = p;
        while (i-- != 0 && digit[i] % p == 0)
		continue;
        return i < 0;
    }
	
    static void tunjukkan(int p) {
        System.out.print("Digit Angka Yang Ada : \n");
        for (long i = 0; i <= digit.length; i++) {
            System.out.print(i + " ");
        }
		System.out.println("\n");
    }
}