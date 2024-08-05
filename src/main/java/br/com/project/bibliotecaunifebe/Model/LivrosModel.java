package br.com.project.bibliotecaunifebe.Model;

public class LivrosModel {
    private int Id;
    private String Titulo;
    private String Autor;
    private String Editora;
    private String Ano;
    private String Categoria;
    private String Status;

    public LivrosModel(int id, String titulo, String autor, String editora, String ano, String categoria, String status) {
        this.Id = id;
        this.Titulo = titulo;
        this.Autor = autor;
        this.Editora = editora;
        this.Ano = ano;
        this.Categoria = categoria;
        this.Status = status;
    }
}
