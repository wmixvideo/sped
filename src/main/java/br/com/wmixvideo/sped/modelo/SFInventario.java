package br.com.wmixvideo.sped.modelo;

import java.io.Serializable;
import java.math.BigDecimal;

public class SFInventario implements Serializable {
    private static final long serialVersionUID = -9050002001506776835L;
    private String codigo;
    private int estoque;
    private BigDecimal valorUnitario;
    private SFUnidadeMedida unidadeMedida;

    public String getCodigo() {
        return codigo;
    }

    public SFInventario setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public int getEstoque() {
        return estoque;
    }

    public SFInventario setEstoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public SFUnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public SFInventario setUnidadeMedida(SFUnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
        return this;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public SFInventario setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
        return this;
    }

    public BigDecimal getValorTotal() {
        return this.valorUnitario != null ? this.valorUnitario.multiply(BigDecimal.valueOf(this.estoque)) : BigDecimal.ZERO;
    }
}
