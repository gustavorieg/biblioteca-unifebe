package br.com.project.bibliotecaunifebe.model;

import java.util.Date;

public class HistoricoEmpresaModel {
    private int Id;
    private int UsuarioId;
    private int LivroID;
    private Date DataEmprestimo;
    private Date DataDevolucao;

    public HistoricoEmpresaModel(int id, int usuarioId, int livroID, Date dataEmprestimo, Date dataDevolucao) {
        this.Id = id;
        this.UsuarioId = usuarioId;
        this.LivroID = livroID;
        this.DataEmprestimo = dataEmprestimo;
        this.DataDevolucao = dataDevolucao;
    }

    public int getId() {
        return Id;
    }

    public int getUsuarioId() {
        return UsuarioId;
    }

    public int getLivroID() {
        return LivroID;
    }

    public Date getDataEmprestimo() {
        return DataEmprestimo;
    }

    public Date getDataDevolucao() {
        return DataDevolucao;
    }
}
