package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFAberturaBloco;
import br.com.wmixvideo.sped.leiaute.SFIndicadorMovimento;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.leiaute.bloco0.SFEncerramentoBloco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class SFBloco {

    private final List<SFLinha> linhas;

    SFBloco() {
        this.linhas = new ArrayList<>();
    }

    abstract String getIdentificadorBloco();

    public SFBloco addLinha(SFLinha linha) {
        this.linhas.add(linha);
        return this;
    }

    public int getNumeroLinhas() {
        return this.getLinhas().size();
    }

    public List<SFLinha> getLinhas() {
        final List<SFLinha> linhas = new ArrayList<>();
        linhas.add(this.getAbertura());
        linhas.add(this.getEncerramento());
        linhas.addAll(this.linhas);

        Collections.sort(linhas, (linha1, linha2) -> linha1.getCodigoRegistro().compareTo(linha2.getCodigoRegistro()));
        return linhas;
    }

    SFLinha getAbertura() {
        final String codigo = String.format("%s001", this.getIdentificadorBloco());
        final SFIndicadorMovimento indicador = this.linhas.isEmpty() ? SFIndicadorMovimento.BLOCO_SEM_DADOS_INFORMADOS : SFIndicadorMovimento.BLOCO_COM_DADOS_INFORMADOS;
        return new SFAberturaBloco(codigo, indicador);
    }

    SFLinha getEncerramento() {
        final String codigo = String.format("%s990", this.getIdentificadorBloco());
        return new SFEncerramentoBloco(codigo, this.linhas.size() + 2);
    }
}
