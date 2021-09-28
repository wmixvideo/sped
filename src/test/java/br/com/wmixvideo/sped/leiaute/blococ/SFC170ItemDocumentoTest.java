package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFIndicadorPeriodo;
import br.com.wmixvideo.sped.enums.SFMovimentacaoFisica;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFC170ItemDocumentoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFC170ItemDocumento linha = new SFC170ItemDocumento()
                .setCampo02Ordem("000000")
                .setCampo03Codigo("000001")
                .setCampo04Descricao("000010")
                .setCampo05Quantidade(BigDecimal.valueOf(10))
                .setCampo06Unidade("000011")
                .setCampo07Valor(BigDecimal.valueOf(10.01))
                .setCampo08ValorDesconto(BigDecimal.valueOf(10.02))
                .setCampo09MovimentacaoFisica(SFMovimentacaoFisica.SIM)
                .setCampo10CodigoSituacaoTributaria("000100")
                .setCampo11CodigoFiscalOperacaoPrestacao("000101")
                .setCampo12CodigoNaturezaOperacao("000110")
                .setCampo13ValorBaseCalculoIcms(BigDecimal.valueOf(10.03))
                .setCampo14ValorAliquotaIcms(BigDecimal.valueOf(10.04))
                .setCampo15ValorIcms(BigDecimal.valueOf(10.05))
                .setCampo16ValorBaseCalculoIcmsSt(BigDecimal.valueOf(10.06))
                .setCampo17ValorAliquotaIcmsSt(BigDecimal.valueOf(10.07))
                .setCampo18ValorIcmsSt(BigDecimal.valueOf(10.08))
                .setCampo19IndicadorPeriodo(SFIndicadorPeriodo.MENSAL)
                .setCampo20CodigoSituacaoTributariaIpi("000111")
                .setCampo21CodigoEnquadramentoIpi("001000")
                .setCampo22ValorBaseCalculoIpi(BigDecimal.valueOf(10.09))
                .setCampo23ValorAliquotaIpi(BigDecimal.valueOf(10.1))
                .setCampo24ValorIpi(BigDecimal.valueOf(10.11))
                .setCampo25CodigoStPis("001001")
                .setCampo26ValorBaseCalculoPis(BigDecimal.valueOf(10.12))
                .setCampo27ValorAliquotaPercentualPis(BigDecimal.valueOf(10.13))
                .setCampo28QuantidadeBaseCalculoPis(BigDecimal.valueOf(10.14))
                .setCampo29ValorAliquotaPis(BigDecimal.valueOf(10.15))
                .setCampo30ValorPis(BigDecimal.valueOf(10.16))
                .setCampo31CodigoStCofins("001010")
                .setCampo32ValorBaseCalculoCofins(BigDecimal.valueOf(10.17))
                .setCampo33ValorAliquotaPercentualCofins(BigDecimal.valueOf(10.18))
                .setCampo34QuantidadeBaseCalculoCofins(BigDecimal.valueOf(10.19))
                .setCampo35ValorAliquotaCofins(BigDecimal.valueOf(10.2))
                .setCampo36ValorCofins(BigDecimal.valueOf(10.21))
                .setCampo37ContaContabil("001011");

        Assert.assertEquals("|C170|000000|000001|000010|10,00000|000011|10,01|10,02|0|000100|000101|000110|10,03|10,04|10,05|10,06|10,07|10,08|0|000111|001000|10,09|10,10|10,11|001001|10,12|10,13|10,14|10,15|10,16|001010|10,17|10,18|10,19|10,20|10,21|001011|", linha.toString());
    }
}