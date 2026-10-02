package com.mycompany.sistemmembershipstreaming;

public class SistemMembershipStreaming {

    public static void cetakFakturBulanan(AkunMember member) {
        System.out.println("--- Faktur Bulanan ---");
        System.out.println("Nama Pengguna : " + member.getNamaPengguna());
        System.out.println("Tipe Paket    : " + member.getClass().getSimpleName());
        System.out.println("Total Tagihan : Rp" + member.hitungBiayaBulanan());
        System.out.println("----------------------\n");
    }

    public static void main(String[] args) {
        AkunMember[] daftarPengguna = new AkunMember[5];

        daftarPengguna[0] = new MemberBasic("Budi", 50000);
        daftarPengguna[1] = new MemberPremium("Siti", 50000, 35000);
        daftarPengguna[2] = new MemberVIP("Andi", 50000, 100000);
        daftarPengguna[3] = new MemberBasic("Joko", 50000);
        daftarPengguna[4] = new MemberPremium("Rina", 50000, 35000);

        System.out.println("=== DAFTAR TAGIHAN PENGGUNA ===");
        
        for (AkunMember pengguna : daftarPengguna) {
            cetakFakturBulanan(pengguna);
        }

        System.out.println("=== UPDATE STATUS FITUR ===");
        
        daftarPengguna[0].perbaruiFitur("Rekomendasi Film AI");
        daftarPengguna[1].perbaruiFitur("Download Offline", true);
        daftarPengguna[2].perbaruiFitur("Tayangan Iklan", false);
    }
}
