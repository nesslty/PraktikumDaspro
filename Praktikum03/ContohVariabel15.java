package Praktikum03;

public class ContohVariabel15 {
    public static void main(String[] args) {
       String salahSatuHobiSayaAdalah = "Bermain petak umpet";
       boolean isPandai = true;
       char jeniskelamin = 'P';
       byte _umurSayaSekarang = 19;
       double $ipk = 3.24, tinggi = 1.68;
       
       System.out.println(salahSatuHobiSayaAdalah);
       System.out.println("Apakah pandai? " + isPandai);
       System.out.println("Jenis Kelamin: " + jeniskelamin);
       System.out.println("IPK: " + $ipk);
       System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", _umurSayaSekarang, tinggi));
    } 
}