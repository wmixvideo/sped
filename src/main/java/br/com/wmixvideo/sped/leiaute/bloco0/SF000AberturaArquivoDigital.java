package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFUnidadeFederativa;
import br.com.wmixvideo.sped.leiaute.SFFinalidadeArquivo;
import br.com.wmixvideo.sped.leiaute.SFIndicadorTipoAtividade;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.leiaute.SFPerfilApresentacaoArquivoFiscal;
import br.com.wmixvideo.sped.util.SFReferencia;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;
import java.time.Month;

public class SF000AberturaArquivoDigital implements SFLinha {

    private String razaoSocial;
    private String cnpj;
    private String cpf;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String suframa;
    private String codigoMunicipio;
    private SFUnidadeFederativa uf;
    private SFReferencia referencia;
    private SFFinalidadeArquivo finalidade;
    private SFPerfilApresentacaoArquivoFiscal perfilApresentacaoArquivoFiscal;
    private SFIndicadorTipoAtividade indicadorTipoAtividade;

    @Override
    public String toString() {
        if (this.referencia == null) {
            return null;
        }

        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.getCodigoVersaoLeiaute());
        texto.append(this.finalidade != null ? this.finalidade.getCodigo() : "");
        texto.append(SFUtil.formatToString(this.referencia.getInicio()));
        texto.append(SFUtil.formatToString(this.referencia.getFim()));
        texto.append(this.razaoSocial);
        texto.append(this.cnpj);
        texto.append(this.cpf);
        texto.append(this.uf != null ? this.uf.getCodigo() : "");
        texto.append(this.inscricaoEstadual);
        texto.append(this.codigoMunicipio);
        texto.append(this.inscricaoMunicipal);
        texto.append(this.suframa);
        texto.append(this.perfilApresentacaoArquivoFiscal != null ? this.perfilApresentacaoArquivoFiscal.getCodigo() : "");
        texto.append(this.indicadorTipoAtividade != null ? this.indicadorTipoAtividade.getCodigo() : "");
        return texto.toString();
    }

    private String getCodigoVersaoLeiaute() {
        final LocalDate dataFinalReferencia = this.referencia.getFim();
        if (dataFinalReferencia.isBefore(LocalDate.of(2010, Month.JANUARY, 1))) {
            return "002";
        } else if (dataFinalReferencia.isBefore(LocalDate.of(2011, Month.JANUARY, 1))) {
            return "003";
        } else if (dataFinalReferencia.isBefore(LocalDate.of(2012, Month.JANUARY, 1))) {
            return "004";
        } else if (dataFinalReferencia.isBefore(LocalDate.of(2012, Month.JULY, 1))) {
            return "005";
        } else if (dataFinalReferencia.isBefore(LocalDate.of(2013, Month.JANUARY, 1))) {
            return "006";
        } else if (dataFinalReferencia.isBefore(LocalDate.of(2014, Month.FEBRUARY, 1))) {
            return "007";
        } else if (dataFinalReferencia.isBefore(LocalDate.of(2015, Month.JANUARY, 1))) {
            return "008";
        } else if (dataFinalReferencia.isBefore(LocalDate.of(2016, Month.JANUARY, 1))) {
            return "009";
        } else {
            return "010";
        }
    }

    @Override
    public String getCodigoRegistro() {
        return "0000";
    }

    public SF000AberturaArquivoDigital setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public SF000AberturaArquivoDigital setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
        return this;
    }

    public SF000AberturaArquivoDigital setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public SF000AberturaArquivoDigital setFinalidade(SFFinalidadeArquivo finalidade) {
        this.finalidade = finalidade;
        return this;
    }

    public SF000AberturaArquivoDigital setIndicadorTipoAtividade(SFIndicadorTipoAtividade indicadorTipoAtividade) {
        this.indicadorTipoAtividade = indicadorTipoAtividade;
        return this;
    }

    public SF000AberturaArquivoDigital setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
        return this;
    }

    public SF000AberturaArquivoDigital setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
        return this;
    }

    public SF000AberturaArquivoDigital setPerfilApresentacaoArquivoFiscal(SFPerfilApresentacaoArquivoFiscal perfilApresentacaoArquivoFiscal) {
        this.perfilApresentacaoArquivoFiscal = perfilApresentacaoArquivoFiscal;
        return this;
    }

    public SF000AberturaArquivoDigital setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public SF000AberturaArquivoDigital setReferencia(SFReferencia referencia) {
        this.referencia = referencia;
        return this;
    }

    public SF000AberturaArquivoDigital setSuframa(String suframa) {
        this.suframa = suframa;
        return this;
    }

    public SF000AberturaArquivoDigital setUf(SFUnidadeFederativa uf) {
        this.uf = uf;
        return this;
    }
}