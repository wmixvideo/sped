package br.com.wmixvideo.sped.leiaute;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimentoAberturaBloco;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFAberturaBloco implements SFLinha {
    private final SFIndicadorMovimentoAberturaBloco indicadorMovimento;
    private final String codigoRegistro;

    public SFAberturaBloco(final String codigoRegistro, final SFIndicadorMovimentoAberturaBloco indicadorMovimento) {
        this.indicadorMovimento = indicadorMovimento;
        this.codigoRegistro = codigoRegistro;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.indicadorMovimento.getCodigo());
        return texto.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return this.codigoRegistro;
    }
}