package br.com.wmixvideo.sped.leiaute.blocoh;

import br.com.wmixvideo.sped.enums.SFIndicadorPropriedade;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFH010InventarioTest {
    @Test
    public void deveGerarLinhaCompleta() {
        final SFH010Inventario inventario = new SFH010Inventario()
                .setCampo02Codigo("101001")
                .setCampo03UnidadeMedida("UN")
                .setCampo04Quantidade(34)
                .setCampo05ValorUnitario(BigDecimal.valueOf(23.93))
                .setCampo06ValorTotal(BigDecimal.valueOf(813.62))
                .setCampo07IndicadorPropriedade(SFIndicadorPropriedade.DO_INFORMANTE_E_EM_SEU_PODER)
                .setCampo10CodigoContaAnaliticaContabil("1010501")
                .setCampo11ValorImpostoRenda(BigDecimal.valueOf(813.62));

        Assert.assertEquals("|H010|101001|UN|34|23,93|813,62|0|||1010501|813,62|", inventario.toString());
    }
}