package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFFinalidadeArquivo;
import br.com.wmixvideo.sped.enums.SFIndicadorTipoAtividade;
import br.com.wmixvideo.sped.enums.SFUnidadeFederativa;
import br.com.wmixvideo.sped.leiaute.SFPerfilApresentacaoArquivoFiscal;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SF000AberturaArquivoDigitalTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital()
                .setCampo03Finalidade(SFFinalidadeArquivo.REMESSA_ORIGINAL)
                .setCampo04DataInicio(LocalDate.of(2016, Month.FEBRUARY, 1))
                .setCampo05DataFim(LocalDate.of(2016, Month.FEBRUARY, 29))
                .setCampo06RazaoSocial("Empresa LTDA")
                .setCampo07Cnpj("00000000000000")
                .setCampo08Cpf("00000000000")
                .setCampo09Uf(SFUnidadeFederativa.SC)
                .setCampo10InscricaoEstadual("00000")
                .setCampo11CodigoMunicipio("4216602")
                .setCampo12InscricaoMunicipal("000")
                .setCampo13Suframa("00")
                .setCampo14PerfilApresentacaoArquivoFiscal(SFPerfilApresentacaoArquivoFiscal.PERFIL_B)
                .setCampo15IndicadorTipoAtividade(SFIndicadorTipoAtividade.OUTROS);

        Assert.assertEquals("|0000|011|0|01022016|29022016|Empresa LTDA|00000000000000|00000000000|SC|00000|4216602|000|00|B|1|", header.toString());
    }
}