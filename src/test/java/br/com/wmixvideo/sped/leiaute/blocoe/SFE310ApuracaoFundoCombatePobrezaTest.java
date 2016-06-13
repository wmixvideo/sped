package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimento;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFE310ApuracaoFundoCombatePobrezaTest {

    @Test
    public void testeToString() throws Exception {
        final SFE310ApuracaoFundoCombatePobreza linha = new SFE310ApuracaoFundoCombatePobreza()
                .setCampo02IndicadorMovimento(SFIndicadorMovimento.COM)
                .setCampo03ValorSaldoCredorAnterior(BigDecimal.valueOf(1))
                .setCampo04ValorDebitos(BigDecimal.valueOf(2))
                .setCampo05ValorDebitosAjuste(BigDecimal.valueOf(3))
                .setCampo06ValorDebitosFCP(BigDecimal.valueOf(4))
                .setCampo07ValorCreditos(BigDecimal.valueOf(5))
                .setCampo08ValorCreditosFCP(BigDecimal.valueOf(6))
                .setCampo09ValorCreditosAjuste(BigDecimal.valueOf(7))
                .setCampo10ValorSaldoDevedorAntesDeducoes(BigDecimal.valueOf(8))
                .setCampo11ValorDeducoes(BigDecimal.valueOf(9))
                .setCampo12ValorARecolher(BigDecimal.valueOf(10))
                .setCampo13ValorSaldoCredorTransportar(BigDecimal.valueOf(11))
                .setCampo14ValorExtraApuracao(BigDecimal.valueOf(12));

        Assert.assertEquals("|E310|1|1,00|2,00|3,00|4,00|5,00|6,00|7,00|8,00|9,00|10,00|11,00|12,00|", linha.toString());
    }
}