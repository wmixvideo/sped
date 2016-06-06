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
    public void testeToString() throws Exception {
        final SFC500NotaFiscalEnergiaEletrica linha = new SFC500NotaFiscalEnergiaEletrica()
                .setOperacao(SFNotaFiscalOperacao.ENTRADA)
                .setEmissao(SFNotaFiscalEmissao.TERCEIROS)
                .setCodigoParticipante("11111111111")
                .setCodigoModeloFiscal("111")
                .setSituacao(SFNotaFiscalSituacao.DOCUMENTO_REGULAR)
                .setSerie("001")
                .setSubserie("0001")
                .setClasse(SFClasseConsumoEnergial.CONSUMO_PROPRIO)
                .setNumero("123")
                .setDataEmissao(LocalDate.of(2016, Month.APRIL, 10))
                .setDataOperacao(LocalDate.of(2016, Month.APRIL, 9))
                .setValorDocumento(BigDecimal.valueOf(10.5))
                .setValorDesconto(BigDecimal.valueOf(10.6))
                .setValorFornecido(BigDecimal.valueOf(10.7))
                .setValorNaoTributado(BigDecimal.valueOf(10.8))
                .setValorEmNomeDeTerceiros(BigDecimal.valueOf(10.9))
                .setValorDespesasAcessorias(BigDecimal.valueOf(11.0))
                .setValorBaseCalculoIcms(BigDecimal.valueOf(11.1))
                .setValorIcms(BigDecimal.valueOf(11.2))
                .setValorBaseCalculoIcmsSt(BigDecimal.valueOf(11.3))
                .setValorIcmsSt(BigDecimal.valueOf(11.4))
                .setCodigoInformacaoComplementar("321")
                .setValorPis(BigDecimal.valueOf(11.5))
                .setValorCofins(BigDecimal.valueOf(11.6))
                .setTipoLigacao(SFTipoLigacaoEletrica.TRIFASICO)
                .setGrupoTensao(SFGrupoTensaoEletrica.AS_ALTA_TENSAO);

        Assert.assertEquals("|C500|0|1|11111111111|111|00|001|0001|02|123|10042016|09042016|10,50|10,60|10,70|10,80|10,90|11,00|11,10|11,20|11,30|11,40|321|11,50|11,60|3|06|", linha.toString());
    }
}