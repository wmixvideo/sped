package br.com.wmixvideo.sped.leiaute.blocod;

import br.com.wmixvideo.sped.enums.SFIndicadorEmitente;
import br.com.wmixvideo.sped.enums.SFIndicadorOperacao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalFrete;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFD100NotaFiscalTransporteTest {

    @Test
    public void testeToString() throws Exception {
        final SFD100NotaFiscalTransporte linha = new SFD100NotaFiscalTransporte()
                .setIndicadorOperacao(SFIndicadorOperacao.PRESTACAO)
                .setIndicadorEmitente(SFIndicadorEmitente.EMISSAO_PROPRIA)
                .setCodigoParticipante("001")
                .setCodigoModelo("002")
                .setCodigoSituacao("003")
                .setSerie("004")
                .setSubserie("005")
                .setNumero("006")
                .setChaveTransporteEletronico("007")
                .setDataEmissao(LocalDate.of(2016, Month.MARCH, 10))
                .setDataAquisicao(LocalDate.of(2016, Month.MARCH, 5))
                .setTipoTransporteEletronico("008")
                .setChaveTransporteEletronicoReferencia("009")
                .setValor(BigDecimal.valueOf(10.1))
                .setValorDesconto(BigDecimal.valueOf(10.2))
                .setFrete(SFNotaFiscalFrete.POR_CONTA_DO_DESTINATARIO_REMETENTE)
                .setValorPrestacaoServico(BigDecimal.valueOf(10.3))
                .setValorBaseCalculo(BigDecimal.valueOf(10.4))
                .setValorICMS(BigDecimal.valueOf(10.5))
                .setValorNaoTributado(BigDecimal.valueOf(10.6))
                .setCodigoInformacaoComplementar("010")
                .setCodigoContaAnalitica("011");

        Assert.assertEquals("|D100|1|0|001|002|003|004|005|006|007|10032016|05032016|008|009|10,10|10,20|1|10,30|10,40|10,50|10,60|010|011|", linha.toString());

    }
}