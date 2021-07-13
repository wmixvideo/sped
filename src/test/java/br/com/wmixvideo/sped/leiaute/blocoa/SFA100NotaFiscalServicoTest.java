package br.com.wmixvideo.sped.leiaute.blocoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import org.junit.Assert;
import org.junit.Test;

import br.com.wmixvideo.sped.enums.SFIndicadorEmitente;
import br.com.wmixvideo.sped.enums.SFIndicadorOperacao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalPagamento;
import br.com.wmixvideo.sped.enums.SFNotaFiscalSituacao;

public class SFA100NotaFiscalServicoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFA100NotaFiscalServico linha = new SFA100NotaFiscalServico()
                .setCampo02IndicadorOperacao(SFIndicadorOperacao.AQUISICAO)
                .setCampo03IdicadorEmitente(SFIndicadorEmitente.EMISSAO_PROPRIA)
                .setCampo04CodigoParticipante("00000000004")
                .setCampo05CodigoSituacaoDocumentoFiscal(SFNotaFiscalSituacao.DOCUMENTO_REGULAR)
                .setCampo06SerieDocumento("06")
                .setCampo07SubserieDocumento("07")
                .setCampo08NumeroDocumento("08")
                .setCampo09ChaveCodigoVerificacaoEletronica("09")
                .setCampo10DataEmissao(LocalDate.of(2016, Month.FEBRUARY, 10))
                .setCampo11DataExecucao(LocalDate.of(2016, Month.FEBRUARY, 11))
                .setCampo12ValorTotalDocumento(BigDecimal.valueOf(12))
                .setCampo13Indicador(SFNotaFiscalPagamento.A_PRAZO)
                .setCampo14ValorTotalDesconto(BigDecimal.valueOf(14))
                .setCampo15ValorBaseCalculoPis(BigDecimal.valueOf(15))
                .setCampo16ValorTotalPis(BigDecimal.valueOf(16))
                .setCampo17ValorBaseCalculoCofins(BigDecimal.valueOf(17))
                .setCampo18ValorCofins(BigDecimal.valueOf(18))
                .setCampo19ValorPisRetidoFonte(BigDecimal.valueOf(19))
                .setCampo20ValorCofinsRetidoFonte(BigDecimal.valueOf(20))
                .setCampo21ValorTotalISS(BigDecimal.valueOf(21));

        Assert.assertEquals("|A100|0|0|00000000004|00|06|07|08|09|10022016|11022016|12,00|1|14,00|15,00|16,00|17,00|18,00|19,00|20,00|21,00|", linha.toString());
    }
}