package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0100DadosContabilista implements SFLinha {

    private String campo02Nome;
    private String campo03Cpf;
    private String campo04Crc;
    private String campo05Cnpj;
    private String campo06Cep;
    private String campo07Endereco;
    private String campo08Numero;
    private String campo09Complemento;
    private String campo10Bairro;
    private String campo11Telefone;
    private String campo12Fax;
    private String campo13Email;
    private String campo14MunicipioCodigo;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Nome);
        linha.append(this.campo03Cpf);
        linha.append(this.campo04Crc);
        linha.append(this.campo05Cnpj);
        linha.append(this.campo06Cep);
        linha.append(this.campo07Endereco);
        linha.append(this.campo08Numero);
        linha.append(this.campo09Complemento);
        linha.append(this.campo10Bairro);
        linha.append(this.campo11Telefone);
        linha.append(this.campo12Fax);
        linha.append(this.campo13Email);
        linha.append(this.campo14MunicipioCodigo);

        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0100";
    }

    public SF0100DadosContabilista setCampo02Nome(String campo02Nome) {
        this.campo02Nome = campo02Nome;
        return this;
    }

    public SF0100DadosContabilista setCampo03Cpf(String campo03Cpf) {
        this.campo03Cpf = campo03Cpf;
        return this;
    }

    public SF0100DadosContabilista setCampo04Crc(String campo04Crc) {
        this.campo04Crc = campo04Crc;
        return this;
    }

    public SF0100DadosContabilista setCampo05Cnpj(String campo05Cnpj) {
        this.campo05Cnpj = campo05Cnpj;
        return this;
    }

    public SF0100DadosContabilista setCampo06Cep(String campo06Cep) {
        this.campo06Cep = campo06Cep;
        return this;
    }

    public SF0100DadosContabilista setCampo07Endereco(String campo07Endereco) {
        this.campo07Endereco = campo07Endereco;
        return this;
    }

    public SF0100DadosContabilista setCampo08Numero(String campo08Numero) {
        this.campo08Numero = campo08Numero;
        return this;
    }

    public SF0100DadosContabilista setCampo09Complemento(String campo09Complemento) {
        this.campo09Complemento = campo09Complemento;
        return this;
    }

    public SF0100DadosContabilista setCampo10Bairro(String campo10Bairro) {
        this.campo10Bairro = campo10Bairro;
        return this;
    }

    public SF0100DadosContabilista setCampo11Telefone(String campo11Telefone) {
        this.campo11Telefone = campo11Telefone;
        return this;
    }

    public SF0100DadosContabilista setCampo12Fax(String campo12Fax) {
        this.campo12Fax = campo12Fax;
        return this;
    }

    public SF0100DadosContabilista setCampo13Email(String campo13Email) {
        this.campo13Email = campo13Email;
        return this;
    }

    public SF0100DadosContabilista setCampo14MunicipioCodigo(String campo14MunicipioCodigo) {
        this.campo14MunicipioCodigo = campo14MunicipioCodigo;
        return this;
    }
}