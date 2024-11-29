import java.util.Scanner;
public class kafe15 {
    // public static void Menu (String namaPelanggan, boolean isMember) {

    public static void main(String[] args) { 
        String namaPelanggan = "Andi";
        boolean isMember = true;

        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    // }
    // public static void main(String[] args) {
    //     Menu("Andi", true);

        Scanner sc = new Scanner(System.in);
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

        System.out.print("Masukkan promo (jika ada): ");
        String promo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        double setelahDiskon = hitungSetelahDiskon(totalHarga, promo);

        if (setelahDiskon != totalHarga) {
            System.out.printf("Total harga setelah diskon: Rp%.2f%n", setelahDiskon);
        } else if (!promo.equalsIgnoreCase("DISKON50") && !promo.equalsIgnoreCase("DISKON30")) {
        System.out.println("Kode promo tidak valid");
        } else {
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        }
        sc.close();
    }

    public static int hitungTotalHarga (int pilihanMenu, int banyakItem) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal; 
    }

    public static double hitungSetelahDiskon(int totalHarga, String kodePromo) {
        double totalSetelahDiskon = totalHarga;
    
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalSetelahDiskon = totalHarga * 50/100;

        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
                totalSetelahDiskon = totalHarga * 30/100;
            }
    
        return totalSetelahDiskon;
    }
}
