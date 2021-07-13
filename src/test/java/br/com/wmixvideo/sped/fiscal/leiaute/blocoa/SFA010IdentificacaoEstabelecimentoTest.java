package br.com.wmixvideo.sped.fiscal.leiaute.blocoa;

import org.junit.Assert;
import org.junit.Test;

public class SFA010IdentificacaoEstabelecimentoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFA010IdentificacaoEstabelecimento linha = new SFA010IdentificacaoEstabelecimento().setCampo02CNPJ("012345678901234");
        Assert.assertEquals("|A010|012345678901234|", linha.toString());
    }
}
