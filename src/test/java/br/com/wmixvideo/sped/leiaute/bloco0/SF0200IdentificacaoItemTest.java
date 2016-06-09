package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFItemTipo;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SF0200IdentificacaoItemTest {

    @Test
    public void geraTexto() {
        final SF0200IdentificacaoItem linha = new SF0200IdentificacaoItem()
                .setCodigo("123456")
                .setDescricao("FILME")
                .setCodigoBarras("123456789123")
                .setUnidadeMedida("PC")
                .setCodigoNcm("85234029")
                .setTipo(SFItemTipo.SERVIÇOS)
                .setAliquotaIcms(BigDecimal.ZERO);

        Assert.assertEquals("|0200|123456|FILME|123456789123||PC|09|85234029||||0|", linha.toString());
    }

    @Test
    public void geraTextoOutroNCM() {
        final SF0200IdentificacaoItem linha = new SF0200IdentificacaoItem()
                .setCodigo("123456")
                .setDescricao("FILME")
                .setCodigoBarras("123456789123")
                .setUnidadeMedida("PC")
                .setCodigoNcm("85234990")
                .setTipo(SFItemTipo.SERVIÇOS)
                .setAliquotaIcms(BigDecimal.ZERO);

        Assert.assertEquals("|0200|123456|FILME|123456789123||PC|09|85234990||||0|", linha.toString());
    }

    @Test
    public void codigoDeBarrasNuloDeveConsiderarVazio() {
        final SF0200IdentificacaoItem linha = new SF0200IdentificacaoItem()
                .setCodigo("123456")
                .setDescricao("FILME")
                .setCodigoBarras(null)
                .setUnidadeMedida("PC")
                .setCodigoNcm("85234029")
                .setTipo(SFItemTipo.EMBALAGEM)
                .setAliquotaIcms(BigDecimal.ZERO);

        Assert.assertEquals("|0200|123456|FILME|||PC|02|85234029||||0|", linha.toString());
    }
}