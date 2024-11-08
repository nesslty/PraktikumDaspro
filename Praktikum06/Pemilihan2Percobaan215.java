package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan215 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pilihanMenu, harga;
    String member, qris;
    double diskon, total_bayar;

    System.out.println("-----------------------");
    System.out.println("==== MENU KAFE JTI ====");
    System.out.println("-----------------------");
    System.out.println("1. Rice Bowl");
    System.out.println("2. Ice Tea");
    System.out.println("3. Paket Bunding (Rice Bowl + Ice Tea)");
    System.out.println("-----------------------");
    System.out.println("Masukkan angka dari menu yang dipilih");
    pilihanMenu = sc.nextInt();
    sc.nextLine();
    System.out.println("Apakah punya member (y/n) ? = ");
    member = sc.nextLine();
    System.out.println("Apakah pembayaran QRIS (y/n) ? =");
    qris = sc.nextLine();
    System.out.println("-----------------------");

    if (member.equalsIgnoreCase("y")) {
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (pilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga Rice Bowl = " + "harga");
        } else if (pilihanMenu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + "harga");
        } else if (pilihanMenu == 3) {
        harga = 15000;
        System.out.println("Harga Bunding = " + "harga");
        } else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return;
        }
        total_bayar = harga - (harga * diskon);
        System.out.println(total_bayar);
        // jika bayar dengan qris dipotong 1.000
        if (qris.equalsIgnoreCase("y")) {
            System.out.println("Mendapat potongan 1.000 karena metode QRIS");
            total_bayar -= 1000; // bentuk sederhana dari total_bayar = total_bayar - 1000;
        }

        System.out.println("Total bayar setelah diskon = " + total_bayar);
    } else if (member.equalsIgnoreCase("n")) {
        if (pilihanMenu == 1) {
        harga = 14000;
        System.out.println("Harga Rice Bowl = " + harga);
        } else if (pilihanMenu == 3) {
        harga = 3000;
        System.out.println("Harga Ice Tea = " + harga);
        } else if (pilihanMenu == 3) {
        harga = 15000;
        System.out.println("Harga Bunding = " + harga);
        } else {
        System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        // jika bayar dengan qris dipotong 1.000
        if (qris.equalsIgnoreCase("y")) {
            System.out.println("Mendapat potongan 1.000 karena metode QRIS");
            harga -= 1000; // bentuk sederhana dari total_bayar = total_bayar - 1000;
        }

        System.out.println("Total bayar = " + harga);
    } else {
        System.out.println("Member tidak valid");
    }
    System.out.println("---------------------");
    sc.close();
}
}
