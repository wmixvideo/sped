package br.com.wmixvideo.sped.leiaute.blocoh;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFH005TotaisInventarioTest {
    @Test
    public void geraTexto() {
        Assert.assertEquals("|H005|06112008|10893622,45|01|", new SFH005TotaisInventario(LocalDate.of(2008, 11, 6), new BigDecimal("10893622.45")).toString());
    }
}