package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.modelo.SFParticipante;
import org.junit.Assert;
import org.junit.Test;

public class SF0150CadastroParticipanteTest {

    @Test
    public void geraTextoComCPF() {
        final SFParticipante participante = new SFParticipante();
        participante.setNome("CLIENTE DA SILVA");
        participante.setCpf("12345678909");
        participante.setInscricaoEstadual("001002003");

        participante.getEndereco().setLogradouro("AV BRIGADEIRO SILVA PAES");
        participante.getEndereco().setNumero("225");
        participante.getEndereco().setComplemento("");
        participante.getEndereco().setBairro("CAMPINAS");
        participante.getEndereco().setCodigoMunicipio("4216602");

        Assert.assertEquals("|0150|12345678909|CLIENTE DA SILVA|01058||12345678909|001002003|4216602||AV BRIGADEIRO SILVA PAES|225||CAMPINAS|", new SF0150CadastroParticipante(participante).toString());
    }

    @Test
    public void geraTextoComCNPJ() {
        final SFParticipante participante = new SFParticipante();
        participante.setNome("CLIENTE DA SILVA");
        participante.setCnpj("83017152000124");
        participante.setInscricaoEstadual("001002003");

        participante.getEndereco().setLogradouro("AV BRIGADEIRO SILVA PAES");
        participante.getEndereco().setNumero("225");
        participante.getEndereco().setComplemento("");
        participante.getEndereco().setBairro("CAMPINAS");
        participante.getEndereco().setCodigoMunicipio("4216602");

        Assert.assertEquals("|0150|83017152000124|CLIENTE DA SILVA|01058|83017152000124||001002003|4216602||AV BRIGADEIRO SILVA PAES|225||CAMPINAS|", new SF0150CadastroParticipante(participante).toString());
    }

    @Test
    public void semMunicipioDeixaVazio() {
        final SFParticipante participante = new SFParticipante();
        participante.setNome("CLIENTE DA SILVA");
        participante.setCnpj("83017152000124");
        participante.setInscricaoEstadual("001002003");

        participante.getEndereco().setLogradouro("AV BRIGADEIRO SILVA PAES");
        participante.getEndereco().setNumero("225");
        participante.getEndereco().setComplemento("");
        participante.getEndereco().setBairro("CAMPINAS");

        Assert.assertEquals("|0150|83017152000124|CLIENTE DA SILVA|01058|83017152000124||001002003|||AV BRIGADEIRO SILVA PAES|225||CAMPINAS|", new SF0150CadastroParticipante(participante).toString());
    }

    @Test
    public void mantemPosicaoDePossuiAlteracoesVerdadeiro() {
        final SFParticipante participante = new SFParticipante();
        participante.setPossuiAlteracoes(true);
        Assert.assertTrue(new SF0150CadastroParticipante(participante).isPossuiAlteracoes());
    }

    @Test
    public void mantemPosicaoDePossuiAlteracoesFalso() {
        final SFParticipante participante = new SFParticipante();
        participante.setPossuiAlteracoes(false);
        Assert.assertFalse(new SF0150CadastroParticipante(participante).isPossuiAlteracoes());
    }
}