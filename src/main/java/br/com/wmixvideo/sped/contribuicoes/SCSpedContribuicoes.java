package br.com.wmixvideo.sped.contribuicoes;

import br.com.wmixvideo.sped.util.SFBloco;

public class SCSpedContribuicoes {

    private final SFBloco bloco0, blocoA, blocoC, blocoD, blocoF, blocoI, blocoM, blocoP, bloco1, bloco9;

    public SCSpedContribuicoes() {
        this.bloco0 = new SFBloco();
        this.blocoA = new SFBloco();
        this.blocoC = new SFBloco();
        this.blocoD = new SFBloco();
        this.blocoF = new SFBloco();
        this.blocoI = new SFBloco();
        this.blocoM = new SFBloco();
        this.blocoP = new SFBloco();
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
        this.getBlocoF().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoI().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoM().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
        this.getBlocoP().getLinhas().forEach(l -> sped.append(l).append(System.lineSeparator()));
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

    public SFBloco getBlocoF() {
        return this.blocoF;
    }

    public SFBloco getBlocoI() {
        return this.blocoI;
    }

    public SFBloco getBlocoM() {
        return this.blocoM;
    }

    public SFBloco getBlocoP() {
        return this.blocoP;
    }

    public SFBloco getBloco1() {
        return this.bloco1;
    }

    public SFBloco getBloco9() {
        return this.bloco9;
    }
}
