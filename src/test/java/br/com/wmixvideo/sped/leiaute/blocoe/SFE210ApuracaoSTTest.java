package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimento;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFE210ApuracaoSTTest {

    @Test
    public void testeToStringSemDados() {
        Assert.assertEquals("|E210|||||||||||||||", new SFE210ApuracaoST().toString());
    }

    @Test
    public void testeToStringComDados() {
        final SFE210ApuracaoST linha = new SFE210ApuracaoST()
                .setIndicadorMovimento(SFIndicadorMovimento.COM)
                .setValorSaldoCredorAnterior(BigDecimal.valueOf(1))
                .setValorDevolucao(BigDecimal.valueOf(2))
                .setValorRessarcimento(BigDecimal.valueOf(3))
                .setValorOutrosCreditos(BigDecimal.valueOf(4))
                .setValorAjusteCreditos(BigDecimal.valueOf(5))
                .setValorRetencao(BigDecimal.valueOf(6))
                .setValorOutrosDebitos(BigDecimal.valueOf(7))
                .setValorAjusteDebitos(BigDecimal.valueOf(8))
                .setValorSaldoDevedorAntesDeducoes(BigDecimal.valueOf(9))
                .setValorDeducoes(BigDecimal.valueOf(10))
                .setValorARecolher(BigDecimal.valueOf(11))
                .setValorSaldoCredorTransportar(BigDecimal.valueOf(12))
                .setValorExtraApuracao(BigDecimal.valueOf(13));

        Assert.assertEquals("|E210|1|1,00|2,00|3,00|4,00|5,00|6,00|7,00|8,00|9,00|10,00|11,00|12,00|13,00|", linha.toString());
    }

}