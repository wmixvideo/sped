package br.com.wmixvideo.sped.fiscal.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0100DadosContabilistaTest {
    @Test
    public void deveGerarLinhaCompleta() {
        final SF0100DadosContabilista linha = new SF0100DadosContabilista()
                .setCampo02Nome("Contador")
                .setCampo03Cpf("11122233344")
                .setCampo04Crc("99999999999")
                .setCampo05Cnpj("12345678000190")
                .setCampo06Cep("12345678")
                .setCampo07Endereco("ENDERECO")
                .setCampo08Numero("123")
                .setCampo09Complemento("SALA 1")
                .setCampo10Bairro("CENTRO")
                .setCampo11Telefone("4812341234")
                .setCampo12Fax("4843214321")
                .setCampo13Email("email@email.com")
                .setCampo14MunicipioCodigo("4205407");

        Assert.assertEquals("|0100|Contador|11122233344|99999999999|12345678000190|12345678|ENDERECO|123|SALA 1|CENTRO|4812341234|4843214321|email@email.com|4205407|", linha.toString());
    }
}