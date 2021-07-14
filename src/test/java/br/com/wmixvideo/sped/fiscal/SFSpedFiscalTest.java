package br.com.wmixvideo.sped.fiscal;

import br.com.wmixvideo.sped.fiscal.leiaute.bloco0.SF0005DadosComplementaresEntidade;
import br.com.wmixvideo.sped.fiscal.leiaute.bloco0.SF000AberturaArquivoDigital;
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
        sped.getBloco0().addLinha(new SF000AberturaArquivoDigital());
        Assert.assertEquals("|0000|012||||||||||||||" + System.lineSeparator(), sped.toString());
    }

    @Test
    public void arquivoDuasLinhasTest() {
        final SFSpedFiscal sped = new SFSpedFiscal();
        sped.getBloco0().addLinha(new SF000AberturaArquivoDigital());
        sped.getBloco0().addLinha(new SF0005DadosComplementaresEntidade());
        Assert.assertEquals("|0000|012||||||||||||||" + System.lineSeparator() + "|0005||||||||||" + System.lineSeparator(), sped.toString());
    }
}
