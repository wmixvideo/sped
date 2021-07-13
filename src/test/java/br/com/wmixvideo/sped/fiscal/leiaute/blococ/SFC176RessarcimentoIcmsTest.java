package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import br.com.wmixvideo.sped.fiscal.enums.SFModeloDocumentoArrecadacao;
import br.com.wmixvideo.sped.fiscal.enums.SFMotivoRessarcimento;
import br.com.wmixvideo.sped.fiscal.enums.SFResponsavelRetencaoIcmsSt;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFC176RessarcimentoIcmsTest {
    @Test
    public void deveGerarLinhaCompleta() {
        final SFC176RessarcimentoIcms linha = new SFC176RessarcimentoIcms()
                .setCampo02CodigoModelo("0000")
                .setCampo03Numero("0001")
                .setCampo04Serie("0010")
                .setCampo05DataUltimaEntrada(LocalDate.of(2016, Month.MARCH, 22))
                .setCampo06CodigoParticipante("0011")
                .setCampo07Quantidade(10)
                .setCampo08ValorUnitario(BigDecimal.valueOf(1.01))
                .setCampo09ValorUnitarioBaseCalculoST(BigDecimal.valueOf(1.02))
                .setCampo10ChaveNFeUltimaEntrada("10101010101010101010101010101010101010101010")
                .setCampo11NumeroSequencialNFUltimaEntrada("11")
                .setCampo12ValorUnitarioBaseCalculoUltimaEntrada(BigDecimal.valueOf(1.12))
                .setCampo13AliquotaIcmsUltimaEntrada(BigDecimal.valueOf(1.13))
                .setCampo14ValorUnitarioBaseCalculoIcmsUltimaEntrada(BigDecimal.valueOf(1.14))
                .setCampo15ValorUnitarioCreditoIcmsUltimaEntrada(BigDecimal.valueOf(1.15))
                .setCampo16AliquotaIcmsStUltimaEntrada(BigDecimal.valueOf(1.16))
                .setCampo17ValorUnitarioRessarcimentoUltimaEntrada(BigDecimal.valueOf(1.17))
                .setCampo18ResponsavelRetencaoIcmsSt(SFResponsavelRetencaoIcmsSt.PROPRIO_DECLARANTE)
                .setCampo19MotivoRessarcimento(SFMotivoRessarcimento.VENDA_PARA_OUTRA_UF)
                .setCampo20ChaveNFComRetencaoIcmsSt("20202020202020202020202020202020202020202020")
                .setCampo21CodigoParticipanteNFComRetencaoIcmsSt("21")
                .setCampo22SerieNFComRetencaoIcmsSt("22")
                .setCampo23NumeroNFComRetencaoIcmsSt("23")
                .setCampo24SequencialItemNumeroNFComRetencaoIcmsSt("24")
                .setCampo25ModeloDocumentoArrecadacao(SFModeloDocumentoArrecadacao.GNRE)
                .setCampo26NumeroDocumentoArrecadacaoEstadual("26")
                ;

        Assert.assertEquals("|C176|0000|0001|0010|22032016|0011|10|1,01|1,02|10101010101010101010101010101010101010101010|11|1,12|1,13|1,14|1,15|1,16|1,17|3|1|20202020202020202020202020202020202020202020|21|22|23|24|1|26|", linha.toString());

    }
}