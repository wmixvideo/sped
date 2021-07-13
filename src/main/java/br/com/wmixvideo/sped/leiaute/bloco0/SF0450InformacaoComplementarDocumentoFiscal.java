package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SF0450InformacaoComplementarDocumentoFiscal implements SFLinha {

    private int campo02Contador;
    private String campo03Observacao;

    @Override
    public String getCampo01CodigoRegistro() {
        return "0450";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.leftPad(this.campo02Contador, 6, '0'));
        linha.append(this.campo03Observacao);
        return linha.toString();
    }

    public SF0450InformacaoComplementarDocumentoFiscal setCampo02Contador(int campo02Contador) {
        this.campo02Contador = campo02Contador;
        return this;
    }

    public SF0450InformacaoComplementarDocumentoFiscal setCampo03Observacao(String campo03Observacao) {
        this.campo03Observacao = campo03Observacao;
        return this;
    }
}