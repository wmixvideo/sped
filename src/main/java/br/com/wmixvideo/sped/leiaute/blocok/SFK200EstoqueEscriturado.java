package br.com.wmixvideo.sped.leiaute.blocok;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

public class SFK200EstoqueEscriturado implements SFLinha {

    private static final String CODIGO_DO_PARTICIPANTE = StringUtils.EMPTY;
    private static final String ESTOQUE_DE_PROPRIEDADE_DO_INFORMANTE_E_EM_SEU_PODER = "0";
    private final LocalDate dataEstoqueFinal;
    private final String codigoProduto;
    private final int quantidadeEmEstoque;

    public SFK200EstoqueEscriturado(final LocalDate dataEstoqueFinal, final String codigoProduto, final int quantidadeEmEstoque) {
        this.dataEstoqueFinal = dataEstoqueFinal;
        this.codigoProduto = codigoProduto;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "K200";
    }

    @Override
    public String toString() {
        final SFStringBuilder builder = new SFStringBuilder();
        builder.append(this.getCampo01CodigoRegistro());
        builder.append(SFUtil.formatToString(this.dataEstoqueFinal));
        builder.append(this.codigoProduto);
        builder.append(this.quantidadeEmEstoque);
        builder.append(SFK200EstoqueEscriturado.ESTOQUE_DE_PROPRIEDADE_DO_INFORMANTE_E_EM_SEU_PODER);
        builder.append(SFK200EstoqueEscriturado.CODIGO_DO_PARTICIPANTE);
        return builder.toString();
    }
}