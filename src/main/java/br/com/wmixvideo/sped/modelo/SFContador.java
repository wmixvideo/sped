package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;

public class SFContador implements Serializable {
    private static final long serialVersionUID = 7257883146079556795L;
    private String nome, cpf, cnpj, crc, cep, endereco, numero, complemento, bairro, telefone, fax, email, municipioCodigo;

    public String getBairro() {
        return bairro;
    }

    public SFContador setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public SFContador setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public SFContador setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public SFContador setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public SFContador setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getCrc() {
        return crc;
    }

    public SFContador setCrc(String crc) {
        this.crc = crc;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SFContador setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public SFContador setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getFax() {
        return fax;
    }

    public SFContador setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public SFContador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public SFContador setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public SFContador setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getMunicipioCodigo() {
        return municipioCodigo;
    }

    public SFContador setMunicipioCodigo(String municipioCodigo) {
        this.municipioCodigo = municipioCodigo;
        return this;
    }
}
