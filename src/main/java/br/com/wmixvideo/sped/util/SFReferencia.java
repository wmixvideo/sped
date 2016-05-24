package br.com.wmixvideo.sped.util;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class SFReferencia implements Serializable {
    private static final long serialVersionUID = -8052724845398696709L;
    private final Year ano;
    private final Month mes;

    private SFReferencia(Year ano, Month mes) {
        this.ano = ano;
        this.mes = mes;
    }

    public static SFReferencia of(int ano, Month mes) {
        return new SFReferencia(Year.of(ano), mes);
    }

    public LocalDate getInicio() {
        return LocalDate.of(this.ano.getValue(), this.mes.getValue(), 1);
    }

    public LocalDate getFim() {
        final LocalDate inicio = this.getInicio();
        return inicio.withDayOfMonth(inicio.lengthOfMonth());
    }
}
