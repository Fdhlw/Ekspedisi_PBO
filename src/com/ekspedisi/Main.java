package com.ekspedisi;

import com.ekspedisi.ServiceType.Supercepat;
import com.ekspedisi.ServiceType.Reguler;
import com.ekspedisi.ServiceType.Ekonomi;
import java.util.Scanner;

import com.ekspedisi.Ekspedisi;

public class Main {
    public Ekspedisi ekp;

    public static void main(String[] args) {


        Main main = new Main();

        System.out.println("#  SELAMAT DATANG DI J&T EXPRESS  #");
        main.ekp = main.tambah();
        System.out.println("Pilih ServiceType:");
        System.out.println("1. Supercepat");
        System.out.println("2. Reguler");
        System.out.println("3. Ekonomi");

        System.out.print("Masukkan Pilihan Service anda :");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                new Supercepat(main.ekp);
                break;
            case 2:
                new Reguler(main.ekp);
                break;
            case 3:
                new Ekonomi(main.ekp);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    public Ekspedisi tambah() {

        String alamat;
        double jarak, berat, ukuran;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Alamat = ");
        alamat = sc.nextLine();
        System.out.print("Masukan Jarak = ");
        jarak = sc.nextDouble();
        sc.nextLine();
        System.out.print("Masukan Berat = ");
        berat = sc.nextDouble();
        sc.nextLine();
        System.out.print("Masukan Ukuran = ");
        ukuran = sc.nextDouble();
        Ekspedisi ekp = new Ekspedisi(null, null,
                alamat,
                jarak, berat, ukuran);
        char confirm;
        do{
            System.out.println("Alamat: " + ekp.getAddress());
            System.out.println("Jarak: " + ekp.getDistance());
            System.out.println("Berat: " + ekp.getWeight());
            System.out.println("Ukuran: " + ekp.getSize());
            System.out.println("Apakah Ada yang mau diedit? (y/n) ");
            confirm = sc.next().charAt(0);
            if(confirm == 'y'){
                edit(ekp);
            }
        } while (confirm == 'y');

        return ekp;
    }

    public void edit(Ekspedisi ekp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("1.Alamat");
        System.out.println("2.Jarak");
        System.out.println("3.Berat");
        System.out.println("4.Ukuran");
        System.out.print("Data yang mau diubah (angka saja) = ");
        int angka = sc.nextInt();
        sc.nextLine();
        switch (angka) {
            case 1:
                System.out.print("Masukan Alamat = ");
                String alamat = sc.nextLine();
                ekp.setAddress(alamat);
                break;
            case 2:
                System.out.print("Masukan Jarak = ");
                double jarak = sc.nextDouble();
                ekp.setDistance(jarak);
                break;
            case 3:
                System.out.print("Masukan Berat = ");
                double berat = sc.nextDouble();
                ekp.setWeight(berat);
                break;
            case 4:
                System.out.print("Masukan Ukuran = ");
                double ukuran = sc.nextDouble();
                ekp.setSize(ukuran);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
