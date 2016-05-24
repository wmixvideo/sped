package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFEntidade;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0005DadosComplementaresEntidade implements SFRegistro {

    private final SFEntidade entidade;

    public SF0005DadosComplementaresEntidade(SFEntidade entidade) {
        this.entidade = entidade;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.entidade != null ? this.entidade.getNomeFantasia() : "");
        texto.append(this.entidade != null ? this.entidade.getEndereco().getCep() : "");
        texto.append(this.entidade != null ? this.entidade.getEndereco().getLogradouro() : "");
        texto.append(this.entidade != null ? this.entidade.getEndereco().getNumero() : "");
        texto.append(this.entidade != null ? this.entidade.getEndereco().getComplemento() : "");
        texto.append(this.entidade != null ? this.entidade.getEndereco().getBairro() : "");
        texto.append(this.entidade != null ? this.entidade.getTelefone() : "");
        texto.append(this.entidade != null ? this.entidade.getFax() : "");
        texto.append(this.entidade != null ? this.entidade.getEmail() : "");

        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "0005";
    }
}