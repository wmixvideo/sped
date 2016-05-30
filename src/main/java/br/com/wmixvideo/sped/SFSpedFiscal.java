package br.com.wmixvideo.sped;

import br.com.wmixvideo.sped.leiaute.SFLinha;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SFSpedFiscal {

    private final SFBloco bloco0, blocoC, blocoH, blocoK, bloco1, bloco9;

    public SFSpedFiscal() {
        bloco0 = new SFBloco0();
        blocoC = new SFBlocoC();
        blocoH = new SFBlocoH();
        blocoK = new SFBlocoK();
        bloco1 = new SFBloco1();
        bloco9 = new SFBloco9();
    }

    public List<String> gerarSpedFiscal() {
        final List<SFLinha> sped = new ArrayList<>();
        sped.addAll(this.bloco0.getLinhas());
        sped.addAll(this.blocoC.getLinhas());
        sped.addAll(this.blocoH.getLinhas());
        sped.addAll(this.blocoK.getLinhas());
        sped.addAll(this.bloco1.getLinhas());
        sped.addAll(this.bloco9.getLinhas());
        return sped.stream().map(SFLinha::toString).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), this.gerarSpedFiscal());
    }

    public SFBloco getBloco0() {
        return bloco0;
    }

    public SFBloco getBlocoC() {
        return blocoC;
    }

    public SFBloco getBlocoH() {
        return blocoH;
    }

    public SFBloco getBlocoK() {
        return blocoK;
    }

    public SFBloco getBloco1() {
        return bloco1;
    }

    public SFBloco getBloco9() {
        return bloco9;
    }
}
