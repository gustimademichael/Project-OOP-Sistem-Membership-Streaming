package com.mycompany.sistemmembershipstreaming;
import java.util.Scanner;

public class SistemMembershipStreaming {

    public static void cetakFakturBulanan(AkunMember member) {
        System.out.println("\n--- Faktur Bulanan ---");
        System.out.println("Nama Pengguna : " + member.getNamaPengguna());
        System.out.println("Tipe Paket    : " + member.getClass().getSimpleName());
        System.out.println("Total Tagihan : Rp" + member.hitungBiayaBulanan());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AkunMember[] daftarPengguna = new AkunMember[3];

        System.out.println("==========================================");
        System.out.println("  INPUT DATA PENGGUNA STREAMING (3 ORANG)");
        System.out.println("==========================================");

        for (int i = 0; i < daftarPengguna.length; i++) {
            System.out.println("\nPengguna ke-" + (i + 1) + ":");
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Harga Dasar Paket: Rp");
            double hargaDasar = scanner.nextDouble();

            System.out.println("Pilih Tipe Member:");
            System.out.println("1. Basic");
            System.out.println("2. Premium");
            System.out.println("3. VIP");
            System.out.print("Pilihan (1-3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    daftarPengguna[i] = new MemberBasic(nama, hargaDasar);
                    break;

                case 2:
                    System.out.print("Masukkan Biaya Tambahan Ultra HD: Rp");
                    double biayaUltraHD = scanner.nextDouble();
                    scanner.nextLine();
                    daftarPengguna[i] = new MemberPremium(nama, hargaDasar, biayaUltraHD);
                    break;

                case 3:
                    System.out.print("Masukkan Biaya Tambahan Akses VIP: Rp");
                    double biayaVIP = scanner.nextDouble();
                    scanner.nextLine();
                    daftarPengguna[i] = new MemberVIP(nama, hargaDasar, biayaVIP);
                    break;

                default:
                    System.out.println("Pilihan tidak valid, otomatis diset ke Member Basic.");
                    daftarPengguna[i] = new MemberBasic(nama, hargaDasar);
                    break;
            }
        }

        System.out.println("\n==========================================");
        System.out.println("        DAFTAR TAGIHAN PENGGUNA");
        System.out.println("==========================================");
        
        for (AkunMember pengguna : daftarPengguna) {
            cetakFakturBulanan(pengguna);
        }

        System.out.println("\n==========================================");
        System.out.println("          UPDATE STATUS FITUR");
        System.out.println("==========================================");

        System.out.print("Pilih indeks pengguna untuk diupdate fiturnya (1-5): ");
        int indeks = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indeks >= 0 && indeks < daftarPengguna.length) {
            System.out.print("Masukkan Nama Fitur: ");
            String namaFitur = scanner.nextLine();

            System.out.print("Apakah ingin mengubah status akses? (y/n): ");
            String ubahStatus = scanner.nextLine();

            if (ubahStatus.equalsIgnoreCase("y")) {
                System.out.print("Aktifkan fitur? (true/false): ");
                boolean statusAkses = scanner.nextBoolean();
                
                daftarPengguna[indeks].perbaruiFitur(namaFitur, statusAkses);
            } else {
                daftarPengguna[indeks].perbaruiFitur(namaFitur);
            }
        } else {
            System.out.println("Indeks pengguna tidak valid.");
        }

        scanner.close();
    }
}
