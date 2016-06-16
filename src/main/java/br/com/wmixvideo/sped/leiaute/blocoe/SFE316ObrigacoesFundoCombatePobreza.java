package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFReferencia;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFE316ObrigacoesFundoCombatePobreza implements SFLinha {

    private String campo02Codigo, campo05CodigoReceita, campo06NumeroProcesso, campo08DescricaoResumida, campo09DescricaoComplementar;
    private BigDecimal campo03Valor;
    private LocalDate campo04DataVencimento;
    private SFIndicadorProcessoOrigem campo07IndicadorProcessoOrigem;
    private SFReferencia campo10Referencia;

    @Override
    public String getCampo01CodigoRegistro() {
        return "E316";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Codigo);
        linha.append(SFUtil.formatToString(this.campo03Valor));
        linha.append(SFUtil.formatToString(this.campo04DataVencimento));
        linha.append(this.campo05CodigoReceita);
        linha.append(this.campo06NumeroProcesso);
        linha.append(SFUtil.formatToString(this.campo07IndicadorProcessoOrigem));
        linha.append(this.campo08DescricaoResumida);
        linha.append(this.campo09DescricaoComplementar);
        linha.append(SFUtil.formatToString(this.campo10Referencia));
        return linha.toString();
    }

    public SFE316ObrigacoesFundoCombatePobreza setCampo02Codigo(String campo02Codigo) {
        this.campo02Codigo = campo02Codigo;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setCampo05CodigoReceita(String campo05CodigoReceita) {
        this.campo05CodigoReceita = campo05CodigoReceita;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setCampo04DataVencimento(LocalDate campo04DataVencimento) {
        this.campo04DataVencimento = campo04DataVencimento;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setCampo09DescricaoComplementar(String campo09DescricaoComplementar) {
        this.campo09DescricaoComplementar = campo09DescricaoComplementar;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setCampo08DescricaoResumida(String campo08DescricaoResumida) {
        this.campo08DescricaoResumida = campo08DescricaoResumida;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setCampo07IndicadorProcessoOrigem(SFIndicadorProcessoOrigem campo07IndicadorProcessoOrigem) {
        this.campo07IndicadorProcessoOrigem = campo07IndicadorProcessoOrigem;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setCampo06NumeroProcesso(String campo06NumeroProcesso) {
        this.campo06NumeroProcesso = campo06NumeroProcesso;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setCampo10Referencia(SFReferencia campo10Referencia) {
        this.campo10Referencia = campo10Referencia;
        return this;
    }

    public SFE316ObrigacoesFundoCombatePobreza setCampo03Valor(BigDecimal campo03Valor) {
        this.campo03Valor = campo03Valor;
        return this;
    }
}
