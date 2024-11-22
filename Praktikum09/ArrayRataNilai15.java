package Praktikum09;
import java.util.Scanner;
public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Masukkan jumlah mahasiswa: ");
        // int jumlahMahasiswa = sc.nextInt();

        // int[] nilaiMhs = new int[jumlahMahasiswa];
        // double totalLulus = 0;
        // double totalTidakLulus = 0;
        // int jumlahLulus = 0;
        // int jumlahTidakLulus = 0;

        // for (int i = 0; i < jumlahMahasiswa; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
        //     nilaiMhs[i] = sc.nextInt();

        //     if (nilaiMhs[i] >= 70) {
        //         jumlahLulus++;
        //         totalLulus += nilaiMhs[i];
        //     } else {
        //         jumlahTidakLulus++;
        //         totalTidakLulus += nilaiMhs[i];
        //     }
        // }

        // double rataRataLulus = jumlahLulus == 0 ? 0 : totalLulus / jumlahLulus;
        // double rataRataTidakLulus = jumlahTidakLulus == 0 ? 0 : totalTidakLulus / jumlahTidakLulus;

        // System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        // System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);


        // int [] nilaiMhs = new int [10];
        // double total = 0;
        // double rata2;
        // int jumlahLulus = 0;

        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + " : ");
        //     nilaiMhs [i] = sc.nextInt();
            
        //     if (nilaiMhs[i] >= 70){
        //         jumlahLulus++;
        //     }

        //     total += nilaiMhs [i];
        // }
        // rata2 = total/nilaiMhs.length;
        // System.out.println("Rata-rata nilai = " + rata2);
        // System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
                System.out.print("Masukkan jumlah mahasiswa: ");
               int jumlahMahasiswa = sc.nextInt();
       
               int[] nilaiMhs = new int[jumlahMahasiswa];
               double totalLulus = 0;
               double totalTidakLulus = 0;
               int jumlahLulus = 0;
               int jumlahTidakLulus = 0;
       
               int nilaiTertinggi = nilaiMhs[0];
               int nilaiTerendah = nilaiMhs[0];
       
               for (int i = 0; i < jumlahMahasiswa; i++) {
                   System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
                   nilaiMhs[i] = sc.nextInt();
       
                   if (nilaiMhs[i] > nilaiTertinggi) {
                       nilaiTertinggi = nilaiMhs[i];
                   }
                   if (nilaiMhs[i] < nilaiTerendah) {
                       nilaiTerendah = nilaiMhs[i];
                   }
       
                   if (nilaiMhs[i] >= 70) {
                       jumlahLulus++;
                       totalLulus += nilaiMhs[i];
                   } else {
                       jumlahTidakLulus++;
                       totalTidakLulus += nilaiMhs[i];
                   }
               }
       
               double rataRataLulus = jumlahLulus == 0 ? 0 : totalLulus / jumlahLulus;
               double rataRataTidakLulus = jumlahTidakLulus == 0 ? 0 : totalTidakLulus / jumlahTidakLulus;
       
               System.out.println("Nilai tertinggi: " + nilaiTertinggi);
               System.out.println("Nilai terendah: " + nilaiTerendah);
               System.out.println("Rata-rata nilai lulus: " + rataRataLulus);
               System.out.println("Rata-rata nilai tidak lulus: " + rataRataTidakLulus); 
       
        sc.close();
    }
}
