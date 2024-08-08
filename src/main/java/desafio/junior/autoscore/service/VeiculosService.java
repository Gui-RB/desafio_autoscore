package desafio.junior.autoscore.service;

import desafio.junior.autoscore.DTO.ProprietariosDTO;
import desafio.junior.autoscore.DTO.VeiculosDTO;
import desafio.junior.autoscore.entity.VeiculosEntity;
import desafio.junior.autoscore.repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class VeiculosService {

    @Autowired
    private VeiculosRepository veiculosRepository;

    public VeiculosDTO consultaPlaca(String placa){
        return new RestTemplate().getForEntity("https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa="+placa, VeiculosDTO.class).getBody();
    }

    public void inserir(VeiculosDTO veiculosDTO) {
        VeiculosEntity veiculos = new VeiculosEntity(veiculosDTO);
        veiculosRepository.save(veiculos);
    }

    public VeiculosDTO alterar(VeiculosDTO veiculosDTO) {
        VeiculosEntity veiculos = new VeiculosEntity(veiculosDTO);
        return new VeiculosDTO(veiculosRepository.save(veiculos));
    }

    public void excluir(Long id) {
        VeiculosEntity veiculos = veiculosRepository.findById(id).get();
        veiculosRepository.delete(veiculos);
    }

}
