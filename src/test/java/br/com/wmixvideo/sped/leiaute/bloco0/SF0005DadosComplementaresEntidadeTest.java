package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.modelo.SFEntidade;
import org.junit.Assert;
import org.junit.Test;

public class SF0005DadosComplementaresEntidadeTest {

    @Test
    public void gerarTexto() {
        final SFEntidade entidade = new SFEntidade()
                .setNomeFantasia("Empresa")
                .setTelefone("4844444444")
                .setFax("4833333333")
                .setEmail("teste@empresa.com.br");

        entidade.getEndereco().setCep("88000000");
        entidade.getEndereco().setLogradouro("AV Principal");
        entidade.getEndereco().setNumero("5000");
        entidade.getEndereco().setBairro("CAMPINAS");

        Assert.assertEquals("|0005|Empresa|88000000|AV Principal|5000||CAMPINAS|4844444444|4833333333|teste@empresa.com.br|", new SF0005DadosComplementaresEntidade(entidade).toString());
    }
}