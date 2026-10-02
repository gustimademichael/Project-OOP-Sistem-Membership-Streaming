package com.mycompany.sistemmembershipstreaming;

public class MemberBasic extends AkunMember {
    
    public MemberBasic(String namaPengguna, double hargaDasar) {
        super(namaPengguna, hargaDasar);
    }

    @Override
    public double hitungBiayaBulanan() {
        return hargaDasar;
    }
}
