package com.ekspedisi;

import com.ekspedisi.ServiceType.Supercepat;
import com.ekspedisi.ServiceType.Reguler;
import com.ekspedisi.ServiceType.Ekonomi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ekspedisi ekp = new Ekspedisi(null, null, "Jl. Ringroad Selatan, Kabupaten Bantul, Daerah Istimewa Yogyakarta 55191", 5.4, 10.2, 2);

        System.out.println("#  SELAMAT DATANG DI J&T EXPRESS  #");
        System.out.println("Pilih ServiceType:");
        System.out.println("1. Supercepat");
        System.out.println("2. Reguler");
        System.out.println("3. Ekonomi");

        System.out.println("Masukkan Pilihan Service anda :");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                new Supercepat(ekp);
                break;
            case 2:
                new Reguler(ekp);
                break;
            case 3:
                new Ekonomi(ekp);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
