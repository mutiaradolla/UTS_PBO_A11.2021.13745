package uts_A11202113745;
// Nama: Mutiara Dolla Meitantya | 4405 | A11.2021.13745

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // scanner with arraylist
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan NIM: ");
            String nim = input.nextLine();
            System.out.println("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.println("Masukkan Semester: ");
            int semester = input.nextInt();
            input.nextLine();
            System.out.println("Masukkan jumlah mata kuliah: ");
            int jumlahMatkul = input.nextInt();
            input.nextLine();

            String krs2[] = new String[jumlahMatkul];
            int nilai2[] = new int[jumlahMatkul];

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.println("Masukkan nama mata kuliah: ");
                krs2[j] = input.nextLine();
                System.out.println("Masukkan nilai mata kuliah: ");
                nilai2[j] = input.nextInt();
                input.nextLine();
            }

            Mahasiswa mhs = new Mahasiswa(nim, nama, semester, krs2);

            //ArrayList
            ArrayList<Mahasiswa> listmahasiswa = new ArrayList<Mahasiswa>();

            listmahasiswa.add(mhs);

            for (Mahasiswa mahasiswa : listmahasiswa) {
                mahasiswa.infoMahasiswa();
                mahasiswa.infoKrsMahasiswa();
                System.out.println("Rata-rata nilai: " + mahasiswa.hitungRataNilai(nilai2));
                System.out.println();
            }


        }

    }
}
