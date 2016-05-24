package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.modelo.SFParticipante;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import org.apache.commons.lang3.StringUtils;

public class SF0150CadastroParticipante implements SFRegistro {
    final SFParticipante participante;

    public SF0150CadastroParticipante(final SFParticipante participante) {
        this.participante = participante;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.participante.getCodigoParticipante());
        texto.append(this.participante.getNome());
        texto.append(this.participante.getEndereco().getPais().getCodigo());
        texto.append(this.participante.getCnpj());
        texto.append(this.participante.getCpf());
        texto.append(this.participante.getInscricaoEstadual());
        texto.append(this.participante.getEndereco().getCodigoMunicipio());
        texto.append(this.participante.getSuframa());
        texto.append(StringUtils.trimToEmpty(this.participante.getEndereco().getLogradouro()));
        texto.append(StringUtils.trimToEmpty(this.participante.getEndereco().getNumero()));
        texto.append(this.participante.getEndereco().getComplemento());
        texto.append(StringUtils.trimToEmpty(this.participante.getEndereco().getBairro()));
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "0150";
    }

    public boolean isPossuiAlteracoes() {
        return this.participante.isPossuiAlteracoes();
    }

//    public String[] getCampos(final SFReferencia referencia) {
//        if (referencia.getInicio().isBefore(LocalDate.of(2013, Month.SEPTEMBER, 1))) {
//            return new String[]{"cgc", "razaosocial", "inscricaoestadual", "endereco", "numero", "complemento", "bairro"};
//        }
//        return new String[]{"cgc", "razaosocial", "endereco", "numero", "complemento", "bairro"};
//    }
}