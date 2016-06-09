package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import org.apache.commons.lang3.StringUtils;

public class SF0450InformacaoComplementarDocumentoFiscal implements SFLinha {
    private int contador;
    private String observacao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "0450";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(StringUtils.leftPad(String.valueOf(this.contador), 6, "0"));
        texto.append(this.observacao);
        return texto.toString();
    }

    public SF0450InformacaoComplementarDocumentoFiscal setContador(int contador) {
        this.contador = contador;
        return this;
    }

    public SF0450InformacaoComplementarDocumentoFiscal setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }
}