package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0005DadosComplementaresEntidadeTest {

    @Test
    public void gerarTexto() {
        final SF0005DadosComplementaresEntidade linha = new SF0005DadosComplementaresEntidade()
                .setNomeFantasia("Empresa")
                .setTelefone("4844444444")
                .setFax("4833333333")
                .setEmail("teste@empresa.com.br")
                .setCep("88000000")
                .setLogradouro("AV Principal")
                .setNumero("5000")
                .setBairro("CAMPINAS");

        Assert.assertEquals("|0005|Empresa|88000000|AV Principal|5000||CAMPINAS|4844444444|4833333333|teste@empresa.com.br|", linha.toString());
    }
}