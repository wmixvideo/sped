package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorMovimento;
import org.junit.Assert;
import org.junit.Test;

public class SF0001AberturaBloco0Test {


    @Test
    public void deveGerarLinhaCompletaComDados() {
        final SC0001AberturaBloco0 linha = new SC0001AberturaBloco0().setCampo02IndicadorMovimento(SCIndicadorMovimento.COM_DADOS);
        Assert.assertEquals("|0001|0|", linha.toString());
    }

    @Test
    public void deveGerarLinhaCompletaSemDados() {
        final SC0001AberturaBloco0 linha = new SC0001AberturaBloco0().setCampo02IndicadorMovimento(SCIndicadorMovimento.SEM_DADOS);
        Assert.assertEquals("|0001|1|", linha.toString());
    }

}