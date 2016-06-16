package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0190IdentificacaoUnidadeMedida implements SFLinha {

    private String campo02Codigo;
    private String campo03Descricao;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Codigo);
        linha.append(this.campo03Descricao);
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0190";
    }

    public SF0190IdentificacaoUnidadeMedida setCampo02Codigo(String campo02Codigo) {
        this.campo02Codigo = campo02Codigo;
        return this;
    }

    public SF0190IdentificacaoUnidadeMedida setCampo03Descricao(String campo03Descricao) {
        this.campo03Descricao = campo03Descricao;
        return this;
    }
}