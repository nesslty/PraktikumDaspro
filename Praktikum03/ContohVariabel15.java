package Praktikum03;

public class ContohVariabel15 {
    public static void main(String[] args) {
       String salahSatuHobiSayaAdalah = "Bermain petak umpet";
       boolean isPandai = false;
       char jenisKelamin = 'P';
       byte umurSayaSekarang = 19;
       double $ipk = 3.24, tinggi = 1.68;
       
       System.out.println(salahSatuHobiSayaAdalah);
       System.out.println("Apakah pandai? " + isPandai);
       System.out.println("Jenis Kelamin: " + jenisKelamin);
       System.out.println("IPK: " + $ipk);
       System.out.println(String.format("Saya berumur %s dengan tinggi badan %s ", umurSayaSekarang, tinggi));
    } 
}