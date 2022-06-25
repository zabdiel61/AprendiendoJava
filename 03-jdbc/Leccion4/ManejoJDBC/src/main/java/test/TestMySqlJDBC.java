/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jonat
 */
public class TestMySqlJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connexion = DriverManager.getConnection(url, "root", "Pa$$w0rd");

            //Nos permite ejecutar sentencias sobre nuestra tabla de base de datos
            Statement instruccion = connexion.createStatement();

            var sql = "SELECT idPersona, nombre, apellido, email, telefono FROM persona";

            ResultSet resultado = instruccion.executeQuery(sql);

            //el metodo next no indica si tenenes aun elementos a iterar y si no regresa false
            while (resultado.next()) {
                System.out.print(" idPersona: " + resultado.getInt("idPersona"));
                System.out.print(" nombre: " + resultado.getString("nombre"));
                System.out.println(" apellido: " + resultado.getString("apellido"));
                System.out.println(" email: " + resultado.getString("email"));
                System.out.println(" telefono: " + resultado.getString("telefono"));
            }

            resultado.close();
            instruccion.close();
            connexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
