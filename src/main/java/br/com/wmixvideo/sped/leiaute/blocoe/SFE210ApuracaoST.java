package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimento;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFE210ApuracaoST implements SFLinha {

    private SFIndicadorMovimento indicadorMovimento;
    private BigDecimal valorSaldoCredorAnterior;
    private BigDecimal valorDevolucao;
    private BigDecimal valorRessarcimento;
    private BigDecimal valorOutrosCreditos;
    private BigDecimal valorAjusteCreditos;
    private BigDecimal valorRetencao;
    private BigDecimal valorOutrosDebitos;
    private BigDecimal valorAjusteDebitos;
    private BigDecimal valorSaldoDevedorAntesDeducoes;
    private BigDecimal valorDeducoes;
    private BigDecimal valorARecolher;
    private BigDecimal valorSaldoCredorTransportar;
    private BigDecimal valorExtraApuracao;

    @Override
    public String getCodigoRegistro() {
        return "E210";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCodigoRegistro());
        linha.append(SFUtil.formatToString(this.indicadorMovimento));
        linha.append(SFUtil.formatToString(this.valorSaldoCredorAnterior));
        linha.append(SFUtil.formatToString(this.valorDevolucao));
        linha.append(SFUtil.formatToString(this.valorRessarcimento));
        linha.append(SFUtil.formatToString(this.valorOutrosCreditos));
        linha.append(SFUtil.formatToString(this.valorAjusteCreditos));
        linha.append(SFUtil.formatToString(this.valorRetencao));
        linha.append(SFUtil.formatToString(this.valorOutrosDebitos));
        linha.append(SFUtil.formatToString(this.valorAjusteDebitos));
        linha.append(SFUtil.formatToString(this.valorSaldoDevedorAntesDeducoes));
        linha.append(SFUtil.formatToString(this.valorDeducoes));
        linha.append(SFUtil.formatToString(this.valorARecolher));
        linha.append(SFUtil.formatToString(this.valorSaldoCredorTransportar));
        linha.append(SFUtil.formatToString(this.valorExtraApuracao));
        return linha.toString();
    }

    public SFE210ApuracaoST setIndicadorMovimento(SFIndicadorMovimento indicadorMovimento) {
        this.indicadorMovimento = indicadorMovimento;
        return this;
    }

    public SFE210ApuracaoST setValorAjusteCreditos(BigDecimal valorAjusteCreditos) {
        this.valorAjusteCreditos = valorAjusteCreditos;
        return this;
    }

    public SFE210ApuracaoST setValorAjusteDebitos(BigDecimal valorAjusteDebitos) {
        this.valorAjusteDebitos = valorAjusteDebitos;
        return this;
    }

    public SFE210ApuracaoST setValorARecolher(BigDecimal valorARecolher) {
        this.valorARecolher = valorARecolher;
        return this;
    }

    public SFE210ApuracaoST setValorDeducoes(BigDecimal valorDeducoes) {
        this.valorDeducoes = valorDeducoes;
        return this;
    }

    public SFE210ApuracaoST setValorDevolucao(BigDecimal valorDevolucao) {
        this.valorDevolucao = valorDevolucao;
        return this;
    }

    public SFE210ApuracaoST setValorExtraApuracao(BigDecimal valorExtraApuracao) {
        this.valorExtraApuracao = valorExtraApuracao;
        return this;
    }

    public SFE210ApuracaoST setValorOutrosCreditos(BigDecimal valorOutrosCreditos) {
        this.valorOutrosCreditos = valorOutrosCreditos;
        return this;
    }

    public SFE210ApuracaoST setValorOutrosDebitos(BigDecimal valorOutrosDebitos) {
        this.valorOutrosDebitos = valorOutrosDebitos;
        return this;
    }

    public SFE210ApuracaoST setValorRessarcimento(BigDecimal valorRessarcimento) {
        this.valorRessarcimento = valorRessarcimento;
        return this;
    }

    public SFE210ApuracaoST setValorRetencao(BigDecimal valorRetencao) {
        this.valorRetencao = valorRetencao;
        return this;
    }

    public SFE210ApuracaoST setValorSaldoCredorAnterior(BigDecimal valorSaldoCredorAnterior) {
        this.valorSaldoCredorAnterior = valorSaldoCredorAnterior;
        return this;
    }

    public SFE210ApuracaoST setValorSaldoCredorTransportar(BigDecimal valorSaldoCredorTransportar) {
        this.valorSaldoCredorTransportar = valorSaldoCredorTransportar;
        return this;
    }

    public SFE210ApuracaoST setValorSaldoDevedorAntesDeducoes(BigDecimal valorSaldoDevedorAntesDeducoes) {
        this.valorSaldoDevedorAntesDeducoes = valorSaldoDevedorAntesDeducoes;
        return this;
    }
}
