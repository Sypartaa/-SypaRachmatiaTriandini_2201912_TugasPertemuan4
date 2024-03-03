/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        while (batasAwal < 1) {
            System.out.println("Batas awal harus lebih dari atau sama dengan 1.");
            System.out.print("Masukkan kembali batas awal: ");
            batasAwal = scanner.nextInt();
        }

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        while (batasAkhir >= 100) {
            System.out.println("Batas akhir harus kurang dari atau sama dengan 100.");
            System.out.print("Masukkan kembali batas akhir: ");
            batasAkhir = scanner.nextInt();
        }

        System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
