package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFClasseConsumoEnergial;
import br.com.wmixvideo.sped.enums.SFGrupoTensaoEletrica;
import br.com.wmixvideo.sped.enums.SFNotaFiscalEmissao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalOperacao;
import br.com.wmixvideo.sped.enums.SFNotaFiscalSituacao;
import br.com.wmixvideo.sped.enums.SFTipoLigacaoEletrica;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFC500NotaFiscalEnergiaEletrica implements SFLinha {

    private SFNotaFiscalEmissao emissao;
    private SFNotaFiscalOperacao operacao;
    private SFNotaFiscalSituacao situacao;
    private SFClasseConsumoEnergial classe;
    private SFTipoLigacaoEletrica tipoLigacao;
    private SFGrupoTensaoEletrica grupoTensao;
    private String numero;
    private String serie;
    private String subserie;
    private String codigoParticipante;
    private String codigoModeloFiscal;
    private String codigoInformacaoComplementar;
    private LocalDate dataEmissao;
    private LocalDate dataOperacao;
    private BigDecimal valorDocumento;
    private BigDecimal valorDesconto;
    private BigDecimal valorFornecido;
    private BigDecimal valorNaoTributado;
    private BigDecimal valorEmNomeDeTerceiros;
    private BigDecimal valorDespesasAcessorias;
    private BigDecimal valorBaseCalculoIcms;
    private BigDecimal valorIcms;
    private BigDecimal valorBaseCalculoIcmsSt;
    private BigDecimal valorIcmsSt;
    private BigDecimal valorPis;
    private BigDecimal valorCofins;

    @Override
    public String getCodigoRegistro() {
        return "C500";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCodigoRegistro());
        linha.append(SFUtil.formatToString(this.operacao));
        linha.append(SFUtil.formatToString(this.emissao));
        linha.append(this.codigoParticipante);
        linha.append(this.codigoModeloFiscal);
        linha.append(SFUtil.formatToString(this.situacao));
        linha.append(this.serie);
        linha.append(this.subserie);
        linha.append(SFUtil.formatToString(this.classe));
        linha.append(this.numero);
        linha.append(SFUtil.formatToString(this.dataEmissao));
        linha.append(SFUtil.formatToString(this.dataOperacao));
        linha.append(SFUtil.formatToString(this.valorDocumento));
        linha.append(SFUtil.formatToString(this.valorDesconto));
        linha.append(SFUtil.formatToString(this.valorFornecido));
        linha.append(SFUtil.formatToString(this.valorNaoTributado));
        linha.append(SFUtil.formatToString(this.valorEmNomeDeTerceiros));
        linha.append(SFUtil.formatToString(this.valorDespesasAcessorias));
        linha.append(SFUtil.formatToString(this.valorBaseCalculoIcms));
        linha.append(SFUtil.formatToString(this.valorIcms));
        linha.append(SFUtil.formatToString(this.valorBaseCalculoIcmsSt));
        linha.append(SFUtil.formatToString(this.valorIcmsSt));
        linha.append(this.codigoInformacaoComplementar);
        linha.append(SFUtil.formatToString(this.valorPis));
        linha.append(SFUtil.formatToString(this.valorCofins));
        linha.append(SFUtil.formatToString(this.tipoLigacao));
        linha.append(SFUtil.formatToString(this.grupoTensao));
        return linha.toString();
    }

    public SFC500NotaFiscalEnergiaEletrica setClasse(SFClasseConsumoEnergial classe) {
        this.classe = classe;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCodigoInformacaoComplementar(String codigoInformacaoComplementar) {
        this.codigoInformacaoComplementar = codigoInformacaoComplementar;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCodigoModeloFiscal(String codigoModeloFiscal) {
        this.codigoModeloFiscal = codigoModeloFiscal;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setCodigoParticipante(String codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setDataOperacao(LocalDate dataOperacao) {
        this.dataOperacao = dataOperacao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setEmissao(SFNotaFiscalEmissao emissao) {
        this.emissao = emissao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setGrupoTensao(SFGrupoTensaoEletrica grupoTensao) {
        this.grupoTensao = grupoTensao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setOperacao(SFNotaFiscalOperacao operacao) {
        this.operacao = operacao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setSerie(String serie) {
        this.serie = serie;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setSituacao(SFNotaFiscalSituacao situacao) {
        this.situacao = situacao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setSubserie(String subserie) {
        this.subserie = subserie;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setTipoLigacao(SFTipoLigacaoEletrica tipoLigacao) {
        this.tipoLigacao = tipoLigacao;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorBaseCalculoIcms(BigDecimal valorBaseCalculoIcms) {
        this.valorBaseCalculoIcms = valorBaseCalculoIcms;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorBaseCalculoIcmsSt(BigDecimal valorBaseCalculoIcmsSt) {
        this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorCofins(BigDecimal valorCofins) {
        this.valorCofins = valorCofins;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorDespesasAcessorias(BigDecimal valorDespesasAcessorias) {
        this.valorDespesasAcessorias = valorDespesasAcessorias;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorDocumento(BigDecimal valorDocumento) {
        this.valorDocumento = valorDocumento;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorEmNomeDeTerceiros(BigDecimal valorEmNomeDeTerceiros) {
        this.valorEmNomeDeTerceiros = valorEmNomeDeTerceiros;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorFornecido(BigDecimal valorFornecido) {
        this.valorFornecido = valorFornecido;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorIcmsSt(BigDecimal valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorNaoTributado(BigDecimal valorNaoTributado) {
        this.valorNaoTributado = valorNaoTributado;
        return this;
    }

    public SFC500NotaFiscalEnergiaEletrica setValorPis(BigDecimal valorPis) {
        this.valorPis = valorPis;
        return this;
    }
}