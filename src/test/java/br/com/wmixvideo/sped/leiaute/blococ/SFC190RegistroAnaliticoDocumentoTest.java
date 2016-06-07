package br.com.wmixvideo.sped.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFC190RegistroAnaliticoDocumentoTest {

    @Test
    public void testeToString() throws Exception {
        final SFC190RegistroAnaliticoDocumento linha = new SFC190RegistroAnaliticoDocumento()
                .setCodigoSituacaoTributaria("001")
                .setCodigoFiscalOperacaoPrestacao("002")
                .setAliquotaIcms(BigDecimal.valueOf(1.01))
                .setValorOperacao(BigDecimal.valueOf(1.02))
                .setValorBaseCalculoIcms(BigDecimal.valueOf(1.03))
                .setValorIcms(BigDecimal.valueOf(1.04))
                .setValorBaseCalculoIcmsSt(BigDecimal.valueOf(1.05))
                .setValorIcmsSt(BigDecimal.valueOf(1.06))
                .setValorNaoTributado(BigDecimal.valueOf(1.07))
                .setValorIpi(BigDecimal.valueOf(1.08))
                .setCodigoObservacao("003");

        Assert.assertEquals("|C190|001|002|1,01|1,02|1,03|1,04|1,05|1,06|1,07|1,08|003|", linha.toString());
    }
}