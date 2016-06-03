package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFReferencia;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFE250ObrigacoesICMS implements SFLinha {

    private String codigo, codigoReceita, numeroProcesso, descricaoProcesso, descricaoComplementarProcesso;
    private BigDecimal valor;
    private LocalDate dataVencimento;
    private SFIndicadorProcessoOrigem indicadorProcessoOrigem;
    private SFReferencia referencia;

    @Override
    public String getCodigoRegistro() {
        return "E250";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCodigoRegistro());
        linha.append(this.codigo);
        linha.append(SFUtil.formatToString(this.valor));
        linha.append(SFUtil.formatToString(this.dataVencimento));
        linha.append(this.codigoReceita);
        linha.append(this.numeroProcesso);
        linha.append(SFUtil.formatToString(this.indicadorProcessoOrigem));
        linha.append(this.descricaoProcesso);
        linha.append(this.descricaoComplementarProcesso);
        linha.append(SFUtil.formatToString(this.referencia));
        return linha.toString();
    }

    public SFE250ObrigacoesICMS setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SFE250ObrigacoesICMS setCodigoReceita(String codigoReceita) {
        this.codigoReceita = codigoReceita;
        return this;
    }

    public SFE250ObrigacoesICMS setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
        return this;
    }

    public SFE250ObrigacoesICMS setDescricaoComplementarProcesso(String descricaoComplementarProcesso) {
        this.descricaoComplementarProcesso = descricaoComplementarProcesso;
        return this;
    }

    public SFE250ObrigacoesICMS setDescricaoProcesso(String descricaoProcesso) {
        this.descricaoProcesso = descricaoProcesso;
        return this;
    }

    public SFE250ObrigacoesICMS setIndicadorProcessoOrigem(SFIndicadorProcessoOrigem indicadorProcessoOrigem) {
        this.indicadorProcessoOrigem = indicadorProcessoOrigem;
        return this;
    }

    public SFE250ObrigacoesICMS setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
        return this;
    }

    public SFE250ObrigacoesICMS setReferencia(SFReferencia referencia) {
        this.referencia = referencia;
        return this;
    }

    public SFE250ObrigacoesICMS setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }
}
