package br.com.wmixvideo.sped.fiscal.leiaute.bloco1;

import br.com.wmixvideo.sped.fiscal.enums.SFConfirmacao;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SF1010ObrigatoriedadeRegistrosBloco1 implements SFLinha {

    private SFConfirmacao campo06OcorreuAverbacaoDeExportacao;
    private SFConfirmacao campo05ExistemInformacoesDeCreditosDeIcms;
    private SFConfirmacao campo03EhComercioVarejistaDeCombustiveis;
    private SFConfirmacao campo08UsinasDeAcucarEAlcool;
    private SFConfirmacao campo04ExistemInformacoesASeremPrestadasNesteRegistro;
    private SFConfirmacao campo02DistribuidoraDeEnergiaOutraUF;
    private SFConfirmacao campo10VendasComCartaoDeCreditoOuDeDebito;
    private SFConfirmacao campo09UtilizacaoDeDocumentosFiscaisEmPapel;
    private SFConfirmacao campo07PrestouServicosDeTransporteAereo;

    public SF1010ObrigatoriedadeRegistrosBloco1() {
        this.campo02DistribuidoraDeEnergiaOutraUF = SFConfirmacao.NAO;
        this.campo03EhComercioVarejistaDeCombustiveis = SFConfirmacao.NAO;
        this.campo04ExistemInformacoesASeremPrestadasNesteRegistro = SFConfirmacao.NAO;
        this.campo05ExistemInformacoesDeCreditosDeIcms = SFConfirmacao.NAO;
        this.campo06OcorreuAverbacaoDeExportacao = SFConfirmacao.NAO;
        this.campo07PrestouServicosDeTransporteAereo = SFConfirmacao.NAO;
        this.campo08UsinasDeAcucarEAlcool = SFConfirmacao.NAO;
        this.campo09UtilizacaoDeDocumentosFiscaisEmPapel = SFConfirmacao.NAO;
        this.campo10VendasComCartaoDeCreditoOuDeDebito = SFConfirmacao.NAO;
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "1010";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02DistribuidoraDeEnergiaOutraUF));
        linha.append(SFUtil.formatToString(this.campo03EhComercioVarejistaDeCombustiveis));
        linha.append(SFUtil.formatToString(this.campo04ExistemInformacoesASeremPrestadasNesteRegistro));
        linha.append(SFUtil.formatToString(this.campo05ExistemInformacoesDeCreditosDeIcms));
        linha.append(SFUtil.formatToString(this.campo06OcorreuAverbacaoDeExportacao));
        linha.append(SFUtil.formatToString(this.campo07PrestouServicosDeTransporteAereo));
        linha.append(SFUtil.formatToString(this.campo08UsinasDeAcucarEAlcool));
        linha.append(SFUtil.formatToString(this.campo09UtilizacaoDeDocumentosFiscaisEmPapel));
        linha.append(SFUtil.formatToString(this.campo10VendasComCartaoDeCreditoOuDeDebito));
        return linha.toString();
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo02DistribuidoraDeEnergiaOutraUF(SFConfirmacao campo02DistribuidoraDeEnergiaOutraUF) {
        this.campo02DistribuidoraDeEnergiaOutraUF = campo02DistribuidoraDeEnergiaOutraUF;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo03EhComercioVarejistaDeCombustiveis(SFConfirmacao campo03EhComercioVarejistaDeCombustiveis) {
        this.campo03EhComercioVarejistaDeCombustiveis = campo03EhComercioVarejistaDeCombustiveis;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo04ExistemInformacoesASeremPrestadasNesteRegistro(SFConfirmacao campo04ExistemInformacoesASeremPrestadasNesteRegistro) {
        this.campo04ExistemInformacoesASeremPrestadasNesteRegistro = campo04ExistemInformacoesASeremPrestadasNesteRegistro;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo05ExistemInformacoesDeCreditosDeIcms(SFConfirmacao campo05ExistemInformacoesDeCreditosDeIcms) {
        this.campo05ExistemInformacoesDeCreditosDeIcms = campo05ExistemInformacoesDeCreditosDeIcms;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo06OcorreuAverbacaoDeExportacao(SFConfirmacao campo06OcorreuAverbacaoDeExportacao) {
        this.campo06OcorreuAverbacaoDeExportacao = campo06OcorreuAverbacaoDeExportacao;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo07PrestouServicosDeTransporteAereo(SFConfirmacao campo07PrestouServicosDeTransporteAereo) {
        this.campo07PrestouServicosDeTransporteAereo = campo07PrestouServicosDeTransporteAereo;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo08UsinasDeAcucarEAlcool(SFConfirmacao campo08UsinasDeAcucarEAlcool) {
        this.campo08UsinasDeAcucarEAlcool = campo08UsinasDeAcucarEAlcool;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo09UtilizacaoDeDocumentosFiscaisEmPapel(SFConfirmacao campo09UtilizacaoDeDocumentosFiscaisEmPapel) {
        this.campo09UtilizacaoDeDocumentosFiscaisEmPapel = campo09UtilizacaoDeDocumentosFiscaisEmPapel;
        return this;
    }

    public SF1010ObrigatoriedadeRegistrosBloco1 setCampo10VendasComCartaoDeCreditoOuDeDebito(SFConfirmacao campo10VendasComCartaoDeCreditoOuDeDebito) {
        this.campo10VendasComCartaoDeCreditoOuDeDebito = campo10VendasComCartaoDeCreditoOuDeDebito;
        return this;
    }
}