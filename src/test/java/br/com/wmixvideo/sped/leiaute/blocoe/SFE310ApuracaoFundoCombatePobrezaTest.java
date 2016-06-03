package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimento;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFE310ApuracaoFundoCombatePobrezaTest {

    @Test
    public void testeToString() throws Exception {
        final SFE310ApuracaoFundoCombatePobreza linha = new SFE310ApuracaoFundoCombatePobreza()
                .setIndicadorMovimento(SFIndicadorMovimento.COM)
                .setValorSaldoCredorAnterior(BigDecimal.valueOf(1))
                .setValorDebitos(BigDecimal.valueOf(2))
                .setValorDebitosAjuste(BigDecimal.valueOf(3))
                .setValorDebitosFCP(BigDecimal.valueOf(4))
                .setValorCreditos(BigDecimal.valueOf(5))
                .setValorCreditosFCP(BigDecimal.valueOf(6))
                .setValorCreditosAjuste(BigDecimal.valueOf(7))
                .setValorSaldoDevedorAntesDeducoes(BigDecimal.valueOf(8))
                .setValorDeducoes(BigDecimal.valueOf(9))
                .setValorARecolher(BigDecimal.valueOf(10))
                .setValorSaldoCredorTransportar(BigDecimal.valueOf(11))
                .setValorExtraApuracao(BigDecimal.valueOf(12));

        Assert.assertEquals("|E310|1|1,00|2,00|3,00|4,00|5,00|6,00|7,00|8,00|9,00|10,00|11,00|12,00|", linha.toString());
    }
}