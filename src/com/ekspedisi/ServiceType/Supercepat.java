package com.ekspedisi.ServiceType;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.ekspedisi.Ekspedisi;

public class Supercepat extends Ekspedisi {
    private Ekspedisi eks;

    public Supercepat(Ekspedisi eks) {
        super("J&T Super (Cepat)", "Paket Anda, Prioritas Kami - Sampai dalam Sekejap!", eks.getAddress(),
                eks.getDistance(),
                eks.getWeight(), eks.getSize());
        setDay(1);
        display();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Estimasi Harga: Rp " + CalculatePrice());
        System.out.println("Tanggal kirim: " + SendDate());
        System.out.println("Tanggal Sampai: " + Estiminate());
        // System.out.println("==========================");
    }

    @Override
    public double CalculatePrice() {
        price = (getSize() * getDistance()) * 5000;
        return price;
    }

    @Override
    protected String Estiminate() {
        Calendar kalender = Calendar.getInstance();
        kalender.add(Calendar.DAY_OF_MONTH, day);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String estimateDate = dateFormat.format(kalender.getTime());
        return estimateDate;

    }

    @Override
    protected String SendDate() {
        Calendar kalender = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String estimateDate = dateFormat.format(kalender.getTime());

        return estimateDate;
    }

}
