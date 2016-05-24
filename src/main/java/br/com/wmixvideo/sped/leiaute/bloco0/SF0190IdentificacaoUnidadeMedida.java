package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFUnidadeMedida;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0190IdentificacaoUnidadeMedida implements SFRegistro {

    private final SFUnidadeMedida unidadeMedida;

    public SF0190IdentificacaoUnidadeMedida(final SFUnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.unidadeMedida.getCodigo());
        texto.append(this.unidadeMedida.getDescricao());
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "0190";
    }
}