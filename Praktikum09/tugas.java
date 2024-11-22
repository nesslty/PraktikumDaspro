package Praktikum09;
import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {
        
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};

        int[] daftarPesanan = new int[daftarMenu.length];

        Scanner sc = new Scanner(System.in);

        double totalHarga = 0;

        while (true) {
            System.out.println("Masukkan nama menu (ketik 'selesai' untuk mengakhiri):");
            String menu = sc.nextLine();

            if (menu.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah pesanan: ");
            int jumlah = sc.nextInt();
            sc.nextLine(); 

            int indeks = cariMenu(daftarMenu, menu);

            if (indeks != -1) {
                daftarPesanan[indeks] = jumlah;
                totalHarga += jumlah * daftarHarga[indeks];
            } else {
                System.out.println("Menu tidak tersedia.");
            }
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarPesanan[i] > 0) {
                System.out.println(daftarMenu[i] + ": " + daftarPesanan[i] + " porsi");
            }
        }

        System.out.println("\nTotal Harga: Rp" + totalHarga);
    }

    static int cariMenu(String[] daftarMenu, String menu) {
        for (int i = 0; i < daftarMenu.length; i++) {
            if (daftarMenu[i].equalsIgnoreCase(menu)) {
                return i;
            }
        }
        return -1;
    }
}

