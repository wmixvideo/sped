package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.modelo.SFParticipanteAlteracao;
import br.com.wmixvideo.sped.modelo.SFParticipanteAlteracaoCampo;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SF0175ParticipanteAlteracaoTest {
    @Test
    public void geraTextoAlteracaoRazaoSocial() {
        SFParticipanteAlteracao alteracao = new SFParticipanteAlteracao();
        alteracao.setCampo(SFParticipanteAlteracaoCampo.NOME);
        alteracao.setData(LocalDate.of(2008, Month.OCTOBER, 16));
        alteracao.setConteudoAnterior("CONSORTE VIDEO LTDA ME");

        Assert.assertEquals("|0175|16102008|03|CONSORTE VIDEO LTDA ME|", new SF0175AlteracaoCadastroParticipante(alteracao).toString());
    }

    @Test
    public void geraTextoAlteracaoCpf() {
        SFParticipanteAlteracao alteracao = new SFParticipanteAlteracao();
        alteracao.setCampo(SFParticipanteAlteracaoCampo.CPF);
        alteracao.setData(LocalDate.of(2008, Month.OCTOBER, 16));
        alteracao.setConteudoAnterior("12345678910");

        Assert.assertEquals("|0175|16102008|06|12345678910|", new SF0175AlteracaoCadastroParticipante(alteracao).toString());
    }

    @Test
    public void geraTextoAlteracaoComplemento() {
        SFParticipanteAlteracao alteracao = new SFParticipanteAlteracao();
        alteracao.setCampo(SFParticipanteAlteracaoCampo.COMPLEMENTO);
        alteracao.setData(LocalDate.of(2008, Month.OCTOBER, 16));
        alteracao.setConteudoAnterior("CASA");

        Assert.assertEquals("|0175|16102008|12|CASA|", new SF0175AlteracaoCadastroParticipante(alteracao).toString());
    }
}