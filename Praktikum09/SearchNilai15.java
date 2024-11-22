package Praktikum09;
import java.util.Scanner;
public class SearchNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahElemen = sc.nextInt();

        int[] arrNilai = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1; // Inisialisasi hasil dengan -1 untuk menunjukkan nilai tidak ditemukan

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
        // int [] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        // int key = 90;
        // int hasil = 0;

        // System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        // int jumlahElemen = sc.nextInt();

        // for (int i = 0; i < jumlahElemen; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
        //     arrNilai[i] = sc.nextInt();

        // System.out.print("Masukkan nilai yang ingin dicari: ");
        // sc.nextInt();


        // for (i = 0; i < arrNilai.length; i++) {
        //     if (key == arrNilai [i]) {
        //     hasil = i;
        //     break;
        //     }
        // }

        // if (hasil != -1) {
        //     System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
        // } else {
        //     System.out.println("Nilai " + key + " tidak ditemukan");
        // }


        // int [] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        // int key = 90;
        // int hasil = 0;

        // for (int i = 0; i < arrNilai.length; i++) {
        //     if (key == arrNilai [i]) {
        //         hasil = i;
        //         break;
        //     }
        // }
        // System.out.println();
        // System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        // System.out.println();
        sc.close();
    }
}

