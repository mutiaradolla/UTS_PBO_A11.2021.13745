package uts_A11202113745;
// Nama: Mutiara Dolla Meitantya | 4405 | A11.2021.13745

public class MahasiswaAktif extends Mahasiswa {

    // Constructor
    public MahasiswaAktif(String nim, String nama, int semester, String krs[]) {
        super(nim, nama, semester, krs);
    }

    public static void main(String[] args) {
        String krs[] = {"PBO", "Kalkulus", "Bahasa Inggris", "PKN"};
        int nilai[] = {80, 90, 85, 95};
        MahasiswaAktif mhs = new MahasiswaAktif("A11.2021.13745", "Mutiara Dolla Meitantya", 3, krs);
        mhs.infoMahasiswa();
        mhs.infoKrsMahasiswa();
        System.out.println("Rata-rata nilai: " + mhs.hitungRataNilai(nilai));
    }

    
    
}
