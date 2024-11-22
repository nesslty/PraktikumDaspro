package Praktikum10;
import java.util.Scanner;

public class tugasteori {
    public static void main(String[] args) {
        int[][] hasilSurvei = new int[10][6];
        Scanner sc = new Scanner(System.in);

        // Input data survei
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                hasilSurvei[i][j] = sc.nextInt();
            }
        }

        // Hitung dan tampilkan rata-rata setiap responden, pertanyaan, dan keseluruhan
        double totalKeseluruhan = 0;

        // Rata-rata responden dan pertanyaan
        for (int i = 0; i < 10; i++) {
            double rataRataResponden = 0;
            for (int j = 0; j < 6; j++) {
                rataRataResponden += hasilSurvei[i][j];
                totalKeseluruhan += hasilSurvei[i][j];
            }
            System.out.println("Rata-rata responden " + (i + 1) + ": " + rataRataResponden / 6);
        }

        // Rata-rata per pertanyaan
        for (int j = 0; j < 6; j++) {
            double rataRataPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                rataRataPertanyaan += hasilSurvei[i][j];
            }
            System.out.println("Rata-rata pertanyaan " + (j + 1) + ": " + rataRataPertanyaan / 10);
        }

        // Rata-rata keseluruhan
        System.out.println("\nRata-rata keseluruhan: " + totalKeseluruhan / (10 * 6));

        sc.close();
    }
}
