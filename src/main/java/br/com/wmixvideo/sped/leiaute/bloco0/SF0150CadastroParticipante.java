package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class SF0150CadastroParticipante implements SFLinha, Comparable<SF0150CadastroParticipante> {

    private String campo02CodigoParticipante;
    private String campo03Nome;
    private String campo04CodigoPais;
    private String campo05Cnpj;
    private String campo06Cpf;
    private String campo07InscricaoEstadual;
    private String campo08CodigoMunicipio;
    private String campo09Suframa;
    private String campo10Logradouro;
    private String campo11Numero;
    private String campo12Complemento;
    private String campo13Bairro;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02CodigoParticipante);
        linha.append(this.campo03Nome);
        linha.append(this.campo04CodigoPais);
        linha.append(this.campo05Cnpj);
        linha.append(this.campo06Cpf);
        linha.append(this.campo07InscricaoEstadual);
        linha.append(this.campo08CodigoMunicipio);
        linha.append(this.campo09Suframa);
        linha.append(StringUtils.trimToEmpty(this.campo10Logradouro));
        linha.append(StringUtils.trimToEmpty(this.campo11Numero));
        linha.append(this.campo12Complemento);
        linha.append(StringUtils.trimToEmpty(this.campo13Bairro));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0150";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SF0150CadastroParticipante that = (SF0150CadastroParticipante) o;
        return Objects.equals(campo02CodigoParticipante, that.campo02CodigoParticipante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campo02CodigoParticipante);
    }

    @Override
    public int compareTo(SF0150CadastroParticipante o) {
        return this.campo02CodigoParticipante.compareTo(o.campo02CodigoParticipante);
    }

    public SF0150CadastroParticipante setCampo02CodigoParticipante(String campo02CodigoParticipante) {
        this.campo02CodigoParticipante = campo02CodigoParticipante;
        return this;
    }

    public SF0150CadastroParticipante setCampo03Nome(String campo03Nome) {
        this.campo03Nome = campo03Nome;
        return this;
    }

    public SF0150CadastroParticipante setCampo04CodigoPais(String campo04CodigoPais) {
        this.campo04CodigoPais = campo04CodigoPais;
        return this;
    }

    public SF0150CadastroParticipante setCampo05Cnpj(String campo05Cnpj) {
        this.campo05Cnpj = campo05Cnpj;
        return this;
    }

    public SF0150CadastroParticipante setCampo06Cpf(String campo06Cpf) {
        this.campo06Cpf = campo06Cpf;
        return this;
    }

    public SF0150CadastroParticipante setCampo07InscricaoEstadual(String campo07InscricaoEstadual) {
        this.campo07InscricaoEstadual = campo07InscricaoEstadual;
        return this;
    }

    public SF0150CadastroParticipante setCampo08CodigoMunicipio(String campo08CodigoMunicipio) {
        this.campo08CodigoMunicipio = campo08CodigoMunicipio;
        return this;
    }

    public SF0150CadastroParticipante setCampo09Suframa(String campo09Suframa) {
        this.campo09Suframa = campo09Suframa;
        return this;
    }

    public SF0150CadastroParticipante setCampo10Logradouro(String campo10Logradouro) {
        this.campo10Logradouro = campo10Logradouro;
        return this;
    }

    public SF0150CadastroParticipante setCampo11Numero(String campo11Numero) {
        this.campo11Numero = campo11Numero;
        return this;
    }

    public SF0150CadastroParticipante setCampo12Complemento(String campo12Complemento) {
        this.campo12Complemento = campo12Complemento;
        return this;
    }

    public SF0150CadastroParticipante setCampo13Bairro(String campo13Bairro) {
        this.campo13Bairro = campo13Bairro;
        return this;
    }
}