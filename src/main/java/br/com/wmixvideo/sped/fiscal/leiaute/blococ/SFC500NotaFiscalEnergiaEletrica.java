package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import br.com.wmixvideo.sped.fiscal.enums.SFClasseConsumoEnergia;
import br.com.wmixvideo.sped.fiscal.enums.SFGrupoTensaoEletrica;
import br.com.wmixvideo.sped.fiscal.enums.SFNotaFiscalEmissao;
import br.com.wmixvideo.sped.fiscal.enums.SFNotaFiscalOperacao;
import br.com.wmixvideo.sped.fiscal.enums.SFNotaFiscalSituacao;
import br.com.wmixvideo.sped.fiscal.enums.SFTipoLigacaoEletrica;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFC500NotaFiscalEnergiaEletrica implements SFLinha {

    private SFNotaFiscalEmissao campo03Emissao;
    private SFNotaFiscalOperacao campo02Operacao;
    private SFNotaFiscalSituacao campo06Situacao;
    private SFClasseConsumoEnergia campo09Classe;
    private SFTipoLigacaoEletrica campo26TipoLigacao;
    private SFGrupoTensaoEletrica campo27GrupoTensao;
    private String campo10Numero;
    private String campo07Serie;
    private String campo08Subserie;
    private String campo04CodigoParticipante;
    private String campo05CodigoModeloFiscal;
    private String campo23CodigoInformacaoComplementar;
    private LocalDate campo11DataEmissao;
    private LocalDate campo12DataOperacao;
    private BigDecimal campo13ValorDocumento;
    private BigDecimal campo14ValorDesconto;
    private BigDecimal campo15ValorFornecido;
    private BigDecimal campo16ValorNaoTributado;
    private BigDecimal campo17ValorEmNomeDeTerceiros;
    private BigDecimal campo18ValorDespesasAcessorias;
    private BigDecimal campo19ValorBaseCalculoIcms;
    private BigDecimal campo20ValorIcms;
    private BigDecimal campo21ValorBaseCalculoIcmsSt;
    private BigDecimal campo22ValorIcmsSt;
    private BigDecimal campo24ValorPis;
    private BigDecimal campo25ValorCofins;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C500";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02Operacao));
        linha.append(SFUtil.formatToString(this.campo03Emissao));
        linha.append(this.campo04CodigoParticipante);
        linha.append(this.campo05CodigoModeloFiscal);
        linha.append(SFUtil.formatToString(this.campo06Situacao));
        linha.append(this.campo07Serie);
        linha.append(this.campo08Subserie);
        linha.append(SFUtil.formatToString(this.campo09Classe));
        linha.append(this.campo10Numero);
        linha.append(SFUtil.formatToString(this.campo11DataEmissao));
        linha.append(SFUtil.formatToString(this.campo12DataOperacao));
        linha.append(SFUtil.formatToString(this.campo13ValorDocumento));
        linha.append(SFUtil.formatToString(this.campo14ValorDesconto));
        linha.append(SFUtil.formatToString(this.campo15ValorFornecido));
        linha.append(SFUtil.formatToString(this.campo16ValorNaoTributado));
        linha.append(SFUtil.formatToString(this.campo17ValorEmNomeDeTerceiros));
        linha.append(SFUtil.formatToString(this.campo18ValorDespesasAcessorias));
        linha.append(SFUtil.formatToString(this.campo19ValorBaseCalculoIcms));
        linha.append(SFUtil.formatToString(this.campo20ValorIcms));
        linha.append(SFUtil.formatToString(this.campo21ValorBaseCalculoIcmsSt));
        linha.append(SFUtil.formatToString(this.campo22ValorIcmsSt));
        linha.append(this.campo23CodigoInformacaoComplementar);
        linha.append(SFUtil.formatToString(this.campo24ValorPis));
        linha.append(SFUtil.formatToString(this.campo25ValorCofins));
        linha.append(SFUtil.formatToString(this.campo26TipoLigacao));
        linha.append(SFUtil.formatToString(this.campo27GrupoTensao));
        return linha.toString();
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo09Classe(SFClasseConsumoEnergia campo09Classe) {
        this.campo09Classe = campo09Classe;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo23CodigoInformacaoComplementar(String campo23CodigoInformacaoComplementar) {
        this.campo23CodigoInformacaoComplementar = campo23CodigoInformacaoComplementar;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo05CodigoModeloFiscal(String campo05CodigoModeloFiscal) {
        this.campo05CodigoModeloFiscal = campo05CodigoModeloFiscal;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo04CodigoParticipante(String campo04CodigoParticipante) {
        this.campo04CodigoParticipante = campo04CodigoParticipante;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo11DataEmissao(LocalDate campo11DataEmissao) {
        this.campo11DataEmissao = campo11DataEmissao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo12DataOperacao(LocalDate campo12DataOperacao) {
        this.campo12DataOperacao = campo12DataOperacao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo03Emissao(SFNotaFiscalEmissao campo03Emissao) {
        this.campo03Emissao = campo03Emissao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo27GrupoTensao(SFGrupoTensaoEletrica campo27GrupoTensao) {
        this.campo27GrupoTensao = campo27GrupoTensao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo10Numero(String campo10Numero) {
        this.campo10Numero = campo10Numero;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo02Operacao(SFNotaFiscalOperacao campo02Operacao) {
        this.campo02Operacao = campo02Operacao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo07Serie(String campo07Serie) {
        this.campo07Serie = campo07Serie;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo06Situacao(SFNotaFiscalSituacao campo06Situacao) {
        this.campo06Situacao = campo06Situacao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo08Subserie(String campo08Subserie) {
        this.campo08Subserie = campo08Subserie;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo26TipoLigacao(SFTipoLigacaoEletrica campo26TipoLigacao) {
        this.campo26TipoLigacao = campo26TipoLigacao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo19ValorBaseCalculoIcms(BigDecimal campo19ValorBaseCalculoIcms) {
        this.campo19ValorBaseCalculoIcms = campo19ValorBaseCalculoIcms;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo21ValorBaseCalculoIcmsSt(BigDecimal campo21ValorBaseCalculoIcmsSt) {
        this.campo21ValorBaseCalculoIcmsSt = campo21ValorBaseCalculoIcmsSt;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo25ValorCofins(BigDecimal campo25ValorCofins) {
        this.campo25ValorCofins = campo25ValorCofins;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo14ValorDesconto(BigDecimal campo14ValorDesconto) {
        this.campo14ValorDesconto = campo14ValorDesconto;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo18ValorDespesasAcessorias(BigDecimal campo18ValorDespesasAcessorias) {
        this.campo18ValorDespesasAcessorias = campo18ValorDespesasAcessorias;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo13ValorDocumento(BigDecimal campo13ValorDocumento) {
        this.campo13ValorDocumento = campo13ValorDocumento;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo17ValorEmNomeDeTerceiros(BigDecimal campo17ValorEmNomeDeTerceiros) {
        this.campo17ValorEmNomeDeTerceiros = campo17ValorEmNomeDeTerceiros;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo15ValorFornecido(BigDecimal campo15ValorFornecido) {
        this.campo15ValorFornecido = campo15ValorFornecido;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo20ValorIcms(BigDecimal campo20ValorIcms) {
        this.campo20ValorIcms = campo20ValorIcms;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo22ValorIcmsSt(BigDecimal campo22ValorIcmsSt) {
        this.campo22ValorIcmsSt = campo22ValorIcmsSt;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo16ValorNaoTributado(BigDecimal campo16ValorNaoTributado) {
        this.campo16ValorNaoTributado = campo16ValorNaoTributado;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCampo24ValorPis(BigDecimal campo24ValorPis) {
        this.campo24ValorPis = campo24ValorPis;
        return this;
    }
}