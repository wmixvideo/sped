package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFE110ApuracaoICMSOperacoesProprias implements SFLinha {

    private BigDecimal valorTotalDebitos;
    private BigDecimal valorAjusteDebitos;
    private BigDecimal valorTotalAjusteDebitos;
    private BigDecimal valorEstornoCreditos;
    private BigDecimal valorTotalCreditos;
    private BigDecimal valorAjusteCreditos;
    private BigDecimal valorTotalAjusteCreditos;
    private BigDecimal valorEstornosDebito;
    private BigDecimal valorSaldoCredorAnterior;
    private BigDecimal valorSaldoApurado;
    private BigDecimal valorTotalDeducoes;
    private BigDecimal valorIcmsRecolher;
    private BigDecimal valorSaldoCredorTransportar;
    private BigDecimal valorExtraApuracao;

    public SFE110ApuracaoICMSOperacoesProprias () {
        this.valorTotalDebitos = BigDecimal.ZERO;
        this.valorAjusteDebitos = BigDecimal.ZERO;
        this.valorTotalAjusteDebitos = BigDecimal.ZERO;
        this.valorEstornoCreditos = BigDecimal.ZERO;
        this.valorTotalCreditos = BigDecimal.ZERO;
        this.valorAjusteCreditos = BigDecimal.ZERO;
        this.valorTotalAjusteCreditos = BigDecimal.ZERO;
        this.valorEstornosDebito = BigDecimal.ZERO;
        this.valorSaldoCredorAnterior = BigDecimal.ZERO;
        this.valorSaldoApurado = BigDecimal.ZERO;
        this.valorTotalDeducoes = BigDecimal.ZERO;
        this.valorIcmsRecolher = BigDecimal.ZERO;
        this.valorSaldoCredorTransportar = BigDecimal.ZERO;
        this.valorExtraApuracao = BigDecimal.ZERO;
    }

    @Override
    public String getCodigoRegistro() {
        return "E110";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(SFUtil.formatToString(this.valorTotalDebitos));
        texto.append(SFUtil.formatToString(this.valorAjusteDebitos));
        texto.append(SFUtil.formatToString(this.valorTotalAjusteDebitos));
        texto.append(SFUtil.formatToString(this.valorEstornoCreditos));
        texto.append(SFUtil.formatToString(this.valorTotalCreditos));
        texto.append(SFUtil.formatToString(this.valorAjusteCreditos));
        texto.append(SFUtil.formatToString(this.valorTotalAjusteCreditos));
        texto.append(SFUtil.formatToString(this.valorEstornosDebito));
        texto.append(SFUtil.formatToString(this.valorSaldoCredorAnterior));
        texto.append(SFUtil.formatToString(this.valorSaldoApurado));
        texto.append(SFUtil.formatToString(this.valorTotalDeducoes));
        texto.append(SFUtil.formatToString(this.valorIcmsRecolher));
        texto.append(SFUtil.formatToString(this.valorSaldoCredorTransportar));
        texto.append(SFUtil.formatToString(this.valorExtraApuracao));
        return texto.toString();
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorAjusteCreditos(BigDecimal valorAjusteCreditos) {
        this.valorAjusteCreditos = valorAjusteCreditos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorAjusteDebitos(BigDecimal valorAjusteDebitos) {
        this.valorAjusteDebitos = valorAjusteDebitos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorEstornoCreditos(BigDecimal valorEstornoCreditos) {
        this.valorEstornoCreditos = valorEstornoCreditos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorEstornosDebito(BigDecimal valorEstornosDebito) {
        this.valorEstornosDebito = valorEstornosDebito;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorExtraApuracao(BigDecimal valorExtraApuracao) {
        this.valorExtraApuracao = valorExtraApuracao;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorIcmsRecolher(BigDecimal valorIcmsRecolher) {
        this.valorIcmsRecolher = valorIcmsRecolher;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorSaldoApurado(BigDecimal valorSaldoApurado) {
        this.valorSaldoApurado = valorSaldoApurado;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorSaldoCredorAnterior(BigDecimal valorSaldoCredorAnterior) {
        this.valorSaldoCredorAnterior = valorSaldoCredorAnterior;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorSaldoCredorTransportar(BigDecimal valorSaldoCredorTransportar) {
        this.valorSaldoCredorTransportar = valorSaldoCredorTransportar;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorTotalAjusteCreditos(BigDecimal valorTotalAjusteCreditos) {
        this.valorTotalAjusteCreditos = valorTotalAjusteCreditos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorTotalAjusteDebitos(BigDecimal valorTotalAjusteDebitos) {
        this.valorTotalAjusteDebitos = valorTotalAjusteDebitos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorTotalCreditos(BigDecimal valorTotalCreditos) {
        this.valorTotalCreditos = valorTotalCreditos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorTotalDebitos(BigDecimal valorTotalDebitos) {
        this.valorTotalDebitos = valorTotalDebitos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setValorTotalDeducoes(BigDecimal valorTotalDeducoes) {
        this.valorTotalDeducoes = valorTotalDeducoes;
        return this;
    }
}
