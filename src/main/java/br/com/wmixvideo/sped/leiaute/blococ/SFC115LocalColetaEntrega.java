package br.com.wmixvideo.sped.leiaute.blococ;

import br.com.wmixvideo.sped.enums.SFTipoTransporte;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC115LocalColetaEntrega implements SFLinha {

    private String coletaCnpj, coletaInscricaoEstadual, coletaCpf, coletaCodigoMunicipio;
    private String entregaCnpj, entregaInscricaoEstadual, entregaCpf, entregaCodigoMunicipio;
    private SFTipoTransporte tipoTransporte;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C115";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.tipoTransporte));
        linha.append(this.coletaCnpj);
        linha.append(this.coletaInscricaoEstadual);
        linha.append(this.coletaCpf);
        linha.append(this.coletaCodigoMunicipio);
        linha.append(this.entregaCnpj);
        linha.append(this.entregaInscricaoEstadual);
        linha.append(this.entregaCpf);
        linha.append(this.entregaCodigoMunicipio);
        return linha.toString();
    }

    public SFC115LocalColetaEntrega setColetaCnpj(String coletaCnpj) {
        this.coletaCnpj = coletaCnpj;
        return this;
    }

    public SFC115LocalColetaEntrega setColetaCodigoMunicipio(String coletaCodigoMunicipio) {
        this.coletaCodigoMunicipio = coletaCodigoMunicipio;
        return this;
    }

    public SFC115LocalColetaEntrega setColetaCpf(String coletaCpf) {
        this.coletaCpf = coletaCpf;
        return this;
    }

    public SFC115LocalColetaEntrega setColetaInscricaoEstadual(String coletaInscricaoEstadual) {
        this.coletaInscricaoEstadual = coletaInscricaoEstadual;
        return this;
    }

    public SFC115LocalColetaEntrega setEntregaCnpj(String entregaCnpj) {
        this.entregaCnpj = entregaCnpj;
        return this;
    }

    public SFC115LocalColetaEntrega setEntregaCodigoMunicipio(String entregaCodigoMunicipio) {
        this.entregaCodigoMunicipio = entregaCodigoMunicipio;
        return this;
    }

    public SFC115LocalColetaEntrega setEntregaCpf(String entregaCpf) {
        this.entregaCpf = entregaCpf;
        return this;
    }

    public SFC115LocalColetaEntrega setEntregaInscricaoEstadual(String entregaInscricaoEstadual) {
        this.entregaInscricaoEstadual = entregaInscricaoEstadual;
        return this;
    }

    public SFC115LocalColetaEntrega setTipoTransporte(SFTipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
        return this;
    }
}
