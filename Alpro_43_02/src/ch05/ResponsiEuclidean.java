package ch05;

public class ResponsiEuclidean {
	public static int iniFpb (int p, int q) {
		int r;
		while (q != 0) {
			r = p % q;
			p = q;
			q = r;
		}
		return p;
	}
	public static void main (String[]args) {
		System.out.println ("Euclidean (FPB) : " + iniFpb(105,55));
	}
}