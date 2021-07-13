package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorMovimento;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFE310ApuracaoFundoCombatePobreza implements SFLinha {

    private SFIndicadorMovimento campo02IndicadorMovimento;
    private BigDecimal campo03ValorSaldoCredorAnteriorDifal;
    private BigDecimal campo04ValorDebitosDifal;
    private BigDecimal campo05ValorOutrosDebitosDifal;
    private BigDecimal campo06ValorCreditosDifal;
    private BigDecimal campo07ValorOutrosCreditosDifal;
    private BigDecimal campo08ValorSaldoDevedorAntesDeducoesDifal;
    private BigDecimal campo09ValorDeducoesDifal;
    private BigDecimal campo10ValorRecolhidoRecolherDifal;
    private BigDecimal campo11ValorSaldoCredorTransportarDifal;
    private BigDecimal campo12ValorRecolhidoRecolherExtraApuracaoDifal;
    private BigDecimal campo13ValorSaldoCredorPeriodoAnteriorFcp;
    private BigDecimal campo14ValorTotalDebitosSaidaPrestacaoFcp;
    private BigDecimal campo15ValorAjustesOutrosDebitosFcp;
    private BigDecimal campo16ValorCreditoFcpEntradass;
    private BigDecimal campo17ValorAjustesOutrosCreditosEstornoDebitosFcp;
    private BigDecimal campo18ValorSaldoDevedorFcpAntesDeducoes;
    private BigDecimal campo19ValorDeducoesFcp;
    private BigDecimal campo20ValorRecolhidoRecolherFcp;
    private BigDecimal campo21ValorSaldoCredorTransportarFcp;
    private BigDecimal campo22ValorRecolhidoRecolherExtraApuracaoFcp;

    @Override
    public String getCampo01CodigoRegistro() {
        return "E310";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IndicadorMovimento));
        linha.append(SFUtil.formatToString(this.campo03ValorSaldoCredorAnteriorDifal));
        linha.append(SFUtil.formatToString(this.campo04ValorDebitosDifal));
        linha.append(SFUtil.formatToString(this.campo05ValorOutrosDebitosDifal));
        linha.append(SFUtil.formatToString(this.campo06ValorCreditosDifal));
        linha.append(SFUtil.formatToString(this.campo07ValorOutrosCreditosDifal));
        linha.append(SFUtil.formatToString(this.campo08ValorSaldoDevedorAntesDeducoesDifal));
        linha.append(SFUtil.formatToString(this.campo09ValorDeducoesDifal));
        linha.append(SFUtil.formatToString(this.campo10ValorRecolhidoRecolherDifal));
        linha.append(SFUtil.formatToString(this.campo11ValorSaldoCredorTransportarDifal));
        linha.append(SFUtil.formatToString(this.campo12ValorRecolhidoRecolherExtraApuracaoDifal));
        linha.append(SFUtil.formatToString(this.campo13ValorSaldoCredorPeriodoAnteriorFcp));
        linha.append(SFUtil.formatToString(this.campo14ValorTotalDebitosSaidaPrestacaoFcp));
        linha.append(SFUtil.formatToString(this.campo15ValorAjustesOutrosDebitosFcp));
        linha.append(SFUtil.formatToString(this.campo16ValorCreditoFcpEntradass));
        linha.append(SFUtil.formatToString(this.campo17ValorAjustesOutrosCreditosEstornoDebitosFcp));
        linha.append(SFUtil.formatToString(this.campo18ValorSaldoDevedorFcpAntesDeducoes));
        linha.append(SFUtil.formatToString(this.campo19ValorDeducoesFcp));
        linha.append(SFUtil.formatToString(this.campo20ValorRecolhidoRecolherFcp));
        linha.append(SFUtil.formatToString(this.campo21ValorSaldoCredorTransportarFcp));
        linha.append(SFUtil.formatToString(this.campo22ValorRecolhidoRecolherExtraApuracaoFcp));
        return linha.toString();
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo02IndicadorMovimento(SFIndicadorMovimento campo02IndicadorMovimento) {
        this.campo02IndicadorMovimento = campo02IndicadorMovimento;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo03ValorSaldoCredorAnteriorDifal(BigDecimal campo03ValorSaldoCredorAnteriorDifal) {
        this.campo03ValorSaldoCredorAnteriorDifal = campo03ValorSaldoCredorAnteriorDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo04ValorDebitosDifal(BigDecimal campo04ValorDebitosDifal) {
        this.campo04ValorDebitosDifal = campo04ValorDebitosDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo05ValorOutrosDebitosDifal(BigDecimal campo05ValorOutrosDebitosDifal) {
        this.campo05ValorOutrosDebitosDifal = campo05ValorOutrosDebitosDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo06ValorCreditosDifal(BigDecimal campo06ValorCreditosDifal) {
        this.campo06ValorCreditosDifal = campo06ValorCreditosDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo07ValorOutrosCreditosDifal(BigDecimal campo07ValorOutrosCreditosDifal) {
        this.campo07ValorOutrosCreditosDifal = campo07ValorOutrosCreditosDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo08ValorSaldoDevedorAntesDeducoesDifal(BigDecimal campo08ValorSaldoDevedorAntesDeducoesDifal) {
        this.campo08ValorSaldoDevedorAntesDeducoesDifal = campo08ValorSaldoDevedorAntesDeducoesDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo09ValorDeducoesDifal(BigDecimal campo09ValorDeducoesDifal) {
        this.campo09ValorDeducoesDifal = campo09ValorDeducoesDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo10ValorRecolhidoRecolherDifal(BigDecimal campo10ValorRecolhidoRecolherDifal) {
        this.campo10ValorRecolhidoRecolherDifal = campo10ValorRecolhidoRecolherDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo11ValorSaldoCredorTransportarDifal(BigDecimal campo11ValorSaldoCredorTransportarDifal) {
        this.campo11ValorSaldoCredorTransportarDifal = campo11ValorSaldoCredorTransportarDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo12ValorRecolhidoRecolherExtraApuracaoDifal(BigDecimal campo12ValorRecolhidoRecolherExtraApuracaoDifal) {
        this.campo12ValorRecolhidoRecolherExtraApuracaoDifal = campo12ValorRecolhidoRecolherExtraApuracaoDifal;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo13ValorSaldoCredorPeriodoAnteriorFcp(BigDecimal campo13ValorSaldoCredorPeriodoAnteriorFcp) {
        this.campo13ValorSaldoCredorPeriodoAnteriorFcp = campo13ValorSaldoCredorPeriodoAnteriorFcp;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo14ValorTotalDebitosSaidaPrestacaoFcp(BigDecimal campo14ValorTotalDebitosSaidaPrestacaoFcp) {
        this.campo14ValorTotalDebitosSaidaPrestacaoFcp = campo14ValorTotalDebitosSaidaPrestacaoFcp;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo15ValorAjustesOutrosDebitosFcp(BigDecimal campo15ValorAjustesOutrosDebitosFcp) {
        this.campo15ValorAjustesOutrosDebitosFcp = campo15ValorAjustesOutrosDebitosFcp;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo16ValorCreditoFcpEntradass(BigDecimal campo16ValorCreditoFcpEntradass) {
        this.campo16ValorCreditoFcpEntradass = campo16ValorCreditoFcpEntradass;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo17ValorAjustesOutrosCreditosEstornoDebitosFcp(BigDecimal campo17ValorAjustesOutrosCreditosEstornoDebitosFcp) {
        this.campo17ValorAjustesOutrosCreditosEstornoDebitosFcp = campo17ValorAjustesOutrosCreditosEstornoDebitosFcp;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo18ValorSaldoDevedorFcpAntesDeducoes(BigDecimal campo18ValorSaldoDevedorFcpAntesDeducoes) {
        this.campo18ValorSaldoDevedorFcpAntesDeducoes = campo18ValorSaldoDevedorFcpAntesDeducoes;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo19ValorDeducoesFcp(BigDecimal campo19ValorDeducoesFcp) {
        this.campo19ValorDeducoesFcp = campo19ValorDeducoesFcp;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo20ValorRecolhidoRecolherFcp(BigDecimal campo20ValorRecolhidoRecolherFcp) {
        this.campo20ValorRecolhidoRecolherFcp = campo20ValorRecolhidoRecolherFcp;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo21ValorSaldoCredorTransportarFcp(BigDecimal campo21ValorSaldoCredorTransportarFcp) {
        this.campo21ValorSaldoCredorTransportarFcp = campo21ValorSaldoCredorTransportarFcp;
        return this;
    }

    public SFE310ApuracaoFundoCombatePobreza setCampo22ValorRecolhidoRecolherExtraApuracaoFcp(BigDecimal campo22ValorRecolhidoRecolherExtraApuracaoFcp) {
        this.campo22ValorRecolhidoRecolherExtraApuracaoFcp = campo22ValorRecolhidoRecolherExtraApuracaoFcp;
        return this;
    }
}
