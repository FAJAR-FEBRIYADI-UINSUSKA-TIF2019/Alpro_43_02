package ch08;

public class ResponsiKnuthMorrisPratt {
	public static void iniKnuthmorrispratt(String p, String q) {
		if (q == null || q.length() == 0) {
			System.out.println("Pergeseran Pola Adalah 0");
			return;
		}

		if (p == null || q.length() > p.length()) {
			System.out.println("Pola Tidak Ditemukan");
			return;
		}

		char[] karakter = q.toCharArray();
		int[] karakter_lanjut = new int[q.length() + 1];
		for (int i = 1; i < q.length(); i++) {
			int k = karakter_lanjut[i + 1];
			while (k > 0 && karakter[k] != karakter[i])
				k = karakter_lanjut[k];
			if (k > 0 || karakter[k] == karakter[i])
				karakter_lanjut[i + 1] = k + 1;
		}

		for (int i = 0, k = 0; i < p.length(); i++) {
			if (k < q.length() && p.charAt(i) == q.charAt(k)) {
				if (++k == q.length()) {
					System.out.println("Knuth Morris Pratt (Pergeseran Pola Terjadi Ke- : " + (i - k + 1));
				}
			}
			else if (k > 0) {
				k = karakter_lanjut[k];
				i--;	
			}
		}
	}

	public static void main(String[] args) {
		String kalimat = "dimanapunkapanpunsiapapunwalaupunmengapapun";
		System.out.println("Kalimat : " + kalimat);
		String pola = "apun";
		System.out.println("Pola : " + pola);
		iniKnuthmorrispratt(kalimat, pola);
	}
}