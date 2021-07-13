package br.com.wmixvideo.sped.fiscal.leiaute.blocod;

import br.com.wmixvideo.sped.fiscal.enums.SFDocumentoModelo;
import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorEmitente;
import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorOperacao;
import br.com.wmixvideo.sped.fiscal.enums.SFNotaFiscalFrete;
import br.com.wmixvideo.sped.fiscal.enums.SFSituacaoDocumento;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFD100NotaFiscalTransporteTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFD100NotaFiscalTransporte linha = new SFD100NotaFiscalTransporte()
                .setCampo02IndicadorOperacao(SFIndicadorOperacao.PRESTACAO)
                .setCampo03IndicadorEmitente(SFIndicadorEmitente.EMISSAO_PROPRIA)
                .setCampo04CodigoParticipante("001")
                .setCampo05Modelo(SFDocumentoModelo.NOTA_FISCAL_DE_VENDA_A_CONSUMIDOR)
                .setCampo06Situacao(SFSituacaoDocumento.ESCRITURACAO_EXTEMPORANEA_DOCUMENTO_CANCELADO)
                .setCampo07Serie("004")
                .setCampo08Subserie("005")
                .setCampo09Numero("006")
                .setCampo10ChaveTransporteEletronico("007")
                .setCampo11DataEmissao(LocalDate.of(2016, Month.MARCH, 10))
                .setCampo12DataAquisicao(LocalDate.of(2016, Month.MARCH, 5))
                .setCampo13TipoTransporteEletronico("008")
                .setCampo14ChaveTransporteEletronicoReferencia("009")
                .setCampo15Valor(BigDecimal.valueOf(10.1))
                .setCampo16ValorDesconto(BigDecimal.valueOf(10.2))
                .setCampo17Frete(SFNotaFiscalFrete.POR_CONTA_DO_DESTINATARIO_REMETENTE)
                .setCampo18ValorPrestacaoServico(BigDecimal.valueOf(10.3))
                .setCampo19ValorBaseCalculo(BigDecimal.valueOf(10.4))
                .setCampo20ValorICMS(BigDecimal.valueOf(10.5))
                .setCampo21ValorNaoTributado(BigDecimal.valueOf(10.6))
                .setCampo22CodigoInformacaoComplementar("010")
                .setCampo23CodigoContaAnalitica("011")
                .setCampo24CodigoMunicipioOrigem("4216602")
                .setCampo25CodigoMunicipioDestino("4205407");

        Assert.assertEquals("|D100|1|0|001|02|03|004|005|006|007|10032016|05032016|008|009|10,10|10,20|1|10,30|10,40|10,50|10,60|010|011|4216602|4205407|", linha.toString());
    }
}