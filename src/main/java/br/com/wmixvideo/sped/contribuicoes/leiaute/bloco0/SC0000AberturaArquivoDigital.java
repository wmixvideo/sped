package br.com.wmixvideo.sped.contribuicoes.leiaute.bloco0;

import br.com.wmixvideo.sped.fiscal.enums.SFUnidadeFederativa;
import br.com.wmixvideo.sped.SFLinha;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorNaturezaPessoaJuridica;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorSituacaoEspecial;
import br.com.wmixvideo.sped.contribuicoes.enums.SCIndicadorTipoAtividadePredominante;
import br.com.wmixvideo.sped.contribuicoes.enums.SCTipoEscrituracao;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

public class SC0000AberturaArquivoDigital implements SFLinha {

    private SCTipoEscrituracao campo03TipoEscrituracao;
    private SCIndicadorSituacaoEspecial campo04IndicadorSituacaoEspecial;
    private String campo05NumeroReciboEscrituracaoAnterior;
    private LocalDate campo06DataInicio;
    private LocalDate campo07DataFim;
    private String campo08RazaoSocial;
    private String campo09Cnpj;
    private SFUnidadeFederativa campo10Uf;
    private String campo11CodigoMunicipio;
    private String campo12Suframa;
    private SCIndicadorNaturezaPessoaJuridica campo13IndicadorNatureza;
    private SCIndicadorTipoAtividadePredominante campo14IndicadorTipoAtividade;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.getCampo02CodigoVersaoLeiaute());
        linha.append(SFUtil.formatToString(this.campo03TipoEscrituracao));
        linha.append(SFUtil.formatToString(this.campo04IndicadorSituacaoEspecial));
        linha.append(this.campo05NumeroReciboEscrituracaoAnterior);
        linha.append(SFUtil.formatToString(this.campo06DataInicio));
        linha.append(SFUtil.formatToString(this.campo07DataFim));
        linha.append(this.campo08RazaoSocial);
        linha.append(this.campo09Cnpj);
        linha.append(SFUtil.formatToString(this.campo10Uf));
        linha.append(this.campo11CodigoMunicipio);
        linha.append(this.campo12Suframa);
        linha.append(SFUtil.formatToString(this.campo13IndicadorNatureza));
        linha.append(SFUtil.formatToString(this.campo14IndicadorTipoAtividade));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "0000";
    }

    private String getCampo02CodigoVersaoLeiaute() {
        return "3.1.0";
    }


    public SC0000AberturaArquivoDigital setCampo03TipoEscrituracao(SCTipoEscrituracao campo03TipoEscrituracao) {
        this.campo03TipoEscrituracao = campo03TipoEscrituracao;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo04IndicadorSituacaoEspecial(SCIndicadorSituacaoEspecial campo04IndicadorSituacaoEspecial) {
        this.campo04IndicadorSituacaoEspecial = campo04IndicadorSituacaoEspecial;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo05NumeroReciboEscrituracaoAnterior(String campo05NumeroReciboEscrituracaoAnterior) {
        this.campo05NumeroReciboEscrituracaoAnterior = campo05NumeroReciboEscrituracaoAnterior;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo06DataInicio(LocalDate campo06DataInicio) {
        this.campo06DataInicio = campo06DataInicio;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo07DataFim(LocalDate campo07DataFim) {
        this.campo07DataFim = campo07DataFim;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo08RazaoSocial(String campo08RazaoSocial) {
        this.campo08RazaoSocial = campo08RazaoSocial;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo09Cnpj(String campo09Cnpj) {
        this.campo09Cnpj = campo09Cnpj;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo10Uf(SFUnidadeFederativa campo10Uf) {
        this.campo10Uf = campo10Uf;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo11CodigoMunicipio(String campo11CodigoMunicipio) {
        this.campo11CodigoMunicipio = campo11CodigoMunicipio;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo12Suframa(String campo12Suframa) {
        this.campo12Suframa = campo12Suframa;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo13IndicadorNatureza(SCIndicadorNaturezaPessoaJuridica campo13IndicadorNatureza) {
        this.campo13IndicadorNatureza = campo13IndicadorNatureza;
        return this;
    }

    public SC0000AberturaArquivoDigital setCampo14IndicadorTipoAtividade(SCIndicadorTipoAtividadePredominante campo14IndicadorTipoAtividade) {
        this.campo14IndicadorTipoAtividade = campo14IndicadorTipoAtividade;
        return this;
    }
}