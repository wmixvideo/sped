package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFItemTipo;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SF0200IdentificacaoItemTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SF0200IdentificacaoItem linha = new SF0200IdentificacaoItem()
                .setCampo02Codigo("123456")
                .setCampo03Descricao("FILME")
                .setCampo04CodigoBarras("123456789123")
                .setCampo05CodigoAnterior("654")
                .setCampo06UnidadeMedida("PC")
                .setCampo07Tipo(SFItemTipo.SERVIÇOS)
                .setCampo08CodigoNcm("85234029")
                .setCampo09CodigoExIpi("765")
                .setCampo10CodigoGenero("876")
                .setCampo11CodigoServico("987")
                .setCampo12AliquotaIcms(BigDecimal.ZERO)
                .setCampo13CodigoEspecificadorSubstituicaoTributaria("13");

        Assert.assertEquals("|0200|123456|FILME|123456789123|654|PC|09|85234029|765|876|987|0|13|", linha.toString());
    }
}