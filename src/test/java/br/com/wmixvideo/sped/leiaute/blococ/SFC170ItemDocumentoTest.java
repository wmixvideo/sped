package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFIndicadorPeriodo;
import br.com.wmixvideo.sped.enums.SFMovimentacaoFisica;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFC170ItemDocumentoTest {

    @Test
    public void testeToString() throws Exception {
        final SFC170ItemDocumento linha = new SFC170ItemDocumento()
                .setMovimentacaoFisica(SFMovimentacaoFisica.SIM)
                .setIndicadorPeriodo(SFIndicadorPeriodo.MENSAL)
                .setQuantidade(10)
                .setNumero("000000")
                .setCodigo("000001")
                .setDescricao("000010")
                .setUnidade("000011")
                .setCodigoSituacaoTributaria("000100")
                .setCodigoFiscalOperacaoPrestacao("000101")
                .setCodigoNaturezaOperacao("000110")
                .setCodigoSituacaoTributariaIpi("000111")
                .setCodigoEnquadramentoIpi("001000")
                .setCodigoStPis("001001")
                .setCodigoStCofins("001010")
                .setContaContabil("001011")
                .setValor(BigDecimal.valueOf(10.01))
                .setValorDesconto(BigDecimal.valueOf(10.02))
                .setValorBaseCalculoIcms(BigDecimal.valueOf(10.03))
                .setValorAliquotaIcms(BigDecimal.valueOf(10.04))
                .setValorIcms(BigDecimal.valueOf(10.05))
                .setValorBaseCalculoIcmsSt(BigDecimal.valueOf(10.06))
                .setValorAliquotaIcmsSt(BigDecimal.valueOf(10.07))
                .setValorIcmsSt(BigDecimal.valueOf(10.08))
                .setValorBaseCalculoIpi(BigDecimal.valueOf(10.09))
                .setValorAliquotaIpi(BigDecimal.valueOf(10.1))
                .setValorIpi(BigDecimal.valueOf(10.11))
                .setValorBaseCalculoPis(BigDecimal.valueOf(10.12))
                .setValorAliquotaPercentualPis(BigDecimal.valueOf(10.13))
                .setQuantidadeBaseCalculoPis(BigDecimal.valueOf(10.14))
                .setValorAliquotaPis(BigDecimal.valueOf(10.15))
                .setValorPis(BigDecimal.valueOf(10.16))
                .setValorBaseCalculoCofins(BigDecimal.valueOf(10.17))
                .setValorAliquotaPercentualCofins(BigDecimal.valueOf(10.18))
                .setQuantidadeBaseCalculoCofins(BigDecimal.valueOf(10.19))
                .setValorAliquotaCofins(BigDecimal.valueOf(10.2))
                .setValorCofins(BigDecimal.valueOf(10.21));

        Assert.assertEquals("|C170|000000|000001|000010|10|000011|10,01|10,02|0|000100|000101|000110|10,03|10,04|10,05|10,06|10,07|10,08|0|000111|001000|10,09|10,10|10,11|001001|10,12|10,13|10,14|10,15|10,16|001010|10,17|10,18|10,19|10,20|10,21|001011|", linha.toString());
    }
}