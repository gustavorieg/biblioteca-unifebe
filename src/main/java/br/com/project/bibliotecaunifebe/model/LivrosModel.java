package br.com.project.bibliotecaunifebe.model;

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

    public int getId() {
        return Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getEditora() {
        return Editora;
    }

    public String getAno() {
        return Ano;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getStatus() {
        return Status;
    }
}
