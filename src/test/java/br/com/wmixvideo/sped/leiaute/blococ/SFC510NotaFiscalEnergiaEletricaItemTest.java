package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFIndicadorTipoReceita;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFC510NotaFiscalEnergiaEletricaItemTest {

    @Test
    public void deveRetornarLinhaCompleta() {
        final SFC510NotaFiscalEnergiaEletricaItem linha = new SFC510NotaFiscalEnergiaEletricaItem()
                .setCampo02Sequencial(2)
                .setCampo03Codigo("3")
                .setCampo04CodigoClassificacao("4")
                .setCampo05Quantidade(BigDecimal.valueOf(5))
                .setCampo06Unidade("6")
                .setCampo07Valor(BigDecimal.valueOf(7))
                .setCampo08ValorDesconto(BigDecimal.valueOf(8))
                .setCampo09CST("9")
                .setCampo10CFOP("10")
                .setCampo11ValorBaseCalculoICMS(BigDecimal.valueOf(11))
                .setCampo12AliquotaICMS(BigDecimal.valueOf(12))
                .setCampo13ValorICMS(BigDecimal.valueOf(13))
                .setCampo14ValorBaseCalculoICMSST(BigDecimal.valueOf(14))
                .setCampo15AliquotaST(BigDecimal.valueOf(15))
                .setCampo16ValorICMSST(BigDecimal.valueOf(16))
                .setCampo17IndicadorTipoReceita(SFIndicadorTipoReceita.TERCEIROS)
                .setCampo18CodigoParticipante("18")
                .setCampo19ValorPIS(BigDecimal.valueOf(19))
                .setCampo20ValorCOFINS(BigDecimal.valueOf(20))
                .setCampo21CodigoContaAnalitica("21");

        Assert.assertEquals("|C510|2|3|4|5,00|6|7,00|8,00|9|10|11,00|12,00|13,00|14,00|15,00|16,00|1|18|19,00|20,00|21|", linha.toString());
    }
}