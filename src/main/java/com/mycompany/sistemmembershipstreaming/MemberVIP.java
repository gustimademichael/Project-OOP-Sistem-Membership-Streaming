package com.mycompany.sistemmembershipstreaming;

public class MemberVIP extends AkunMember {
    private double biayaVIP;

    public MemberVIP(String namaPengguna, double hargaDasar, double biayaVIP) {
        super(namaPengguna, hargaDasar);
        this.biayaVIP = biayaVIP;
    }

    @Override
    public double hitungBiayaBulanan() {
        return hargaDasar + biayaVIP;
    }
}
