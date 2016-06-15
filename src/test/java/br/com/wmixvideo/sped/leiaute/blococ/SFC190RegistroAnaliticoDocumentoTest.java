package br.com.wmixvideo.sped.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFC190RegistroAnaliticoDocumentoTest {

    @Test
    public void testeToString() throws Exception {
        final SFC190RegistroAnaliticoDocumento linha = new SFC190RegistroAnaliticoDocumento()
                .setCampo02CodigoSituacaoTributaria("001")
                .setCampo03CodigoFiscalOperacaoPrestacao("002")
                .setCampo04AliquotaIcms(BigDecimal.valueOf(1.01))
                .setCampo05ValorOperacao(BigDecimal.valueOf(1.02))
                .setCampo06ValorBaseCalculoIcms(BigDecimal.valueOf(1.03))
                .setCampo07ValorIcms(BigDecimal.valueOf(1.04))
                .setCampo08ValorBaseCalculoIcmsSt(BigDecimal.valueOf(1.05))
                .setCampo09ValorIcmsSt(BigDecimal.valueOf(1.06))
                .setCampo10ValorNaoTributado(BigDecimal.valueOf(1.07))
                .setCampo11ValorIpi(BigDecimal.valueOf(1.08))
                .setCampo12CodigoObservacao("003");

        Assert.assertEquals("|C190|001|002|1,01|1,02|1,03|1,04|1,05|1,06|1,07|1,08|003|", linha.toString());
    }
}