package br.com.wmixvideo.sped.contribuicoes;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFBloco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SFSpedContribuicoes {

    private final SFBloco bloco0, blocoA, blocoC, blocoD, blocoF, blocoI, blocoM, blocoP, bloco1, bloco9;

    public SFSpedContribuicoes() {
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

    public List<String> gerarSpedFiscal() {
        final List<SFLinha> linhas = new ArrayList<>();
        this.getBlocos().forEach(b -> linhas.addAll(b.getLinhas()));
        return linhas.stream().map(SFLinha::toString).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), this.gerarSpedFiscal()).concat(System.lineSeparator());
    }

    public List<SFBloco> getBlocos() {
        return Arrays.asList(this.bloco0, this.blocoA, this.blocoC, this.blocoD, this.blocoF, this.blocoI, this.blocoM, this.blocoP, this.bloco1, this.bloco9);
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
