package br.com.wmixvideo.sped.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFC197OutrasObrigacoesTributariasTest {
    @Test
    public void testeToString() throws Exception {
        final SFC197OutrasObrigacoesTributarias linha = new SFC197OutrasObrigacoesTributarias()
                .setCodigo("010")
                .setDescricao("des cri cao")
                .setCodigoItem("123456")
                .setBaseCalculo(BigDecimal.valueOf(2))
                .setAliquota(BigDecimal.valueOf(3))
                .setValor(BigDecimal.valueOf(5))
                .setOutros(BigDecimal.valueOf(8));

        Assert.assertEquals("|C197|010|des cri cao|123456|2,00|3,00|5,00|8,00|", linha.toString());
    }
}