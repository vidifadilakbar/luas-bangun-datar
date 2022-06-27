/* Program Mencari Luas bangun datar khususnya untuk (Persegi, Segitiga, dan Lingkaran)
 author: @vidifadilakbar, @jordhi404, Isan-1302194081 */

package org.luas_bangun_datar;
import java.util.Scanner;

public class Main {
    public class LuasBangunDatar {
        private static int LuasPersegi(int s) {
            return s * s;
        }

        private static int LuasSegitiga(int a, int t) {
            return a * t / 2;
        }

        private static int LuasLingkaran(int r) {
            return (int)3.14 * r * r;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Bangun Datar :");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.print("Pilih Bangun Datar : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi : ");
                int sisi = input.nextInt();
                System.out.println("Luas Persegi : " + LuasBangunDatar.LuasPersegi(sisi));
                break;
            case 2:
                System.out.print("Masukkan alas : ");
                int alas = input.nextInt();
                System.out.print("Masukkan tinggi : ");
                int tinggi = input.nextInt();
                System.out.println("Luas Segitiga : " + LuasBangunDatar.LuasSegitiga(alas, tinggi));
                break;
            case 3:
                System.out.print("Masukkan jari-jari : ");
                int jari = input.nextInt();
                System.out.println("Luas Lingkaran : " + LuasBangunDatar.LuasLingkaran(jari));
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
}