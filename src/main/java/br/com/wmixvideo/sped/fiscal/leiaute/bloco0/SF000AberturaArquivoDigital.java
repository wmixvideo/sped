package br.com.wmixvideo.sped.fiscal.leiaute.bloco0;

import br.com.wmixvideo.sped.fiscal.enums.SFFinalidadeArquivo;
import br.com.wmixvideo.sped.fiscal.enums.SFIndicadorTipoAtividade;
import br.com.wmixvideo.sped.fiscal.enums.SFUnidadeFederativa;
import br.com.wmixvideo.sped.fiscal.leiaute.SFLinha;
import br.com.wmixvideo.sped.fiscal.enums.SFPerfilApresentacaoArquivoFiscal;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SF000AberturaArquivoDigital implements SFLinha {

    private SFFinalidadeArquivo campo03Finalidade;
    private LocalDate campo04DataInicio;
    private LocalDate campo05DataFim;
    private String campo06RazaoSocial;
    private String campo07Cnpj;
    private String campo08Cpf;
    private SFUnidadeFederativa campo09Uf;
    private String campo10InscricaoEstadual;
    private String campo11CodigoMunicipio;
    private String campo12InscricaoMunicipal;
    private String campo13Suframa;
    private SFPerfilApresentacaoArquivoFiscal campo14PerfilApresentacaoArquivoFiscal;
    private SFIndicadorTipoAtividade campo15IndicadorTipoAtividade;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.getCampo02CodigoVersaoLeiaute());
        linha.append(SFUtil.formatToString(this.campo03Finalidade));
        linha.append(SFUtil.formatToString(this.campo04DataInicio));
        linha.append(SFUtil.formatToString(this.campo05DataFim));
        linha.append(this.campo06RazaoSocial);
        linha.append(this.campo07Cnpj);
        linha.append(this.campo08Cpf);
        linha.append(SFUtil.formatToString(this.campo09Uf));
        linha.append(this.campo10InscricaoEstadual);
        linha.append(this.campo11CodigoMunicipio);
        linha.append(this.campo12InscricaoMunicipal);
        linha.append(this.campo13Suframa);
        linha.append(SFUtil.formatToString(this.campo14PerfilApresentacaoArquivoFiscal));
        linha.append(SFUtil.formatToString(this.campo15IndicadorTipoAtividade));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0000";
    }

    private String getCampo02CodigoVersaoLeiaute() {
        return "012";
    }

    public SF000AberturaArquivoDigital setCampo03Finalidade(SFFinalidadeArquivo campo03Finalidade) {
        this.campo03Finalidade = campo03Finalidade;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo04DataInicio(LocalDate campo04DataInicio) {
        this.campo04DataInicio = campo04DataInicio;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo05DataFim(LocalDate campo05DataFim) {
        this.campo05DataFim = campo05DataFim;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo06RazaoSocial(String campo06RazaoSocial) {
        this.campo06RazaoSocial = campo06RazaoSocial;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo07Cnpj(String campo07Cnpj) {
        this.campo07Cnpj = campo07Cnpj;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo08Cpf(String campo08Cpf) {
        this.campo08Cpf = campo08Cpf;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo09Uf(SFUnidadeFederativa campo09Uf) {
        this.campo09Uf = campo09Uf;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo10InscricaoEstadual(String campo10InscricaoEstadual) {
        this.campo10InscricaoEstadual = campo10InscricaoEstadual;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo11CodigoMunicipio(String campo11CodigoMunicipio) {
        this.campo11CodigoMunicipio = campo11CodigoMunicipio;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo12InscricaoMunicipal(String campo12InscricaoMunicipal) {
        this.campo12InscricaoMunicipal = campo12InscricaoMunicipal;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo13Suframa(String campo13Suframa) {
        this.campo13Suframa = campo13Suframa;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo14PerfilApresentacaoArquivoFiscal(SFPerfilApresentacaoArquivoFiscal campo14PerfilApresentacaoArquivoFiscal) {
        this.campo14PerfilApresentacaoArquivoFiscal = campo14PerfilApresentacaoArquivoFiscal;
        return this;
    }

    public SF000AberturaArquivoDigital setCampo15IndicadorTipoAtividade(SFIndicadorTipoAtividade campo15IndicadorTipoAtividade) {
        this.campo15IndicadorTipoAtividade = campo15IndicadorTipoAtividade;
        return this;
    }
}