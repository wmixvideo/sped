package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFC195ObservacoesLancamentoFiscal implements SFLinha {

    private String campo02Codigo, campo03Descricao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C195";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Codigo);
        linha.append(this.campo03Descricao);
        return linha.toString();
    }

    public SFC195ObservacoesLancamentoFiscal setCampo02Codigo(String campo02Codigo) {
        this.campo02Codigo = campo02Codigo;
        return this;
    }

    public SFC195ObservacoesLancamentoFiscal setCampo03Descricao(String campo03Descricao) {
        this.campo03Descricao = campo03Descricao;
        return this;
    }
}
