package Prakrikum06;

import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilSatu, bilDua, bilTiga;

        System.out.print("Masukkan bilangan : ");
        bilSatu = sc.nextInt();

        System.out.print("Masukkan bilanagan : ");
        bilDua = sc.nextInt();

        System.out.println("Masukkan Bilangan : ");
        bilTiga = sc.nextInt();

        if (bilSatu > bilDua) {
            if (bilSatu > bilTiga) {
                System.out.println("Bilangan terbesar adalah " + bilSatu);
            } else {
                System.out.println("Bilangan terbesar adalah " + bilTiga);
            }
        }
        else 
        if (bilDua > bilTiga) {
            System.out.println("Bilangan terbesar adalah " + bilDua);
        } else {
            System.out.println("Bilangan terbesar adalah " + bilTiga);
        }
        sc.close();
}
}