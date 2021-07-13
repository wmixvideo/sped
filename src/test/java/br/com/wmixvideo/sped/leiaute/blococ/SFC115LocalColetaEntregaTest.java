package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFTipoTransporte;
import org.junit.Assert;
import org.junit.Test;

public class SFC115LocalColetaEntregaTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFC115LocalColetaEntrega linha = new SFC115LocalColetaEntrega()
                .setCampo02TipoTransporte(SFTipoTransporte.FERROVIARIO)
                .setCampo03ColetaCnpj("00000000000000")
                .setCampo04ColetaInscricaoEstadual("00000")
                .setCampo05ColetaCpf("00000000000")
                .setCampo06ColetaCodigoMunicipio("0000")
                .setCampo07EntregaCnpj("11111111111111")
                .setCampo08EntregaInscricaoEstadual("11111")
                .setCampo09EntregaCpf("11111111111")
                .setCampo10EntregaCodigoMunicipio("1111");

        Assert.assertEquals("|C115|1|00000000000000|00000|00000000000|0000|11111111111111|11111|11111111111|1111|", linha.toString());
    }
}