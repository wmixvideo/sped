package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFC197OutrasObrigacoesTributariasTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFC197OutrasObrigacoesTributarias linha = new SFC197OutrasObrigacoesTributarias()
                .setCampo02Codigo("010")
                .setCampo03Descricao("des cri cao")
                .setCampo04CodigoItem("123456")
                .setCampo05BaseCalculo(BigDecimal.valueOf(2))
                .setCampo06Aliquota(BigDecimal.valueOf(3))
                .setCampo07Valor(BigDecimal.valueOf(5))
                .setCampo08Outros(BigDecimal.valueOf(8));

        Assert.assertEquals("|C197|010|des cri cao|123456|2,00|3,00|5,00|8,00|", linha.toString());
    }
}