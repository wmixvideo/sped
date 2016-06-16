package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0150CadastroParticipanteTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SF0150CadastroParticipante linha = new SF0150CadastroParticipante()
                .setCampo02CodigoParticipante("12345678909")
                .setCampo03Nome("CLIENTE DA SILVA")
                .setCampo04CodigoPais("01058")
                .setCampo05Cnpj("1234567890987")
                .setCampo06Cpf("12345678909")
                .setCampo07InscricaoEstadual("001002003")
                .setCampo08CodigoMunicipio("4216602")
                .setCampo09Suframa("321")
                .setCampo10Logradouro("AV BRIGADEIRO SILVA PAES")
                .setCampo11Numero("225")
                .setCampo12Complemento("")
                .setCampo13Bairro("CAMPINAS");

        Assert.assertEquals("|0150|12345678909|CLIENTE DA SILVA|01058|1234567890987|12345678909|001002003|4216602|321|AV BRIGADEIRO SILVA PAES|225||CAMPINAS|", linha.toString());
    }
}