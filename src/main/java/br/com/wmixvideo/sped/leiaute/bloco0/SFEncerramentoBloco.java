package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFEncerramentoBloco implements SFLinha {
    private final int totalLinhas;
    private final String codigoRegistro;

    public SFEncerramentoBloco(final String codigoRegistro, final int totalLinhas) {
        this.totalLinhas = totalLinhas;
        this.codigoRegistro = codigoRegistro;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.codigoRegistro);
        texto.append(this.totalLinhas);
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return this.codigoRegistro;
    }
}