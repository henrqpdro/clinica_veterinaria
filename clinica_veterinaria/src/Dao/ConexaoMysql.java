package Dao;

import java.sql.*;

public class ConexaoMysql {

    public static Connection getConexao() throws Exception {

        return DriverManager.getConnection(

            "jdbc:mysql://localhost:3306/db_veterinaria",
            "root",
            " ");


    }

}
