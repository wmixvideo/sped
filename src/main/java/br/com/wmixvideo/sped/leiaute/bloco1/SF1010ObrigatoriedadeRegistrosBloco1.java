package br.com.wmixvideo.sped.leiaute.bloco1;

import br.com.wmixvideo.sped.enums.SFConfirmacao;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF1010ObrigatoriedadeRegistrosBloco1 implements SFLinha {

    private SFConfirmacao ocorreuAverbacaoDeExportacao;
    private SFConfirmacao existemInformacoesDeCreditosDeIcms;
    private SFConfirmacao ehComercioVarejistaDeCombustiveis;
    private SFConfirmacao usinasDeAcucarEAlcool;
    private SFConfirmacao existemInformacoesASeremPrestadasNesteRegistro;
    private SFConfirmacao distribuidoraDeEnergiaOutraUF;
    private SFConfirmacao vendasComCartaoDeCreditoOuDeDebito;
    private SFConfirmacao utilizacaoDeDocumentosFiscaisEmPapel;
    private SFConfirmacao prestouServicosDeTransporteAereo;

    public SF1010ObrigatoriedadeRegistrosBloco1() {
        this.distribuidoraDeEnergiaOutraUF = SFConfirmacao.NAO;
        this.ehComercioVarejistaDeCombustiveis = SFConfirmacao.NAO;
        this.existemInformacoesASeremPrestadasNesteRegistro = SFConfirmacao.NAO;
        this.existemInformacoesDeCreditosDeIcms = SFConfirmacao.NAO;
        this.ocorreuAverbacaoDeExportacao = SFConfirmacao.NAO;
        this.prestouServicosDeTransporteAereo = SFConfirmacao.NAO;
        this.usinasDeAcucarEAlcool = SFConfirmacao.NAO;
        this.utilizacaoDeDocumentosFiscaisEmPapel = SFConfirmacao.NAO;
        this.vendasComCartaoDeCreditoOuDeDebito = SFConfirmacao.NAO;
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "1010";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCampo01CodigoRegistro());
        texto.append(this.distribuidoraDeEnergiaOutraUF.getCodigo());
        texto.append(this.ehComercioVarejistaDeCombustiveis.getCodigo());
        texto.append(this.existemInformacoesASeremPrestadasNesteRegistro.getCodigo());
        texto.append(this.existemInformacoesDeCreditosDeIcms.getCodigo());
        texto.append(this.ocorreuAverbacaoDeExportacao.getCodigo());
        texto.append(this.prestouServicosDeTransporteAereo.getCodigo());
        texto.append(this.usinasDeAcucarEAlcool.getCodigo());
        texto.append(this.utilizacaoDeDocumentosFiscaisEmPapel.getCodigo());
        texto.append(this.vendasComCartaoDeCreditoOuDeDebito.getCodigo());
        return texto.toString();
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setDistribuidoraDeEnergiaOutraUF(SFConfirmacao distribuidoraDeEnergiaOutraUF) {
        this.distribuidoraDeEnergiaOutraUF = distribuidoraDeEnergiaOutraUF;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setEhComercioVarejistaDeCombustiveis(SFConfirmacao ehComercioVarejistaDeCombustiveis) {
        this.ehComercioVarejistaDeCombustiveis = ehComercioVarejistaDeCombustiveis;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setExistemInformacoesASeremPrestadasNesteRegistro(SFConfirmacao existemInformacoesASeremPrestadasNesteRegistro) {
        this.existemInformacoesASeremPrestadasNesteRegistro = existemInformacoesASeremPrestadasNesteRegistro;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setExistemInformacoesDeCreditosDeIcms(SFConfirmacao existemInformacoesDeCreditosDeIcms) {
        this.existemInformacoesDeCreditosDeIcms = existemInformacoesDeCreditosDeIcms;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setOcorreuAverbacaoDeExportacao(SFConfirmacao ocorreuAverbacaoDeExportacao) {
        this.ocorreuAverbacaoDeExportacao = ocorreuAverbacaoDeExportacao;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setPrestouServicosDeTransporteAereo(SFConfirmacao prestouServicosDeTransporteAereo) {
        this.prestouServicosDeTransporteAereo = prestouServicosDeTransporteAereo;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setUsinasDeAcucarEAlcool(SFConfirmacao usinasDeAcucarEAlcool) {
        this.usinasDeAcucarEAlcool = usinasDeAcucarEAlcool;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setUtilizacaoDeDocumentosFiscaisEmPapel(SFConfirmacao utilizacaoDeDocumentosFiscaisEmPapel) {
        this.utilizacaoDeDocumentosFiscaisEmPapel = utilizacaoDeDocumentosFiscaisEmPapel;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setVendasComCartaoDeCreditoOuDeDebito(SFConfirmacao vendasComCartaoDeCreditoOuDeDebito) {
        this.vendasComCartaoDeCreditoOuDeDebito = vendasComCartaoDeCreditoOuDeDebito;
        return this;
    }
}