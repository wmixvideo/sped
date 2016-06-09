package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0190IdentificacaoUnidadeMedida implements SFLinha {

    private String codigo;
    private String descricao;

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.codigo);
        texto.append(this.descricao);
        return texto.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0190";
    }

    public SF0190IdentificacaoUnidadeMedida setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SF0190IdentificacaoUnidadeMedida setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}