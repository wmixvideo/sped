package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0100DadosContabilistaTest {
    @Test
    public void geraTexto() {
        final SF0100DadosContabilista linha = new SF0100DadosContabilista()
                .setNome("Contador")
                .setCpf("11122233344")
                .setCrc("99999999999")
                .setCnpj("12345678000190")
                .setCep("12345678")
                .setEndereco("ENDERECO")
                .setNumero("123")
                .setComplemento("SALA 1")
                .setBairro("CENTRO")
                .setTelefone("4812341234")
                .setFax("4843214321")
                .setEmail("email@email.com")
                .setMunicipioCodigo("4205407");

        Assert.assertEquals("|0100|Contador|11122233344|99999999999|12345678000190|12345678|ENDERECO|123|SALA 1|CENTRO|4812341234|4843214321|email@email.com|4205407|", linha.toString());
    }
}