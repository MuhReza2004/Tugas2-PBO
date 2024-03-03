// Nama    : Muh. Reza
// Nim     : 13020220070

import java.io.Console;

public class Consol {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console tidak tersedia. Pastikan program dijalankan dari konsol.");
            System.exit(1);
        }
        System.out.println("Metode Console\n");
        System.out.println("==============\n");
        String nama = console.readLine("Masukkan nama mahasiswa: ");
        String nim = console.readLine("Masukkan NIM mahasiswa: ");
        int tahunMasuk = Integer.parseInt(console.readLine("Masukkan tahun masuk: "));

        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}
