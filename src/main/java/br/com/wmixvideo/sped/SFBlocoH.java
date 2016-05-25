package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFAberturaBloco;
import br.com.wmixvideo.sped.leiaute.SFIndicadorMovimento;
import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.leiaute.bloco0.SFEncerramentoBloco;
import br.com.wmixvideo.sped.leiaute.blocoh.SFH005TotaisInventario;
import br.com.wmixvideo.sped.leiaute.blocoh.SFH010Inventario;
import br.com.wmixvideo.sped.modelo.SFInventario;
import br.com.wmixvideo.sped.util.SFReferencia;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class SFBlocoH implements SFBloco {

    private final SFReferencia referencia;
    private final List<SFInventario> inventarios;

    public SFBlocoH(final SFReferencia referencia, final List<SFInventario> inventarios) {
        this.referencia = referencia;
        this.inventarios = inventarios;
    }

    @Override
    public List<SFRegistro> gerarLinhas() {
        final boolean incluirInventario = Month.FEBRUARY.equals(this.referencia.getInicio().getMonth()) && !inventarios.isEmpty();

        final List<SFRegistro> linhas = new ArrayList<>();
        linhas.add(gerarLinhaAbertura(incluirInventario));

        if (incluirInventario) {
            linhas.add(gerarLinhaTotalInventario(this.referencia, this.inventarios));
            linhas.addAll(gerarLinhasInventario(this.inventarios));
        }
        linhas.add(gerarLinhaEncerramento(linhas.size() + 1));

        return linhas;
    }

    private static SFH005TotaisInventario gerarLinhaTotalInventario(SFReferencia referencia, List<SFInventario> inventarios) {
        final LocalDate dataFinalEstoque = referencia.getFim().withDayOfYear(1);
        final BigDecimal valorTotalInventario = inventarios.stream().map(SFInventario::getValorTotal).reduce(BigDecimal.ZERO, BigDecimal::add);
        return new SFH005TotaisInventario(dataFinalEstoque.minusDays(1), valorTotalInventario);
    }

    private static List<SFH010Inventario> gerarLinhasInventario(List<SFInventario> inventarios) {
        final List<SFH010Inventario> linhas = new ArrayList<>();
        for (final SFInventario inventario : inventarios) {
            linhas.add(new SFH010Inventario(inventario));
        }
        return linhas;
    }

    private static SFEncerramentoBloco gerarLinhaEncerramento(int totalLinhas) {
        return new SFEncerramentoBloco("H990", totalLinhas);
    }

    private static SFRegistro gerarLinhaAbertura(boolean incluirInventario) {
        return new SFAberturaBloco("H001", incluirInventario ? SFIndicadorMovimento.BLOCO_COM_DADOS_INFORMADOS : SFIndicadorMovimento.BLOCO_SEM_DADOS_INFORMADOS);
    }
}
