package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFFinalidadeArquivo;
import br.com.wmixvideo.sped.leiaute.SFIndicadorTipoAtividade;
import br.com.wmixvideo.sped.leiaute.SFPerfilApresentacaoArquivoFiscal;
import br.com.wmixvideo.sped.modelo.SFEntidade;
import br.com.wmixvideo.sped.modelo.SFUnidadeFederativa;
import br.com.wmixvideo.sped.util.SFReferencia;
import org.junit.Assert;
import org.junit.Test;

import java.time.Month;

public class SF000AberturaArquivoDigitalTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SFEntidade entidade = new SFEntidade()
                .setRazaoSocial("Empresa LTDA")
                .setCnpj("00000000000000")
                .setCpf("00000000000")
                .setInscricaoEstadual("00000")
                .setInscricaoMunicipal("000")
                .setSuframa("00");

        entidade.getEndereco().setUf(SFUnidadeFederativa.SC);
        entidade.getEndereco().setCodigoMunicipio("4216602");

        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital(entidade, SFReferencia.of(2016, Month.FEBRUARY), SFFinalidadeArquivo.REMESSA_ORIGINAL)
                .setPerfilApresentacaoArquivoFiscal(SFPerfilApresentacaoArquivoFiscal.PERFIL_B)
                .setIndicadorTipoAtividade(SFIndicadorTipoAtividade.OUTROS);

        Assert.assertEquals("|0000|010|0|01022016|29022016|Empresa LTDA|00000000000000|00000000000|SC|00000|4216602|000|00|B|1|", header.toString());
    }

    @Test
    public void deveRetornarNuloSeNaoTiverReferencia() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital();
        Assert.assertNull(header.toString());
    }

    @Test
    public void deveGerarLeiaute2() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital().setReferencia(SFReferencia.of(2008, Month.OCTOBER));
        Assert.assertEquals("|0000|002||01102008|31102008|||||||||||", header.toString());
    }

    @Test
    public void deveGerarLeiaute3() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital().setReferencia(SFReferencia.of(2010, Month.JANUARY));
        Assert.assertEquals("|0000|003||01012010|31012010|||||||||||", header.toString());
    }

    @Test
    public void deveGerarLeiaute4() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital().setReferencia(SFReferencia.of(2011, Month.JANUARY));
        Assert.assertEquals("|0000|004||01012011|31012011|||||||||||", header.toString());
    }

    @Test
    public void deveGerarLeiaute5() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital().setReferencia(SFReferencia.of(2012, Month.JANUARY));
        Assert.assertEquals("|0000|005||01012012|31012012|||||||||||", header.toString());
    }

    @Test
    public void deveGerarLeiaute6() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital().setReferencia(SFReferencia.of(2012, Month.JULY));
        Assert.assertEquals("|0000|006||01072012|31072012|||||||||||", header.toString());
    }

    @Test
    public void deveGerarLeiaute7() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital().setReferencia(SFReferencia.of(2013, Month.JANUARY));
        Assert.assertEquals("|0000|007||01012013|31012013|||||||||||", header.toString());
    }

    @Test
    public void deveGerarLeiaute8() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital().setReferencia(SFReferencia.of(2014, Month.FEBRUARY));
        Assert.assertEquals("|0000|008||01022014|28022014|||||||||||", header.toString());
    }

    @Test
    public void deveGerarLeiaute9() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital().setReferencia(SFReferencia.of(2015, Month.FEBRUARY));
        Assert.assertEquals("|0000|009||01022015|28022015|||||||||||", header.toString());
    }

    @Test
    public void deveGerarLeiaute10() {
        final SF000AberturaArquivoDigital header = new SF000AberturaArquivoDigital().setReferencia(SFReferencia.of(2016, Month.FEBRUARY));
        Assert.assertEquals("|0000|010||01022016|29022016|||||||||||", header.toString());
    }
}