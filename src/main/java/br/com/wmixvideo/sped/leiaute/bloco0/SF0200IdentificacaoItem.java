package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFItem;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;
import org.apache.commons.lang3.StringUtils;

public class SF0200IdentificacaoItem implements SFRegistro {

    private final SFItem item;

    public SF0200IdentificacaoItem(final SFItem item) {
        this.item = item;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.item.getCodigo());
        texto.append(this.item.getDescricao());
        texto.append(StringUtils.trimToEmpty(this.item.getCodigoBarras()));
        texto.append(this.item.getCodigoAnterior());
        texto.append(this.item.getUnidadeMedida().getCodigo());
        texto.append(this.item.getTipo().getCodigo());
        texto.append(this.item.getCodigoNcm());
        texto.append(this.item.getCodigoExIpi());
        texto.append(this.item.getCodigoGenero());
        texto.append(this.item.getCodigoServico());
        texto.append(SFUtil.formatToString(this.item.getAliquotaIcms()));
        texto.append(this.item.getCodigoSubstituicaoTributaria());
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "0200";
    }
}