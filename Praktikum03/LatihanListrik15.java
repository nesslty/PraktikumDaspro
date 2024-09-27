package Praktikum03;
import java.util.Scanner;
public class LatihanListrik15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifListrik, penggunaanListrik, tagihan,
        listrikLebih = 500;
        tarifListrik = 1500;
        System.out.println("Masukkan jumlah penggunaan listrik (kWh) ");
        penggunaanListrik = sc.nextInt();
        tagihan = penggunaanListrik * tarifListrik;
        System.out.println("Berikut adalah tagihan listrik anda " + tagihan);
        System.out.println("Apakah listrik lebih dari 500 kWh " + (penggunaanListrik > listrikLebih));
        sc.close();
    }
} 