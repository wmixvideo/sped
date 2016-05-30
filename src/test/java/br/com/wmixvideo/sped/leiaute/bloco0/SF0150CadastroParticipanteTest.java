package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0150CadastroParticipanteTest {

    @Test
    public void geraTextoComCPF() {
        final SF0150CadastroParticipante linha = new SF0150CadastroParticipante()
                .setNome("CLIENTE DA SILVA")
                .setCodigoParticipante("12345678909")
                .setCpf("12345678909")
                .setInscricaoEstadual("001002003")
                .setLogradouro("AV BRIGADEIRO SILVA PAES")
                .setNumero("225")
                .setComplemento("")
                .setBairro("CAMPINAS")
                .setCodigoMunicipio("4216602")
                .setCodigoPais("01058");

        Assert.assertEquals("|0150|12345678909|CLIENTE DA SILVA|01058||12345678909|001002003|4216602||AV BRIGADEIRO SILVA PAES|225||CAMPINAS|", linha.toString());
    }

    @Test
    public void geraTextoComCNPJ() {
        final SF0150CadastroParticipante linha = new SF0150CadastroParticipante()
                .setNome("CLIENTE DA SILVA")
                .setCodigoParticipante("83017152000124")
                .setCnpj("83017152000124")
                .setInscricaoEstadual("001002003")
                .setLogradouro("AV BRIGADEIRO SILVA PAES")
                .setNumero("225")
                .setComplemento("")
                .setBairro("CAMPINAS")
                .setCodigoMunicipio("4216602")
                .setCodigoPais("01058");

        Assert.assertEquals("|0150|83017152000124|CLIENTE DA SILVA|01058|83017152000124||001002003|4216602||AV BRIGADEIRO SILVA PAES|225||CAMPINAS|", linha.toString());
    }

    @Test
    public void semMunicipioDeixaVazio() {
        final SF0150CadastroParticipante linha = new SF0150CadastroParticipante()
                .setNome("CLIENTE DA SILVA")
                .setCodigoParticipante("83017152000124")
                .setCnpj("83017152000124")
                .setInscricaoEstadual("001002003")
                .setLogradouro("AV BRIGADEIRO SILVA PAES")
                .setNumero("225")
                .setComplemento("")
                .setBairro("CAMPINAS")
                .setCodigoPais("01058");

        Assert.assertEquals("|0150|83017152000124|CLIENTE DA SILVA|01058|83017152000124||001002003|||AV BRIGADEIRO SILVA PAES|225||CAMPINAS|", linha.toString());
    }
}