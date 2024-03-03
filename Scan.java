// Nama     : Muh. Reza 
// Nim      : 13020220070

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metode Scanner \n");
        System.out.print("============== \n");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan tahun masuk: ");
        int tahunMasuk = scanner.nextInt();

        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Tahun Masuk : " + tahunMasuk);

        // Menutup Scanner setelah selesai penggunaan
        scanner.close();
    }
}
