// Nama    : Muh. Reza
// Nim     : 13020220070
// Tanggal : 05/03/2024

import java.util.Scanner;

public class Praktikum11 {
    public static void main(String[] args) {

        int N;
        int i;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1;
        System.out.print("Print i dengan ITERATE : \n");
        for (;;) {
            System.out.println(i);
            if (i == N)
                break;
            else {
                i++;
            }
        }
    }
}
