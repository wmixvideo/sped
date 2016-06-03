package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.util.SFReferencia;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFE316ObrigacoesFundoCombatePobrezaTest {

    @Test
    public void testeToString() throws Exception {
        final SFE316ObrigacoesFundoCombatePobreza linha = new SFE316ObrigacoesFundoCombatePobreza()
                .setCodigo("001")
                .setCodigoReceita("002")
                .setNumeroProcesso("101")
                .setDescricaoResumida("Resumo")
                .setDescricaoComplementar("Complemento")
                .setReferencia(SFReferencia.of(2016, Month.APRIL))
                .setValor(BigDecimal.valueOf(10.4))
                .setDataVencimento(LocalDate.of(2016, Month.APRIL, 20))
                .setIndicadorProcessoOrigem(SFIndicadorProcessoOrigem.JUSTICA_FEDERAL);

        Assert.assertEquals("|E316|001|10,40|20042016|002|101|1|Resumo|Complemento|042016|", linha.toString());

    }
}