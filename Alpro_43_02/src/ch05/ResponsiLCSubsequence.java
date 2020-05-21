package ch05;

public class ResponsiLCSubsequence {

	public static int iniLcsubsequence(String kata1, String kata2) {
		int p = kata1.length();
		int q = kata2.length();
		int[][] Arrays = new int[p + 1][q + 1];
		for (int i = 1; i <= p; i++) {
			for (int k = 1; k <= q; k++) {
				if (kata1.charAt(i - 1) == kata2.charAt(k - 1)) {
					Arrays[i][k] = Arrays[i - 1][k - 1] + 1;
				}else{
					Arrays[i][k] = Integer.max(Arrays[i - 1][k], Arrays[i][k - 1]);	 
				}
			}
		}
		return Arrays[p][q];
	}
	
	public static void main(String[] args) {
		String kata1 = "MENGAPA"; 
		String kata2 = "KENAPAA";
		System.out.println("Kata 1 : " + kata1);
		System.out.println("Kata 2 : " + kata2);
		System.out.println("Longest Common Subsequence : " + iniLcsubsequence(kata1, kata2));
	}
}
