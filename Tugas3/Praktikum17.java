// Nama    : Muh. Reza
// Nim     : 13020220070
// Tanggal : 05/03/2024

import java.util.Scanner;

public class Praktikum17 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        Sum = 0;
        System.out.print("Masukkan nilai x (int), akhiri dengan 999 : ");
        x = masukan.nextInt();
        while (x != 999) {
            Sum = Sum + x;
            System.out.print("Masukkan nilai x (int), akhiri dengan 999 : ");
            x = masukan.nextInt();
        }
        System.out.println("Hasil penjumlahan = " + Sum);
    }
}
