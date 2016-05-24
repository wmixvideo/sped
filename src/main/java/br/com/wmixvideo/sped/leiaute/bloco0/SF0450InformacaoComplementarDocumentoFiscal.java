package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import org.apache.commons.lang3.StringUtils;

public class SF0450InformacaoComplementarDocumentoFiscal implements SFRegistro {
    private int contador;
    private String observacao;

    public SF0450InformacaoComplementarDocumentoFiscal(final int contador, final String observacao) {
        this.contador = contador;
        this.observacao = observacao;
    }

    @Override
    public String getCodigoRegistro() {
        return "0450";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(StringUtils.leftPad(String.valueOf(this.contador), 6, "0"));
        texto.append(this.observacao);

        return texto.toString();
    }
}