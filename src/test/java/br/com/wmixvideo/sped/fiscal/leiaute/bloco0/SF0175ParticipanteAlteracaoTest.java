package br.com.wmixvideo.sped.fiscal.leiaute.bloco0;

import br.com.wmixvideo.sped.fiscal.enums.SFParticipanteAlteracaoCampo;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SF0175ParticipanteAlteracaoTest {
    @Test
    public void geraTextoAlteracaoRazaoSocial() {
        final SF0175AlteracaoCadastroParticipante linha = new SF0175AlteracaoCadastroParticipante()
                .setCampo03AlteracaoCampo(SFParticipanteAlteracaoCampo.NOME)
                .setCampo02Data(LocalDate.of(2008, Month.OCTOBER, 16))
                .setCampo04ConteudoAnterior("CONSORTE VIDEO LTDA ME");

        Assert.assertEquals("|0175|16102008|03|CONSORTE VIDEO LTDA ME|", linha.toString());
    }

    @Test
    public void geraTextoAlteracaoCpf() {
        final SF0175AlteracaoCadastroParticipante linha = new SF0175AlteracaoCadastroParticipante()
                .setCampo03AlteracaoCampo(SFParticipanteAlteracaoCampo.CPF)
                .setCampo02Data(LocalDate.of(2008, Month.OCTOBER, 16))
                .setCampo04ConteudoAnterior("12345678910");

        Assert.assertEquals("|0175|16102008|06|12345678910|", linha.toString());
    }

    @Test
    public void geraTextoAlteracaoComplemento() {
        final SF0175AlteracaoCadastroParticipante linha = new SF0175AlteracaoCadastroParticipante()
                .setCampo03AlteracaoCampo(SFParticipanteAlteracaoCampo.COMPLEMENTO)
                .setCampo02Data(LocalDate.of(2008, Month.OCTOBER, 16))
                .setCampo04ConteudoAnterior("CASA");

        Assert.assertEquals("|0175|16102008|12|CASA|", linha.toString());
    }
}