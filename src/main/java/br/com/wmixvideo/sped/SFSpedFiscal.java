package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFLinha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SFSpedFiscal {

    private final SFBloco bloco0, blocoC, blocoD, blocoE, blocoG, blocoH, blocoK, bloco1, bloco9;

    public SFSpedFiscal() {
        bloco0 = new SFBloco();
        blocoC = new SFBloco();
        blocoD = new SFBloco();
        blocoE = new SFBloco();
        blocoG = new SFBloco();
        blocoH = new SFBloco();
        blocoK = new SFBloco();
        bloco1 = new SFBloco();
        bloco9 = new SFBloco();
    }

    public List<String> gerarSpedFiscal() {
        final List<SFLinha> linhas = new ArrayList<>();
        this.getBlocos().forEach(b -> linhas.addAll(b.getLinhas()));
        return linhas.stream().map(SFLinha::toString).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), this.gerarSpedFiscal());
    }

    public List<SFBloco> getBlocos() {
        return Arrays.asList(this.bloco0, this.blocoC, this.blocoD, this.blocoE, this.blocoG, this.blocoH, this.blocoK, this.bloco1, this.bloco9);
    }

    public SFBloco getBloco0() {
        return this.bloco0;
    }

    public SFBloco getBlocoC() {
        return this.blocoC;
    }

    public SFBloco getBlocoD() {
        return this.blocoD;
    }

    public SFBloco getBlocoE() {
        return this.blocoE;
    }

    public SFBloco getBlocoG() {
        return this.blocoG;
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
