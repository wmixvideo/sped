package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFNotaFiscalEmissao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalFrete;
import br.com.wmixvideo.sped.enums.SFNotaFiscalOperacao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalPagamento;
import br.com.wmixvideo.sped.enums.SFNotaFiscalSituacao;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFC100NotaFiscalTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFC100NotaFiscal linha = new SFC100NotaFiscal()
                .setCampo02Operacao(SFNotaFiscalOperacao.SAIDA)
                .setCampo03Emissao(SFNotaFiscalEmissao.PROPRIA)
                .setCampo04CodigoParticipante("00000000004")
                .setCampo05CodigoModeloFiscal("05")
                .setCampo06Situacao(SFNotaFiscalSituacao.DOCUMENTO_REGULAR)
                .setCampo07Serie("07")
                .setCampo08Numero("08")
                .setCampo09ChaveNotaFiscalEletronica("09")
                .setCampo10DataEmissao(LocalDate.of(2016, Month.FEBRUARY, 10))
                .setCampo11DataOperacao(LocalDate.of(2016, Month.FEBRUARY, 11))
                .setCampo12ValorDocumento(BigDecimal.valueOf(12))
                .setCampo13Pagamento(SFNotaFiscalPagamento.A_PRAZO)
                .setCampo14ValorDesconto(BigDecimal.valueOf(14))
                .setCampo15ValorAbatimentoNaoTributado(BigDecimal.valueOf(15))
                .setCampo16ValorMercadoriaEServico(BigDecimal.valueOf(16))
                .setCampo17Frete(SFNotaFiscalFrete.POR_CONTA_DO_DESTINATARIO_REMETENTE)
                .setCampo18ValorFrete(BigDecimal.valueOf(18))
                .setCampo19ValorSeguro(BigDecimal.valueOf(19))
                .setCampo20ValorOutrasDespesasAcessorias(BigDecimal.valueOf(20))
                .setCampo21ValorBaseCalculoIcms(BigDecimal.valueOf(21))
                .setCampo22ValorIcms(BigDecimal.valueOf(22))
                .setCampo23ValorBaseCalculoIcmsSt(BigDecimal.valueOf(23))
                .setCampo24ValorIcmsSt(BigDecimal.valueOf(24))
                .setCampo25ValorIpi(BigDecimal.valueOf(25))
                .setCampo26ValorPis(BigDecimal.valueOf(26))
                .setCampo27ValorCofins(BigDecimal.valueOf(27))
                .setCampo28ValorPisSt(BigDecimal.valueOf(28))
                .setCampo29ValorCofinsSt(BigDecimal.valueOf(29));

        Assert.assertEquals("|C100|1|0|00000000004|05|00|07|08|09|10022016|11022016|12,00|1|14,00|15,00|16,00|1|18,00|19,00|20,00|21,00|22,00|23,00|24,00|25,00|26,00|27,00|28,00|29,00|", linha.toString());

    }
}