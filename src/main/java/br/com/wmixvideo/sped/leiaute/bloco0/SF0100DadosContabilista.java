package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFContador;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF0100DadosContabilista implements SFRegistro {
    private SFContador contador;

    public SF0100DadosContabilista(final SFContador contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.contador.getNome());
        texto.append(this.contador.getCpf());
        texto.append(this.contador.getCrc());
        texto.append(this.contador.getCnpj());
        texto.append(this.contador.getCep());
        texto.append(this.contador.getEndereco());
        texto.append(this.contador.getNumero());
        texto.append(this.contador.getComplemento());
        texto.append(this.contador.getBairro());
        texto.append(this.contador.getTelefone());
        texto.append(this.contador.getFax());
        texto.append(this.contador.getEmail());
        texto.append(this.contador.getMunicipioCodigo());

        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "0100";
    }
}