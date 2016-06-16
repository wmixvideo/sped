package br.com.wmixvideo.sped.leiaute;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimentoAberturaBloco;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFAberturaBloco implements SFLinha {

    private String campo01CodigoRegistro;
    private SFIndicadorMovimentoAberturaBloco campo02IndicadorMovimento;

    public SFAberturaBloco(String campo01CodigoRegistro, SFIndicadorMovimentoAberturaBloco campo02IndicadorMovimento) {
        this.campo01CodigoRegistro = campo01CodigoRegistro;
        this.campo02IndicadorMovimento = campo02IndicadorMovimento;
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IndicadorMovimento));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return this.campo01CodigoRegistro;
    }
}