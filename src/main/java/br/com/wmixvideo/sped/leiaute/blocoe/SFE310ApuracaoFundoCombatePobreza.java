package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimento;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFE310ApuracaoFundoCombatePobreza implements SFLinha {

    private SFIndicadorMovimento indicadorMovimento;
    private BigDecimal valorSaldoCredorAnterior;
    private BigDecimal valorDebitos;
    private BigDecimal valorDebitosAjuste;
    private BigDecimal valorDebitosFCP;
    private BigDecimal valorCreditos;
    private BigDecimal valorCreditosFCP;
    private BigDecimal valorCreditosAjuste;
    private BigDecimal valorSaldoDevedorAntesDeducoes;
    private BigDecimal valorDeducoes;
    private BigDecimal valorARecolher;
    private BigDecimal valorSaldoCredorTransportar;
    private BigDecimal valorExtraApuracao;

    @Override
    public String getCodigoRegistro() {
        return "E310";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCodigoRegistro());
        linha.append(SFUtil.formatToString(this.indicadorMovimento));
        linha.append(SFUtil.formatToString(this.valorSaldoCredorAnterior));
        linha.append(SFUtil.formatToString(this.valorDebitos));
        linha.append(SFUtil.formatToString(this.valorDebitosAjuste));
        linha.append(SFUtil.formatToString(this.valorDebitosFCP));
        linha.append(SFUtil.formatToString(this.valorCreditos));
        linha.append(SFUtil.formatToString(this.valorCreditosFCP));
        linha.append(SFUtil.formatToString(this.valorCreditosAjuste));
        linha.append(SFUtil.formatToString(this.valorSaldoDevedorAntesDeducoes));
        linha.append(SFUtil.formatToString(this.valorDeducoes));
        linha.append(SFUtil.formatToString(this.valorARecolher));
        linha.append(SFUtil.formatToString(this.valorSaldoCredorTransportar));
        linha.append(SFUtil.formatToString(this.valorExtraApuracao));
        return linha.toString();
    }

    public SFE310ApuracaoFundoCombatePobreza setIndicadorMovimento(SFIndicadorMovimento indicadorMovimento) {
        this.indicadorMovimento = indicadorMovimento;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorARecolher(BigDecimal valorARecolher) {
        this.valorARecolher = valorARecolher;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorCreditos(BigDecimal valorCreditos) {
        this.valorCreditos = valorCreditos;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorCreditosAjuste(BigDecimal valorCreditosAjuste) {
        this.valorCreditosAjuste = valorCreditosAjuste;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorCreditosFCP(BigDecimal valorCreditosFCP) {
        this.valorCreditosFCP = valorCreditosFCP;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorDebitos(BigDecimal valorDebitos) {
        this.valorDebitos = valorDebitos;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorDebitosAjuste(BigDecimal valorDebitosAjuste) {
        this.valorDebitosAjuste = valorDebitosAjuste;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorDebitosFCP(BigDecimal valorDebitosFCP) {
        this.valorDebitosFCP = valorDebitosFCP;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorDeducoes(BigDecimal valorDeducoes) {
        this.valorDeducoes = valorDeducoes;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorExtraApuracao(BigDecimal valorExtraApuracao) {
        this.valorExtraApuracao = valorExtraApuracao;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorSaldoCredorAnterior(BigDecimal valorSaldoCredorAnterior) {
        this.valorSaldoCredorAnterior = valorSaldoCredorAnterior;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorSaldoCredorTransportar(BigDecimal valorSaldoCredorTransportar) {
        this.valorSaldoCredorTransportar = valorSaldoCredorTransportar;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setValorSaldoDevedorAntesDeducoes(BigDecimal valorSaldoDevedorAntesDeducoes) {
        this.valorSaldoDevedorAntesDeducoes = valorSaldoDevedorAntesDeducoes;
        return this;
    }
}
