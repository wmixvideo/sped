package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC111ProcessoReferenciado implements SFLinha {

    private String numero;
    private SFIndicadorProcessoOrigem indicadorOrigem;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C111";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.numero);
        linha.append(SFUtil.formatToString(this.indicadorOrigem));
        return linha.toString();
    }

    public SFC111ProcessoReferenciado setIndicadorOrigem(SFIndicadorProcessoOrigem indicadorOrigem) {
        this.indicadorOrigem = indicadorOrigem;
        return this;
    }

    public SFC111ProcessoReferenciado setNumero(String numero) {
        this.numero = numero;
        return this;
    }
}
