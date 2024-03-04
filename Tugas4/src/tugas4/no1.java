/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = scanner.nextInt();

        int N = angka1 * 100 + angka2 * 10 + angka3;

        if (N >= 1000 && N <= 9999) {
            System.out.println("Angka " + N + " adalah angka ribuan.");
        } else {
            System.out.println("Angka " + N + " bukan angka ribuan.");
        }

        scanner.close();
    }
    
}
