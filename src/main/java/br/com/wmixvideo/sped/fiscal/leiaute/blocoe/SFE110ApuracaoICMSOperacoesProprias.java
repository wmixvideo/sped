package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFE110ApuracaoICMSOperacoesProprias implements SFLinha {

    private BigDecimal campo02ValorTotalDebitos;
    private BigDecimal campo03ValorAjusteDebitos;
    private BigDecimal campo04ValorTotalAjusteDebitos;
    private BigDecimal campo05ValorEstornoCreditos;
    private BigDecimal campo06ValorTotalCreditos;
    private BigDecimal campo07ValorAjusteCreditos;
    private BigDecimal campo08ValorTotalAjusteCreditos;
    private BigDecimal campo09ValorEstornosDebito;
    private BigDecimal campo10ValorSaldoCredorAnterior;
    private BigDecimal campo11ValorSaldoApurado;
    private BigDecimal campo12ValorTotalDeducoes;
    private BigDecimal campo13ValorIcmsRecolher;
    private BigDecimal campo14ValorSaldoCredorTransportar;
    private BigDecimal campo15ValorExtraApuracao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "E110";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02ValorTotalDebitos));
        linha.append(SFUtil.formatToString(this.campo03ValorAjusteDebitos));
        linha.append(SFUtil.formatToString(this.campo04ValorTotalAjusteDebitos));
        linha.append(SFUtil.formatToString(this.campo05ValorEstornoCreditos));
        linha.append(SFUtil.formatToString(this.campo06ValorTotalCreditos));
        linha.append(SFUtil.formatToString(this.campo07ValorAjusteCreditos));
        linha.append(SFUtil.formatToString(this.campo08ValorTotalAjusteCreditos));
        linha.append(SFUtil.formatToString(this.campo09ValorEstornosDebito));
        linha.append(SFUtil.formatToString(this.campo10ValorSaldoCredorAnterior));
        linha.append(SFUtil.formatToString(this.campo11ValorSaldoApurado));
        linha.append(SFUtil.formatToString(this.campo12ValorTotalDeducoes));
        linha.append(SFUtil.formatToString(this.campo13ValorIcmsRecolher));
        linha.append(SFUtil.formatToString(this.campo14ValorSaldoCredorTransportar));
        linha.append(SFUtil.formatToString(this.campo15ValorExtraApuracao));
        return linha.toString();
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo02ValorTotalDebitos(BigDecimal campo02ValorTotalDebitos) {
        this.campo02ValorTotalDebitos = campo02ValorTotalDebitos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo03ValorAjusteDebitos(BigDecimal campo03ValorAjusteDebitos) {
        this.campo03ValorAjusteDebitos = campo03ValorAjusteDebitos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo04ValorTotalAjusteDebitos(BigDecimal campo04ValorTotalAjusteDebitos) {
        this.campo04ValorTotalAjusteDebitos = campo04ValorTotalAjusteDebitos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo05ValorEstornoCreditos(BigDecimal campo05ValorEstornoCreditos) {
        this.campo05ValorEstornoCreditos = campo05ValorEstornoCreditos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo06ValorTotalCreditos(BigDecimal campo06ValorTotalCreditos) {
        this.campo06ValorTotalCreditos = campo06ValorTotalCreditos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo07ValorAjusteCreditos(BigDecimal campo07ValorAjusteCreditos) {
        this.campo07ValorAjusteCreditos = campo07ValorAjusteCreditos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo08ValorTotalAjusteCreditos(BigDecimal campo08ValorTotalAjusteCreditos) {
        this.campo08ValorTotalAjusteCreditos = campo08ValorTotalAjusteCreditos;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo09ValorEstornosDebito(BigDecimal campo09ValorEstornosDebito) {
        this.campo09ValorEstornosDebito = campo09ValorEstornosDebito;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo10ValorSaldoCredorAnterior(BigDecimal campo10ValorSaldoCredorAnterior) {
        this.campo10ValorSaldoCredorAnterior = campo10ValorSaldoCredorAnterior;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo11ValorSaldoApurado(BigDecimal campo11ValorSaldoApurado) {
        this.campo11ValorSaldoApurado = campo11ValorSaldoApurado;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo12ValorTotalDeducoes(BigDecimal campo12ValorTotalDeducoes) {
        this.campo12ValorTotalDeducoes = campo12ValorTotalDeducoes;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo13ValorIcmsRecolher(BigDecimal campo13ValorIcmsRecolher) {
        this.campo13ValorIcmsRecolher = campo13ValorIcmsRecolher;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo14ValorSaldoCredorTransportar(BigDecimal campo14ValorSaldoCredorTransportar) {
        this.campo14ValorSaldoCredorTransportar = campo14ValorSaldoCredorTransportar;
        return this;
    }

    public SFE110ApuracaoICMSOperacoesProprias setCampo15ValorExtraApuracao(BigDecimal campo15ValorExtraApuracao) {
        this.campo15ValorExtraApuracao = campo15ValorExtraApuracao;
        return this;
    }
}
