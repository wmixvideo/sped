package br.com.wmixvideo.sped.fiscal.leiaute.bloco0;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0005DadosComplementaresEntidade implements SFLinha {

    private String campo02NomeFantasia;
    private String campo03Cep;
    private String campo04Logradouro;
    private String campo05Numero;
    private String campo06Complemento;
    private String campo07Bairro;
    private String campo08Telefone;
    private String campo09Fax;
    private String campo10Email;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02NomeFantasia);
        linha.append(this.campo03Cep);
        linha.append(this.campo04Logradouro);
        linha.append(this.campo05Numero);
        linha.append(this.campo06Complemento);
        linha.append(this.campo07Bairro);
        linha.append(this.campo08Telefone);
        linha.append(this.campo09Fax);
        linha.append(this.campo10Email);

        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0005";
    }

    public SF0005DadosComplementaresEntidade setCampo02NomeFantasia(String campo02NomeFantasia) {
        this.campo02NomeFantasia = campo02NomeFantasia;
        return this;
    }

    public SF0005DadosComplementaresEntidade setCampo03Cep(String campo03Cep) {
        this.campo03Cep = campo03Cep;
        return this;
    }

    public SF0005DadosComplementaresEntidade setCampo04Logradouro(String campo04Logradouro) {
        this.campo04Logradouro = campo04Logradouro;
        return this;
    }

    public SF0005DadosComplementaresEntidade setCampo05Numero(String campo05Numero) {
        this.campo05Numero = campo05Numero;
        return this;
    }

    public SF0005DadosComplementaresEntidade setCampo06Complemento(String campo06Complemento) {
        this.campo06Complemento = campo06Complemento;
        return this;
    }

    public SF0005DadosComplementaresEntidade setCampo07Bairro(String campo07Bairro) {
        this.campo07Bairro = campo07Bairro;
        return this;
    }

    public SF0005DadosComplementaresEntidade setCampo08Telefone(String campo08Telefone) {
        this.campo08Telefone = campo08Telefone;
        return this;
    }

    public SF0005DadosComplementaresEntidade setCampo09Fax(String campo09Fax) {
        this.campo09Fax = campo09Fax;
        return this;
    }

    public SF0005DadosComplementaresEntidade setCampo10Email(String campo10Email) {
        this.campo10Email = campo10Email;
        return this;
    }
}