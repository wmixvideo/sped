package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFC197OutrasObrigacoesTributarias implements SFLinha {

    private String codigo, descricao, codigoItem;
    private BigDecimal baseCalculo, aliquota, valor, outros;

    @Override
    public String getCodigoRegistro() {
        return "C197";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCodigoRegistro());
        linha.append(this.codigo);
        linha.append(this.descricao);
        linha.append(this.codigoItem);
        linha.append(SFUtil.formatToString(this.baseCalculo));
        linha.append(SFUtil.formatToString(this.aliquota));
        linha.append(SFUtil.formatToString(this.valor));
        linha.append(SFUtil.formatToString(this.outros));
        return linha.toString();
    }

    public SFC197OutrasObrigacoesTributarias setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setBaseCalculo(BigDecimal baseCalculo) {
        this.baseCalculo = baseCalculo;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setOutros(BigDecimal outros) {
        this.outros = outros;
        return this;
    }

    public SFC197OutrasObrigacoesTributarias setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }
}
