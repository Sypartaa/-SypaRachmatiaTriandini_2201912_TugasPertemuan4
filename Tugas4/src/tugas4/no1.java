/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input tiga angka
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = scanner.nextInt();

        // Menggabungkan tiga angka menjadi satu angka
        int combinedNumber = angka1 * 100 + angka2 * 10 + angka3;

        // Memeriksa apakah angka tersebut merupakan ribuan
        if (combinedNumber >= 1000 && combinedNumber <= 9999) {
            System.out.println("Angka " + combinedNumber + " adalah angka ribuan.");
        } else {
            System.out.println("Angka " + combinedNumber + " bukan angka ribuan.");
        }

        scanner.close();
    }
    
}
