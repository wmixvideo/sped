package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SFE116ObrigacoesICMSRecolherOperacoesProprias implements SFLinha {

    private String codigoObrigacao, codigoReceita, numeroProcesso, descricaoResumida, descricaoComplementar, referencia;
    private BigDecimal valorObrigacao;
    private LocalDate dataVencimento;
    private SFIndicadorProcessoOrigem indicadorProcessoOrigem;

    @Override
    public String getCodigoRegistro() {
        return "E116";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.codigoObrigacao);
        texto.append(SFUtil.formatToString(this.valorObrigacao));
        texto.append(SFUtil.formatToString(this.dataVencimento));
        texto.append(this.codigoReceita);
        texto.append(this.numeroProcesso);
        texto.append(this.indicadorProcessoOrigem != null ? this.indicadorProcessoOrigem.getCodigo() : StringUtils.EMPTY);
        texto.append(this.descricaoResumida);
        texto.append(this.descricaoComplementar);
        texto.append(this.referencia);
        return texto.toString();
    }

    public SFE116ObrigacoesICMSRecolherOperacoesProprias setCodigoObrigacao(String codigoObrigacao) {
        this.codigoObrigacao = codigoObrigacao;
        return this;
    }

    public SFE116ObrigacoesICMSRecolherOperacoesProprias setCodigoReceita(String codigoReceita) {
        this.codigoReceita = codigoReceita;
        return this;
    }

    public SFE116ObrigacoesICMSRecolherOperacoesProprias setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
        return this;
    }

    public SFE116ObrigacoesICMSRecolherOperacoesProprias setDescricaoComplementar(String descricaoComplementar) {
        this.descricaoComplementar = descricaoComplementar;
        return this;
    }

    public SFE116ObrigacoesICMSRecolherOperacoesProprias setDescricaoResumida(String descricaoResumida) {
        this.descricaoResumida = descricaoResumida;
        return this;
    }

    public SFE116ObrigacoesICMSRecolherOperacoesProprias setIndicadorProcessoOrigem(SFIndicadorProcessoOrigem indicadorProcessoOrigem) {
        this.indicadorProcessoOrigem = indicadorProcessoOrigem;
        return this;
    }

    public SFE116ObrigacoesICMSRecolherOperacoesProprias setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
        return this;
    }

    public SFE116ObrigacoesICMSRecolherOperacoesProprias setReferencia(String referencia) {
        this.referencia = referencia;
        return this;
    }

    public SFE116ObrigacoesICMSRecolherOperacoesProprias setValorObrigacao(BigDecimal valorObrigacao) {
        this.valorObrigacao = valorObrigacao;
        return this;
    }
}
