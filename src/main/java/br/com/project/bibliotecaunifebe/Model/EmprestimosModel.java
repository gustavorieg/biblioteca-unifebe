package br.com.project.bibliotecaunifebe.Model;

public class EmprestimosModel {
    private int Id;
    private int IdUsuario;
    private int IdLivro;
    private String DataEmprestimo;
    private String DataDevolucao;
    private String DataDevolvido;

    public EmprestimosModel(int id, int idUsuario, int idLivro, String dataEmprestimo, String dataDevolucao, String dataDevolvido) {
        this.Id = id;
        this.IdUsuario = idUsuario;
        this.IdLivro = idLivro;
        this.DataEmprestimo = dataEmprestimo;
        this.DataDevolucao = dataDevolucao;
        this.DataDevolvido = dataDevolvido;
    }
}
