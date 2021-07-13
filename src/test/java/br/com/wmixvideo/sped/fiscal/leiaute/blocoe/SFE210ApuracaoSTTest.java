package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorMovimento;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFE210ApuracaoSTTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFE210ApuracaoST linha = new SFE210ApuracaoST()
                .setCampo02IndicadorMovimento(SFIndicadorMovimento.COM)
                .setCampo03ValorSaldoCredorAnterior(BigDecimal.valueOf(1))
                .setCampo04ValorDevolucao(BigDecimal.valueOf(2))
                .setCampo05ValorRessarcimento(BigDecimal.valueOf(3))
                .setCampo06ValorOutrosCreditos(BigDecimal.valueOf(4))
                .setCampo07ValorAjusteCreditos(BigDecimal.valueOf(5))
                .setCampo08ValorRetencao(BigDecimal.valueOf(6))
                .setCampo09ValorOutrosDebitos(BigDecimal.valueOf(7))
                .setCampo10ValorAjusteDebitos(BigDecimal.valueOf(8))
                .setCampo11ValorSaldoDevedorAntesDeducoes(BigDecimal.valueOf(9))
                .setCampo12ValorDeducoes(BigDecimal.valueOf(10))
                .setCampo13ValorARecolher(BigDecimal.valueOf(11))
                .setCampo14ValorSaldoCredorTransportar(BigDecimal.valueOf(12))
                .setCampo15ValorExtraApuracao(BigDecimal.valueOf(13));

        Assert.assertEquals("|E210|1|1,00|2,00|3,00|4,00|5,00|6,00|7,00|8,00|9,00|10,00|11,00|12,00|13,00|", linha.toString());
    }

}