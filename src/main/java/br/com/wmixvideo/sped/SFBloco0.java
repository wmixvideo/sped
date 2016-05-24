package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFAberturaBloco;
import br.com.wmixvideo.sped.leiaute.SFFinalidadeArquivo;
import br.com.wmixvideo.sped.leiaute.SFIndicadorMovimento;
import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0005DadosComplementaresEntidade;
import br.com.wmixvideo.sped.leiaute.bloco0.SF000AberturaArquivoDigital;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0100DadosContabilista;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0150CadastroParticipante;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0175AlteracaoCadastroParticipante;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0190IdentificacaoUnidadeMedida;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0200IdentificacaoItem;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0205AlteracaoItem;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0450InformacaoComplementarDocumentoFiscal;
import br.com.wmixvideo.sped.leiaute.bloco0.SF0460ObservacaoLancamentoFiscal;
import br.com.wmixvideo.sped.leiaute.bloco0.SFEncerramentoBloco;
import br.com.wmixvideo.sped.modelo.SFContador;
import br.com.wmixvideo.sped.modelo.SFContribuinteSubstituicao;
import br.com.wmixvideo.sped.modelo.SFEntidade;
import br.com.wmixvideo.sped.modelo.SFItem;
import br.com.wmixvideo.sped.modelo.SFItemAlteracao;
import br.com.wmixvideo.sped.modelo.SFObservacaoLancamentoFiscal;
import br.com.wmixvideo.sped.modelo.SFParticipante;
import br.com.wmixvideo.sped.modelo.SFParticipanteAlteracao;
import br.com.wmixvideo.sped.modelo.SFUnidadeMedida;
import br.com.wmixvideo.sped.util.SFReferencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SFBloco0 {

    public static List<SFRegistro> gerarLinhas(final SFEntidade entidade, final SFReferencia referencia, final SFFinalidadeArquivo finalidade, final List<SFItem> itens, final List<String> informacoesComplementares, final SFObservacaoLancamentoFiscal observacaoLancamentoFiscal) {
        final List<SFRegistro> linhas = new ArrayList<>();
        linhas.add(gerarLinhaAberturaArquivoDigital(entidade, referencia, finalidade));
        linhas.add(gerarLinhaAberturaBloco());
        linhas.add(gerarLinhaDadosComplementaresEntidade(entidade));
        linhas.addAll(gerarLinhasDadosContribuinte(entidade.getContribuinteSubstituicoes()));
        linhas.add(gerarLinhaDadosContabilista(entidade.getContador()));
        linhas.addAll(gerarLinhasPaticipantes(entidade.getParticipantes()));
        linhas.addAll(gerarLinhasUnidadesMedida(itens.stream().map(SFItem::getUnidadeMedida).collect(Collectors.toSet())));
        linhas.addAll(gerarLinhasItens(itens));
        linhas.addAll(gerarLinhasInformacoesComplementares(informacoesComplementares));
        linhas.add(gerarLinhaObservacaoLancamentoFiscal(observacaoLancamentoFiscal));
        linhas.add(gerarLinhaEncerramentoBloco(linhas.size() + 1));
        return linhas;
    }

    private static SFRegistro gerarLinhaEncerramentoBloco(int numeroLinhas) {
        return new SFEncerramentoBloco("0990", numeroLinhas);
    }

    private static SFRegistro gerarLinhaObservacaoLancamentoFiscal(SFObservacaoLancamentoFiscal observacaoLancamentoFiscal) {
        return new SF0460ObservacaoLancamentoFiscal(observacaoLancamentoFiscal);
    }

    private static List<SFRegistro> gerarLinhasInformacoesComplementares(List<String> informacoesComplementares) {
        final List<SFRegistro> linhas = new ArrayList<>();
        for (int i = 0; i < informacoesComplementares.size(); i++) {
            linhas.add(new SF0450InformacaoComplementarDocumentoFiscal(i + 1, informacoesComplementares.get(i)));
        }
        return linhas;
    }

    private static List<SFRegistro> gerarLinhasItens(List<SFItem> itens) {
        final List<SFRegistro> linhas = new ArrayList<>();
        for (final SFItem item : itens) {
            linhas.add(new SF0200IdentificacaoItem(item));
            for (final SFItemAlteracao alteracao : item.getAlteracoes()) {
                linhas.add(new SF0205AlteracaoItem(alteracao));
            }
        }
        return linhas;
    }

    private static List<SFRegistro> gerarLinhasUnidadesMedida(Set<SFUnidadeMedida> unidades) {
        final List<SFRegistro> linhas = new ArrayList<>();
        for (final SFUnidadeMedida unidadeMedida : unidades) {
            linhas.add(new SF0190IdentificacaoUnidadeMedida(unidadeMedida));
        }
        return linhas;
    }

    private static List<SFRegistro> gerarLinhasPaticipantes(List<SFParticipante> participantes) {
        final List<SFRegistro> linhas = new ArrayList<>();
        for (final SFParticipante participante : participantes) {
            linhas.add(new SF0150CadastroParticipante(participante));
            for (final SFParticipanteAlteracao alteracao : participante.getAlteracoesCadastro()) {
                linhas.add(new SF0175AlteracaoCadastroParticipante(alteracao));
            }
        }
        return linhas;
    }

    private static SFRegistro gerarLinhaDadosContabilista(SFContador contador) {
        return new SF0100DadosContabilista(contador);
    }

    private static SFRegistro gerarLinhaDadosComplementaresEntidade(SFEntidade entidade) {
        return new SF0005DadosComplementaresEntidade(entidade);
    }

    private static SFRegistro gerarLinhaAberturaBloco() {
        return new SFAberturaBloco("0001", SFIndicadorMovimento.BLOCO_COM_DADOS_INFORMADOS);
    }

    private static SFRegistro gerarLinhaAberturaArquivoDigital(SFEntidade entidade, SFReferencia referencia, SFFinalidadeArquivo finalidade) {
        return new SF000AberturaArquivoDigital(entidade, referencia, finalidade);
    }

    private static List<SFRegistro> gerarLinhasDadosContribuinte(List<SFContribuinteSubstituicao> contribuintesSubstituicao) {
        final List<SFRegistro> linhas = new ArrayList<>();
        for (final SFContribuinteSubstituicao contribuinteSubstituicao : contribuintesSubstituicao) {
            linhas.add(new SF0015DadosContribuinteSubstitutoOuResponsavelICMSDestino(contribuinteSubstituicao));
        }
        return linhas;
    }
}
