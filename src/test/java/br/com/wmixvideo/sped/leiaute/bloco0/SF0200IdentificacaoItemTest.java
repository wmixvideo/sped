package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.modelo.SFItem;
import br.com.wmixvideo.sped.modelo.SFItemTipo;
import br.com.wmixvideo.sped.modelo.SFUnidadeMedida;
import org.junit.Assert;
import org.junit.Test;

public class SF0200IdentificacaoItemTest {
    @Test
    public void geraTexto() {
        final SFItem item = new SFItem();
        item.setCodigo("123456");
        item.setDescricao("FILME");
        item.setCodigoBarras("123456789123");
        item.setUnidadeMedida(new SFUnidadeMedida("PC", "Peça"));
        item.setCodigoNcm("85234029");
        item.setTipo(SFItemTipo.SERVIÇOS);
        Assert.assertEquals("|0200|123456|FILME|123456789123||PC|09|85234029||||0||", new SF0200IdentificacaoItem(item).toString());
    }

    @Test
    public void geraTextoOutroNCM() {
        final SFItem item = new SFItem();
        item.setCodigo("123456");
        item.setDescricao("FILME");
        item.setCodigoBarras("123456789123");
        item.setUnidadeMedida(new SFUnidadeMedida("PC", "Peça"));
        item.setCodigoNcm("85234990");
        item.setTipo(SFItemTipo.SERVIÇOS);
        Assert.assertEquals("|0200|123456|FILME|123456789123||PC|09|85234990||||0||", new SF0200IdentificacaoItem(item).toString());
    }

    @Test
    public void codigoDeBarrasNuloDeveConsiderarVazio() {
        final SFItem item = new SFItem();
        item.setCodigo("123456");
        item.setDescricao("FILME");
        item.setCodigoBarras(null);
        item.setUnidadeMedida(new SFUnidadeMedida("PC", "Peça"));
        item.setCodigoNcm("85234029");
        item.setTipo(SFItemTipo.EMBALAGEM);
        Assert.assertEquals("|0200|123456|FILME|||PC|02|85234029||||0||", new SF0200IdentificacaoItem(item).toString());
    }
}