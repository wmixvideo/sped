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
    public void deveGerarLinhaCompleta() throws Exception {
        final SFE250ObrigacoesICMS linha = new SFE250ObrigacoesICMS()
                .setCampo02Codigo("1")
                .setCampo03Valor(BigDecimal.TEN)
                .setCampo04DataVencimento(LocalDate.of(2016, Month.JANUARY, 22))
                .setCampo05CodigoReceita("0020")
                .setCampo06NumeroProcesso("102")
                .setCampo07IndicadorProcessoOrigem(SFIndicadorProcessoOrigem.JUSTICA_ESTADUAL)
                .setCampo08DescricaoProcesso("descricao")
                .setCampo09DescricaoComplementarProcesso("complementar")
                .setCampo10Referencia(SFReferencia.of(2016, Month.JANUARY));

        Assert.assertEquals("|E250|1|10,00|22012016|0020|102|2|descricao|complementar|012016|", linha.toString());
    }
}