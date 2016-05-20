package br.com.wmixvideo.sped.util;

public final class SFStringBuilder {

    private static final String SEPARADOR = "|";
    private final StringBuilder stringBuilder;

    public SFStringBuilder() {
        this.stringBuilder = new StringBuilder(SEPARADOR);
    }

    public SFStringBuilder append(final String string) {
        this.stringBuilder.append(string.trim().replaceAll("\\|", " ")).append(SEPARADOR);
        return this;
    }

    public void append(final int texto) {
        this.append(String.valueOf(texto));
    }

    @Override
    public String toString() {
        return this.stringBuilder.toString();
    }
}
