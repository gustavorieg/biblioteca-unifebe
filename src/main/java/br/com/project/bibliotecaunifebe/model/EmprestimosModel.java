package br.com.project.bibliotecaunifebe.model;

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

    public int getId() {
        return Id;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public int getIdLivro() {
        return IdLivro;
    }

    public String getDataEmprestimo() {
        return DataEmprestimo;
    }

    public String getDataDevolucao() {
        return DataDevolucao;
    }

    public String getDataDevolvido() {
        return DataDevolvido;
    }
}
