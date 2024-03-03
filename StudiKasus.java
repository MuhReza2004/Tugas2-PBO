// Nama    : Muh. Reza
// Nim     : 13020220070

import java.util.Scanner;

public class StudiKasus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        long totalDetik = scanner.nextLong();

        long detikSekarang = totalDetik % 60;

        long totalMenit = totalDetik / 60;

        long menitSekarang = totalMenit % 60;

        long totalJam = totalMenit / 60;

        long jamSekarang = totalJam % 24;

        System.out.println("Waktu sekarang: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);

        scanner.close();
    }

}
