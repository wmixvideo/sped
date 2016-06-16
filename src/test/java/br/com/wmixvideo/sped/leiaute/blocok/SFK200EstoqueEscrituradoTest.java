package br.com.wmixvideo.sped.leiaute.blocok;

import br.com.wmixvideo.sped.enums.SFIndicadorEstoque;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SFK200EstoqueEscrituradoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFK200EstoqueEscriturado linha = new SFK200EstoqueEscriturado()
                .setCampo02DataEstoqueFinal(LocalDate.of(2010, 7, 31))
                .setCampo03CodigoProduto("124315")
                .setCampo04QuantidadeEmEstoque(10)
                .setCampo05TipoEstoque(SFIndicadorEstoque.DO_INFORMANTE_EM_SEU_PODER)
                .setCampo06CodigoParticipante("");

        Assert.assertEquals("|K200|31072010|124315|10|0||", linha.toString());
    }
}