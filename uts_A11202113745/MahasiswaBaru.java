package uts_A11202113745;
// Nama: Mutiara Dolla Meitantya | 4405 | A11.2021.13745

/*
 asalSekolah : string
____________________
ikutOspek() : boolean
infoMahasiswa() : void
 */

public class MahasiswaBaru extends Mahasiswa{
    String asalSekolah;

    // Constructor
    public MahasiswaBaru(String nim, String nama, int semester, String krs[], String asalSekolah) {
        super(nim, nama, semester, krs);
        this.asalSekolah = asalSekolah;
    }

    // Method
    public boolean ikutOspek(){
        return true;
    }

    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Asal Sekolah: " + asalSekolah);
    }

    public static void main(String[] args) {
        String krs[] = {"PBO", "Kalkulus", "Bahasa Inggris", "PKN"};
        int nilai[] = {80, 90, 85, 95};
        MahasiswaBaru mhs = new MahasiswaBaru("A11.2021.13767", "Faril Afrizal", 3, krs, "SMAN 1 Bandung");
        mhs.infoMahasiswa();
        System.out.println();
        
        mhs.infoKrsMahasiswa();
        System.out.println("Rata-rata nilai: " + mhs.hitungRataNilai(nilai));
        System.out.println("Ikut OSPEK: " + mhs.ikutOspek());
    }


    
}
