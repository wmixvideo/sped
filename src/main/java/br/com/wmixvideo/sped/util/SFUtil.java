package br.com.wmixvideo.sped.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class SFUtil {
    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("ddMMyyyy");

    public static String formatToString(final LocalDate data) {
        return data != null ? data.format(DATE_PATTERN) : "";
    }

    public static String formatToString(final BigDecimal valor) {
        return formatToString(valor, 2);
    }

    public static String formatToString(final BigDecimal valor, final int casasDecimais) {
        if (valor == null) {
            return "";
        }

        if (valor.signum() == 0) {
            return "0";
        }

        final NumberFormat fmt = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        fmt.setGroupingUsed(false);
        fmt.setMaximumFractionDigits(casasDecimais);
        fmt.setMinimumFractionDigits(casasDecimais);
        return fmt.format(valor);
    }
}
