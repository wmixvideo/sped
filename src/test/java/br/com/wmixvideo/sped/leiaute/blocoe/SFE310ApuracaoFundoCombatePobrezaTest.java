package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimento;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFE310ApuracaoFundoCombatePobrezaTest {

    @Test
    public void deveGerarLinhaCompleta() throws Exception {
        final SFE310ApuracaoFundoCombatePobreza linha = new SFE310ApuracaoFundoCombatePobreza()
                .setCampo02IndicadorMovimento(SFIndicadorMovimento.COM)
                .setCampo03ValorSaldoCredorAnteriorDifal(BigDecimal.valueOf(3))
                .setCampo04ValorDebitosDifal(BigDecimal.valueOf(4))
                .setCampo05ValorOutrosDebitosDifal(BigDecimal.valueOf(5))
                .setCampo06ValorCreditosDifal(BigDecimal.valueOf(6))
                .setCampo07ValorOutrosCreditosDifal(BigDecimal.valueOf(7))
                .setCampo08ValorSaldoDevedorAntesDeducoesDifal(BigDecimal.valueOf(8))
                .setCampo09ValorDeducoesDifal(BigDecimal.valueOf(9))
                .setCampo10ValorRecolhidoRecolherDifal(BigDecimal.valueOf(10))
                .setCampo11ValorSaldoCredorTransportarDifal(BigDecimal.valueOf(11))
                .setCampo12ValorRecolhidoRecolherExtraApuracaoDifal(BigDecimal.valueOf(12))
                .setCampo13ValorSaldoCredorPeriodoAnteriorFcp(BigDecimal.valueOf(13))
                .setCampo14ValorTotalDebitosSaidaPrestacaoFcp(BigDecimal.valueOf(14))
                .setCampo15ValorAjustesOutrosDebitosFcp(BigDecimal.valueOf(15))
                .setCampo16ValorCreditoFcpEntradass(BigDecimal.valueOf(16))
                .setCampo17ValorAjustesOutrosCreditosEstornoDebitosFcp(BigDecimal.valueOf(17))
                .setCampo18ValorSaldoDevedorFcpAntesDeducoes(BigDecimal.valueOf(18))
                .setCampo19ValorDeducoesFcp(BigDecimal.valueOf(19))
                .setCampo20ValorRecolhidoRecolherFcp(BigDecimal.valueOf(20))
                .setCampo21ValorSaldoCredorTransportarFcp(BigDecimal.valueOf(21))
                .setCampo22ValorRecolhidoRecolherExtraApuracaoFcp(BigDecimal.valueOf(22));

        Assert.assertEquals("|E310|1|3,00|4,00|5,00|6,00|7,00|8,00|9,00|10,00|11,00|12,00|13,00|14,00|15,00|16,00|17,00|18,00|19,00|20,00|21,00|22,00|", linha.toString());
    }
}