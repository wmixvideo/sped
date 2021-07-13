package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.util.SFReferencia;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFE116ObrigacoesICMSRecolherOperacoesPropriasTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFE116ObrigacoesICMSRecolherOperacoesProprias linha = new SFE116ObrigacoesICMSRecolherOperacoesProprias()
                .setCampo02Codigo("02")
                .setCampo03Valor(BigDecimal.valueOf(3))
                .setCampo04DataVencimento(LocalDate.of(2013, Month.FEBRUARY, 4))
                .setCampo05CodigoReceita("05")
                .setCampo06NumeroProcesso("06")
                .setCampo07IndicadorProcessoOrigem(SFIndicadorProcessoOrigem.SEFAZ)
                .setCampo08DescricaoResumida("08")
                .setCampo09DescricaoComplementar("09")
                .setCampo10Referencia(SFReferencia.of(2013, Month.JANUARY));

        Assert.assertEquals("|E116|02|3,00|04022013|05|06|0|08|09|012013|", linha.toString());
    }

}