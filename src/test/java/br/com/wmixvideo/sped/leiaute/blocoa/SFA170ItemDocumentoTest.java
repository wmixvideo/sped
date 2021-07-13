package br.com.wmixvideo.sped.leiaute.blocoa;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.wmixvideo.sped.enums.SFIndicadorOrigemCredito;
import br.com.wmixvideo.sped.enums.SFNaturezaBaseCalculoCredito;

public class SFA170ItemDocumentoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFA170ItemDocumento linha = new SFA170ItemDocumento()
                .setCampo02NumeroItem(1)
                .setCampo03CodigoItem("03")
                .setCampo04DescricaoComplementar("00000000004")
                .setCampo05ValorTotalItem(BigDecimal.valueOf(5))
                .setCampo06ValorDesconto(BigDecimal.valueOf(6))
                .setCampo07NaturezaBCCredito(SFNaturezaBaseCalculoCredito.ARMAZENAGEM_DE_MERCADORIA_E_FRETE_NA_OPERACAO_DE_VENDA)
                .setCampo08IndicadorOrigemCredito(SFIndicadorOrigemCredito.MERCADO_INTERNO)
                .setCampo09CodigoStPis("09")
                .setCampo10ValorBaseCalculoPis(BigDecimal.valueOf(10))
                .setCampo11AliquotaPis(BigDecimal.valueOf(11))
                .setCampo12ValorPis(BigDecimal.valueOf(12))
                .setCampo13CodigoStCofins("13")
                .setCampo14ValorBaseCalculoCofins(BigDecimal.valueOf(14))
                .setCampo15AliquotaCofins(BigDecimal.valueOf(15))
                .setCampo16ValorCofins(BigDecimal.valueOf(16))
                .setCampo17CodigoContaAnalitica("0017")
                .setCampo18CodigoCentroCusto("0018");

        Assert.assertEquals("|A170|1|03|00000000004|5,00|6,00|07|0|09|10,00|11,00|12,00|13|14,00|15,00|16,00|0017|0018|", linha.toString());
    }

}
