import java.util.Scanner;
public class kafe215 {
    public static void Menu (String namaPelanggan, boolean isMember, String promo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% di setiap pembelian!");
        }

        if (promo.equalsIgnoreCase("DISKON5O")) {
            System.out.println("anda mendapat diskon 50%");
        } else if (promo.equalsIgnoreCase("DISKON30")) {
            System.out.println("anda mendapat diskon 30%");
        } else {
            System.out.println("kode invalid!!");
        }
        System.out.println("===== [ MENU RESTO KAFE ] =====");
        System.out.println("1. Kopi Hitam   = Rp 15,000");
        System.out.println("2. Cappuccino   = Rp 20,000");
        System.out.println("3. Latte        = Rp 22,000");
        System.out.println("4. Teh Tarik    = Rp 12,000");
        System.out.println("5. Roti Bakar   = Rp 10,000");
        System.out.println("6. Mie Goreng   = Rp 18,000");
        System.out.println("==============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON50");
        System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga15(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        sc.close();
        }
    public static int hitungTotalHarga15(int pilihanMenu, int banyakItem) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000} ;

        int hargaTotal = hargaItems [pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
}

