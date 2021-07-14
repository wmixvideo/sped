package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SC0111ReceitaBrutaMensalRateioCreditosComuns implements SFLinha {

    private BigDecimal campo02ReceitaBrutaNaoCumulativaTributadaMercadoInterno;
    private BigDecimal campo03ReceitaBrutaNaoCumulativaNaoTributadaMercadoInterno;
    private BigDecimal campo04ReceitaBrutaNaoCumulativaExportacao;
    private BigDecimal campo05ReceitaBrutaCumulativa;
    private BigDecimal campo06ReceitaBrutaTotal;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02ReceitaBrutaNaoCumulativaTributadaMercadoInterno));
        linha.append(SFUtil.formatToString(this.campo03ReceitaBrutaNaoCumulativaNaoTributadaMercadoInterno));
        linha.append(SFUtil.formatToString(this.campo04ReceitaBrutaNaoCumulativaExportacao));
        linha.append(SFUtil.formatToString(this.campo05ReceitaBrutaCumulativa));
        linha.append(SFUtil.formatToString(this.campo06ReceitaBrutaTotal));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0111";
    }

    public SC0111ReceitaBrutaMensalRateioCreditosComuns setCampo02ReceitaBrutaNaoCumulativaTributadaMercadoInterno(BigDecimal campo02ReceitaBrutaNaoCumulativaTributadaMercadoInterno) {
        this.campo02ReceitaBrutaNaoCumulativaTributadaMercadoInterno = campo02ReceitaBrutaNaoCumulativaTributadaMercadoInterno;
        return this;
    }

    public SC0111ReceitaBrutaMensalRateioCreditosComuns setCampo03ReceitaBrutaNaoCumulativaNaoTributadaMercadoInterno(BigDecimal campo03ReceitaBrutaNaoCumulativaNaoTributadaMercadoInterno) {
        this.campo03ReceitaBrutaNaoCumulativaNaoTributadaMercadoInterno = campo03ReceitaBrutaNaoCumulativaNaoTributadaMercadoInterno;
        return this;
    }

    public SC0111ReceitaBrutaMensalRateioCreditosComuns setCampo04ReceitaBrutaNaoCumulativaExportacao(BigDecimal campo04ReceitaBrutaNaoCumulativaExportacao) {
        this.campo04ReceitaBrutaNaoCumulativaExportacao = campo04ReceitaBrutaNaoCumulativaExportacao;
        return this;
    }

    public SC0111ReceitaBrutaMensalRateioCreditosComuns setCampo05ReceitaBrutaCumulativa(BigDecimal campo05ReceitaBrutaCumulativa) {
        this.campo05ReceitaBrutaCumulativa = campo05ReceitaBrutaCumulativa;
        return this;
    }

    public SC0111ReceitaBrutaMensalRateioCreditosComuns setCampo06ReceitaBrutaTotal(BigDecimal campo06ReceitaBrutaTotal) {
        this.campo06ReceitaBrutaTotal = campo06ReceitaBrutaTotal;
        return this;
    }
}