/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class PerhitunganLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        double diameter = 0;

        System.out.println("======Perhitungan Lingkaran======");
        boolean valid = false;

        while (!valid) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            if (scanner.hasNextDouble()) {
                diameter = scanner.nextDouble();
                valid = true;
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai");
                scanner.next(); // clear invalid input
            }
        }

        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = Math.PI * diameter;

        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + df.format(jariJari) + " cm");
        System.out.println("Luas Lingkaran = " + df.format(luas) + " cm");
        System.out.println("Keliling Lingkaran = " + df.format(keliling) + " cm");
    }
}
