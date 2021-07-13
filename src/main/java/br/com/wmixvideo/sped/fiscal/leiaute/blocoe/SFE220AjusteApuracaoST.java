package br.com.wmixvideo.sped.fiscal.leiaute.blocoe;

import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFE220AjusteApuracaoST implements SFLinha {

    private String campo02CodigoAjuste;
    private String campo03DescricaoComplementar;
    private BigDecimal campo04Valor;

    @Override
    public String getCampo01CodigoRegistro() {
        return "E220";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02CodigoAjuste);
        linha.append(this.campo03DescricaoComplementar);
        linha.append(SFUtil.formatToString(this.campo04Valor));
        return linha.toString();
    }

    public SFE220AjusteApuracaoST setCampo02CodigoAjuste(String campo02CodigoAjuste) {
        this.campo02CodigoAjuste = campo02CodigoAjuste;
        return this;
    }

    public SFE220AjusteApuracaoST setCampo03DescricaoComplementar(String campo03DescricaoComplementar) {
        this.campo03DescricaoComplementar = campo03DescricaoComplementar;
        return this;
    }

    public SFE220AjusteApuracaoST setCampo04Valor(BigDecimal campo04Valor) {
        this.campo04Valor = campo04Valor;
        return this;
    }
}
