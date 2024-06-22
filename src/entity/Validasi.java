/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

//import java.time.DateTimeException;
//import java.time.LocalDate;

/**
 *
 * @author BLESSY
 */

public class Validasi {
    public static boolean cekNamaLengkap(String namaLengkap) {
    if (namaLengkap.trim().length() >= 5  && namaLengkap.trim().length() <= 25 ) {
            if (!namaLengkap.matches("[A-Za-z ]+")) {
            return false;
            }
        } 
        return true;
    }
    
    public static boolean cekJudul(String judul) {
    if (judul.trim().length() >= 5  && judul.trim().length() <= 255 ) {
            if (!judul.matches("[A-Za-z ]+")) {
            return false;
            }
        } 
        return true;
    }
    
    public static boolean cekUmur(String umur){
       if (!umur.matches("[0-9]+")) {
        return false;
    }
    return true;
    }
}
