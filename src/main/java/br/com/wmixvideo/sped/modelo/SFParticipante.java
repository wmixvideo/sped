package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SFParticipante implements Serializable {
    private static final long serialVersionUID = -4431035314778110904L;
    private boolean possuiAlteracoes;
    private String nome;
    private String cnpj;
    private String cpf;
    private String inscricaoEstadual;
    private String suframa;
    private SFEndereco endereco;
    private List<SFParticipanteAlteracao> alteracoesCadastro;

    public SFParticipante() {
        this.endereco = new SFEndereco();
        this.possuiAlteracoes = false;
        this.alteracoesCadastro = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigoParticipante() {
        return this.getCnpj() != null && !this.getCnpj().isEmpty() ? this.getCnpj() : this.getCpf();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public SFEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(SFEndereco endereco) {
        this.endereco = endereco;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPossuiAlteracoes() {
        return possuiAlteracoes;
    }

    public void setPossuiAlteracoes(boolean possuiAlteracoes) {
        this.possuiAlteracoes = possuiAlteracoes;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public List<SFParticipanteAlteracao> getAlteracoesCadastro() {
        return alteracoesCadastro;
    }

    public void setAlteracoesCadastro(List<SFParticipanteAlteracao> alteracoesCadastro) {
        this.alteracoesCadastro = alteracoesCadastro;
    }
}
