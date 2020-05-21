package ch03;

import java.util.Scanner;
public class ResponsiPrimaAtauBukan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int bilangan = input.nextInt();
        int prima = 0;
        for(int i=1; i<=bilangan; i++){
        if(bilangan % i== 0)
            prima = prima + 1;  }
        if(prima == 2)
            System.out.println(bilangan + " Merupakan Bilangan PRIMA");
        else
            System.out.println(bilangan + " Merupakan Bilangan BUKAN Prima");
    }
}