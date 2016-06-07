package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SFC195ObservacoesLancamentoFiscal implements SFLinha {

    private String codigo, descricao;

    @Override
    public String getCodigoRegistro() {
        return "C195";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCodigoRegistro());
        linha.append(this.codigo);
        linha.append(this.descricao);
        return linha.toString();
    }

    public SFC195ObservacoesLancamentoFiscal setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public SFC195ObservacoesLancamentoFiscal setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}
