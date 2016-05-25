package br.com.wmixvideo.sped.leiaute.blocoC;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFNotaFiscal;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

public class SFC100NotaFiscal implements SFRegistro {

    private final SFNotaFiscal notaFiscal;

    public SFC100NotaFiscal(final SFNotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.notaFiscal.getOperacao().getCodigo());
        texto.append(this.notaFiscal.getEmissao().getCodigo());
        texto.append(this.notaFiscal.getCodigoParticipante());
        texto.append(this.notaFiscal.getCodigoModeloFiscal());
        texto.append(this.notaFiscal.getSituacao().getCodigo());
        texto.append(this.notaFiscal.getSerie());
        texto.append(this.notaFiscal.getNumero());
        texto.append(this.notaFiscal.getChaveNotaFiscalEletronica());

        if (!this.notaFiscal.getSituacao().isCancelada() && !this.notaFiscal.getSituacao().isInutilizada()) {
            texto.append(SFUtil.formatToString(this.notaFiscal.getDataEmissao()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getDataOperacao()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorDocumento()));
            texto.append(this.notaFiscal.getPagamento().getCodigo());
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorDesconto()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorAbatimentoNaoTributado()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorMercadoriaEServico()));
            texto.append(this.notaFiscal.getFrete().getCodigo());
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorFrete()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorSeguro()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorOutrasDespesasAcessorias()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorBaseCalculoIcms()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorIcms()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorBaseCalculoIcmsSt()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorIcmsSt()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorIpi()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorPis()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorCofins()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorPisSt()));
            texto.append(SFUtil.formatToString(this.notaFiscal.getValorCofinsSt()));
        } else {
            for (int i = 0; i < 20; i++) {
                texto.append("");
            }
        }

        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "C100";
    }
}
