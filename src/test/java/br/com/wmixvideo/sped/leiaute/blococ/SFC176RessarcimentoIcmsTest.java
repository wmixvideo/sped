package br.com.wmixvideo.sped.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFC176RessarcimentoIcmsTest {
    @Test
    public void deveGerarLinhaCompleta() throws Exception {
        final SFC176RessarcimentoIcms linha = new SFC176RessarcimentoIcms()
                .setCampo02CodigoModelo("0000")
                .setCampo03Numero("0001")
                .setCampo04Serie("0010")
                .setCampo05DataUltimaEntrada(LocalDate.of(2016, Month.MARCH, 22))
                .setCampo06CodigoParticipante("0011")
                .setCampo07Quantidade(10)
                .setCampo08ValorUnitario(BigDecimal.valueOf(1.01))
                .setCampo09ValorUnitarioBaseCalculoST(BigDecimal.valueOf(1.02));

        Assert.assertEquals("|C176|0000|0001|0010|22032016|0011|10|1,01|1,02|", linha.toString());

    }
}