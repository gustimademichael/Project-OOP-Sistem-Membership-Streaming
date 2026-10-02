package com.mycompany.sistemmembershipstreaming;

public class MemberPremium extends AkunMember {
    private double biayaUltraHD;

    public MemberPremium(String namaPengguna, double hargaDasar, double biayaUltraHD) {
        super(namaPengguna, hargaDasar);
        this.biayaUltraHD = biayaUltraHD;
    }

    @Override
    public double hitungBiayaBulanan() {
        return hargaDasar + biayaUltraHD;
    }
}
