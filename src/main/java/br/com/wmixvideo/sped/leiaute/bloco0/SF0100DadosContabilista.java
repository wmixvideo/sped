package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0100DadosContabilista implements SFLinha {

    private String nome, cpf, crc, cnpj, cep, endereco, numero, complemento, bairro, telefone, fax, email, municipioCodigo;

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.nome);
        texto.append(this.cpf);
        texto.append(this.crc);
        texto.append(this.cnpj);
        texto.append(this.cep);
        texto.append(this.endereco);
        texto.append(this.numero);
        texto.append(this.complemento);
        texto.append(this.bairro);
        texto.append(this.telefone);
        texto.append(this.fax);
        texto.append(this.email);
        texto.append(this.municipioCodigo);

        return texto.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0100";
    }

    public SF0100DadosContabilista setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public SF0100DadosContabilista setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public SF0100DadosContabilista setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public SF0100DadosContabilista setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public SF0100DadosContabilista setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public SF0100DadosContabilista setCrc(String crc) {
        this.crc = crc;
        return this;
    }

    public SF0100DadosContabilista setEmail(String email) {
        this.email = email;
        return this;
    }

    public SF0100DadosContabilista setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public SF0100DadosContabilista setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public SF0100DadosContabilista setMunicipioCodigo(String municipioCodigo) {
        this.municipioCodigo = municipioCodigo;
        return this;
    }

    public SF0100DadosContabilista setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public SF0100DadosContabilista setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public SF0100DadosContabilista setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
}