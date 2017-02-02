package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFModeloDocumentoArrecadacao;
import br.com.wmixvideo.sped.enums.SFMotivoRessarcimento;
import br.com.wmixvideo.sped.enums.SFResponsavelRetencaoIcmsSt;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFC176RessarcimentoIcms implements SFLinha {

    private String campo02CodigoModelo;
    private String campo03Numero;
    private String campo04Serie;
    private LocalDate campo05DataUltimaEntrada;
    private String campo06CodigoParticipante;
    private int campo07Quantidade;
    private BigDecimal campo08ValorUnitario;
    private BigDecimal campo09ValorUnitarioBaseCalculoST;
    private String campo10ChaveNFeUltimaEntrada;
    private String campo11NumeroSequencialNFUltimaEntrada;
    private BigDecimal campo12ValorUnitarioBaseCalculoUltimaEntrada;
    private BigDecimal campo13AliquotaIcmsUltimaEntrada;
    private BigDecimal campo14ValorUnitarioBaseCalculoIcmsUltimaEntrada;
    private BigDecimal campo15ValorUnitarioCreditoIcmsUltimaEntrada;
    private BigDecimal campo16AliquotaIcmsStUltimaEntrada;
    private BigDecimal campo17ValorUnitarioRessarcimentoUltimaEntrada;
    private SFResponsavelRetencaoIcmsSt campo18ResponsavelRetencaoIcmsSt;
    private SFMotivoRessarcimento campo19MotivoRessarcimento;
    private String campo20ChaveNFComRetencaoIcmsSt;
    private String campo21CodigoParticipanteNFComRetencaoIcmsSt;
    private String campo22SerieNFComRetencaoIcmsSt;
    private String campo23NumeroNFComRetencaoIcmsSt;
    private String campo24SequencialItemNumeroNFComRetencaoIcmsSt;
    private SFModeloDocumentoArrecadacao campo25ModeloDocumentoArrecadacao;
    private String campo26NumeroDocumentoArrecadacaoEstadual;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C176";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02CodigoModelo);
        linha.append(this.campo03Numero);
        linha.append(this.campo04Serie);
        linha.append(SFUtil.formatToString(this.campo05DataUltimaEntrada));
        linha.append(this.campo06CodigoParticipante);
        linha.append(this.campo07Quantidade);
        linha.append(SFUtil.formatToString(this.campo08ValorUnitario));
        linha.append(SFUtil.formatToString(this.campo09ValorUnitarioBaseCalculoST));
        linha.append(this.campo10ChaveNFeUltimaEntrada);
        linha.append(this.campo11NumeroSequencialNFUltimaEntrada);
        linha.append(SFUtil.formatToString(this.campo12ValorUnitarioBaseCalculoUltimaEntrada));
        linha.append(SFUtil.formatToString(this.campo13AliquotaIcmsUltimaEntrada));
        linha.append(SFUtil.formatToString(this.campo14ValorUnitarioBaseCalculoIcmsUltimaEntrada));
        linha.append(SFUtil.formatToString(this.campo15ValorUnitarioCreditoIcmsUltimaEntrada));
        linha.append(SFUtil.formatToString(this.campo16AliquotaIcmsStUltimaEntrada));
        linha.append(SFUtil.formatToString(this.campo17ValorUnitarioRessarcimentoUltimaEntrada));
        linha.append(SFUtil.formatToString(this.campo18ResponsavelRetencaoIcmsSt));
        linha.append(SFUtil.formatToString(this.campo19MotivoRessarcimento));
        linha.append(this.campo20ChaveNFComRetencaoIcmsSt);
        linha.append(this.campo21CodigoParticipanteNFComRetencaoIcmsSt);
        linha.append(this.campo22SerieNFComRetencaoIcmsSt);
        linha.append(this.campo23NumeroNFComRetencaoIcmsSt);
        linha.append(this.campo24SequencialItemNumeroNFComRetencaoIcmsSt);
        linha.append(SFUtil.formatToString(this.campo25ModeloDocumentoArrecadacao));
        linha.append(this.campo26NumeroDocumentoArrecadacaoEstadual);
        return linha.toString();
    }

    public SFC176RessarcimentoIcms setCampo02CodigoModelo(String campo02CodigoModelo) {
        this.campo02CodigoModelo = campo02CodigoModelo;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo03Numero(String campo03Numero) {
        this.campo03Numero = campo03Numero;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo04Serie(String campo04Serie) {
        this.campo04Serie = campo04Serie;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo05DataUltimaEntrada(LocalDate campo05DataUltimaEntrada) {
        this.campo05DataUltimaEntrada = campo05DataUltimaEntrada;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo06CodigoParticipante(String campo06CodigoParticipante) {
        this.campo06CodigoParticipante = campo06CodigoParticipante;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo07Quantidade(int campo07Quantidade) {
        this.campo07Quantidade = campo07Quantidade;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo08ValorUnitario(BigDecimal campo08ValorUnitario) {
        this.campo08ValorUnitario = campo08ValorUnitario;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo09ValorUnitarioBaseCalculoST(BigDecimal campo09ValorUnitarioBaseCalculoST) {
        this.campo09ValorUnitarioBaseCalculoST = campo09ValorUnitarioBaseCalculoST;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo10ChaveNFeUltimaEntrada(String campo10ChaveNFeUltimaEntrada) {
        this.campo10ChaveNFeUltimaEntrada = campo10ChaveNFeUltimaEntrada;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo11NumeroSequencialNFUltimaEntrada(String campo11NumeroSequencialNFUltimaEntrada) {
        this.campo11NumeroSequencialNFUltimaEntrada = campo11NumeroSequencialNFUltimaEntrada;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo12ValorUnitarioBaseCalculoUltimaEntrada(BigDecimal campo12ValorUnitarioBaseCalculoUltimaEntrada) {
        this.campo12ValorUnitarioBaseCalculoUltimaEntrada = campo12ValorUnitarioBaseCalculoUltimaEntrada;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo13AliquotaIcmsUltimaEntrada(BigDecimal campo13AliquotaIcmsUltimaEntrada) {
        this.campo13AliquotaIcmsUltimaEntrada = campo13AliquotaIcmsUltimaEntrada;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo14ValorUnitarioBaseCalculoIcmsUltimaEntrada(BigDecimal campo14ValorUnitarioBaseCalculoIcmsUltimaEntrada) {
        this.campo14ValorUnitarioBaseCalculoIcmsUltimaEntrada = campo14ValorUnitarioBaseCalculoIcmsUltimaEntrada;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo15ValorUnitarioCreditoIcmsUltimaEntrada(BigDecimal campo15ValorUnitarioCreditoIcmsUltimaEntrada) {
        this.campo15ValorUnitarioCreditoIcmsUltimaEntrada = campo15ValorUnitarioCreditoIcmsUltimaEntrada;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo16AliquotaIcmsStUltimaEntrada(BigDecimal campo16AliquotaIcmsStUltimaEntrada) {
        this.campo16AliquotaIcmsStUltimaEntrada = campo16AliquotaIcmsStUltimaEntrada;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo17ValorUnitarioRessarcimentoUltimaEntrada(BigDecimal campo17ValorUnitarioRessarcimentoUltimaEntrada) {
        this.campo17ValorUnitarioRessarcimentoUltimaEntrada = campo17ValorUnitarioRessarcimentoUltimaEntrada;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo18ResponsavelRetencaoIcmsSt(SFResponsavelRetencaoIcmsSt campo18ResponsavelRetencaoIcmsSt) {
        this.campo18ResponsavelRetencaoIcmsSt = campo18ResponsavelRetencaoIcmsSt;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo19MotivoRessarcimento(SFMotivoRessarcimento campo19MotivoRessarcimento) {
        this.campo19MotivoRessarcimento = campo19MotivoRessarcimento;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo20ChaveNFComRetencaoIcmsSt(String campo20ChaveNFComRetencaoIcmsSt) {
        this.campo20ChaveNFComRetencaoIcmsSt = campo20ChaveNFComRetencaoIcmsSt;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo21CodigoParticipanteNFComRetencaoIcmsSt(String campo21CodigoParticipanteNFComRetencaoIcmsSt) {
        this.campo21CodigoParticipanteNFComRetencaoIcmsSt = campo21CodigoParticipanteNFComRetencaoIcmsSt;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo22SerieNFComRetencaoIcmsSt(String campo22SerieNFComRetencaoIcmsSt) {
        this.campo22SerieNFComRetencaoIcmsSt = campo22SerieNFComRetencaoIcmsSt;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo23NumeroNFComRetencaoIcmsSt(String campo23NumeroNFComRetencaoIcmsSt) {
        this.campo23NumeroNFComRetencaoIcmsSt = campo23NumeroNFComRetencaoIcmsSt;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo24SequencialItemNumeroNFComRetencaoIcmsSt(String campo24SequencialItemNumeroNFComRetencaoIcmsSt) {
        this.campo24SequencialItemNumeroNFComRetencaoIcmsSt = campo24SequencialItemNumeroNFComRetencaoIcmsSt;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo25ModeloDocumentoArrecadacao(SFModeloDocumentoArrecadacao campo25ModeloDocumentoArrecadacao) {
        this.campo25ModeloDocumentoArrecadacao = campo25ModeloDocumentoArrecadacao;
        return this;
    }

    public SFC176RessarcimentoIcms setCampo26NumeroDocumentoArrecadacaoEstadual(String campo26NumeroDocumentoArrecadacaoEstadual) {
        this.campo26NumeroDocumentoArrecadacaoEstadual = campo26NumeroDocumentoArrecadacaoEstadual;
        return this;
    }
}