package br.com.wmixvideo.sped.leiaute.bloco9;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF9900RegistrosArquivo implements SFLinha {

    private final String campo02Codigo;
    private final int campo03TotalLinhas;

    public SF9900RegistrosArquivo(final String campo02Codigo, final int campo03TotalLinhas) {
        this.campo02Codigo = campo02Codigo;
        this.campo03TotalLinhas = campo03TotalLinhas;
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Codigo);
        linha.append(this.campo03TotalLinhas);
        return linha.toString();
    }

    public String getCampo01CodigoRegistro() {
        return "9900";
    }
}
