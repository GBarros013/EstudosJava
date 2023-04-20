package org.example.facade;

import org.example.subsistema1.CrmService;
import org.example.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstacia().recuperarCidade(cep);
        String estado = CepApi.getInstacia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
