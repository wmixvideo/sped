package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFAberturaBloco;
import br.com.wmixvideo.sped.leiaute.SFIndicadorMovimento;
import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.leiaute.blococ.SFC100NotaFiscal;
import br.com.wmixvideo.sped.leiaute.blococ.SFC101NotaFiscalInformacaoComplementar;
import br.com.wmixvideo.sped.modelo.SFNotaFiscal;
import br.com.wmixvideo.sped.modelo.SFUnidadeFederativa;

import java.util.ArrayList;
import java.util.List;

public class SFBlocoC implements SFBloco {

    private final SFUnidadeFederativa uf;
    private final List<SFNotaFiscal> notas;

    public SFBlocoC(final SFUnidadeFederativa uf, final List<SFNotaFiscal> notas) {
        this.uf = uf;
        this.notas = notas;
    }

    @Override
    public List<SFRegistro> gerarLinhas() {
        final List<SFRegistro> linhas = new ArrayList<>();
        linhas.add(gerarLinhaAbertura(notas.isEmpty()));

        for (SFNotaFiscal nota : notas) {
            linhas.add(new SFC100NotaFiscal(nota));
            final boolean isInterEstadual = !this.uf.equals(nota.getUf());
            if (nota.isNotaFiscalEletronica() && !nota.getSituacao().isCancelada() && !nota.getSituacao().isInutilizada() && isInterEstadual) {
                linhas.add(new SFC101NotaFiscalInformacaoComplementar(nota));
            }
        }


        return linhas;
    }

    private static SFRegistro gerarLinhaAbertura(boolean possuiDados) {
        return new SFAberturaBloco("C001", possuiDados ? SFIndicadorMovimento.BLOCO_COM_DADOS_INFORMADOS : SFIndicadorMovimento.BLOCO_SEM_DADOS_INFORMADOS);
    }
}
