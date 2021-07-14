package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.contribuicoes.enums.SCInformacaoComplementar;
import br.com.wmixvideo.sped.util.SFReferencia;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.Month;

public class SC0120SemDadosTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SC0120SemDados linha = new SC0120SemDados()
                .setCampo02Referencia(SFReferencia.of(1983, Month.DECEMBER))
                .setCampo03InformacaoComplementar(SCInformacaoComplementar.DEMAIS_HIPOTESES);

        Assert.assertEquals("|0120|121983|99|", linha.toString());
    }
}