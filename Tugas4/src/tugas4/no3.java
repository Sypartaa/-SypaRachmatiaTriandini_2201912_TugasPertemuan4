/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (antara 1-1000): ");
        int N = scanner.nextInt();

        while (N < 1 || N > 1000) {
            System.out.println("Masukkan harus berada antara 1-1000.");
            System.out.print("Masukkan nilai N (antara 1-1000): ");
            N = scanner.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
