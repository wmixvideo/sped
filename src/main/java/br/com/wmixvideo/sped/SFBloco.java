package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFLinha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SFBloco {

    private final List<SFLinha> linhas;

    SFBloco() {
        this.linhas = new ArrayList<>();
    }

    public SFBloco addLinha(SFLinha linha) {
        this.linhas.add(linha);
        return this;
    }

    public SFBloco addLinhas(List<SFLinha> linhas) {
        for (SFLinha linha : linhas) {
            addLinha(linha);
        }
        return this;
    }

    public int getNumeroLinhas() {
        return this.getLinhas().size();
    }

    public List<SFLinha> getLinhas() {
        final List<SFLinha> linhas = new ArrayList<>(this.linhas);
        Collections.sort(linhas, (o1, o2) -> o1.getCodigoRegistro().compareTo(o2.getCodigoRegistro()));
        return linhas;
    }
}
