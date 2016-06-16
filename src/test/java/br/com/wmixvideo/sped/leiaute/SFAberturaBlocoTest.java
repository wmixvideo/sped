package br.com.wmixvideo.sped.leiaute;

import br.com.wmixvideo.sped.enums.SFIndicadorMovimentoAberturaBloco;
import org.junit.Assert;
import org.junit.Test;

public class SFAberturaBlocoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFAberturaBloco linha = new SFAberturaBloco()
                .setCampo01CodigoRegistro("1234")
                .setCampo02IndicadorMovimento(SFIndicadorMovimentoAberturaBloco.COM);
        
        Assert.assertEquals("|1234|0|", linha.toString());
    }
}