package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFAberturaBloco;
import br.com.wmixvideo.sped.leiaute.SFIndicadorMovimento;
import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.leiaute.bloco0.SFEncerramentoBloco;
import br.com.wmixvideo.sped.leiaute.bloco1.SF1010ObrigatoriedadeRegistrosBloco1;

import java.util.ArrayList;
import java.util.List;

public class SFBloco1 implements SFBloco {

    public SFBloco1() {
    }

    @Override
    public List<SFRegistro> gerarLinhas() {
        final List<SFRegistro> linhas = new ArrayList<>();
        linhas.add(new SFAberturaBloco("1001", SFIndicadorMovimento.BLOCO_COM_DADOS_INFORMADOS));
        linhas.add(new SF1010ObrigatoriedadeRegistrosBloco1());
        linhas.add(new SFEncerramentoBloco("1990", linhas.size() + 1));
        return linhas;
    }
}
