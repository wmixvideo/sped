package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.util.SFReferencia;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFE250ObrigacoesICMSTest {

    @Test
    public void testeToString() throws Exception {
        final SFE250ObrigacoesICMS linha = new SFE250ObrigacoesICMS()
                .setCodigo("1")
                .setValor(BigDecimal.TEN)
                .setDataVencimento(LocalDate.of(2016, Month.JANUARY, 22))
                .setCodigoReceita("0020")
                .setNumeroProcesso("102")
                .setIndicadorProcessoOrigem(SFIndicadorProcessoOrigem.JUSTICA_ESTADUAL)
                .setDescricaoProcesso("descricao")
                .setDescricaoComplementarProcesso("complementar")
                .setReferencia(SFReferencia.of(2016, Month.JANUARY));

        Assert.assertEquals("|E250|1|10,00|22012016|0020|102|2|descricao|complementar|012016|", linha.toString());
    }
}