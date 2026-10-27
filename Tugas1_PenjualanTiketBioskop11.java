
import java.util.Scanner;

public class Tugas1_PenjualanTiketBioskop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        int totalPenjualan = 0;
        int harga;
        double diskon;

        while (true) {
            System.out.print(
                "Masukkan jumlah tiket (0 untuk selesai): "
            );
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println(
                    "Jumlah tiket tidak valid. Masukkan ulang!"
                );
                continue;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            harga = jumlahTiket * HARGA_TIKET;
            harga = harga - (int) (harga * diskon);

            totalTiket += jumlahTiket;
            totalPenjualan += harga;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total pembayaran: Rp " + harga);
            System.out.println();
        }

        System.out.println("\n=== REKAP PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}
