// Nama    : Muh. Reza
// Nim     : 13020220070
// Tanggal : 05/03/2024

import java.util.Scanner;

public class Praktikum9 {
    public static void main(String[] args) {

        int a, b;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Maksimum dua bilangan : \n");
        System.out.print("Ketikkan dua bilangan, pisahkan dengan RETURN :\n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println("Ke dua bilangan : a = " + a + " b = " + b);
        if (a >= b) {
            System.out.println("Nilai a yang maksimum " + a);
        } else {
            System.out.println("Nilai b yang maksimum: " + b);
        }
    }
}
