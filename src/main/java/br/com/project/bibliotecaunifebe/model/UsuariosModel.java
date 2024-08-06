package br.com.project.bibliotecaunifebe.model;

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

    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    public String getSenha() {
        return Senha;
    }

    public Boolean getPermissao() {
        return Permissao;
    }
}
