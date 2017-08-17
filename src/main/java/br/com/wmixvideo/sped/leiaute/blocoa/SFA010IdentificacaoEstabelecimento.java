package br.com.wmixvideo.sped.leiaute.blocoa;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFA010IdentificacaoEstabelecimento implements SFLinha {

    private String campo02CNPJ;

    @Override
    public String getCampo01CodigoRegistro() {
        return "A010";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02CNPJ);
        return linha.toString();
    }

    public SFA010IdentificacaoEstabelecimento setCampo02CNPJ(final String campo02cnpj) {
        this.campo02CNPJ = campo02cnpj;
        return this;
    }
}