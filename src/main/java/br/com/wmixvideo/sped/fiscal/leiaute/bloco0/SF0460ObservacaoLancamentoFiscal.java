package br.com.wmixvideo.sped.fiscal.leiaute.bloco0;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0460ObservacaoLancamentoFiscal implements SFLinha {

    private String campo02Codigo;
    private String campo03Observacao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "0460";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Codigo);
        linha.append(this.campo03Observacao);
        return linha.toString();
    }

    public SF0460ObservacaoLancamentoFiscal setCampo02Codigo(String campo02Codigo) {
        this.campo02Codigo = campo02Codigo;
        return this;
    }

    public SF0460ObservacaoLancamentoFiscal setCampo03Observacao(String campo03Observacao) {
        this.campo03Observacao = campo03Observacao;
        return this;
    }
}