//import modul untuk input
import java.util.Scanner;
public class luas_segitiga_intputs {
    public static void main (String[] args) {
        // deklarasi variabel
        double alas, tinggi, luas;
        // deklarasi input
        Scanner scan = new Scanner(System.in);
        // inisialisasi variabel
        System.out.println("masukkan Panjang Alas:");
        alas = scan.nextDouble();
        System.out.println("masukkan tinggi:");
        tinggi=scan.nextDouble();
        
        // hitung luas
        luas=0.5*alas*tinggi;
        
        // cetak hasil
        System.out.println("luas segitiga adalah:"+luas);
    }
}
