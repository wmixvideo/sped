package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFC110InformacaoComplementarNotaFiscal implements SFLinha {


    private String codigo, descricao;

    @Override
    public String getCodigoRegistro() {
        return "C110";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.codigo);
        texto.append(this.descricao);
        return texto.toString();
    }

    public SFC110InformacaoComplementarNotaFiscal setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SFC110InformacaoComplementarNotaFiscal setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}