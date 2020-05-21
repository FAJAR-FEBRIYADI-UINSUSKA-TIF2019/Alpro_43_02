package ch08;

public class ResponsiLCSubstringProblem {

	public static String iniLcsubstring(String p, String q, int r, int s) {
		int panjanglcs = 0;
		int indek_akhir_lcs_p = r;
		int[][] panjanglc_substring = new int[r + 1][s + 1];
		for (int i = 1; i <= r; i++) {
			for (int k = 1; k <= s; k++)
			{
				if (p.charAt(i - 1) == q.charAt(k - 1)) {
					panjanglc_substring[i][k] = panjanglc_substring[i - 1][k - 1] + 1;
					if (panjanglc_substring[i][k] > panjanglcs) {
						panjanglcs = panjanglc_substring[i][k];
						indek_akhir_lcs_p = i;
					}
				}
			}
		}

		return p.substring(indek_akhir_lcs_p - panjanglcs, indek_akhir_lcs_p);
	}

	public static void main(String[] args) {
		String p = "dimanapunkapanpunsiapapun", q = "walaupunmengapapunbagaimanapun";
		System.out.println("Teks 1 : " + p);
		System.out.println("Teks 2 : " + q);
		int r = p.length(), s = q.length();
		System.out.println("Longest Common Substring Problem : " + iniLcsubstring(p, q, r, s));
	}
}