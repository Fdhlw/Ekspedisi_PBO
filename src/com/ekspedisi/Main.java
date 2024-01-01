package com.ekspedisi;

import com.ekspedisi.ServiceType.Supercepat;
import com.ekspedisi.ServiceType.Reguler;
import com.ekspedisi.ServiceType.Ekonomi;

public class Main {
    public static void main(String[] args) {
        Ekspedisi ekp = new Ekspedisi(null, null, "Jl. Ringroad Selatan, Kabupaten Bantul, Daerah Istimewa Yogyakarta 55191", 5.4, 10.2, 2);

        new Supercepat(ekp);
        new Reguler(ekp);
        new Ekonomi(ekp);

    }
}