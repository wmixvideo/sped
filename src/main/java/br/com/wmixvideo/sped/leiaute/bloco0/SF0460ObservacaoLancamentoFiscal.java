package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0460ObservacaoLancamentoFiscal implements SFLinha {

    private String codigo;
    private String observacao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "0460";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.codigo);
        texto.append(this.observacao);
        return texto.toString();
    }

    public SF0460ObservacaoLancamentoFiscal setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SF0460ObservacaoLancamentoFiscal setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }
}