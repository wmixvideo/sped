package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFEncerramentoBloco implements SFLinha {

    private String campo01CodigoRegistro;
    private int campo02TotalLinhas;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.campo01CodigoRegistro);
        linha.append(this.campo02TotalLinhas);
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return this.campo01CodigoRegistro;
    }

    public SFEncerramentoBloco setCampo01CodigoRegistro(String campo01CodigoRegistro) {
        this.campo01CodigoRegistro = campo01CodigoRegistro;
        return this;
    }

    public SFEncerramentoBloco setCampo02TotalLinhas(int campo02TotalLinhas) {
        this.campo02TotalLinhas = campo02TotalLinhas;
        return this;
    }
}