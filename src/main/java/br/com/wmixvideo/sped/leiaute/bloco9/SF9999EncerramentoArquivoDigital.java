package br.com.wmixvideo.sped.leiaute.bloco9;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF9999EncerramentoArquivoDigital implements SFLinha {

    private int campo02TotalLinhasArquivo;

    public SF9999EncerramentoArquivoDigital(final int campo02TotalLinhasArquivo) {
        this.campo02TotalLinhasArquivo = campo02TotalLinhasArquivo;
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02TotalLinhasArquivo);
        return linha.toString();
    }

    public String getCampo01CodigoRegistro() {
        return "9999";
    }
}
