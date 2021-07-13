package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorMovimento;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SC0001AberturaBloco0 implements SFLinha {

    private SCIndicadorMovimento campo02IndicadorMovimento;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02IndicadorMovimento));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0001";
    }

    public SC0001AberturaBloco0 setCampo02IndicadorMovimento(SCIndicadorMovimento campo02IndicadorMovimento) {
        this.campo02IndicadorMovimento = campo02IndicadorMovimento;
        return this;
    }
}