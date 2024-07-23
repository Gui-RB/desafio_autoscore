package desafio.junior.autoscore.consumoAPI;

import desafio.junior.autoscore.DTO.ProprietariosDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumoApi {

    private final RestTemplate restTemplate;

    public ConsumoApi(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ProprietariosDTO obterVeiculoPorPlaca(String placa) {
        String url = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=" + placa;
        return restTemplate.getForObject(url, ProprietariosDTO.class);
    }
}


gi