package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFReferencia;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFE250ObrigacoesICMS implements SFLinha {

    private String campo02Codigo, campo05CodigoReceita, campo06NumeroProcesso, campo08DescricaoProcesso, campo09DescricaoComplementarProcesso;
    private BigDecimal campo03Valor;
    private LocalDate campo04DataVencimento;
    private SFIndicadorProcessoOrigem campo07IndicadorProcessoOrigem;
    private SFReferencia campo10Referencia;

    @Override
    public String getCampo01CodigoRegistro() {
        return "E250";
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
        linha.append(this.campo08DescricaoProcesso);
        linha.append(this.campo09DescricaoComplementarProcesso);
        linha.append(SFUtil.formatToString(this.campo10Referencia));
        return linha.toString();
    }

    public SFE250ObrigacoesICMS setCampo02Codigo(String campo02Codigo) {
        this.campo02Codigo = campo02Codigo;
        return this;
    }

    public SFE250ObrigacoesICMS setCampo05CodigoReceita(String campo05CodigoReceita) {
        this.campo05CodigoReceita = campo05CodigoReceita;
        return this;
    }

    public SFE250ObrigacoesICMS setCampo04DataVencimento(LocalDate campo04DataVencimento) {
        this.campo04DataVencimento = campo04DataVencimento;
        return this;
    }

    public SFE250ObrigacoesICMS setCampo09DescricaoComplementarProcesso(String campo09DescricaoComplementarProcesso) {
        this.campo09DescricaoComplementarProcesso = campo09DescricaoComplementarProcesso;
        return this;
    }

    public SFE250ObrigacoesICMS setCampo08DescricaoProcesso(String campo08DescricaoProcesso) {
        this.campo08DescricaoProcesso = campo08DescricaoProcesso;
        return this;
    }

    public SFE250ObrigacoesICMS setCampo07IndicadorProcessoOrigem(SFIndicadorProcessoOrigem campo07IndicadorProcessoOrigem) {
        this.campo07IndicadorProcessoOrigem = campo07IndicadorProcessoOrigem;
        return this;
    }

    public SFE250ObrigacoesICMS setCampo06NumeroProcesso(String campo06NumeroProcesso) {
        this.campo06NumeroProcesso = campo06NumeroProcesso;
        return this;
    }

    public SFE250ObrigacoesICMS setCampo10Referencia(SFReferencia campo10Referencia) {
        this.campo10Referencia = campo10Referencia;
        return this;
    }

    public SFE250ObrigacoesICMS setCampo03Valor(BigDecimal campo03Valor) {
        this.campo03Valor = campo03Valor;
        return this;
    }
}
