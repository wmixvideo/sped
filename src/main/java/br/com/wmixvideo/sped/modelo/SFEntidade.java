package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SFEntidade implements Serializable {
    private static final long serialVersionUID = 7174857409959846858L;

    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String cpf;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String suframa;
    private String telefone;
    private String fax;
    private String email;
    private SFEndereco endereco;
    private SFContador contador;
    private List<SFContribuinteSubstituicao> contribuinteSubstituicoes;
    private List<SFParticipante> participantes;

    public SFEntidade() {
        this.endereco = new SFEndereco();
        this.contador = new SFContador();
        this.participantes = new ArrayList<>();
        this.contribuinteSubstituicoes = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public SFEntidade setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public SFEntidade setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SFEntidade setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFax() {
        return fax;
    }

    public SFEntidade setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public SFEntidade setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
        return this;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public SFEntidade setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
        return this;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public SFEntidade setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
        return this;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public SFEntidade setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public String getSuframa() {
        return suframa;
    }

    public SFEntidade setSuframa(String suframa) {
        this.suframa = suframa;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public SFEntidade setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public List<SFContribuinteSubstituicao> getContribuinteSubstituicoes() {
        return contribuinteSubstituicoes;
    }

    public SFContador getContador() {
        return contador;
    }

    public SFEntidade setContador(SFContador contador) {
        this.contador = contador;
        return this;
    }

    public List<SFParticipante> getParticipantes() {
        return participantes;
    }

    public SFEndereco getEndereco() {
        return endereco;
    }

    public SFEntidade setEndereco(SFEndereco endereco) {
        this.endereco = endereco;
        return this;
    }
}
