package Praktikum06;

import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisBuku, jumlahBuku;
        double diskon = 0;

        System.out.println("Pilihan Buku:");
        System.out.println("1. Kamus");
        System.out.println("2. Novel");
        System.out.println("3. Lainnya");
        System.out.println("");

        System.out.print("Pilih jenis buku : ");
        jenisBuku = sc.nextInt();

        System.out.println("");

        if (jenisBuku == 1 || jenisBuku == 2 || jenisBuku == 3) {
            System.out.print("jumlah buku : ");
            jumlahBuku = sc.nextInt();

            if (jenisBuku == 1) {
                // System.out.println("kamus");
                diskon = 10;
                if (jumlahBuku > 2) {
                    diskon += 2;
                } 
            } else if (jenisBuku == 2) {
                // System.out.println("novel");
                diskon = 7;
                if (jumlahBuku > 3) {
                    // diskon = diskon + 10;
                    diskon += 2;
                } else if (jumlahBuku <= 3) {
                    diskon += 1;
                }
            } else if (jenisBuku == 3) {
                // System.out.println("lainnya");
                if (jumlahBuku > 3) {
                    diskon = 5;
                }
            }
        } else {
            System.out.println("maaf, buku tidak diketahui!");
        }

        System.out.println("total diskon: " + diskon + " %");
        sc.close();
    }
}