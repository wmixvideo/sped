package br.com.wmixvideo.sped.leiaute.blocod;

import br.com.wmixvideo.sped.enums.SFIndicadorEmitente;
import br.com.wmixvideo.sped.enums.SFIndicadorOperacao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalFrete;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFD100NotaFiscalTransporte implements SFLinha {

    private String codigoParticipante;
    private String codigoModelo;
    private String codigoSituacao;
    private String serie;
    private String subserie;
    private String numero;
    private String chaveTransporteEletronico;
    private String tipoTransporteEletronico;
    private String chaveTransporteEletronicoReferencia;
    private String codigoInformacaoComplementar;
    private String codigoContaAnalitica;
    private LocalDate dataEmissao;
    private LocalDate dataAquisicao;
    private BigDecimal valor;
    private BigDecimal valorDesconto;
    private BigDecimal valorPrestacaoServico;
    private BigDecimal valorBaseCalculo;
    private BigDecimal valorICMS;
    private BigDecimal valorNaoTributado;
    private SFNotaFiscalFrete frete;
    private SFIndicadorOperacao indicadorOperacao;
    private SFIndicadorEmitente indicadorEmitente;

    @Override
    public String getCampo01CodigoRegistro() {
        return "D100";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(SFUtil.formatToString(this.indicadorOperacao));
        texto.append(SFUtil.formatToString(this.indicadorEmitente));
        texto.append(this.codigoParticipante);
        texto.append(this.codigoModelo);
        texto.append(this.codigoSituacao);
        texto.append(this.serie);
        texto.append(this.subserie);
        texto.append(this.numero);
        texto.append(this.chaveTransporteEletronico);
        texto.append(SFUtil.formatToString(this.dataEmissao));
        texto.append(SFUtil.formatToString(this.dataAquisicao));
        texto.append(this.tipoTransporteEletronico);
        texto.append(this.chaveTransporteEletronicoReferencia);
        texto.append(SFUtil.formatToString(this.valor));
        texto.append(SFUtil.formatToString(this.valorDesconto));
        texto.append(SFUtil.formatToString(this.frete));
        texto.append(SFUtil.formatToString(this.valorPrestacaoServico));
        texto.append(SFUtil.formatToString(this.valorBaseCalculo));
        texto.append(SFUtil.formatToString(this.valorICMS));
        texto.append(SFUtil.formatToString(this.valorNaoTributado));
        texto.append(this.codigoInformacaoComplementar);
        texto.append(this.codigoContaAnalitica);
        return texto.toString();
    }

    public SFD100NotaFiscalTransporte setChaveTransporteEletronico(String chaveTransporteEletronico) {
        this.chaveTransporteEletronico = chaveTransporteEletronico;
        return this;
    }

    public SFD100NotaFiscalTransporte setChaveTransporteEletronicoReferencia(String chaveTransporteEletronicoReferencia) {
        this.chaveTransporteEletronicoReferencia = chaveTransporteEletronicoReferencia;
        return this;
    }

    public SFD100NotaFiscalTransporte setCodigoContaAnalitica(String codigoContaAnalitica) {
        this.codigoContaAnalitica = codigoContaAnalitica;
        return this;
    }

    public SFD100NotaFiscalTransporte setCodigoInformacaoComplementar(String codigoInformacaoComplementar) {
        this.codigoInformacaoComplementar = codigoInformacaoComplementar;
        return this;
    }

    public SFD100NotaFiscalTransporte setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
        return this;
    }

    public SFD100NotaFiscalTransporte setCodigoParticipante(String codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
        return this;
    }

    public SFD100NotaFiscalTransporte setCodigoSituacao(String codigoSituacao) {
        this.codigoSituacao = codigoSituacao;
        return this;
    }

    public SFD100NotaFiscalTransporte setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
        return this;
    }

    public SFD100NotaFiscalTransporte setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    public SFD100NotaFiscalTransporte setFrete(SFNotaFiscalFrete frete) {
        this.frete = frete;
        return this;
    }

    public SFD100NotaFiscalTransporte setIndicadorEmitente(SFIndicadorEmitente indicadorEmitente) {
        this.indicadorEmitente = indicadorEmitente;
        return this;
    }

    public SFD100NotaFiscalTransporte setIndicadorOperacao(SFIndicadorOperacao indicadorOperacao) {
        this.indicadorOperacao = indicadorOperacao;
        return this;
    }

    public SFD100NotaFiscalTransporte setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public SFD100NotaFiscalTransporte setSerie(String serie) {
        this.serie = serie;
        return this;
    }

    public SFD100NotaFiscalTransporte setSubserie(String subserie) {
        this.subserie = subserie;
        return this;
    }

    public SFD100NotaFiscalTransporte setTipoTransporteEletronico(String tipoTransporteEletronico) {
        this.tipoTransporteEletronico = tipoTransporteEletronico;
        return this;
    }

    public SFD100NotaFiscalTransporte setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public SFD100NotaFiscalTransporte setValorBaseCalculo(BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = valorBaseCalculo;
        return this;
    }

    public SFD100NotaFiscalTransporte setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
        return this;
    }

    public SFD100NotaFiscalTransporte setValorICMS(BigDecimal valorICMS) {
        this.valorICMS = valorICMS;
        return this;
    }

    public SFD100NotaFiscalTransporte setValorNaoTributado(BigDecimal valorNaoTributado) {
        this.valorNaoTributado = valorNaoTributado;
        return this;
    }

    public SFD100NotaFiscalTransporte setValorPrestacaoServico(BigDecimal valorPrestacaoServico) {
        this.valorPrestacaoServico = valorPrestacaoServico;
        return this;
    }
}