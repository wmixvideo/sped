package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFC110InformacaoComplementarNotaFiscal implements SFLinha {


    private String campo02Codigo, campo03Descricao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C110";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Codigo);
        linha.append(this.campo03Descricao);
        return linha.toString();
    }

    public SFC110InformacaoComplementarNotaFiscal setCampo02Codigo(String campo02Codigo) {
        this.campo02Codigo = campo02Codigo;
        return this;
    }

    public SFC110InformacaoComplementarNotaFiscal setCampo03Descricao(String campo03Descricao) {
        this.campo03Descricao = campo03Descricao;
        return this;
    }
}