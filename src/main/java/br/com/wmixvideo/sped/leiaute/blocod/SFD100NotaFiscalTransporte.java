package br.com.wmixvideo.sped.leiaute.blocod;

import br.com.wmixvideo.sped.enums.SFDocumentoModelo;
import br.com.wmixvideo.sped.enums.SFIndicadorEmitente;
import br.com.wmixvideo.sped.enums.SFIndicadorOperacao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalFrete;
import br.com.wmixvideo.sped.enums.SFSituacaoDocumento;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFD100NotaFiscalTransporte implements SFLinha {

    private String campo04CodigoParticipante;
    private SFDocumentoModelo campo05Modelo;
    private SFSituacaoDocumento campo06Situacao;
    private String campo07Serie;
    private String campo08Subserie;
    private String campo09Numero;
    private String campo10ChaveTransporteEletronico;
    private String campo13TipoTransporteEletronico;
    private String campo14ChaveTransporteEletronicoReferencia;
    private String campo22CodigoInformacaoComplementar;
    private String campo23CodigoContaAnalitica;
    private LocalDate campo11DataEmissao;
    private LocalDate campo12DataAquisicao;
    private BigDecimal campo15Valor;
    private BigDecimal campo16ValorDesconto;
    private BigDecimal campo18ValorPrestacaoServico;
    private BigDecimal campo19ValorBaseCalculo;
    private BigDecimal campo20ValorICMS;
    private BigDecimal campo21ValorNaoTributado;
    private SFNotaFiscalFrete campo17Frete;
    private SFIndicadorOperacao campo02IndicadorOperacao;
    private SFIndicadorEmitente campo03IndicadorEmitente;

    @Override
    public String getCampo01CodigoRegistro() {
        return "D100";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IndicadorOperacao));
        linha.append(SFUtil.formatToString(this.campo03IndicadorEmitente));
        linha.append(this.campo04CodigoParticipante);
        linha.append(SFUtil.formatToString(this.campo05Modelo));
        linha.append(SFUtil.formatToString(this.campo06Situacao));
        linha.append(this.campo07Serie);
        linha.append(this.campo08Subserie);
        linha.append(this.campo09Numero);
        linha.append(this.campo10ChaveTransporteEletronico);
        linha.append(SFUtil.formatToString(this.campo11DataEmissao));
        linha.append(SFUtil.formatToString(this.campo12DataAquisicao));
        linha.append(this.campo13TipoTransporteEletronico);
        linha.append(this.campo14ChaveTransporteEletronicoReferencia);
        linha.append(SFUtil.formatToString(this.campo15Valor));
        linha.append(SFUtil.formatToString(this.campo16ValorDesconto));
        linha.append(SFUtil.formatToString(this.campo17Frete));
        linha.append(SFUtil.formatToString(this.campo18ValorPrestacaoServico));
        linha.append(SFUtil.formatToString(this.campo19ValorBaseCalculo));
        linha.append(SFUtil.formatToString(this.campo20ValorICMS));
        linha.append(SFUtil.formatToString(this.campo21ValorNaoTributado));
        linha.append(this.campo22CodigoInformacaoComplementar);
        linha.append(this.campo23CodigoContaAnalitica);
        return linha.toString();
    }

    public SFD100NotaFiscalTransporte setCampo10ChaveTransporteEletronico(String campo10ChaveTransporteEletronico) {
        this.campo10ChaveTransporteEletronico = campo10ChaveTransporteEletronico;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo14ChaveTransporteEletronicoReferencia(String campo14ChaveTransporteEletronicoReferencia) {
        this.campo14ChaveTransporteEletronicoReferencia = campo14ChaveTransporteEletronicoReferencia;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo23CodigoContaAnalitica(String campo23CodigoContaAnalitica) {
        this.campo23CodigoContaAnalitica = campo23CodigoContaAnalitica;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo22CodigoInformacaoComplementar(String campo22CodigoInformacaoComplementar) {
        this.campo22CodigoInformacaoComplementar = campo22CodigoInformacaoComplementar;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo05Modelo(SFDocumentoModelo campo05Modelo) {
        this.campo05Modelo = campo05Modelo;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo04CodigoParticipante(String campo04CodigoParticipante) {
        this.campo04CodigoParticipante = campo04CodigoParticipante;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo06Situacao(SFSituacaoDocumento campo06Situacao) {
        this.campo06Situacao = campo06Situacao;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo12DataAquisicao(LocalDate campo12DataAquisicao) {
        this.campo12DataAquisicao = campo12DataAquisicao;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo11DataEmissao(LocalDate campo11DataEmissao) {
        this.campo11DataEmissao = campo11DataEmissao;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo17Frete(SFNotaFiscalFrete campo17Frete) {
        this.campo17Frete = campo17Frete;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo03IndicadorEmitente(SFIndicadorEmitente campo03IndicadorEmitente) {
        this.campo03IndicadorEmitente = campo03IndicadorEmitente;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo02IndicadorOperacao(SFIndicadorOperacao campo02IndicadorOperacao) {
        this.campo02IndicadorOperacao = campo02IndicadorOperacao;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo09Numero(String campo09Numero) {
        this.campo09Numero = campo09Numero;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo07Serie(String campo07Serie) {
        this.campo07Serie = campo07Serie;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo08Subserie(String campo08Subserie) {
        this.campo08Subserie = campo08Subserie;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo13TipoTransporteEletronico(String campo13TipoTransporteEletronico) {
        this.campo13TipoTransporteEletronico = campo13TipoTransporteEletronico;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo15Valor(BigDecimal campo15Valor) {
        this.campo15Valor = campo15Valor;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo19ValorBaseCalculo(BigDecimal campo19ValorBaseCalculo) {
        this.campo19ValorBaseCalculo = campo19ValorBaseCalculo;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo16ValorDesconto(BigDecimal campo16ValorDesconto) {
        this.campo16ValorDesconto = campo16ValorDesconto;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo20ValorICMS(BigDecimal campo20ValorICMS) {
        this.campo20ValorICMS = campo20ValorICMS;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo21ValorNaoTributado(BigDecimal campo21ValorNaoTributado) {
        this.campo21ValorNaoTributado = campo21ValorNaoTributado;
        return this;
    }

    public SFD100NotaFiscalTransporte setCampo18ValorPrestacaoServico(BigDecimal campo18ValorPrestacaoServico) {
        this.campo18ValorPrestacaoServico = campo18ValorPrestacaoServico;
        return this;
    }
}