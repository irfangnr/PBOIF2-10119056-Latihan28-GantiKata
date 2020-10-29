/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan28.gantikata;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan ganti kata
 */
public class PBOIF210119056Latihan28GantiKata {

public static void main (String [] args){
      String kalimat,kata1,kata2,kata3;  
      Scanner masukan = new Scanner(System.in);
      System.out.println("====Program Mengganti Kata====");
      System.out.println();
      
      System.out.print("Masukan kalimat : ");
      kalimat = masukan.nextLine();

      System.out.print("Ganti kata : ");
      kata1 = masukan.nextLine();
      System.out.print("Menjadi kata : ");
      kata2 = masukan.nextLine();
      System.out.println();

      System.out.println("====Hasil Formatting====");
      kata3 = kalimat.replace(kata1,kata2);
      System.out.println("Kalimat awal : "+kalimat);
      System.out.println("Kalimat Baru : "+kata3);
    }
    
}
