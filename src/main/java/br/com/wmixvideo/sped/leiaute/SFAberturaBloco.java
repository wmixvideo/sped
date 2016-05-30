package br.com.wmixvideo.sped.leiaute;

import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFAberturaBloco implements SFLinha {
    private final SFIndicadorMovimento indicadorMovimento;
    private final String codigoRegistro;

    public SFAberturaBloco(final String codigoRegistro, final SFIndicadorMovimento indicadorMovimento) {
        this.indicadorMovimento = indicadorMovimento;
        this.codigoRegistro = codigoRegistro;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.indicadorMovimento.getCodigo());
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return this.codigoRegistro;
    }
}