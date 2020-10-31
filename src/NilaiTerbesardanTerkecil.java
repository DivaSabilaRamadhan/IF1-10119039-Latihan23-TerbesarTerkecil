/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diva Sabila Ramadhan
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini menampilkan Nilai Terbesar dan Terkecil
 */

import java.util.Scanner;
import java.util.Arrays;

public class NilaiTerbesardanTerkecil {
    static Scanner scan = new Scanner(System.in);
    int nilai[];
    String petugas;
    
    public void masukkanData(){
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scan.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");        
        int jumlah = scan.nextInt();
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilai[i] = scan.nextInt();
        }
    }        
    
    public int nilaiTerkecil(){
        int nilaiTerkecil = nilai[0];
        for(int x : nilai){
            if(nilaiTerkecil > x){
                nilaiTerkecil = x;
            }            
        }        
        return nilaiTerkecil;
    }        
    
    public int nilaiTerbesar(){
        int nilaiTerbesar = nilai[0]; 
        for(int x : nilai){           
           if(nilaiTerbesar < x){
                nilaiTerbesar = x;
           }            
        }        
        return nilaiTerbesar;
    }
     
    public void tampilNilai(){
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        int num = 1;
        for(int x : nilai){
            System.out.println("Nilai Mahasiswa ke-"+num+" = "+x);
            num++;
        }
        System.out.println("\nNilai Terbesar adalah "+nilaiTerbesar());
        System.out.println("Nilai Terkecil adalah "+nilaiTerkecil());
        System.out.println("\nPetugas : "+petugas);
    }
    
       public static void main(String[] args) {
        NilaiTerbesardanTerkecil data = new NilaiTerbesardanTerkecil();
        data.masukkanData();        
        data.tampilNilai();       
        System.out.println("Developed by : Diva Sabila Ramadhan");
    }
    
}
