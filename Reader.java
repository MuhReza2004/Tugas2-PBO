// Nama    : Muh. Reza
// Nim     : 13020220070

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Metode BufferedReader \n");
        System.out.println("===================== \n");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = reader.readLine();

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = reader.readLine();

        System.out.print("Masukkan tahun masuk: ");
        int tahunMasuk = Integer.parseInt(reader.readLine());

        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Tahun Masuk: " + tahunMasuk);

        reader.close();
    }
}
