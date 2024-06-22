/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Database to edit this template
 */
package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import entity.*;
/**
 *
 * @author BLESSY
 */
public class Database {
    public static Database instance; 
    
    private final String DB_TYPE = "sqlite";
    private final String DB_NAME = "pbouas";
    
    private Database() {
    }
    
    public Connection getConnection() throws SQLException { 
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:" + DB_TYPE + ":" + DB_NAME);
        } catch (ClassNotFoundException e) {
            throw new SQLException("SQLite JDBC driver not found", e);
        }
    } 
    
    public static synchronized Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public Map<String, Boolean> login(Users users) throws SQLException {
        Connection conn = getConnection();
        try {
            // Prepare and execute the query
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, users.getUsername());
            statement.setString(2, users.getPassword());
            ResultSet resultSet = statement.executeQuery();

            // Check if a matching record is found
            boolean isLoggedIn = resultSet.next();
            boolean isAdmin = false;

            if (isLoggedIn) {
                isAdmin = resultSet.getBoolean("is_admin");
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            conn.close();

            // Create and populate the result map
            Map<String, Boolean> result = new HashMap<>();
            result.put("isLoggedIn", isLoggedIn);
            result.put("isAdmin", isAdmin);

            return result;

        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    public int signUp(Users user) throws SQLException {
        Connection conn = getConnection();
        try {
            // Check if the nik already exists in the database
            String checkQuery = "SELECT COUNT(*) AS count FROM users WHERE username = ?";
            PreparedStatement checkStatement = conn.prepareStatement(checkQuery);
            checkStatement.setString(1, user.getUsername());
            ResultSet checkResult = checkStatement.executeQuery();
            checkResult.next();
            int count = checkResult.getInt("count");
            checkResult.close();
            checkStatement.close();

            if (count > 0) {
                // Nik already exists
                return 1;
            }

            // Insert the new user into the database
            String insertQuery = "INSERT INTO users (jenispetugas, nama, username, password, is_admin) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
            insertStatement.setString(1, user.getJenisPetugas());
            insertStatement.setString(2, user.getNama());
            insertStatement.setString(3, user.getUsername());
            insertStatement.setString(4, user.getPassword());
            insertStatement.setBoolean(5, user.getIs_admin());
            insertStatement.executeUpdate();
            insertStatement.close();

            // Sign-up successful
            return 2;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            conn.close();
        }
    }
    
    public Users getUserByUsername(String username) throws SQLException {
        Connection conn = getConnection();
        try {
            // Prepare and execute the query
            String query = "SELECT * FROM users WHERE username = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // Extract user information from the result set
                String nama = resultSet.getString("nama");
                String password = resultSet.getString("password");
                String jenis_petugas = resultSet.getString("jenis_petugas");
                boolean is_admin = resultSet.getBoolean("is_admin");

                // Create a User object
                Users user = new Users(username, nama, password, jenis_petugas, is_admin);

                return user;
            } else {
                // User not found
                return null;
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            conn.close();
        }
    }
    
    public int insertContent(Content content) throws SQLException {
    Connection conn = getConnection();
    try {
        String query = "INSERT INTO content (nama_lengkap, nim, kelas, asal_daerah, email, umur, jenis_kelamin, tanggal_masuk, alasan) " 
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, content.getNamaLengkap());
        statement.setString(2, content.getNim());
        statement.setString(3, content.getKelas());
        statement.setString(4, content.getAsalDaerah());
        statement.setString(5, content.getEmail());
        statement.setString(6, content.getUmur());
        statement.setString(7, content.getJenisKelamin());
        statement.setString(8, content.getTanggalMasuk());
        statement.setString(9, content.getAlasan());

        int rowsAffected = statement.executeUpdate();
        
        statement.close();
        
        return rowsAffected;
    } catch (SQLException ex) {
        throw ex;
    } finally {
        conn.close();
    }
}
    
    public int insertInformasi(Informasi information) throws SQLException {
    Connection conn = getConnection();
    try {
        String query = "INSERT INTO informasi (judul, keterangankegiatan) " 
                + "VALUES (?, ?)";

        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, information.getJudul());
        statement.setString(2, information.getKeteranganKegiatan());

        int rowsAffected = statement.executeUpdate();
        
        statement.close();
        
        return rowsAffected;
    } catch (SQLException ex) {
        throw ex;
    } finally {
        conn.close();
    }
}
    
    public void deleteContentData(int id) throws SQLException {
        Connection conn = getConnection();
        String sql = "DELETE FROM content WHERE id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }

}
