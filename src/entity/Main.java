/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author BLESSY
 */

//import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            // Membuat objek volunteer
            System.out.println();
            System.out.println("--- Blok I. Keterangan Volunteer ---");
            Users user = new Users();
            user.setNama("Blessy Munthia");
            user.setUsername("blessytiapur");
            user.setPassword("tiapur3107");

            // Menampilkan informasi user
            System.out.println("Nama        : " + user.getNama());
            System.out.println("Username        : " + user.getUsername());
            System.out.println("Password  : " + user.getPassword());
            
            System.out.println("=====================================");

            // Menampilkan objek content
            System.out.println();
            System.out.println("--- Blok II. Informasi Content ---");
            Content content = new Content();
            content.setTanggalMasuk("19 Juni 2024");
            content.setAlasan("Ingin berkontribusi langsung dalam membangun masyarakat");
            
            // Menampilkan informasi content
            System.out.println("Tanggal Masuk       : " + content.getTanggalMasuk());
            System.out.println("Alasan  : " + content.getAlasan());

            System.out.println("=====================================");
            
        } catch (IllegalArgumentException e) {
            // Menangani exception jika validasi gagal
            System.out.println("Error: " + e.getMessage());
        }

    }
}

