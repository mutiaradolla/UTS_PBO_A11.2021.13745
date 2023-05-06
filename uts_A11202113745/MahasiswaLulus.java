package uts_A11202113745;
// Nama: Mutiara Dolla Meitantya | 4405 | A11.2021.13745

/*
 tahunWisuda : int
 ipk : float

    ____________________
ikutWisuda() : boolean
infoMahasiswa() : void
 */

public class MahasiswaLulus extends Mahasiswa{
    int tahunWisuda;
    float ipk;

    // Constructor
    public MahasiswaLulus(String nim, String nama, int semester, String krs[], int tahunWisuda, float ipk) {
        super(nim, nama, semester, krs);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }

    // Method
    public boolean ikutWisuda(){
        return true;
    }

    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda: " + tahunWisuda);
        System.out.println("IPK: " + ipk);
    }

    public static void main(String[] args) {
        String krs[] = {"PBO", "Kalkulus", "Bahasa Inggris", "PKN"};
        int nilai[] = {80, 90, 85, 95};
        MahasiswaLulus mhs = new MahasiswaLulus("A11.2021.13745", "Mutiara Dolla Meitantya", 3, krs, 2025, 3.9f);
        mhs.infoMahasiswa();
        System.out.println();

        mhs.infoKrsMahasiswa();
        System.out.println("Rata-rata nilai: " + mhs.hitungRataNilai(nilai));
        System.out.println("Ikut Wisuda: " + mhs.ikutWisuda());
    }

    
}
