package br.com.wmixvideo.sped.leiaute.bloco1;

import org.junit.Assert;
import org.junit.Test;

public class SF1010ObrigatoriedadeRegistrosBloco1Test {

    @Test
    public void deveGerarLinhaCompleta() {
        Assert.assertEquals("|1010|N|N|N|N|N|N|N|N|N|N|N|N|N|", new SF1010ObrigatoriedadeRegistrosBloco1().toString());
    }
}