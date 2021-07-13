package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.util.SFReferencia;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFE316ObrigacoesFundoCombatePobrezaTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFE316ObrigacoesFundoCombatePobreza linha = new SFE316ObrigacoesFundoCombatePobreza()
                .setCampo02Codigo("001")
                .setCampo03Valor(BigDecimal.valueOf(10.4))
                .setCampo04DataVencimento(LocalDate.of(2016, Month.APRIL, 20))
                .setCampo05CodigoReceita("002")
                .setCampo06NumeroProcesso("101")
                .setCampo07IndicadorProcessoOrigem(SFIndicadorProcessoOrigem.JUSTICA_FEDERAL)
                .setCampo08DescricaoResumida("Resumo")
                .setCampo09DescricaoComplementar("Complemento")
                .setCampo10Referencia(SFReferencia.of(2016, Month.APRIL));

        Assert.assertEquals("|E316|001|10,40|20042016|002|101|1|Resumo|Complemento|042016|", linha.toString());

    }
}