// import java.util.Scanner;
public class kafe15 {
    

    // Scanner sc = new Scanner(System.in);
    // String namaPelanggan = "Andi";
    // boolean isMember = true;
    // int totalAkhir = 0;



    // System.out.print("Apakah Anda member? (yes/no): ");
    // String statusMember = sc.next();
    // isMember = statusMember.equalsIgnoreCase("yes");

    

}
}
//     System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
//     int jumlahMenu = sc.nextInt();
//     for (int i = 0; i < jumlahMenu; i++) {
//         System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
//         int pilihanMenu = sc.nextInt();

//         if (pilihanMenu < 1) {
//             System.out.println("tidak valid, silahkan coba lagi");
//             i--;
//             continue;
//         }

//         System.out.print("Masukkan jumlah item yang ingin dipesan: ");
//         int banyakItem = sc.nextInt();

//         totalAkhir += hitungTotalHarga(pilihanMenu, banyakItem);

//     }

//         System.out.print("Masukkan kode promo: ");
//         String promo = sc.next();

//         int totalSetelahDiskon = hitungDiskon(totalAkhir, promo);

//         // double setelahDiskon = hitungSetelahDiskon(totalHarga, promo);

//         // if (setelahDiskon != totalHarga) {
//         //     System.out.printf("Total harga setelah diskon: Rp%.2f%n", setelahDiskon);
//         // } else if (!promo.equalsIgnoreCase("DISKON50") && !promo.equalsIgnoreCase("DISKON30")) {
//         // System.out.println("Kode promo tidak valid");
//         // } else {
//         // System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
//         // }

//         if (totalSetelahDiskon >=0) {
//             System.out.println("Total harga setelah diskon : Rp " + totalSetelahDiskon);
//         } else {
//             System.out.println("kode promo tidak valid");
//             System.out.println("total akhir: " + totalAkhir);
//         }
//         sc.close();
//     }

//     public static int hitungTotalHarga (int pilihanMenu, int banyakItem) {
//         int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
//       return hargaItems[pilihanMenu - 1] * banyakItem;
//     }
//     public static int hitungDiskon (int totalHarga, String promo) {
//         if (promo.equalsIgnoreCase("DISKON50")) {
//             return (int) (totalHarga * 0.5);
//             // hargaTotal *= 0.5; // Diskon 50%
//         } else if (promo.equalsIgnoreCase("DISKON30")) {
//             return (int) (totalHarga * 0.7);
//         }
//             // hargaTotal *= 0.7; // Diskon 30%
//         // } else  (!promo.equalsIgnoreCase("DISKON50") && !promo.equalsIgnoreCase("DISKON30")) {
//             return -1; // Kode promo tidak valid
//     }
//         // return hargaTotal; 
//     // }

//     // public static double hitungSetelahDiskon(int totalHarga, String kodePromo) {
//     //     double totalSetelahDiskon = totalHarga;
    
//     //     if (kodePromo.equalsIgnoreCase("DISKON50")) {
//     //         totalSetelahDiskon = totalHarga * 50/100;

//     //     } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
//     //             totalSetelahDiskon = totalHarga * 30/100;
//     //         }
    
//     //     return totalSetelahDiskon;
//     // }

// }
