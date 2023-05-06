package uts_A11202113745;
// Nama: Mutiara Dolla Meitantya | 4405 | A11.2021.13745

/*
 nim : string
 nama : string
 Semester : int
 krs[] : string
_________________
hitungRataNilai(nilai[]:int):float
infoMahasiswa():void
infoKrsMahasiswa():void
 */

 public class Mahasiswa{
     String nim;
     String nama;
     int semester;
     String krs[];

    // Constructor
    public Mahasiswa(String nim, String nama, int semester, String krs[]) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.krs = krs;
    }

    // Method
    public float hitungRataNilai(int nilai[]){
        float total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total/nilai.length;
    }

    public void infoMahasiswa(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
    }

    public void infoKrsMahasiswa(){
        System.out.println("KRS: ");
        for (int i = 0; i < krs.length; i++) {
            System.out.println(krs[i]);
           
        }
    }

    public static void main(String[] args) {
        String krs[] = {"PBO", "Kalkulus", "Bahasa Inggris", "PKN"};
        int nilai[] = {80, 90, 85, 95};
        Mahasiswa mhs = new Mahasiswa("A11.2021.13744", "Jihan Ardhyta", 3, krs);
        
        mhs.infoMahasiswa();
        System.out.println();

        mhs.infoKrsMahasiswa();
        System.out.println("Rata-rata nilai: " + mhs.hitungRataNilai(nilai));
    }

 }

 