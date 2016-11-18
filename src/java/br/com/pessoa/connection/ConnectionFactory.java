package br.com.pessoa.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {

        Connection conn;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pessoa", "root", "123456");

            return conn;
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no driver!\n" + ex);
            return null;
        } catch (SQLException ex) {
            System.out.println("Erro no banco de dados!\n" + ex);
            return null;
        }
    }

}
