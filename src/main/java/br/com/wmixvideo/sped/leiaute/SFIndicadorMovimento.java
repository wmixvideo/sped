package br.com.wmixvideo.sped.leiaute;

public enum SFIndicadorMovimento {
    BLOCO_COM_DADOS_INFORMADOS(0), BLOCO_SEM_DADOS_INFORMADOS(1);

    private int codigo;

    private SFIndicadorMovimento(final int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
}