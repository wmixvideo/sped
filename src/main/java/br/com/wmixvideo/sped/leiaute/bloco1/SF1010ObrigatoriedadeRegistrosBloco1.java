package br.com.wmixvideo.sped.leiaute.bloco1;

import br.com.wmixvideo.sped.enums.SFConfirmacao;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SF1010ObrigatoriedadeRegistrosBloco1 implements SFLinha {

    private SFConfirmacao campo02OcorreuAverbacaoDeExportacao;
    private SFConfirmacao campo03ExistemInformacoesDeCreditosDeIcms;
    private SFConfirmacao campo04EhComercioVarejistaDeCombustiveis;
    private SFConfirmacao campo05UsinasDeAcucarEAlcool;
    private SFConfirmacao campo06ExistemInformacoesASeremPrestadasNesteRegistro;
    private SFConfirmacao campo07DistribuidoraDeEnergiaOutraUF;
    private SFConfirmacao campo08VendasComInstrumentosDePagamentosEletronicos;
    private SFConfirmacao campo09UtilizacaoDeDocumentosFiscaisEmPapel;
    private SFConfirmacao campo10PrestouServicosDeTransporteAereo;
    private SFConfirmacao campo11PossuiInfoGaf1;
    private SFConfirmacao campo12PossuiInfoGaf3;
    private SFConfirmacao campo13PossuiInfoGaf4;
    private SFConfirmacao campo14PossuiInformacaoConsolidadaDeRestituicaoRessarcimentoEComplementacaoDoIcms;

    public SF1010ObrigatoriedadeRegistrosBloco1() {
        this.campo02OcorreuAverbacaoDeExportacao = SFConfirmacao.NAO;
        this.campo03ExistemInformacoesDeCreditosDeIcms = SFConfirmacao.NAO;
        this.campo04EhComercioVarejistaDeCombustiveis = SFConfirmacao.NAO;
        this.campo05UsinasDeAcucarEAlcool = SFConfirmacao.NAO;
        this.campo06ExistemInformacoesASeremPrestadasNesteRegistro = SFConfirmacao.NAO;
        this.campo07DistribuidoraDeEnergiaOutraUF = SFConfirmacao.NAO;
        this.campo08VendasComInstrumentosDePagamentosEletronicos = SFConfirmacao.NAO;
        this.campo09UtilizacaoDeDocumentosFiscaisEmPapel = SFConfirmacao.NAO;
        this.campo10PrestouServicosDeTransporteAereo = SFConfirmacao.NAO;
        this.campo11PossuiInfoGaf1 = SFConfirmacao.NAO;
        this.campo12PossuiInfoGaf3 = SFConfirmacao.NAO;
        this.campo13PossuiInfoGaf4 = SFConfirmacao.NAO;
        this.campo14PossuiInformacaoConsolidadaDeRestituicaoRessarcimentoEComplementacaoDoIcms = SFConfirmacao.NAO;
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "1010";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02OcorreuAverbacaoDeExportacao));
        linha.append(SFUtil.formatToString(this.campo03ExistemInformacoesDeCreditosDeIcms));
        linha.append(SFUtil.formatToString(this.campo04EhComercioVarejistaDeCombustiveis));
        linha.append(SFUtil.formatToString(this.campo05UsinasDeAcucarEAlcool));
        linha.append(SFUtil.formatToString(this.campo06ExistemInformacoesASeremPrestadasNesteRegistro));
        linha.append(SFUtil.formatToString(this.campo07DistribuidoraDeEnergiaOutraUF));
        linha.append(SFUtil.formatToString(this.campo08VendasComInstrumentosDePagamentosEletronicos));
        linha.append(SFUtil.formatToString(this.campo09UtilizacaoDeDocumentosFiscaisEmPapel));
        linha.append(SFUtil.formatToString(this.campo10PrestouServicosDeTransporteAereo));
        linha.append(SFUtil.formatToString(this.campo11PossuiInfoGaf1));
        linha.append(SFUtil.formatToString(this.campo12PossuiInfoGaf3));
        linha.append(SFUtil.formatToString(this.campo13PossuiInfoGaf4));
        linha.append(SFUtil.formatToString(this.campo14PossuiInformacaoConsolidadaDeRestituicaoRessarcimentoEComplementacaoDoIcms));
        return linha.toString();
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo02OcorreuAverbacaoDeExportacao(SFConfirmacao campo02OcorreuAverbacaoDeExportacao) {
        this.campo02OcorreuAverbacaoDeExportacao = campo02OcorreuAverbacaoDeExportacao;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo03ExistemInformacoesDeCreditosDeIcms(SFConfirmacao campo03ExistemInformacoesDeCreditosDeIcms) {
        this.campo03ExistemInformacoesDeCreditosDeIcms = campo03ExistemInformacoesDeCreditosDeIcms;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo04EhComercioVarejistaDeCombustiveis(SFConfirmacao campo04EhComercioVarejistaDeCombustiveis) {
        this.campo04EhComercioVarejistaDeCombustiveis = campo04EhComercioVarejistaDeCombustiveis;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo05UsinasDeAcucarEAlcool(SFConfirmacao campo05UsinasDeAcucarEAlcool) {
        this.campo05UsinasDeAcucarEAlcool = campo05UsinasDeAcucarEAlcool;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo06ExistemInformacoesASeremPrestadasNesteRegistro(SFConfirmacao campo06ExistemInformacoesASeremPrestadasNesteRegistro) {
        this.campo06ExistemInformacoesASeremPrestadasNesteRegistro = campo06ExistemInformacoesASeremPrestadasNesteRegistro;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo07DistribuidoraDeEnergiaOutraUF(SFConfirmacao campo07DistribuidoraDeEnergiaOutraUF) {
        this.campo07DistribuidoraDeEnergiaOutraUF = campo07DistribuidoraDeEnergiaOutraUF;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo08VendasComInstrumentosDePagamentosEletronicos(SFConfirmacao campo08VendasComInstrumentosDePagamentosEletronicos) {
        this.campo08VendasComInstrumentosDePagamentosEletronicos = campo08VendasComInstrumentosDePagamentosEletronicos;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo09UtilizacaoDeDocumentosFiscaisEmPapel(SFConfirmacao campo09UtilizacaoDeDocumentosFiscaisEmPapel) {
        this.campo09UtilizacaoDeDocumentosFiscaisEmPapel = campo09UtilizacaoDeDocumentosFiscaisEmPapel;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo10PrestouServicosDeTransporteAereo(SFConfirmacao campo10PrestouServicosDeTransporteAereo) {
        this.campo10PrestouServicosDeTransporteAereo = campo10PrestouServicosDeTransporteAereo;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo11PossuiInfoGaf1(SFConfirmacao campo11PossuiInfoGaf1) {
        this.campo11PossuiInfoGaf1 = campo11PossuiInfoGaf1;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo12PossuiInfoGaf3(SFConfirmacao campo12PossuiInfoGaf3) {
        this.campo12PossuiInfoGaf3 = campo12PossuiInfoGaf3;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo13PossuiInfoGaf4(SFConfirmacao campo13PossuiInfoGaf4) {
        this.campo13PossuiInfoGaf4 = campo13PossuiInfoGaf4;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo14PossuiInformacaoConsolidadaDeRestituicaoRessarcimentoEComplementacaoDoIcms(SFConfirmacao campo14PossuiInformacaoConsolidadaDeRestituicaoRessarcimentoEComplementacaoDoIcms) {
        this.campo14PossuiInformacaoConsolidadaDeRestituicaoRessarcimentoEComplementacaoDoIcms = campo14PossuiInformacaoConsolidadaDeRestituicaoRessarcimentoEComplementacaoDoIcms;
        return this;
    }
}