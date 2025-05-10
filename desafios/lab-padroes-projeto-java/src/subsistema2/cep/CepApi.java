package subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi istancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {

        return istancia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "Araraquara";
    }
}
