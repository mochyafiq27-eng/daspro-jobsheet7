
import java.util.Scanner;

public class Tugas2_PembayaranParkir11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kendaraan, jam, tarif, biaya;
        int totalPendapatan = 0;

        do {
            System.out.println("\n=== PROGRAM PARKIR ===");
            System.out.println("1. Mobil  - Rp3.000/jam");
            System.out.println("2. Motor  - Rp2.000/jam");
            System.out.println("0. Keluar");
            System.out.print("Pilih jenis kendaraan: ");
            kendaraan = input.nextInt();

            if (kendaraan == 1 || kendaraan == 2) {
                if (kendaraan == 1) {
                    tarif = 3000;
                } else {
                    tarif = 2000;
                }

                System.out.print("Masukkan lama parkir (jam): ");
                jam = input.nextInt();

                if (jam > 0) {
                    biaya = tarif * jam;
                    totalPendapatan += biaya;

                    System.out.println("Biaya parkir: Rp" + biaya);
                } else {
                    System.out.println("Lama parkir harus lebih dari 0!");
                }

            } else if (kendaraan != 0) {
                System.out.println("Pilihan kendaraan tidak valid!");
            }

        } while (kendaraan != 0);

        System.out.println("\nTotal pendapatan parkir: Rp" + totalPendapatan);
        System.out.println("Program parkir selesai.");

        input.close();
    }
}
