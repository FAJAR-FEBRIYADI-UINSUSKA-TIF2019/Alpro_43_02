 package ch07;
 
 public class ResponsiBlockSort { 
    static int Ukuran = 32; 
    public static void iniInsertasi (int[] angka, int dariKiri, int dariKanan) { 
        for (int i = dariKiri+1; i<=dariKanan; i++) { 
            int disimpankan = angka[i]; 
            int j = i-1; 
            while (j >=dariKiri && angka[j] > disimpankan) { 
                angka[j+1] = angka[j]; 
                j--; 
            } 
            angka[j+1] = disimpankan; 
        } 
    } 
   
    public static void iniMerge (int[] angka, int p, int q, int r) {  
        int bagian1 = q-p+1;
		int bagian2 = r-q; 
        int[] dariKiri = new int[bagian1]; 
        int[] dariKanan = new int[bagian2]; 
        for (int m = 0; m < bagian1; m++) { 
            dariKiri[m] = angka[p+m]; 
        } 
        for (int m = 0; m < bagian2; m++) { 
            dariKanan[m] = angka[q+1+m];
        } 
        int i = 0; 
        int j = 0; 
        int h = p; 	
		
        while (i < bagian1 && j < bagian2) { 
            if (dariKiri[i] <= dariKanan[j]) { 
                angka[h] = dariKiri[i]; 
                i++; 
            } 
            else { 
                angka[h] = dariKanan[j]; 
                j++; 
            } 
            h++; 
        } 
        while (i < bagian1) { 
            angka[h] = dariKiri[i]; 
            h++; 
            i++; 
        } 
        while (j < bagian2) { 
            angka[h] = dariKanan[j]; 
            h++; 
            j++; 
        } 
    } 
	
    public static void iniBlocksort(int[] angka, int s) { 
        for (int i = 0; i < s; i += Ukuran) { 
            iniInsertasi(angka, i, Math.min((i + 31), (s - 1))); 
        } 
        for (int Besar = Ukuran; Besar < s; Besar = 2*Besar) {  
            for (int dariKiri = 0; dariKiri<s; dariKiri += 2*Besar) { 
                int dariTengah = dariKiri+Besar-1; 
                int dariKanan = Math.min((dariKiri + 2 * Besar - 1), (s - 1)); 
                iniMerge(angka, dariKiri, dariTengah, dariKanan); 
            } 
        } 
    } 
  
    public static void Cetak(int[] angka, int s) { 
        for (int i = 0; i < s; i++) { 
            System.out.print(angka[i] + " "); 
        } 
        System.out.print("\n"); 
    } 
	
    public static void main(String[] args) { 
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
        int s = angka.length; 
        System.out.print("Nilai Dalam Array : \n"); 
        Cetak(angka, s); 
        iniBlocksort(angka, s); 
        System.out.print("Block Sort Array : \n"); 
        Cetak(angka, s); 
    } 
}