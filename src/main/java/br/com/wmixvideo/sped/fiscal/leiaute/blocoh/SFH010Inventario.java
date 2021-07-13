package br.com.wmixvideo.sped.fiscal.leiaute.blocoh;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorPropriedade;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFH010Inventario implements SFLinha {

    private String campo02Codigo;
    private String campo03UnidadeMedida;
    private int campo04Quantidade;
    private BigDecimal campo05ValorUnitario;
    private BigDecimal campo06ValorTotal;
    private SFIndicadorPropriedade campo07IndicadorPropriedade;
    private String campo08CodigoParticipante;
    private String campo09DescricaoComplementar;
    private String campo10CodigoContaAnaliticaContabil;
    private BigDecimal campo11ValorImpostoRenda;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Codigo);
        linha.append(this.campo03UnidadeMedida);
        linha.append(this.campo04Quantidade);
        linha.append(SFUtil.formatToString(this.campo05ValorUnitario));
        linha.append(SFUtil.formatToString(this.campo06ValorTotal));
        linha.append(SFUtil.formatToString(this.campo07IndicadorPropriedade));
        linha.append(this.campo08CodigoParticipante);
        linha.append(this.campo09DescricaoComplementar);
        linha.append(this.campo10CodigoContaAnaliticaContabil);
        linha.append(SFUtil.formatToString(this.campo11ValorImpostoRenda));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "H010";
    }

    public SFH010Inventario setCampo02Codigo(String campo02Codigo) {
        this.campo02Codigo = campo02Codigo;
        return this;
    }

    public SFH010Inventario setCampo10CodigoContaAnaliticaContabil(String campo10CodigoContaAnaliticaContabil) {
        this.campo10CodigoContaAnaliticaContabil = campo10CodigoContaAnaliticaContabil;
        return this;
    }

    public SFH010Inventario setCampo08CodigoParticipante(String campo08CodigoParticipante) {
        this.campo08CodigoParticipante = campo08CodigoParticipante;
        return this;
    }

    public SFH010Inventario setCampo09DescricaoComplementar(String campo09DescricaoComplementar) {
        this.campo09DescricaoComplementar = campo09DescricaoComplementar;
        return this;
    }

    public SFH010Inventario setCampo07IndicadorPropriedade(SFIndicadorPropriedade campo07IndicadorPropriedade) {
        this.campo07IndicadorPropriedade = campo07IndicadorPropriedade;
        return this;
    }

    public SFH010Inventario setCampo04Quantidade(int campo04Quantidade) {
        this.campo04Quantidade = campo04Quantidade;
        return this;
    }

    public SFH010Inventario setCampo03UnidadeMedida(String campo03UnidadeMedida) {
        this.campo03UnidadeMedida = campo03UnidadeMedida;
        return this;
    }

    public SFH010Inventario setCampo06ValorTotal(BigDecimal campo06ValorTotal) {
        this.campo06ValorTotal = campo06ValorTotal;
        return this;
    }

    public SFH010Inventario setCampo11ValorImpostoRenda(BigDecimal campo11ValorImpostoRenda) {
        this.campo11ValorImpostoRenda = campo11ValorImpostoRenda;
        return this;
    }

    public SFH010Inventario setCampo05ValorUnitario(BigDecimal campo05ValorUnitario) {
        this.campo05ValorUnitario = campo05ValorUnitario;
        return this;
    }
}