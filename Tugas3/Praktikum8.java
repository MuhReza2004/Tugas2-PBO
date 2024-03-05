// Nama    : Muh. Reza
// Nim     : 13020220070
// Tanggal : 05/03/2024

import java.util.Scanner;

public class Praktikum8 {
    public static void main(String[] args) {
        final float PHI = 3.1415f;
        float r;

        Scanner masukan = new Scanner(System.in);
        System.out.print("Jari-jari lingkaran =");

        r = masukan.nextFloat();

        System.out.print("Luas lingkaran = " + (PHI * r * r) + "\n");
        System.out.print("Akhir program \n");
    }
}
