package uts_A11202113745;
// Nama: Mutiara Dolla Meitantya | 4405 | A11.2021.13745

/*
 asalUniversitas : string
    ____________________
ikutOspek() : boolean
infoMahasiswa() : void
 */

public class MahasiswaTransfer extends MahasiswaBaru {
    String asalUniversitas;

    // Constructor
    public MahasiswaTransfer(String nim, String nama, int semester, String krs[], String asalSekolah, String asalUniversitas) {
        super(nim, nama, semester, krs, asalSekolah);
        this.asalUniversitas = asalUniversitas;
    }

    // Method
    public boolean ikutOspek(){
        return true;
    }

    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Asal Universitas: " + asalUniversitas);
    }

    public static void main(String[] args) {
        String krs[] = {"PBO", "Kalkulus", "Bahasa Inggris", "PKN"};
        int nilai[] = {80, 90, 85, 95};
        MahasiswaTransfer mhs = new MahasiswaTransfer("A11.2021.13787", "Ryan Mahardika", 3, krs, "SMAN 1 Bandung" ,"Universitas Padjajaran");
        mhs.infoMahasiswa();
        System.out.println();

        mhs.infoKrsMahasiswa();
        System.out.println("Rata-rata nilai: " + mhs.hitungRataNilai(nilai));
        System.out.println("Ikut OSPEK: " + mhs.ikutOspek());
    }
    
}
