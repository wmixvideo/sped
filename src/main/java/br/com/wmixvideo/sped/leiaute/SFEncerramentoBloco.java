package br.com.wmixvideo.sped.leiaute;

import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFEncerramentoBloco implements SFLinha {

    private String campo01CodigoRegistro;
    private int campo02TotalLinhas;

    public SFEncerramentoBloco(String campo01CodigoRegistro, int campo02TotalLinhas) {
        this.campo01CodigoRegistro = campo01CodigoRegistro;
        this.campo02TotalLinhas = campo02TotalLinhas;
    }

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
}