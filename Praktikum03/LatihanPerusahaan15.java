package Praktikum03;
import java.util.Scanner;
public class LatihanPerusahaan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jamkerja, upahperjam, totalgajikotor;
        double gajisamabonus, totalgajibersih;
        upahperjam = 15000;
        System.out.println("Masukkan jumlah jam kerja anda: ");
        jamkerja = sc.nextInt();
        totalgajikotor = upahperjam * jamkerja;
        System.out.println("Berikut adalah jumlah gaji kotor: " + totalgajikotor);
        gajisamabonus = totalgajikotor * 0.1 + totalgajikotor;
        System.out.println("Berikut adalah jumlah gaji sama bonus: " + gajisamabonus);
        totalgajibersih = gajisamabonus - 0.05 * gajisamabonus;
        System.out.println("Berikut total gaji bersih anda: " + totalgajibersih);

        sc.close();
    }
}
