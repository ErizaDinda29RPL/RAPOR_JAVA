package remidirpl;
import java.util.Scanner;

public class RemidiRpl {
 
    static void nama() {
        System.out.println("Eriza Dinda Febriana");}
    
    static void kelas() {
        System.out.println("X RPL 3 / 13");}
     
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        int nilaiBahasaIndonesia;
        int nilaiPkn;
        int nilaiMatematika;
        int nilaiOlahraga;
        int nilaiBahasaInggris;
        int nilaiAgama;
        int nilaiRpl;
        int nilaiSeniBudaya;
        int nilaiSejarah;
        int nilaiKjd;
        int nilaiDdg;
        int nilaiFisika;
        int nilaiKimia;
        int rataRata;
        boolean keluar = true;
        String ulang;
        
        nama();
        kelas();    
       
        System.out.println("\n");
        
        
        System.out.println("Masukkan Nilai Bahasa Indonesia : ");
        nilaiBahasaIndonesia = scan.nextInt();
        
        System.out.println("Masukkan Nilai PKN : ");
        nilaiPkn = scan.nextInt();
        
        System.out.println("Masukkan Nilai Matematika : ");
        nilaiMatematika = scan.nextInt();
        
        System.out.println("Masukkan Nilai Olahraga : ");
        nilaiOlahraga = scan.nextInt();
        
        System.out.println("Masukkan Nilai Bahasa Inggris : ");
        nilaiBahasaInggris = scan.nextInt();
        
        System.out.println("Masukkan Nilai Agama : ");
        nilaiAgama = scan.nextInt();
        
        System.out.println("Masukkan Nilai Produktif RPL : ");
        nilaiRpl = scan.nextInt();
        
        System.out.println("Masukkan Nilai Seni Budaya : ");
        nilaiSeniBudaya = scan.nextInt();
        
        System.out.println("Masukkan Nilai Sejarah : ");
        nilaiSejarah = scan.nextInt();
        
        System.out.println("Masukkan Nilai Komputer Dan Jaringan : ");
        nilaiKjd = scan.nextInt();
        
        System.out.println("Masukkan Nilai Dasar Desain Grafis : ");
        nilaiDdg = scan.nextInt();
        
        System.out.println("Masukkan Nilai Fisika : ");
        nilaiFisika = scan.nextInt();
        
        System.out.println("Masukkan Nilai Kimia : ");
        nilaiKimia = scan.nextInt();
        
        rataRata = (nilaiBahasaIndonesia + nilaiPkn + nilaiMatematika + nilaiOlahraga + nilaiBahasaInggris + nilaiAgama + nilaiRpl + nilaiSeniBudaya + nilaiSejarah 
                    + nilaiKjd + nilaiDdg + nilaiFisika + nilaiKimia)/13;
        
        if (rataRata > 85 && rataRata <=100) {
        System.out.println("Grade Anda Adalah A");
        System.out.println("Nilai Rata-Rata Yang Dicapai Siswa = " + rataRata);
        System.out.println("Status : Siswa Lulus");}
    
        if (rataRata >75 && rataRata <85) {
        System.out.println("Grade Anda Adalah B");
        System.out.println("Nilai Rata-Rata Yang Dicapai Siswa = " + rataRata);
        System.out.println("Status : Siswa Lulus");}
   
        
        if (rataRata > 70 && rataRata  < 75) {
        System.out.println("Grade Anda Adalah C");
        System.out.println("Nilai Rata-Rata Yang Dicapai Siswa = " + rataRata);
        System.out.println("Status : Siswa Lulus");}
        
        if (rataRata < 70) {
        System.out.println("Grade Anda Adalah D"); {
        System.out.println("Nilai Rata-Rata Yang Dicapai Siswa = " + rataRata);
        System.out.println("Status : Siswa Tidak Lulus");}
        }
        
        else{
            System.out.println("\n");
            
            while( keluar ){
                System.out.println("Apakah Anda Ingin Keluar?");
                System.out.println("Jawab Ya Atau Tidak");
                
                ulang = scan.nextLine();
                
                if (ulang.equalsIgnoreCase("ya")){
                    keluar = false;
                }
              }
            }
          }
        }

