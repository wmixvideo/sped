package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SC0035IdentificacaoSociedadeContaParticipacao implements SFLinha {

    private String campo02IdentificacaoSCP;
    private String campo03DescricaoSCP;
    private String campo04InformacaoComplementar;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02IdentificacaoSCP);
        linha.append(this.campo03DescricaoSCP);
        linha.append(this.campo04InformacaoComplementar);
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0035";
    }

    public SC0035IdentificacaoSociedadeContaParticipacao setCampo02IdentificacaoSCP(String campo02IdentificacaoSCP) {
        this.campo02IdentificacaoSCP = campo02IdentificacaoSCP;
        return this;
    }

    public SC0035IdentificacaoSociedadeContaParticipacao setCampo03DescricaoSCP(String campo03DescricaoSCP) {
        this.campo03DescricaoSCP = campo03DescricaoSCP;
        return this;
    }

    public SC0035IdentificacaoSociedadeContaParticipacao setCampo04InformacaoComplementar(String campo04InformacaoComplementar) {
        this.campo04InformacaoComplementar = campo04InformacaoComplementar;
        return this;
    }
}