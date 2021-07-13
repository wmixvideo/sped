package br.com.wmixvideo.sped.enums;

import java.util.Arrays;
import java.util.Objects;

public enum SFNotaFiscalSituacao {

    DOCUMENTO_REGULAR("00"),
    DOCUMENTO_REGULAR_EXTEMPORANEO("01"),
    DOCUMENTO_CANCELADO("02"),
    DOCUMENTO_CANCELADO_EXTEMPORANEO("03"),
    NFE_DENEGADA("04"),
    NFE_NUMERACAO_INUTILIZADA("05"),
    DOCUMENTO_FISCAL_COMPLEMENTAR("06"),
    DOCUMENTO_FISCAL_COMPLEMENTAR_EXTEMPORANEO("07"),
    DOCUMENTO_FISCAL_EMITIDO_COM_BASE_EM_REGIME_ESPECIAL_OU_NORMA_ESPECIFICA("08");

    private final String codigo;

    SFNotaFiscalSituacao(final String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isCancelada() {
        return Arrays.asList(DOCUMENTO_CANCELADO, DOCUMENTO_CANCELADO_EXTEMPORANEO, NFE_NUMERACAO_INUTILIZADA).contains(this);
    }

    public boolean isInutilizada() {
        return Objects.equals(NFE_NUMERACAO_INUTILIZADA, this);
    }

    @Override
    public String toString() {
        return this.codigo;
    }
}
