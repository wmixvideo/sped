package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.modelo.SFContador;
import org.junit.Assert;
import org.junit.Test;

public class SF0100DadosContabilistaTest {
    @Test
    public void geraTexto() {
        final SFContador contador = new SFContador();
        contador.setNome("Contador");
        contador.setCpf("11122233344");
        contador.setCrc("99999999999");
        contador.setCnpj("12345678000190");
        contador.setCep("12345678");
        contador.setEndereco("ENDERECO");
        contador.setNumero("123");
        contador.setComplemento("SALA 1");
        contador.setBairro("CENTRO");
        contador.setTelefone("4812341234");
        contador.setFax("4843214321");
        contador.setEmail("email@email.com");
        contador.setMunicipioCodigo("4205407");

        Assert.assertEquals("|0100|Contador|11122233344|99999999999|12345678000190|12345678|ENDERECO|123|SALA 1|CENTRO|4812341234|4843214321|email@email.com|4205407|", new SF0100DadosContabilista(contador).toString());
    }
}