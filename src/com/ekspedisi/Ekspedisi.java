package com.ekspedisi;

public class Ekspedisi extends Service {

    public Ekspedisi(String serviceName, String tagline, String address, double distance, double weight, double size) {
        super(serviceName, tagline, address, distance, weight, size);
    }

    @Override
    public void display() {
        System.out.println("+========================= J&T EXPRESS =========================+");
        System.out.println("Layanan: " + getServiceName());
        System.out.println("Tagline: " + getTagline());
        System.out.println("Alamat Pengiriman: " + getAddress());
        System.out.println("Jarak Pengiriman: " + getDistance() + " km");
        System.out.println("Berat Barang: " + getWeight() + " kg");
        System.out.println("Ukuran Barang: " + getSize());
        ;
    }

    @Override
    protected String Estiminate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Estiminate'");
    }

    @Override
    protected double CalculatePrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected String SendDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SendDate'");
    }

}
