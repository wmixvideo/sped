package br.com.wmixvideo.sped.fiscal.leiaute.blococ;

import br.com.wmixvideo.sped.fiscal.enums.SFTipoTransporte;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC115LocalColetaEntrega implements SFLinha {

    private String campo03ColetaCnpj, campo04ColetaInscricaoEstadual, campo05ColetaCpf, campo06ColetaCodigoMunicipio;
    private String campo07EntregaCnpj, campo08EntregaInscricaoEstadual, campo09EntregaCpf, campo10EntregaCodigoMunicipio;
    private SFTipoTransporte campo02TipoTransporte;

    @Override
    public String getCampo01CodigoRegistro() {
        return "C115";
    }

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(SFUtil.formatToString(this.campo02TipoTransporte));
        linha.append(this.campo03ColetaCnpj);
        linha.append(this.campo04ColetaInscricaoEstadual);
        linha.append(this.campo05ColetaCpf);
        linha.append(this.campo06ColetaCodigoMunicipio);
        linha.append(this.campo07EntregaCnpj);
        linha.append(this.campo08EntregaInscricaoEstadual);
        linha.append(this.campo09EntregaCpf);
        linha.append(this.campo10EntregaCodigoMunicipio);
        return linha.toString();
    }

    public SFC115LocalColetaEntrega setCampo03ColetaCnpj(String campo03ColetaCnpj) {
        this.campo03ColetaCnpj = campo03ColetaCnpj;
        return this;
    }

    public SFC115LocalColetaEntrega setCampo06ColetaCodigoMunicipio(String campo06ColetaCodigoMunicipio) {
        this.campo06ColetaCodigoMunicipio = campo06ColetaCodigoMunicipio;
        return this;
    }

    public SFC115LocalColetaEntrega setCampo05ColetaCpf(String campo05ColetaCpf) {
        this.campo05ColetaCpf = campo05ColetaCpf;
        return this;
    }

    public SFC115LocalColetaEntrega setCampo04ColetaInscricaoEstadual(String campo04ColetaInscricaoEstadual) {
        this.campo04ColetaInscricaoEstadual = campo04ColetaInscricaoEstadual;
        return this;
    }

    public SFC115LocalColetaEntrega setCampo07EntregaCnpj(String campo07EntregaCnpj) {
        this.campo07EntregaCnpj = campo07EntregaCnpj;
        return this;
    }

    public SFC115LocalColetaEntrega setCampo10EntregaCodigoMunicipio(String campo10EntregaCodigoMunicipio) {
        this.campo10EntregaCodigoMunicipio = campo10EntregaCodigoMunicipio;
        return this;
    }

    public SFC115LocalColetaEntrega setCampo09EntregaCpf(String campo09EntregaCpf) {
        this.campo09EntregaCpf = campo09EntregaCpf;
        return this;
    }

    public SFC115LocalColetaEntrega setCampo08EntregaInscricaoEstadual(String campo08EntregaInscricaoEstadual) {
        this.campo08EntregaInscricaoEstadual = campo08EntregaInscricaoEstadual;
        return this;
    }

    public SFC115LocalColetaEntrega setCampo02TipoTransporte(SFTipoTransporte campo02TipoTransporte) {
        this.campo02TipoTransporte = campo02TipoTransporte;
        return this;
    }
}
