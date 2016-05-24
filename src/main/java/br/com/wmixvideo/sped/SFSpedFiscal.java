package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFFinalidadeArquivo;
import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFEntidade;
import br.com.wmixvideo.sped.modelo.SFItem;
import br.com.wmixvideo.sped.modelo.SFObservacaoLancamentoFiscal;
import br.com.wmixvideo.sped.util.SFReferencia;

import java.util.List;
import java.util.stream.Collectors;

public class SFSpedFiscal {

    public static List<String> gerarSpedFiscal(final SFEntidade entidade, final SFReferencia referencia, final SFFinalidadeArquivo finalidade, final List<SFItem> itens, final List<String> informacoesComplementares, final SFObservacaoLancamentoFiscal observacaoLancamentoFiscal) throws Exception {
        final List<SFRegistro> sped = SFBloco0.gerarLinhas(entidade, referencia, finalidade, itens, informacoesComplementares, observacaoLancamentoFiscal);
        return sped.stream().map(SFRegistro::toString).collect(Collectors.toList());
    }
}
