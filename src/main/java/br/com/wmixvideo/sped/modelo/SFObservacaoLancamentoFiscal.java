package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;

public class SFObservacaoLancamentoFiscal implements Serializable {
    private static final long serialVersionUID = -1618314993743412225L;
    private String codigo;
    private String observacao;

    public SFObservacaoLancamentoFiscal(String codigo, String observacao) {
        this.codigo = codigo;
        this.observacao = observacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
