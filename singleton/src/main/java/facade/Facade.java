package facade;

import subsistema.cep.CepApi;
import subsistema.crm.CrmService;

public class Facade {
    public void migraCliente(String nome, String cep){
       String cidade = CepApi.getInstance().recuperarCidade(cep);
       String estado = CepApi.getInstance().recuperarEstado(cep);

       CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
