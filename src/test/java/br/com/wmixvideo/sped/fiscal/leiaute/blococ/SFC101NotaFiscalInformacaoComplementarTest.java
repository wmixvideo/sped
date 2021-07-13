package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFC101NotaFiscalInformacaoComplementarTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFC101NotaFiscalInformacaoComplementar linha = new SFC101NotaFiscalInformacaoComplementar()
                .setCampo02ValorIcmsPartilhaDestinoFundoCombatePobreza(BigDecimal.valueOf(2))
                .setCampo03ValorIcmsPartilhaDestino(BigDecimal.valueOf(3))
                .setCampo04ValorIcmsPartilhaOrigem(BigDecimal.valueOf(4));

        Assert.assertEquals("|C101|2,00|3,00|4,00|", linha.toString());
    }
}