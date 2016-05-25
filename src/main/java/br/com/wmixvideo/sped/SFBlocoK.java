package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFAberturaBloco;
import br.com.wmixvideo.sped.leiaute.SFIndicadorMovimento;
import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.leiaute.bloco0.SFEncerramentoBloco;
import br.com.wmixvideo.sped.leiaute.blocok.SFK100PeriodoApuracaoICMSIPI;
import br.com.wmixvideo.sped.leiaute.blocok.SFK200EstoqueEscriturado;
import br.com.wmixvideo.sped.modelo.SFInventario;
import br.com.wmixvideo.sped.util.SFReferencia;

import java.util.ArrayList;
import java.util.List;

public class SFBlocoK implements SFBloco {

    private final SFReferencia referencia;
    private final List<SFInventario> inventarios;

    public SFBlocoK(SFReferencia referencia, List<SFInventario> inventarios) {
        this.referencia = referencia;
        this.inventarios = inventarios;
    }

    @Override
    public List<SFRegistro> gerarLinhas() {
        final List<SFRegistro> linhas = new ArrayList<>();

        linhas.add(new SFAberturaBloco("K001", inventarios.isEmpty() ? SFIndicadorMovimento.BLOCO_SEM_DADOS_INFORMADOS : SFIndicadorMovimento.BLOCO_COM_DADOS_INFORMADOS));

        if (!inventarios.isEmpty()) {
            linhas.add(new SFK100PeriodoApuracaoICMSIPI(referencia));
        }
        for (final SFInventario inventario : inventarios) {
            linhas.add(new SFK200EstoqueEscriturado(referencia.getFim(), inventario.getCodigo(), inventario.getEstoque()));
        }

        linhas.add(new SFEncerramentoBloco("K990", linhas.size() + 1));

        return linhas;
    }
}
