package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC111ProcessoReferenciado implements SFLinha {

    private String campo02Numero;
    private SFIndicadorProcessoOrigem campo03IndicadorOrigem;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C111";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Numero);
        linha.append(SFUtil.formatToString(this.campo03IndicadorOrigem));
        return linha.toString();
    }

    public SFC111ProcessoReferenciado setCampo03IndicadorOrigem(SFIndicadorProcessoOrigem campo03IndicadorOrigem) {
        this.campo03IndicadorOrigem = campo03IndicadorOrigem;
        return this;
    }

    public SFC111ProcessoReferenciado setCampo02Numero(String campo02Numero) {
        this.campo02Numero = campo02Numero;
        return this;
    }
}
