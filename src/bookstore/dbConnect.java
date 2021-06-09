/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.sql.Connection;
import java.sql.*;


/**
 *
 * @author detun
 */
public class dbConnect {
     private static Connection con;
    private static Statement st;
    static String location = "jdbc:sqlite:L:\\Documents\\Book_Store\\src\\bookstore\\"; 
    
    
    public static Statement connection(){
        try {
            Class.forName("org.slite.JDBC");
            String url = "jdbc:sqlite:bookStore.db";
            con=DriverManager.getConnection(url);
            st=con.createStatement();
            System.out.println("Connection Successful");
            con.close();
            
        } catch (Exception e) {
            System.err.println("connection failed");
        }
            return st;
    }
    
    public static Connection getCon(){
        System.err.println("here");
        if (con==null) {
            try {
                Class.forName("org.sqlite.JDBC");
                Connection c = DriverManager.getConnection("jdbc:sqlite:L:\\Documents\\Book_Store\\src\\bookstore\\bookStore.db");
//                Connection c = DriverManager.getConnection("jdbc:sqli1te:L:\\Documents\\javaJsonExample\\hidee.sqlite");
                System.out.println("Connection Successful");
                
                return c;
                
            } catch (Exception e) {
               System.err.println("connection failed: " +e);

            }
        }
        return  null;
    }
    
    //CREATE DB
    public static void createNewDatabase(String fileName) {  
   
        String url = location + fileName;  
   
        try {  
            Connection conn = DriverManager.getConnection(url);  
            if (conn != null) {  
                DatabaseMetaData meta = conn.getMetaData();  
                System.out.println("The driver name is " + meta.getDriverName());  
                System.out.println("A new database has been created.");  
            }  
   
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    
    
    public static void createNewTable(String dbName,String sql) {  
        // SQLite connection string  
        String url = location + dbName;
//        String url = ("jdbc:sqlite:L:\\Documents\\javaJsonExample\\hidee.sqlite");  
          
        // SQL statement for creating a new table  
//        String sql = "CREATE TABLE IF NOT EXISTS employees (\n"  
//                + " id integer PRIMARY KEY,\n"  
//                + " name text NOT NULL,\n"  
//                + " capacity real\n"  
//                + ");";  
          
        try{  
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();  
            stmt.execute(sql);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    
    //INSERT RECORDS
    
    public static void insert(String table,String full,String user,String pass,String mail,int secretQuest,String answer,String acct) {  
        String sql = "INSERT INTO '"+table+"'(fullname, username, password, email, secretQuestion, secretAnswer, acctType) VALUES(?,?,?,?,?,?,?)";  
//          String sql = "INSERT INTO User(name,pass) VALUES(?,?)";  
        
        try{  
            Connection conn = getCon();  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setString(1, full);  
            pstmt.setString(2, user);  
            pstmt.setString(3, pass);  
            pstmt.setString(4, mail);  
            pstmt.setInt(5, secretQuest);
            pstmt.setString(6, answer);
            pstmt.setString(7, acct);
            pstmt.executeUpdate();
            System.err.println("insert user data success");
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    
    //SELECT ALL
     public static ResultSet selectAll(String table){  
//        String sql = "SELECT * FROM employees WHERE name LIKE '%i'";  
        String sql = "SELECT * FROM '"+table+"'";  
          
        try {  
            Connection conn = getCon();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
            return rs;
            // loop through the result set  
//            while (rs.next()) {  
//                System.out.println(rs.getInt("id") +  "\t" +   
//                                   rs.getString("name") + "\t" +  
//                                   rs.getDouble("capacity"));  
//            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        return null;
    }
     
    //SELECT item by ID
     public static ResultSet selectId(String table,int xId){  
        String sql = "SELECT * FROM '"+table+"' WHERE xid = '"+xId+"'";  
//        String sql = "SELECT * FROM employees";  
          
        try {  
            Connection conn = getCon();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
//            conn.close();
            return rs;
            // loop through the result set  
            
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return null;
    }
    //GET item by ID
     public static ResultSet getItemById(int xId){  
        String sql = "SELECT * FROM employees WHERE id = '"+xId+"'";  
//        String sql = "SELECT * FROM employees";  
          
        try {  
            Connection conn = getCon();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
            return rs;
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }
        return null;
    }
     
    //DELETE ALL data in the table
     public static void deleteTable(String table){  
        String sql = "DELETE FROM '"+table+"'";  
          
        try {  
            Connection conn = getCon();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
            conn.close();
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    //DELETE data of xID in the table
     public static void deleteTable(String table,int xId){
        
        String sql = "DELETE FROM '"+table+"' WHERE xId= '"+xId+"'";  
          
        try {  
            Connection conn = getCon();  
            Statement stmt  = conn.createStatement();  
            stmt.executeQuery(sql);  
//            conn.close();
            System.err.println("delete success");
        } catch (SQLException e) {  
            System.err.println("delete: "+e.getMessage());  
        } 
    }  
      
    //UPDATE data of xID in the table
      public static void update(String table,int xId,String full,String user,String pass,String mail,int secretQuest,String answer,String acct) {  
//          capacity=(capacity==0?
//                  getItemById(xId).getDouble("capacity"):capacity);
//          
//          name=(name==null?
//                  getItemById(xId).getString("name"):name);
          
          String sql = "UPDATE '"+table+"' SET "
                  + "fullname = '"+full+"',"
                  + "username = '"+user+"',"
                  + "password = '"+pass+"',"
                  + "email = '"+mail+"',"
                  + "secretQuestion = '"+secretQuest+"',"
                  + "secretAnswer = '"+answer+"',"
                  + "acctType = '"+acct+"'"
                + " WHERE xid= '"+xId+"'";  
//        String sql = "INSERT INTO User(name,pass) VALUES(?,?)";  
   
        try{  
            Connection conn = getCon();  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.executeUpdate();  
            System.err.println("update success");
            conn.close();
        } catch (SQLException e) {  
            System.out.println(e.getMessage());
            
        }  
    }  
    //UPDATE data of xID in the table
      public static void updateRowId(String table,String username,int xId) {  
//          capacity=(capacity==0?
//                  getItemById(xId).getDouble("capacity"):capacity);
//          
//          name=(name==null?
//                  getItemById(xId).getString("name"):name);
          
          String sql = "UPDATE '"+table+"' SET "
                  + "xId = '"+xId+"'"
                + " WHERE username= '"+username+"'";  
//        String sql = "INSERT INTO User(name,pass) VALUES(?,?)";  
   
        try{  
            Connection conn = getCon();  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.executeUpdate();  
            System.err.println("update success");
            conn.close();
        } catch (SQLException e) {  
            System.out.println(e.getMessage());
            
        }  
    }  
    
    
}


