/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Irivin
 */
public class Conexion {
    public String bd = "reservahotel";
    public String url = "jdbc:mysql://127.0.0.1/" + bd;
    public String user = "root";
    public String password = "";

    public Conexion() {
    }
    
    public Connection conectar(){
        Connection  link = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
}
