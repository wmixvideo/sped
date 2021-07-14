package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.contribuicoes.enums.SCInformacaoComplementar;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFReferencia;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SC0120SemDados implements SFLinha {

    private SFReferencia campo02Referencia;
    private SCInformacaoComplementar campo03InformacaoComplementar;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02Referencia));
        linha.append(SFUtil.formatToString(this.campo03InformacaoComplementar.getCodigo()));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0120";
    }

    public SC0120SemDados setCampo02Referencia(SFReferencia campo02Referencia) {
        this.campo02Referencia = campo02Referencia;
        return this;
    }

    public SC0120SemDados setCampo03InformacaoComplementar(SCInformacaoComplementar campo03InformacaoComplementar) {
        this.campo03InformacaoComplementar = campo03InformacaoComplementar;
        return this;
    }
}