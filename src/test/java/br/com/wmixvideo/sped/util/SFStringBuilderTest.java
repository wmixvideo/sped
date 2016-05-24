package br.com.wmixvideo.sped.util;

import org.junit.Assert;
import org.junit.Test;

public class SFStringBuilderTest {

    @Test
    public void deveIniciarComPipe() {
        Assert.assertEquals("|", new SFStringBuilder().toString());
    }

    @Test
    public void deveIncluirSeparador() {
        Assert.assertEquals("|0001|", new SFStringBuilder().append("0001").toString());
    }

    @Test
    public void deveAdicionarCamposEmSequencia() {
        Assert.assertEquals("|0001|FERNANDO|", new SFStringBuilder().append("0001").append("FERNANDO").toString());
    }

    @Test
    public void deveRemoverEspacosInicioOuFim() {
        Assert.assertEquals("|0001|FERNANDO|", new SFStringBuilder().append("0001").append(" FERNANDO ").toString());
    }

    @Test
    public void deveGerarEmBrancoQuandoTextoNulo() {
        Assert.assertEquals("||", new SFStringBuilder().append(null).toString());
    }

    @Test
    public void deveSubstituirPipePorEspaco() {
        Assert.assertEquals("|FERN ANDO|", new SFStringBuilder().append("FERN|ANDO").toString());
    }
}