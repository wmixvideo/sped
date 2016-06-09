package br.com.wmixvideo.sped.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFC590RegistroAnaliticoDocumentoTest {

    @Test
    public void testeToString() throws Exception {
        final SFC590RegistroAnaliticoDocumento linha = new SFC590RegistroAnaliticoDocumento()
                .setCampo02CodigoSubstituicaoTributaria("000")
                .setCampo03CodigoFiscalOperacaoPrestacao("001")
                .setCampo04AliquotaIcms(BigDecimal.valueOf(9.99))
                .setCampo05ValorOperacao(BigDecimal.valueOf(9.98))
                .setCampo06ValorBaseCalculoIcms(BigDecimal.valueOf(9.97))
                .setCampo07ValorIcms(BigDecimal.valueOf(9.96))
                .setCampo08ValorBaseCalculoIcmsSt(BigDecimal.valueOf(9.95))
                .setCampo09ValorIcmsSt(BigDecimal.valueOf(9.94))
                .setCampo10ValorNaoTributado(BigDecimal.valueOf(9.93))
                .setCampo11CodigoObservacao("010");

        Assert.assertEquals("|C590|000|001|9,99|9,98|9,97|9,96|9,95|9,94|9,93|010|", linha.toString());
    }
}