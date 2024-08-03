package br.com.project.bibliotecaunifebe.Model;

public class UsuariosModel {
    private int Id;
    private String Nome;
    private String Email;
    private String Senha;
    private Boolean Permissao;

    public UsuariosModel(int id, String nome, String email, String senha, Boolean permissao) {
        this.Id = id;
        this.Nome = nome;
        this.Email = email;
        this.Senha = senha;
        this.Permissao = permissao;
    }
}
