package Praktikum05;

import java.util.Scanner;
public class PemilihanHariDenganIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        if (angka >= 1 && angka <= 5)
        {
            System.out.println("Angka ini adalah" + " weekday ");
        }

        else if (angka == 6 || angka == 7)
        {
            System.out.println("Angka ini adalah" + " weekend ");
        }

        else
        {
            System.out.println("Angka ini adalah" + " invalid number ");
        }
        sc.close();
} 
}