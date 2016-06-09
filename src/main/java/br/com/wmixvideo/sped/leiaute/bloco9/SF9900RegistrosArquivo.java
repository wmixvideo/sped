package br.com.wmixvideo.sped.leiaute.bloco9;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF9900RegistrosArquivo implements SFLinha {

    private String codigo;
    private int totalLinhas;

    public SF9900RegistrosArquivo(final String codigo, final int totalLinhas) {
        this.codigo = codigo;
        this.totalLinhas = totalLinhas;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.codigo);
        texto.append(this.totalLinhas);
        return texto.toString();
    }

    public String getCampo01CodigoRegistro() {
        return "9900";
    }
}
