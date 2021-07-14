package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.fiscal.enums.SFUnidadeFederativa;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorNaturezaPessoaJuridica;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorSituacaoEspecial;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorTipoAtividadePredominante;
import br.com.wmixvideo.sped.contribuicoes.enums.SCTipoEscrituracao;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SC0000AberturaArquivoDigitalTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SC0000AberturaArquivoDigital linha = new SC0000AberturaArquivoDigital()
                .setCampo03TipoEscrituracao(SCTipoEscrituracao.ORIGINAL)
                .setCampo04IndicadorSituacaoEspecial(SCIndicadorSituacaoEspecial.ABERTURA)
                .setCampo05NumeroReciboEscrituracaoAnterior(null)
                .setCampo06DataInicio(LocalDate.of(2019, Month.APRIL, 1))
                .setCampo07DataFim(LocalDate.of(2019, Month.APRIL, 30))
                .setCampo08RazaoSocial("Empresa LTDA")
                .setCampo09Cnpj("00000000000000")
                .setCampo10Uf(SFUnidadeFederativa.SC)
                .setCampo11CodigoMunicipio("4216602")
                .setCampo12Suframa(null)
                .setCampo13IndicadorNatureza(SCIndicadorNaturezaPessoaJuridica.PESSOA_JURIDICA)
                .setCampo14IndicadorTipoAtividade(SCIndicadorTipoAtividadePredominante.COMERCIO);

        Assert.assertEquals("|0000|3.1.0|0|0||01042019|30042019|Empresa LTDA|00000000000000|SC|4216602||00|2|", linha.toString());
    }
}