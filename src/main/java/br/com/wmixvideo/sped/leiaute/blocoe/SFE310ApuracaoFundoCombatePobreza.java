package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimento;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFE310ApuracaoFundoCombatePobreza implements SFLinha {

    private SFIndicadorMovimento campo02IndicadorMovimento;
    private BigDecimal campo03ValorSaldoCredorAnterior;
    private BigDecimal campo04ValorDebitos;
    private BigDecimal campo05ValorDebitosAjuste;
    private BigDecimal campo06ValorDebitosFCP;
    private BigDecimal campo07ValorCreditos;
    private BigDecimal campo08ValorCreditosFCP;
    private BigDecimal campo09ValorCreditosAjuste;
    private BigDecimal campo10ValorSaldoDevedorAntesDeducoes;
    private BigDecimal campo11ValorDeducoes;
    private BigDecimal campo12ValorARecolher;
    private BigDecimal campo13ValorSaldoCredorTransportar;
    private BigDecimal campo14ValorExtraApuracao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "E310";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IndicadorMovimento));
        linha.append(SFUtil.formatToString(this.campo03ValorSaldoCredorAnterior));
        linha.append(SFUtil.formatToString(this.campo04ValorDebitos));
        linha.append(SFUtil.formatToString(this.campo05ValorDebitosAjuste));
        linha.append(SFUtil.formatToString(this.campo06ValorDebitosFCP));
        linha.append(SFUtil.formatToString(this.campo07ValorCreditos));
        linha.append(SFUtil.formatToString(this.campo08ValorCreditosFCP));
        linha.append(SFUtil.formatToString(this.campo09ValorCreditosAjuste));
        linha.append(SFUtil.formatToString(this.campo10ValorSaldoDevedorAntesDeducoes));
        linha.append(SFUtil.formatToString(this.campo11ValorDeducoes));
        linha.append(SFUtil.formatToString(this.campo12ValorARecolher));
        linha.append(SFUtil.formatToString(this.campo13ValorSaldoCredorTransportar));
        linha.append(SFUtil.formatToString(this.campo14ValorExtraApuracao));
        return linha.toString();
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo02IndicadorMovimento(SFIndicadorMovimento campo02IndicadorMovimento) {
        this.campo02IndicadorMovimento = campo02IndicadorMovimento;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo03ValorSaldoCredorAnterior(BigDecimal campo03ValorSaldoCredorAnterior) {
        this.campo03ValorSaldoCredorAnterior = campo03ValorSaldoCredorAnterior;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo04ValorDebitos(BigDecimal campo04ValorDebitos) {
        this.campo04ValorDebitos = campo04ValorDebitos;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo05ValorDebitosAjuste(BigDecimal campo05ValorDebitosAjuste) {
        this.campo05ValorDebitosAjuste = campo05ValorDebitosAjuste;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo06ValorDebitosFCP(BigDecimal campo06ValorDebitosFCP) {
        this.campo06ValorDebitosFCP = campo06ValorDebitosFCP;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo07ValorCreditos(BigDecimal campo07ValorCreditos) {
        this.campo07ValorCreditos = campo07ValorCreditos;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo08ValorCreditosFCP(BigDecimal campo08ValorCreditosFCP) {
        this.campo08ValorCreditosFCP = campo08ValorCreditosFCP;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo09ValorCreditosAjuste(BigDecimal campo09ValorCreditosAjuste) {
        this.campo09ValorCreditosAjuste = campo09ValorCreditosAjuste;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo10ValorSaldoDevedorAntesDeducoes(BigDecimal campo10ValorSaldoDevedorAntesDeducoes) {
        this.campo10ValorSaldoDevedorAntesDeducoes = campo10ValorSaldoDevedorAntesDeducoes;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo11ValorDeducoes(BigDecimal campo11ValorDeducoes) {
        this.campo11ValorDeducoes = campo11ValorDeducoes;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo12ValorARecolher(BigDecimal campo12ValorARecolher) {
        this.campo12ValorARecolher = campo12ValorARecolher;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo13ValorSaldoCredorTransportar(BigDecimal campo13ValorSaldoCredorTransportar) {
        this.campo13ValorSaldoCredorTransportar = campo13ValorSaldoCredorTransportar;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo14ValorExtraApuracao(BigDecimal campo14ValorExtraApuracao) {
        this.campo14ValorExtraApuracao = campo14ValorExtraApuracao;
        return this;
    }
}
