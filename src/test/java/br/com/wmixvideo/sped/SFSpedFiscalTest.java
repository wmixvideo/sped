package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFFinalidadeArquivo;
import br.com.wmixvideo.sped.modelo.SFContador;
import br.com.wmixvideo.sped.modelo.SFContribuinteSubstituicao;
import br.com.wmixvideo.sped.modelo.SFEndereco;
import br.com.wmixvideo.sped.modelo.SFEntidade;
import br.com.wmixvideo.sped.modelo.SFInventario;
import br.com.wmixvideo.sped.modelo.SFItem;
import br.com.wmixvideo.sped.modelo.SFItemTipo;
import br.com.wmixvideo.sped.modelo.SFObservacaoLancamentoFiscal;
import br.com.wmixvideo.sped.modelo.SFParticipante;
import br.com.wmixvideo.sped.modelo.SFUnidadeFederativa;
import br.com.wmixvideo.sped.modelo.SFUnidadeMedida;
import br.com.wmixvideo.sped.util.SFReferencia;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SFSpedFiscalTest {

    @Test
    public void deveGerarArquivoDeSpedFiscal() throws Exception {
        final File file = new File("/tmp/sped.txt");
        System.out.println(file.getAbsolutePath());

        if (file.exists()) {
            file.delete();
        }

        final SFEntidade entidade = new SFEntidade()
                .setRazaoSocial("Empresa LTDA")
                .setCnpj("00000000000000")
                .setCpf("00000000000")
                .setInscricaoEstadual("00000")
                .setInscricaoMunicipal("000")
                .setSuframa("00")
                .setNomeFantasia("Empresa")
                .setTelefone("4844444444")
                .setFax("4833333333")
                .setEmail("teste@empresa.com.br");

        entidade.setEndereco(new SFEndereco()
                .setUf(SFUnidadeFederativa.SC)
                .setCep("88000000")
                .setLogradouro("AV Principal")
                .setNumero("5000")
                .setBairro("CAMPINAS")
                .setCodigoMunicipio("4216602"));

        entidade.setContador(new SFContador()
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
                .setMunicipioCodigo("4205407"));

        entidade.getContribuinteSubstituicoes().add(new SFContribuinteSubstituicao(SFUnidadeFederativa.SC, "000011"));
        entidade.getContribuinteSubstituicoes().add(new SFContribuinteSubstituicao(SFUnidadeFederativa.RS, "000012"));

        entidade.getParticipantes().add(new SFParticipante());

        final List<SFItem> itens = new ArrayList<>();
        itens.add(new SFItem(SFItemTipo.SERVIÇOS, new SFUnidadeMedida("CX", "Caixa")));
        itens.add(new SFItem(SFItemTipo.SERVIÇOS, new SFUnidadeMedida("FT", "Fita")));
        itens.add(new SFItem(SFItemTipo.SERVIÇOS, new SFUnidadeMedida("PC", "Peça")));
        itens.add(new SFItem(SFItemTipo.SERVIÇOS, new SFUnidadeMedida("UN", "Unidade")));

        final List informacoesComplementares = Collections.emptyList();
        final SFReferencia referencia = SFReferencia.of(2016, Month.FEBRUARY);
        final SFFinalidadeArquivo finalidadeArquivo = SFFinalidadeArquivo.REMESSA_ORIGINAL;
        final SFObservacaoLancamentoFiscal observacaoLancamentoFiscal = new SFObservacaoLancamentoFiscal("", "");
        final List<SFInventario> inventarios = Collections.emptyList();

        final List<String> linhas = SFSpedFiscal.gerarSpedFiscal(entidade, referencia, finalidadeArquivo, itens, informacoesComplementares, observacaoLancamentoFiscal, inventarios);
        try (final FileOutputStream stream = new FileOutputStream(file)) {
            for (String linha : linhas) {
                stream.write(linha.concat("\n").getBytes());
            }
        }

        Assert.assertTrue(file.exists());
    }
}
