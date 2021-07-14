package br.com.wmixvideo.sped.fiscal;

import br.com.wmixvideo.sped.util.SFBloco;

public class SFSpedFiscal {

    private final SFBloco bloco0, blocoA, blocoC, blocoD, blocoE, blocoG, blocoH, blocoK, bloco1, bloco9;

    public SFSpedFiscal() {
        this.bloco0 = new SFBloco();
        this.blocoA = new SFBloco();
        this.blocoC = new SFBloco();
        this.blocoD = new SFBloco();
        this.blocoE = new SFBloco();
        this.blocoG = new SFBloco();
        this.blocoH = new SFBloco();
        this.blocoK = new SFBloco();
        this.bloco1 = new SFBloco();
        this.bloco9 = new SFBloco();
    }

    @Override
    public String toString() {
        final StringBuilder sped = new StringBuilder();
        this.getBloco0().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoA().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoC().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoD().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoE().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoG().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoH().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoK().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBloco1().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBloco9().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        return sped.toString();
    }

    public SFBloco getBloco0() {
        return this.bloco0;
    }

    public SFBloco getBlocoA() {
        return this.blocoA;
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
