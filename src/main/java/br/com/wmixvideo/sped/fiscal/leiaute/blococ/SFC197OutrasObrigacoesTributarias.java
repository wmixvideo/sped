package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import java.math.BigDecimal;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC197OutrasObrigacoesTributarias implements SFLinha {

    protected String campo02Codigo, campo03Descricao, campo04CodigoItem;
    protected BigDecimal campo05BaseCalculo, campo06Aliquota, campo07Valor, campo08Outros;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C197";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Codigo);
        linha.append(this.campo03Descricao);
        linha.append(this.campo04CodigoItem);
        linha.append(SFUtil.formatToString(this.campo05BaseCalculo));
        linha.append(SFUtil.formatToString(this.campo06Aliquota));
        linha.append(SFUtil.formatToString(this.campo07Valor));
        linha.append(SFUtil.formatToString(this.campo08Outros));
        return linha.toString();
    }

    public SFC197OutrasObrigacoesTributarias setCampo06Aliquota(final BigDecimal campo06Aliquota) {
        this.campo06Aliquota = campo06Aliquota;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setCampo05BaseCalculo(final BigDecimal campo05BaseCalculo) {
        this.campo05BaseCalculo = campo05BaseCalculo;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setCampo02Codigo(final String campo02Codigo) {
        this.campo02Codigo = campo02Codigo;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setCampo04CodigoItem(final String campo04CodigoItem) {
        this.campo04CodigoItem = campo04CodigoItem;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setCampo03Descricao(final String campo03Descricao) {
        this.campo03Descricao = campo03Descricao;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setCampo08Outros(final BigDecimal campo08Outros) {
        this.campo08Outros = campo08Outros;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setCampo07Valor(final BigDecimal campo07Valor) {
        this.campo07Valor = campo07Valor;
        return this;
    }
}
