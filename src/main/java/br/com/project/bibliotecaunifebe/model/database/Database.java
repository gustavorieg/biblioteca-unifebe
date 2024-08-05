package br.com.project.bibliotecaunifebe.model.database;

import java.sql.*;

public class Database {

    public Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres", "postgres.ddyjzhabjodtbzhtwygp", "tFE7_t_#4@ecY$6");
            return conn;
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + e.getMessage());
            return null;
        }
    }
}
