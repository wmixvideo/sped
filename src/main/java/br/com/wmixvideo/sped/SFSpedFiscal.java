package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFFinalidadeArquivo;
import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFEntidade;
import br.com.wmixvideo.sped.modelo.SFInventario;
import br.com.wmixvideo.sped.modelo.SFItem;
import br.com.wmixvideo.sped.modelo.SFObservacaoLancamentoFiscal;
import br.com.wmixvideo.sped.util.SFReferencia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SFSpedFiscal {

    public static List<String> gerarSpedFiscal(final SFEntidade entidade, final SFReferencia referencia, final SFFinalidadeArquivo finalidade, final List<SFItem> itens, final List<String> informacoesComplementares, final SFObservacaoLancamentoFiscal observacaoLancamentoFiscal, List<SFInventario> inventarios) throws Exception {
        final List<SFRegistro> sped = new ArrayList<>();
        sped.addAll(new SFBloco0(entidade, referencia, finalidade, itens, informacoesComplementares, observacaoLancamentoFiscal).gerarLinhas());
        //sped.addAll(new SFBlocoC(entidade.getEndereco().getUf(), new ArrayList<>()).gerarLinhas());
        sped.addAll(new SFBlocoH(referencia, inventarios).gerarLinhas());
        return sped.stream().map(SFRegistro::toString).collect(Collectors.toList());
    }
}
