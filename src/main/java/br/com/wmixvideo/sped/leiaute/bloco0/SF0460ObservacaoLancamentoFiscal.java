package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFObservacaoLancamentoFiscal;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0460ObservacaoLancamentoFiscal implements SFRegistro {

    private final SFObservacaoLancamentoFiscal observacaoLancamentoFiscal;

    public SF0460ObservacaoLancamentoFiscal(final SFObservacaoLancamentoFiscal observacaoLancamentoFiscal) {
        this.observacaoLancamentoFiscal = observacaoLancamentoFiscal;
    }

    @Override
    public String getCodigoRegistro() {
        return "0460";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.observacaoLancamentoFiscal.getCodigo());
        texto.append(this.observacaoLancamentoFiscal.getObservacao());
        return texto.toString();
    }
}