package br.com.wmixvideo.sped.leiaute.bloco1;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.math.BigDecimal;

public class SF1601OperacoesComInstrumentosDePagamentosEletronicos implements SFLinha {
    private String campo02InstituicaoQueEfetuouPagamento;
    private String campo03IntermediadorDaTransacao;
    private BigDecimal campo4ValorTotalVS;
    private BigDecimal campo5ValorTotalISS;
    private BigDecimal campo6ValorTotalOutros;

    @Override
    public String toString() {
        final SFStringBuilder linha = new SFStringBuilder();
        linha.append(this.getCampo01CodigoRegistro());
        linha.append(this.campo02InstituicaoQueEfetuouPagamento);
        linha.append(this.campo03IntermediadorDaTransacao);
        linha.append(SFUtil.formatToString(this.campo4ValorTotalVS));
        linha.append(SFUtil.formatToString(this.campo5ValorTotalISS));
        linha.append(SFUtil.formatToString(this.campo6ValorTotalOutros));
        return linha.toString();
    }

    @Override
    public String getCampo01CodigoRegistro() {
        return "1601";
    }

    public SF1601OperacoesComInstrumentosDePagamentosEletronicos setCampo02InstituicaoQueEfetuouPagamento(String campo02InstituicaoQueEfetuouPagamento) {
        this.campo02InstituicaoQueEfetuouPagamento = campo02InstituicaoQueEfetuouPagamento;
        return this;
    }

    public SF1601OperacoesComInstrumentosDePagamentosEletronicos setCampo03IntermediadorDaTransacao(String campo03IntermediadorDaTransacao) {
        this.campo03IntermediadorDaTransacao = campo03IntermediadorDaTransacao;
        return this;
    }

    public SF1601OperacoesComInstrumentosDePagamentosEletronicos setCampo4ValorTotalVS(BigDecimal campo4ValorTotalVS) {
        this.campo4ValorTotalVS = campo4ValorTotalVS;
        return this;
    }

    public SF1601OperacoesComInstrumentosDePagamentosEletronicos setCampo5ValorTotalISS(BigDecimal campo5ValorTotalISS) {
        this.campo5ValorTotalISS = campo5ValorTotalISS;
        return this;
    }

    public SF1601OperacoesComInstrumentosDePagamentosEletronicos setCampo6ValorTotalOutros(BigDecimal campo6ValorTotalOutros) {
        this.campo6ValorTotalOutros = campo6ValorTotalOutros;
        return this;
    }
}