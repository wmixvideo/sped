package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0005DadosComplementaresEntidade implements SFLinha {

    private String nomeFantasia, cep, logradouro, numero, complemento, bairro, telefone, fax, email;

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.nomeFantasia);
        texto.append(this.cep);
        texto.append(this.logradouro);
        texto.append(this.numero);
        texto.append(this.complemento);
        texto.append(this.bairro);
        texto.append(this.telefone);
        texto.append(this.fax);
        texto.append(this.email);

        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "0005";
    }

    public SF0005DadosComplementaresEntidade setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public SF0005DadosComplementaresEntidade setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public SF0005DadosComplementaresEntidade setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public SF0005DadosComplementaresEntidade setEmail(String email) {
        this.email = email;
        return this;
    }

    public SF0005DadosComplementaresEntidade setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public SF0005DadosComplementaresEntidade setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public SF0005DadosComplementaresEntidade setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
        return this;
    }

    public SF0005DadosComplementaresEntidade setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public SF0005DadosComplementaresEntidade setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
}