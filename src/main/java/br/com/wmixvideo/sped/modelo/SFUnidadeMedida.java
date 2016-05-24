package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;

public class SFUnidadeMedida implements Serializable {
    private static final long serialVersionUID = -6310969691031251855L;
    private final String codigo;
    private final String descricao;

    public SFUnidadeMedida(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
