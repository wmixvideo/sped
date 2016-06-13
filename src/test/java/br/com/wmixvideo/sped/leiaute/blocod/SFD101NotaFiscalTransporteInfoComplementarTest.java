package br.com.wmixvideo.sped.leiaute.blocod;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFD101NotaFiscalTransporteInfoComplementarTest {

    @Test
    public void testeToString() throws Exception {
        final SFD101NotaFiscalTransporteInfoComplementar linha = new SFD101NotaFiscalTransporteInfoComplementar()
                .setCampo02ValorFundoCombatePobreza(BigDecimal.valueOf(3.05))
                .setCampo03ValorICMSDestino(BigDecimal.valueOf(3.1))
                .setCampo04ValorICMSRemetente(BigDecimal.valueOf(3.15));

        Assert.assertEquals("|D101|3,05|3,10|3,15|", linha.toString());
    }

}