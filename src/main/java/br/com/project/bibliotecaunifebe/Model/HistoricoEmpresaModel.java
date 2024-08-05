package br.com.project.bibliotecaunifebe.Model;

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
}
