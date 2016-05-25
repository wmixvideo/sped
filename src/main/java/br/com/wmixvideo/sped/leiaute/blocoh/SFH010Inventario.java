package br.com.wmixvideo.sped.leiaute.blocoh;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFInventario;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;
import org.apache.commons.lang3.StringUtils;

public class SFH010Inventario implements SFRegistro {
    private static final String INDICADOR_PROPRIEDADE_ITEM_DO_INFORMANTE_EM_SEU_PODER = "0";
    private static final String CODIGO_DO_PARTICIPANTE = StringUtils.EMPTY;
    private static final String DESCRICAO_COMPLEMENTAR = StringUtils.EMPTY;
    private static final String CODIGO_CONTA_ANALITICA = "1010501";
    private SFInventario inventario;

    public SFH010Inventario(final SFInventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.inventario.getCodigo());
        texto.append(this.inventario.getUnidadeMedida().getCodigo());
        texto.append(this.inventario.getEstoque());
        texto.append(SFUtil.formatToString(this.inventario.getValorUnitario()));
        texto.append(SFUtil.formatToString(this.inventario.getValorTotal()));
        texto.append(INDICADOR_PROPRIEDADE_ITEM_DO_INFORMANTE_EM_SEU_PODER);
        texto.append(CODIGO_DO_PARTICIPANTE);
        texto.append(DESCRICAO_COMPLEMENTAR);
        texto.append(CODIGO_CONTA_ANALITICA);
        texto.append(SFUtil.formatToString(this.inventario.getValorTotal()));
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "H010";
    }
}