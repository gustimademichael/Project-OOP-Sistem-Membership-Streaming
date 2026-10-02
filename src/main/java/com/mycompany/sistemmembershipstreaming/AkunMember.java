package com.mycompany.sistemmembershipstreaming;

public class AkunMember {
    protected String namaPengguna;
    protected double hargaDasar;

    public AkunMember(String namaPengguna, double hargaDasar) {
        this.namaPengguna = namaPengguna;
        this.hargaDasar = hargaDasar;
    }

    public double hitungBiayaBulanan() {
        return hargaDasar;
    }

    public void perbaruiFitur(String namaFitur) {
        System.out.println("Sistem: Fitur '" + namaFitur + "' telah diperbarui untuk " + namaPengguna + ".");
    }

    public void perbaruiFitur(String namaFitur, boolean statusAkses) {
        String status = statusAkses ? "DIAKTIFKAN" : "DINONAKTIFKAN";
        System.out.println("Sistem: Fitur '" + namaFitur + "' telah " + status + " untuk " + namaPengguna + ".");
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }
}
