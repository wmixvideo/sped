package br.com.wmixvideo.sped.leiaute.blocoa;

import java.math.BigDecimal;

import br.com.wmixvideo.sped.enums.SFIndicadorOrigemCredito;
import br.com.wmixvideo.sped.enums.SFNaturezaBaseCalculoCredito;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFA170ItemDocumento implements SFLinha {

    private int campo02NumeroItem;
    private String campo03CodigoItem;
    private String campo04DescricaoComplementar;
    private BigDecimal campo05ValorTotalItem;
    private BigDecimal campo06ValorDesconto;
    private SFNaturezaBaseCalculoCredito campo07NaturezaBCCredito;
    private SFIndicadorOrigemCredito campo08IndicadorOrigemCredito;
    private String campo09CodigoStPis;
    private BigDecimal campo10ValorBaseCalculoPis;
    private BigDecimal campo11AliquotaPis;
    private BigDecimal campo12ValorPis;
    private String campo13CodigoStCofins;
    private BigDecimal campo14ValorBaseCalculoCofins;
    private BigDecimal campo15AliquotaCofins;
    private BigDecimal campo16ValorCofins;
    private String campo17CodigoContaAnalitica;
    private String campo18CodigoCentroCusto;

    @Override
    public String getCampo01CodigoRegistro() {
        return "A170";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02NumeroItem);
        linha.append(this.campo03CodigoItem);
        linha.append(this.campo04DescricaoComplementar);
        linha.append(SFUtil.formatToString(this.campo05ValorTotalItem));
        linha.append(SFUtil.formatToString(this.campo06ValorDesconto));
        linha.append(SFUtil.formatToString(this.campo07NaturezaBCCredito));
        linha.append(SFUtil.formatToString(this.campo08IndicadorOrigemCredito));
        linha.append(this.campo09CodigoStPis);
        linha.append(SFUtil.formatToString(this.campo10ValorBaseCalculoPis));
        linha.append(SFUtil.formatToString(this.campo11AliquotaPis));
        linha.append(SFUtil.formatToString(this.campo12ValorPis));
        linha.append(this.campo13CodigoStCofins);
        linha.append(SFUtil.formatToString(this.campo14ValorBaseCalculoCofins));
        linha.append(SFUtil.formatToString(this.campo15AliquotaCofins));
        linha.append(SFUtil.formatToString(this.campo16ValorCofins));
        linha.append(this.campo17CodigoContaAnalitica);
        linha.append(this.campo18CodigoCentroCusto);
        return linha.toString();
    }

    public SFA170ItemDocumento setCampo02NumeroItem(final int campo02NumeroItem) {
        this.campo02NumeroItem = campo02NumeroItem;
        return this;
    }

    public SFA170ItemDocumento setCampo03CodigoItem(final String campo03CodigoItem) {
        this.campo03CodigoItem = campo03CodigoItem;
        return this;
    }

    public SFA170ItemDocumento setCampo04DescricaoComplementar(final String campo04DescricaoComplementar) {
        this.campo04DescricaoComplementar = campo04DescricaoComplementar;
        return this;
    }

    public SFA170ItemDocumento setCampo05ValorTotalItem(final BigDecimal campo05ValorTotalItem) {
        this.campo05ValorTotalItem = campo05ValorTotalItem;
        return this;
    }

    public SFA170ItemDocumento setCampo06ValorDesconto(final BigDecimal campo06ValorDesconto) {
        this.campo06ValorDesconto = campo06ValorDesconto;
        return this;
    }

    public SFA170ItemDocumento setCampo07NaturezaBCCredito(final SFNaturezaBaseCalculoCredito campo07NaturezaBCCredito) {
        this.campo07NaturezaBCCredito = campo07NaturezaBCCredito;
        return this;
    }

    public SFA170ItemDocumento setCampo08IndicadorOrigemCredito(final SFIndicadorOrigemCredito campo08IndicadorOrigemCredito) {
        this.campo08IndicadorOrigemCredito = campo08IndicadorOrigemCredito;
        return this;
    }

    public SFA170ItemDocumento setCampo09CodigoStPis(final String campo09CodigoStPis) {
        this.campo09CodigoStPis = campo09CodigoStPis;
        return this;
    }

    public SFA170ItemDocumento setCampo10ValorBaseCalculoPis(final BigDecimal campo10ValorBaseCalculoPis) {
        this.campo10ValorBaseCalculoPis = campo10ValorBaseCalculoPis;
        return this;
    }

    public SFA170ItemDocumento setCampo11AliquotaPis(final BigDecimal campo11AliquotaPis) {
        this.campo11AliquotaPis = campo11AliquotaPis;
        return this;
    }

    public SFA170ItemDocumento setCampo12ValorPis(final BigDecimal campo12ValorPis) {
        this.campo12ValorPis = campo12ValorPis;
        return this;
    }

    public SFA170ItemDocumento setCampo13CodigoStCofins(final String campo13CodigoStCofins) {
        this.campo13CodigoStCofins = campo13CodigoStCofins;
        return this;
    }

    public SFA170ItemDocumento setCampo14ValorBaseCalculoCofins(final BigDecimal campo14ValorBaseCalculoCofins) {
        this.campo14ValorBaseCalculoCofins = campo14ValorBaseCalculoCofins;
        return this;
    }

    public SFA170ItemDocumento setCampo15AliquotaCofins(final BigDecimal campo15AliquotaCofins) {
        this.campo15AliquotaCofins = campo15AliquotaCofins;
        return this;
    }

    public SFA170ItemDocumento setCampo16ValorCofins(final BigDecimal campo16ValorCofins) {
        this.campo16ValorCofins = campo16ValorCofins;
        return this;
    }

    public SFA170ItemDocumento setCampo17CodigoContaAnalitica(final String campo17CodigoContaAnalitica) {
        this.campo17CodigoContaAnalitica = campo17CodigoContaAnalitica;
        return this;
    }

    public SFA170ItemDocumento setCampo18CodigoCentroCusto(final String campo18CodigoCentroCusto) {
        this.campo18CodigoCentroCusto = campo18CodigoCentroCusto;
        return this;
    }
}