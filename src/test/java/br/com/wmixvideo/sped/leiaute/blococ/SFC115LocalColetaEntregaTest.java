package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFTipoTransporte;
import org.junit.Assert;
import org.junit.Test;

public class SFC115LocalColetaEntregaTest {

    @Test
    public void testeToString() throws Exception {
        final SFC115LocalColetaEntrega linha = new SFC115LocalColetaEntrega()
                .setTipoTransporte(SFTipoTransporte.FERROVIARIO)
                .setColetaCnpj("00000000000000")
                .setColetaInscricaoEstadual("00000")
                .setColetaCpf("00000000000")
                .setColetaCodigoMunicipio("0000")
                .setEntregaCnpj("11111111111111")
                .setEntregaInscricaoEstadual("11111")
                .setEntregaCpf("11111111111")
                .setEntregaCodigoMunicipio("1111");

        Assert.assertEquals("|C115|1|00000000000000|00000|00000000000|0000|11111111111111|11111|11111111111|1111|", linha.toString());
    }
}