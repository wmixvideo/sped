package br.com.wmixvideo.sped.leiaute.blocoh;

import br.com.wmixvideo.sped.modelo.SFInventario;
import br.com.wmixvideo.sped.modelo.SFUnidadeMedida;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFH010InventarioTest {
    @Test
    public void geraTexto() {
        final SFInventario inventario = new SFInventario()
                .setCodigo("101001")
                .setUnidadeMedida(new SFUnidadeMedida("UN", "Unidade"))
                .setValorUnitario(new BigDecimal("23.93"))
                .setEstoque(34);

        Assert.assertEquals("|H010|101001|UN|34|23,93|813,62|0|||1010501|813,62|", new SFH010Inventario(inventario).toString());
    }
}