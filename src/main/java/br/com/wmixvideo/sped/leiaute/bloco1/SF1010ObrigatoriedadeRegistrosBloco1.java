package br.com.wmixvideo.sped.leiaute.bloco1;

import br.com.wmixvideo.sped.leiaute.SFRegistro;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF1010ObrigatoriedadeRegistrosBloco1 implements SFRegistro {

    @Override
    public String getCodigoRegistro() {
        return "1010";
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append("N"); // Ocorreu averbação (conclusão) de exportação no período
        texto.append("N"); // Existem informações acerca de créditos de ICMS a serem controlados, definidos pela Sefaz
        texto.append("N"); // É comercio varejista de combustíveis
        texto.append("N"); // Usinas de açúcar e/álcool - O estabelecimento é produtor de açúcar e/ou álcool carburante:
        texto.append("N"); // Existem informações a serem prestadas neste registro e o registro é obrigatório em sua Unidade da Federação
        texto.append("N"); // A empresa é distribuidora de energia e ocorreu fornecimento de energia elétrica para consumidores de outra UF
        texto.append("N"); // Realizou vendas com Cartão de Crédito ou de débito
        texto.append("N"); // É obrigatório em sua unidade da federação o controle de utilização de documentos fiscais em papel
        texto.append("N"); // A empresa prestou serviços de transporte aéreo de cargas e de passageiros
        return texto.toString();
    }
}