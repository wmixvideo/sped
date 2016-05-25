package br.com.wmixvideo.sped.leiaute.blocoC;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFNotaFiscal;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC101NotaFiscalInformacaoComplementar implements SFRegistro {

    private final SFNotaFiscal nota;

    public SFC101NotaFiscalInformacaoComplementar(final SFNotaFiscal nota) {
        this.nota = nota;
    }

    @Override
    public String getCodigoRegistro() {
        return "C101";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(SFUtil.formatToString(this.nota.getValorIcmsPartilhaDestinoFundoCombatePobreza()));
        texto.append(SFUtil.formatToString(this.nota.getValorIcmsPartilhaDestino()));
        texto.append(SFUtil.formatToString(this.nota.getValorIcmsPartilhaOrigem()));
        return texto.toString();
    }
}