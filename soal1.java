import java.util.Scanner;

public class soal1 {
    public static void main (String [] args){
        Scanner a = new Scanner(System.in); //objek
        String nama_depan, nama_belakang;
        int umur;
        System.out.println("===================");
        System.out.print("Masukkan Nama Depan : ");
        nama_depan = a.nextLine();
        System.out.print("Masukkan Nama Belakang : ");
        nama_belakang = a.nextLine();
        System.out.print("Masukkan Umur : ");
        umur = a.nextInt();
        System.out.println("Nama Saya : "+ nama_depan + nama_belakang);
        System.out.println("Umur Saya : " + umur);
        
    }
}
