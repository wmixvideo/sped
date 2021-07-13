package br.com.wmixvideo.sped.fiscal;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorMovimentoAberturaBloco;
import br.com.wmixvideo.sped.fiscal.leiaute.SFAberturaBloco;
import br.com.wmixvideo.sped.fiscal.leiaute.SFEncerramentoBloco;
import org.junit.Assert;
import org.junit.Test;

public class SFSpedFiscalTest {

    @Test
    public void arquivoVazioTest() {
        Assert.assertEquals("", new SFSpedFiscal().toString());
    }

    @Test
    public void arquivoUmaLinhaTest() {
        final SFSpedFiscal sped = new SFSpedFiscal();
        sped.getBloco0().addLinha(new SFAberturaBloco("666", SFIndicadorMovimentoAberturaBloco.SEM));
        Assert.assertEquals("|666|1|" + System.lineSeparator(), sped.toString());
    }

    @Test
    public void arquivoDuasLinhasTest() {
        final SFSpedFiscal sped = new SFSpedFiscal();
        sped.getBloco0().addLinha(new SFAberturaBloco("666", SFIndicadorMovimentoAberturaBloco.SEM));
        sped.getBloco0().addLinha(new SFEncerramentoBloco("666", 0));
        Assert.assertEquals("|666|1|" + System.lineSeparator() + "|666|0|" + System.lineSeparator(), sped.toString());
    }

}
