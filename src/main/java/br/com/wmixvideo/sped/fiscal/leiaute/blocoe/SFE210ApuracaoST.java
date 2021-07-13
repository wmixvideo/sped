package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorMovimento;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFE210ApuracaoST implements SFLinha {

    private SFIndicadorMovimento campo02IndicadorMovimento;
    private BigDecimal campo03ValorSaldoCredorAnterior;
    private BigDecimal campo04ValorDevolucao;
    private BigDecimal campo05ValorRessarcimento;
    private BigDecimal campo06ValorOutrosCreditos;
    private BigDecimal campo07ValorAjusteCreditos;
    private BigDecimal campo08ValorRetencao;
    private BigDecimal campo09ValorOutrosDebitos;
    private BigDecimal campo10ValorAjusteDebitos;
    private BigDecimal campo11ValorSaldoDevedorAntesDeducoes;
    private BigDecimal campo12ValorDeducoes;
    private BigDecimal campo13ValorARecolher;
    private BigDecimal campo14ValorSaldoCredorTransportar;
    private BigDecimal campo15ValorExtraApuracao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "E210";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IndicadorMovimento));
        linha.append(SFUtil.formatToString(this.campo03ValorSaldoCredorAnterior));
        linha.append(SFUtil.formatToString(this.campo04ValorDevolucao));
        linha.append(SFUtil.formatToString(this.campo05ValorRessarcimento));
        linha.append(SFUtil.formatToString(this.campo06ValorOutrosCreditos));
        linha.append(SFUtil.formatToString(this.campo07ValorAjusteCreditos));
        linha.append(SFUtil.formatToString(this.campo08ValorRetencao));
        linha.append(SFUtil.formatToString(this.campo09ValorOutrosDebitos));
        linha.append(SFUtil.formatToString(this.campo10ValorAjusteDebitos));
        linha.append(SFUtil.formatToString(this.campo11ValorSaldoDevedorAntesDeducoes));
        linha.append(SFUtil.formatToString(this.campo12ValorDeducoes));
        linha.append(SFUtil.formatToString(this.campo13ValorARecolher));
        linha.append(SFUtil.formatToString(this.campo14ValorSaldoCredorTransportar));
        linha.append(SFUtil.formatToString(this.campo15ValorExtraApuracao));
        return linha.toString();
    }

    public SFE210ApuracaoST setCampo02IndicadorMovimento(SFIndicadorMovimento campo02IndicadorMovimento) {
        this.campo02IndicadorMovimento = campo02IndicadorMovimento;
        return this;
    }

    public SFE210ApuracaoST setCampo07ValorAjusteCreditos(BigDecimal campo07ValorAjusteCreditos) {
        this.campo07ValorAjusteCreditos = campo07ValorAjusteCreditos;
        return this;
    }

    public SFE210ApuracaoST setCampo10ValorAjusteDebitos(BigDecimal campo10ValorAjusteDebitos) {
        this.campo10ValorAjusteDebitos = campo10ValorAjusteDebitos;
        return this;
    }

    public SFE210ApuracaoST setCampo13ValorARecolher(BigDecimal campo13ValorARecolher) {
        this.campo13ValorARecolher = campo13ValorARecolher;
        return this;
    }

    public SFE210ApuracaoST setCampo12ValorDeducoes(BigDecimal campo12ValorDeducoes) {
        this.campo12ValorDeducoes = campo12ValorDeducoes;
        return this;
    }

    public SFE210ApuracaoST setCampo04ValorDevolucao(BigDecimal campo04ValorDevolucao) {
        this.campo04ValorDevolucao = campo04ValorDevolucao;
        return this;
    }

    public SFE210ApuracaoST setCampo15ValorExtraApuracao(BigDecimal campo15ValorExtraApuracao) {
        this.campo15ValorExtraApuracao = campo15ValorExtraApuracao;
        return this;
    }

    public SFE210ApuracaoST setCampo06ValorOutrosCreditos(BigDecimal campo06ValorOutrosCreditos) {
        this.campo06ValorOutrosCreditos = campo06ValorOutrosCreditos;
        return this;
    }

    public SFE210ApuracaoST setCampo09ValorOutrosDebitos(BigDecimal campo09ValorOutrosDebitos) {
        this.campo09ValorOutrosDebitos = campo09ValorOutrosDebitos;
        return this;
    }

    public SFE210ApuracaoST setCampo05ValorRessarcimento(BigDecimal campo05ValorRessarcimento) {
        this.campo05ValorRessarcimento = campo05ValorRessarcimento;
        return this;
    }

    public SFE210ApuracaoST setCampo08ValorRetencao(BigDecimal campo08ValorRetencao) {
        this.campo08ValorRetencao = campo08ValorRetencao;
        return this;
    }

    public SFE210ApuracaoST setCampo03ValorSaldoCredorAnterior(BigDecimal campo03ValorSaldoCredorAnterior) {
        this.campo03ValorSaldoCredorAnterior = campo03ValorSaldoCredorAnterior;
        return this;
    }

    public SFE210ApuracaoST setCampo14ValorSaldoCredorTransportar(BigDecimal campo14ValorSaldoCredorTransportar) {
        this.campo14ValorSaldoCredorTransportar = campo14ValorSaldoCredorTransportar;
        return this;
    }

    public SFE210ApuracaoST setCampo11ValorSaldoDevedorAntesDeducoes(BigDecimal campo11ValorSaldoDevedorAntesDeducoes) {
        this.campo11ValorSaldoDevedorAntesDeducoes = campo11ValorSaldoDevedorAntesDeducoes;
        return this;
    }
}
