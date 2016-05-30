package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFParticipanteAlteracaoCampo;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SF0175ParticipanteAlteracaoTest {
    @Test
    public void geraTextoAlteracaoRazaoSocial() {
        final SF0175AlteracaoCadastroParticipante linha = new SF0175AlteracaoCadastroParticipante()
                .setCampo(SFParticipanteAlteracaoCampo.NOME)
                .setData(LocalDate.of(2008, Month.OCTOBER, 16))
                .setConteudoAnterior("CONSORTE VIDEO LTDA ME");

        Assert.assertEquals("|0175|16102008|03|CONSORTE VIDEO LTDA ME|", linha.toString());
    }

    @Test
    public void geraTextoAlteracaoCpf() {
        final SF0175AlteracaoCadastroParticipante linha = new SF0175AlteracaoCadastroParticipante()
                .setCampo(SFParticipanteAlteracaoCampo.CPF)
                .setData(LocalDate.of(2008, Month.OCTOBER, 16))
                .setConteudoAnterior("12345678910");

        Assert.assertEquals("|0175|16102008|06|12345678910|", linha.toString());
    }

    @Test
    public void geraTextoAlteracaoComplemento() {
        final SF0175AlteracaoCadastroParticipante linha = new SF0175AlteracaoCadastroParticipante()
                .setCampo(SFParticipanteAlteracaoCampo.COMPLEMENTO)
                .setData(LocalDate.of(2008, Month.OCTOBER, 16))
                .setConteudoAnterior("CASA");

        Assert.assertEquals("|0175|16102008|12|CASA|", linha.toString());
    }
}