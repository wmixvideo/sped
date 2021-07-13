package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFClasseConsumoEnergial;
import br.com.wmixvideo.sped.enums.SFGrupoTensaoEletrica;
import br.com.wmixvideo.sped.enums.SFNotaFiscalEmissao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalOperacao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalSituacao;
import br.com.wmixvideo.sped.enums.SFTipoLigacaoEletrica;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFC500NotaFiscalEnergiaEletricaTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFC500NotaFiscalEnergiaEletrica linha = new SFC500NotaFiscalEnergiaEletrica()
                .setCampo02Operacao(SFNotaFiscalOperacao.ENTRADA)
                .setCampo03Emissao(SFNotaFiscalEmissao.TERCEIROS)
                .setCampo04CodigoParticipante("11111111111")
                .setCampo05CodigoModeloFiscal("111")
                .setCampo06Situacao(SFNotaFiscalSituacao.DOCUMENTO_REGULAR)
                .setCampo07Serie("001")
                .setCampo08Subserie("0001")
                .setCampo09Classe(SFClasseConsumoEnergial.CONSUMO_PROPRIO)
                .setCampo10Numero("123")
                .setCampo11DataEmissao(LocalDate.of(2016, Month.APRIL, 10))
                .setCampo12DataOperacao(LocalDate.of(2016, Month.APRIL, 9))
                .setCampo13ValorDocumento(BigDecimal.valueOf(10.5))
                .setCampo14ValorDesconto(BigDecimal.valueOf(10.6))
                .setCampo15ValorFornecido(BigDecimal.valueOf(10.7))
                .setCampo16ValorNaoTributado(BigDecimal.valueOf(10.8))
                .setCampo17ValorEmNomeDeTerceiros(BigDecimal.valueOf(10.9))
                .setCampo18ValorDespesasAcessorias(BigDecimal.valueOf(11.0))
                .setCampo19ValorBaseCalculoIcms(BigDecimal.valueOf(11.1))
                .setCampo20ValorIcms(BigDecimal.valueOf(11.2))
                .setCampo21ValorBaseCalculoIcmsSt(BigDecimal.valueOf(11.3))
                .setCampo22ValorIcmsSt(BigDecimal.valueOf(11.4))
                .setCampo23CodigoInformacaoComplementar("321")
                .setCampo24ValorPis(BigDecimal.valueOf(11.5))
                .setCampo25ValorCofins(BigDecimal.valueOf(11.6))
                .setCampo26TipoLigacao(SFTipoLigacaoEletrica.TRIFASICO)
                .setCampo27GrupoTensao(SFGrupoTensaoEletrica.AS_ALTA_TENSAO);

        Assert.assertEquals("|C500|0|1|11111111111|111|00|001|0001|02|123|10042016|09042016|10,50|10,60|10,70|10,80|10,90|11,00|11,10|11,20|11,30|11,40|321|11,50|11,60|3|06|", linha.toString());
    }
}