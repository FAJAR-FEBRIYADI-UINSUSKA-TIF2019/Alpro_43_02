package ch05;

import java.util.Arrays;

public class ResponsiKadane {

	public int iniKadane(int[] angka) {
		int maksimalLokal = 0;
		int maksimalGlobal = 0;
		for (int i = 0; i < angka.length; i++) {
			maksimalLokal += angka[i];
			if (maksimalLokal < 0) {
				maksimalLokal = 0;
			}
			if (maksimalGlobal < maksimalLokal) {
				maksimalGlobal = maksimalLokal;
			}
		}
		return maksimalGlobal;
	}

	public static void main(String args[]) {
		 int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		 System.out.println("Nilai Dalam Array : ");
         System.out.println(Arrays.toString(angka) + "\n");
		 ResponsiKadane obj = new ResponsiKadane();
		 System.out.println("Kadane (Subarray Termaksimal) : " + obj.iniKadane(angka));
	}
}
