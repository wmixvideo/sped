package br.com.wmixvideo.sped.fiscal.leiaute.blocod;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFD190RegistroAnaliticoTransporteTest {
    @Test
    public void deveGerarLinhaCompleta() {
        final SFD190RegistroAnaliticoTransporte linha = new SFD190RegistroAnaliticoTransporte()
                .setCampo02CodigoSituacaoTributaria("001")
                .setCampo03CodigoFiscalOperacaoPrestacao("002")
                .setCampo04ValorICMSAliquota(BigDecimal.valueOf(2.55))
                .setCampo05Valor(BigDecimal.valueOf(2.56))
                .setCampo06ValorICMSBaseCalculo(BigDecimal.valueOf(2.57))
                .setCampo07ValorICMS(BigDecimal.valueOf(2.58))
                .setCampo08ValorNaoTributado(BigDecimal.valueOf(2.59))
                .setCampo09CodigoObservacao("003");

        Assert.assertEquals("|D190|001|002|2,55|2,56|2,57|2,58|2,59|003|", linha.toString());
    }
}