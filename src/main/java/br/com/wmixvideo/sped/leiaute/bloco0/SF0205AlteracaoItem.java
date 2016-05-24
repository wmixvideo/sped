package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFItemAlteracao;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SF0205AlteracaoItem implements SFRegistro {
    private final SFItemAlteracao itemAlteracao;

    public SF0205AlteracaoItem(final SFItemAlteracao itemAlteracao) {
        this.itemAlteracao = itemAlteracao;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.itemAlteracao.getDescricaoAnterior());
        texto.append(SFUtil.formatToString(this.itemAlteracao.getDataInicialUtilizacaoDescricao()));
        texto.append(SFUtil.formatToString(this.itemAlteracao.getDataFinalUtilizacaoDescricao()));
        texto.append(this.itemAlteracao.getCodigoAnterior());
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "0205";
    }
}