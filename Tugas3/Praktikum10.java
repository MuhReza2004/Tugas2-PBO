// Nama    : Muh. Reza
// Nim     : 13020220070
// Tanggal : 05/03/2024

import java.util.Scanner;

public class Praktikum10 {
    public static void main(String[] args) {

        int i, N;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Baca N, print 1 s/d N ");
        System.out.print("N = ");
        N = masukan.nextInt();
        for (i = 1; i <= N; i++) {
            System.out.println(i);
        }
        ;
        System.out.println("Akhir program \n");
    }
}
