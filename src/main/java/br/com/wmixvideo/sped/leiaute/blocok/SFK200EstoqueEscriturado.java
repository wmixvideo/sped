package br.com.wmixvideo.sped.leiaute.blocok;

import br.com.wmixvideo.sped.enums.SFIndicadorEstoque;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SFK200EstoqueEscriturado implements SFLinha {

    private LocalDate campo02DataEstoqueFinal;
    private String campo03CodigoProduto;
    private int campo04QuantidadeEmEstoque;
    private SFIndicadorEstoque campo05TipoEstoque;
    private String campo06CodigoParticipante;

    @Override
    public String getCampo01CodigoRegistro() {
        return "K200";
    }

    @Override
    public String toString() {
        final SFStringBuilder builder = new SFStringBuilder();
        builder.append(this.getCampo01CodigoRegistro());
        builder.append(SFUtil.formatToString(this.campo02DataEstoqueFinal));
        builder.append(this.campo03CodigoProduto);
        builder.append(this.campo04QuantidadeEmEstoque);
        builder.append(SFUtil.formatToString(this.campo05TipoEstoque));
        builder.append(this.campo06CodigoParticipante);
        return builder.toString();
    }

    public SFK200EstoqueEscriturado setCampo02DataEstoqueFinal(LocalDate campo02DataEstoqueFinal) {
        this.campo02DataEstoqueFinal = campo02DataEstoqueFinal;
        return this;
    }

    public SFK200EstoqueEscriturado setCampo03CodigoProduto(String campo03CodigoProduto) {
        this.campo03CodigoProduto = campo03CodigoProduto;
        return this;
    }

    public SFK200EstoqueEscriturado setCampo04QuantidadeEmEstoque(int campo04QuantidadeEmEstoque) {
        this.campo04QuantidadeEmEstoque = campo04QuantidadeEmEstoque;
        return this;
    }

    public SFK200EstoqueEscriturado setCampo05TipoEstoque(SFIndicadorEstoque campo05TipoEstoque) {
        this.campo05TipoEstoque = campo05TipoEstoque;
        return this;
    }

    public SFK200EstoqueEscriturado setCampo06CodigoParticipante(String campo06CodigoParticipante) {
        this.campo06CodigoParticipante = campo06CodigoParticipante;
        return this;
    }
}