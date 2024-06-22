/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author BLESSY
 */
//public class connection {
//
//    private static Connection conn=null;
//    
//        public static Connection getConnection(){
//        if(conn!=null)
//            return conn;
//        else{
//            String dburl="jdbc:mysql://localhost:3306/"+"uaspbo?user=root&password";
//            try{
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                conn=DriverManager.getConnection(dburl);
//            }
//            catch(ClassNotFoundException | SQLException e){
//                System.out.println("Gagal"+e);
//            }
//            return conn;
//        }
//    }
//    public static void main(String[] args) {
//        getConnection();
//    }

//public class connection {
   
public class connection {

    private static Connection conn=null;
    
        public static Connection getConnection(){
        if(conn!=null)
            return conn;
        else{
            String dburl="jdbc:sqlite:pbouas";
//            String dburl="jdbc:sqlite:temp.db";
            try{
                Class.forName("org.sqlite.JDBC");
                conn=DriverManager.getConnection(dburl);
            }
            catch(ClassNotFoundException | SQLException e){
                System.out.println("Gagal"+e);
            }
            return conn;
        }
    }
    public static void main(String[] args) {
        getConnection();
    }
}
