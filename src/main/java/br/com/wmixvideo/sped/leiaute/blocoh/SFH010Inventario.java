package br.com.wmixvideo.sped.leiaute.blocoh;

import br.com.wmixvideo.sped.enums.SFIndicadorPropriedade;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFH010Inventario implements SFLinha {

    private String codigo;
    private String unidadeMedida;
    private int quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;
    private SFIndicadorPropriedade indicadorPropriedade;
    private String codigoParticipante;
    private String descricaoComplementar;
    private String codigoContaAnaliticaContabil;
    private BigDecimal valorImpostoRenda;

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.codigo);
        texto.append(this.unidadeMedida);
        texto.append(this.quantidade);
        texto.append(SFUtil.formatToString(this.valorUnitario));
        texto.append(SFUtil.formatToString(this.valorTotal));
        texto.append(this.indicadorPropriedade != null ? this.indicadorPropriedade.getCodigo() : "");
        texto.append(this.codigoParticipante);
        texto.append(this.descricaoComplementar);
        texto.append(this.codigoContaAnaliticaContabil);
        texto.append(SFUtil.formatToString(this.valorImpostoRenda));
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "H010";
    }

    public SFH010Inventario setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SFH010Inventario setCodigoContaAnaliticaContabil(String codigoContaAnaliticaContabil) {
        this.codigoContaAnaliticaContabil = codigoContaAnaliticaContabil;
        return this;
    }

    public SFH010Inventario setCodigoParticipante(String codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
        return this;
    }

    public SFH010Inventario setDescricaoComplementar(String descricaoComplementar) {
        this.descricaoComplementar = descricaoComplementar;
        return this;
    }

    public SFH010Inventario setIndicadorPropriedade(SFIndicadorPropriedade indicadorPropriedade) {
        this.indicadorPropriedade = indicadorPropriedade;
        return this;
    }

    public SFH010Inventario setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public SFH010Inventario setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
        return this;
    }

    public SFH010Inventario setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
        return this;
    }

    public SFH010Inventario setValorImpostoRenda(BigDecimal valorImpostoRenda) {
        this.valorImpostoRenda = valorImpostoRenda;
        return this;
    }

    public SFH010Inventario setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
        return this;
    }
}