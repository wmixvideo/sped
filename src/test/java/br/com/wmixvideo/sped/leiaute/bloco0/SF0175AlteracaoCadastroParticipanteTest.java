package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.enums.SFParticipanteAlteracaoCampo;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SF0175AlteracaoCadastroParticipanteTest {

    @Test
    public void deveGerarLinhaCompleta() throws Exception {
        final SF0175AlteracaoCadastroParticipante linha = new SF0175AlteracaoCadastroParticipante()
                .setCampo02Data(LocalDate.of(2016, Month.MARCH, 15))
                .setCampo03AlteracaoCampo(SFParticipanteAlteracaoCampo.BAIRRO)
                .setCampo04ConteudoAnterior("Forquilhas");

        Assert.assertEquals("|0175|15032016|13|Forquilhas|", linha.toString());

    }
}