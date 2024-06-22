/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author BLESSY
 */

public class Users {
    private String jenis_petugas;
    private String nama;
    private String username;
    private String password;
    private Boolean is_admin;

    public Users() {
    }

    public Users(String jenis_petugas, String nama, String username, String password, Boolean is_admin) {
        this.jenis_petugas = jenis_petugas;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.is_admin = is_admin;
    }
    
    public Users(String username, String password, Boolean is_admin) {
        this.username = username;
        this.password = password;
        this.is_admin = is_admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJenisPetugas() {
        return jenis_petugas;
    }

    public void setJenisPetugas(String jenis_petugas) {
        this.jenis_petugas = jenis_petugas;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }
    
}
