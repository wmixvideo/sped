package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFReferencia;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFE316ObrigacoesFundoCombatePobreza implements SFLinha {

    private String codigo, codigoReceita, numeroProcesso, descricaoResumida, descricaoComplementar;
    private BigDecimal valor;
    private LocalDate dataVencimento;
    private SFIndicadorProcessoOrigem indicadorProcessoOrigem;
    private SFReferencia referencia;

    @Override
    public String getCodigoRegistro() {
        return "E316";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.codigo);
        texto.append(SFUtil.formatToString(this.valor));
        texto.append(SFUtil.formatToString(this.dataVencimento));
        texto.append(this.codigoReceita);
        texto.append(this.numeroProcesso);
        texto.append(SFUtil.formatToString(this.indicadorProcessoOrigem));
        texto.append(this.descricaoResumida);
        texto.append(this.descricaoComplementar);
        texto.append(SFUtil.formatToString(this.referencia));
        return texto.toString();
    }

    public SFE316ObrigacoesFundoCombatePobreza setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setCodigoReceita(String codigoReceita) {
        this.codigoReceita = codigoReceita;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setDescricaoComplementar(String descricaoComplementar) {
        this.descricaoComplementar = descricaoComplementar;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setDescricaoResumida(String descricaoResumida) {
        this.descricaoResumida = descricaoResumida;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setIndicadorProcessoOrigem(SFIndicadorProcessoOrigem indicadorProcessoOrigem) {
        this.indicadorProcessoOrigem = indicadorProcessoOrigem;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setReferencia(SFReferencia referencia) {
        this.referencia = referencia;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }
}
