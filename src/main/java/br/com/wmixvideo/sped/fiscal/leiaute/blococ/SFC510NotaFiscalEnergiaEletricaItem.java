package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorTipoReceita;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SFC510NotaFiscalEnergiaEletricaItem implements SFLinha {

    private int campo02Sequencial;
    private String campo03Codigo;
    private String campo04CodigoClassificacao;
    private BigDecimal campo05Quantidade;
    private String campo06Unidade;
    private BigDecimal campo07Valor;
    private BigDecimal campo08ValorDesconto;
    private String campo09CST;
    private String campo10CFOP;
    private BigDecimal campo11ValorBaseCalculoICMS;
    private BigDecimal campo12AliquotaICMS;
    private BigDecimal campo13ValorICMS;
    private BigDecimal campo14ValorBaseCalculoICMSST;
    private BigDecimal campo15AliquotaST;
    private BigDecimal campo16ValorICMSST;
    private SFIndicadorTipoReceita campo17IndicadorTipoReceita;
    private String campo18CodigoParticipante;
    private BigDecimal campo19ValorPIS;
    private BigDecimal campo20ValorCOFINS;
    private String campo21CodigoContaAnalitica;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C510";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02Sequencial);
        linha.append(this.campo03Codigo);
        linha.append(this.campo04CodigoClassificacao);
        linha.append(SFUtil.formatToString(this.campo05Quantidade));
        linha.append(this.campo06Unidade);
        linha.append(SFUtil.formatToString(this.campo07Valor));
        linha.append(SFUtil.formatToString(this.campo08ValorDesconto));
        linha.append(this.campo09CST);
        linha.append(this.campo10CFOP);
        linha.append(SFUtil.formatToString(this.campo11ValorBaseCalculoICMS));
        linha.append(SFUtil.formatToString(this.campo12AliquotaICMS));
        linha.append(SFUtil.formatToString(this.campo13ValorICMS));
        linha.append(SFUtil.formatToString(this.campo14ValorBaseCalculoICMSST));
        linha.append(SFUtil.formatToString(this.campo15AliquotaST));
        linha.append(SFUtil.formatToString(this.campo16ValorICMSST));
        linha.append(SFUtil.formatToString(this.campo17IndicadorTipoReceita));
        linha.append(this.campo18CodigoParticipante);
        linha.append(SFUtil.formatToString(this.campo19ValorPIS));
        linha.append(SFUtil.formatToString(this.campo20ValorCOFINS));
        linha.append(this.campo21CodigoContaAnalitica);
        return linha.toString();
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo02Sequencial(int campo02Sequencial) {
        this.campo02Sequencial = campo02Sequencial;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo03Codigo(String campo03Codigo) {
        this.campo03Codigo = campo03Codigo;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo04CodigoClassificacao(String campo04CodigoClassificacao) {
        this.campo04CodigoClassificacao = campo04CodigoClassificacao;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo05Quantidade(BigDecimal campo05Quantidade) {
        this.campo05Quantidade = campo05Quantidade;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo06Unidade(String campo06Unidade) {
        this.campo06Unidade = campo06Unidade;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo07Valor(BigDecimal campo07Valor) {
        this.campo07Valor = campo07Valor;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo08ValorDesconto(BigDecimal campo08ValorDesconto) {
        this.campo08ValorDesconto = campo08ValorDesconto;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo09CST(String campo09CST) {
        this.campo09CST = campo09CST;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo10CFOP(String campo10CFOP) {
        this.campo10CFOP = campo10CFOP;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo11ValorBaseCalculoICMS(BigDecimal campo11ValorBaseCalculoICMS) {
        this.campo11ValorBaseCalculoICMS = campo11ValorBaseCalculoICMS;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo12AliquotaICMS(BigDecimal campo12AliquotaICMS) {
        this.campo12AliquotaICMS = campo12AliquotaICMS;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo13ValorICMS(BigDecimal campo13ValorICMS) {
        this.campo13ValorICMS = campo13ValorICMS;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo14ValorBaseCalculoICMSST(BigDecimal campo14ValorBaseCalculoICMSST) {
        this.campo14ValorBaseCalculoICMSST = campo14ValorBaseCalculoICMSST;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo15AliquotaST(BigDecimal campo15AliquotaST) {
        this.campo15AliquotaST = campo15AliquotaST;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo16ValorICMSST(BigDecimal campo16ValorICMSST) {
        this.campo16ValorICMSST = campo16ValorICMSST;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo17IndicadorTipoReceita(SFIndicadorTipoReceita campo17IndicadorTipoReceita) {
        this.campo17IndicadorTipoReceita = campo17IndicadorTipoReceita;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo18CodigoParticipante(String campo18CodigoParticipante) {
        this.campo18CodigoParticipante = campo18CodigoParticipante;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo19ValorPIS(BigDecimal campo19ValorPIS) {
        this.campo19ValorPIS = campo19ValorPIS;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo20ValorCOFINS(BigDecimal campo20ValorCOFINS) {
        this.campo20ValorCOFINS = campo20ValorCOFINS;
        return this;
    }

    public SFC510NotaFiscalEnergiaEletricaItem setCampo21CodigoContaAnalitica(String campo21CodigoContaAnalitica) {
        this.campo21CodigoContaAnalitica = campo21CodigoContaAnalitica;
        return this;
    }
}