package br.com.wmixvideo.sped.leiaute.blococ;

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
}