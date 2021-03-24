/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.*;

/**
 *
 * @author santi
 */
public class Conexion {

    String usuario = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/pacientesmedicoscitas";
    Connection con;
    Statement stmt;
    ResultSet rs;

    public Conexion() {
        try {
            System.out.println("hola");

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM paciente");
            rs.next();
            do {
                System.out.println(rs.getString("NombreCompleto"));
            } while (rs.next());
        } catch (Exception e) {
        }
    }

    public Connection getConnection() {
        return con;
    }
    public static void main(String[] args){
        Conexion conexion = new Conexion();
    }
}
