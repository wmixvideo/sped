package br.com.wmixvideo.sped.leiaute.blocod;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFD190RegistroAnaliticoTransporteTest {
    @Test
    public void testeToString() throws Exception {
        final SFD190RegistroAnaliticoTransporte linha = new SFD190RegistroAnaliticoTransporte()
                .setCodigoSituacaoTributaria("001")
                .setCodigoFiscalOperacaoPrestacao("002")
                .setValorICMSAliquota(BigDecimal.valueOf(2.55))
                .setValor(BigDecimal.valueOf(2.56))
                .setValorICMSBaseCalculo(BigDecimal.valueOf(2.57))
                .setValorICMS(BigDecimal.valueOf(2.58))
                .setValorNaoTributado(BigDecimal.valueOf(2.59))
                .setCodigoObservacao("003");

        Assert.assertEquals("|D190|001|002|2,55|2,56|2,57|2,58|2,59|003|", linha.toString());
    }
}