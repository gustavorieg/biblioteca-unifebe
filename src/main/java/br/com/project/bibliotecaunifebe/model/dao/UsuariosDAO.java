package br.com.project.bibliotecaunifebe.model.dao;

import br.com.project.bibliotecaunifebe.model.domain.Usuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosDAO {
    private Connection conn;

    public Connection getConnection(){
        return conn;
    }
    public void setConnection(Connection conn){
        this.conn = conn;
    }

    public boolean inserir(Usuarios usuario) throws SQLException{
        String sql = "INSERT INTO teste(nome,senha,email,telefone) VALUES(?,?,?,?)";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
