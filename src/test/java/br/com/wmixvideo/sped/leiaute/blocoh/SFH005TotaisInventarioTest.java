package br.com.wmixvideo.sped.leiaute.blocoh;

import br.com.wmixvideo.sped.enums.SFMotivoInventario;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFH005TotaisInventarioTest {
    @Test
    public void geraTexto() {
        final SFH005TotaisInventario linha = new SFH005TotaisInventario()
                .setMotivoInventario(SFMotivoInventario.FINAL_NO_PERIODO)
                .setDataInventario(LocalDate.of(2008, 11, 6))
                .setValorTotalEstoque(BigDecimal.valueOf(10893622.45));

        Assert.assertEquals("|H005|06112008|10893622,45|01|", linha.toString());
    }
}