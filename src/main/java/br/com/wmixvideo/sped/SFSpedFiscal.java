package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFLinha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SFSpedFiscal {

    private final SFBloco bloco0, blocoC, blocoH, blocoK, bloco1, bloco9;

    public SFSpedFiscal() {
        bloco0 = new SFBloco();
        blocoC = new SFBloco();
        blocoH = new SFBloco();
        blocoK = new SFBloco();
        bloco1 = new SFBloco();
        bloco9 = new SFBloco();
    }

    public List<String> gerarSpedFiscal() {
        final List<SFLinha> sped = new ArrayList<>();
        for (SFBloco bloco : this.getBlocos()) {
            sped.addAll(bloco.getLinhas());
        }
        return sped.stream().map(SFLinha::toString).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        final List<String> linhas = this.gerarSpedFiscal();

        Collections.sort(linhas, ((o1, o2) -> o1.toString().compareTo(o2.toString())));
        return String.join(System.lineSeparator(), linhas);
    }

    public List<SFBloco> getBlocos() {
        return Arrays.asList(bloco0, blocoC, blocoH, blocoK, bloco1, bloco9);
    }

    public SFBloco getBloco0() {
        return this.bloco0;
    }

    public SFBloco getBlocoC() {
        return this.blocoC;
    }

    public SFBloco getBlocoH() {
        return this.blocoH;
    }

    public SFBloco getBlocoK() {
        return this.blocoK;
    }

    public SFBloco getBloco1() {
        return this.bloco1;
    }

    public SFBloco getBloco9() {
        return this.bloco9;
    }
}
