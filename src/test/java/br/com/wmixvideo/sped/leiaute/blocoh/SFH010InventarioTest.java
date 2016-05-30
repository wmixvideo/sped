package br.com.wmixvideo.sped.leiaute.blocoh;

import br.com.wmixvideo.sped.enums.SFIndicadorPropriedade;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFH010InventarioTest {
    @Test
    public void geraTexto() {
        final SFH010Inventario inventario = new SFH010Inventario()
                .setCodigo("101001")
                .setUnidadeMedida("UN")
                .setQuantidade(34)
                .setValorUnitario(BigDecimal.valueOf(23.93))
                .setValorTotal(BigDecimal.valueOf(813.62))
                .setIndicadorPropriedade(SFIndicadorPropriedade.DO_INFORMANTE_E_EM_SEU_PODER)
                .setCodigoContaAnaliticaContabil("1010501")
                .setValorImpostoRenda(BigDecimal.valueOf(813.62));

        Assert.assertEquals("|H010|101001|UN|34|23,93|813,62|0|||1010501|813,62|", inventario.toString());
    }
}