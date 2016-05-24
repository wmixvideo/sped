package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;

public class SFEndereco implements Serializable {
    private static final long serialVersionUID = -5613768487816652894L;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String codigoMunicipio;
    private SFUnidadeFederativa uf;
    private SFPais pais;

    public SFEndereco() {
        this.pais = SFPais.BRASIL;
    }

    public String getBairro() {
        return bairro;
    }

    public SFEndereco setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public SFEndereco setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public SFEndereco setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public SFEndereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public SFEndereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public SFUnidadeFederativa getUf() {
        return uf;
    }

    public SFEndereco setUf(SFUnidadeFederativa uf) {
        this.uf = uf;
        return this;
    }

    public SFPais getPais() {
        return pais;
    }

    public SFEndereco setPais(SFPais pais) {
        this.pais = pais;
        return this;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public SFEndereco setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
        return this;
    }
}
