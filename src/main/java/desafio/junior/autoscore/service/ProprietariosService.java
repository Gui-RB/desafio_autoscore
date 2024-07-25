package desafio.junior.autoscore.service;

import desafio.junior.autoscore.DTO.ProprietariosDTO;
import desafio.junior.autoscore.entity.ProprietariosEntity;
import desafio.junior.autoscore.repository.ProprietariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprietariosService {

    @Autowired
    public ProprietariosRepository proprietariosRepository;

//    }

    public List<ProprietariosDTO> listarTodos(){
        List<ProprietariosEntity> proprietariosEntities = proprietariosRepository.findAll();
        return proprietariosEntities.stream().map(ProprietariosDTO::new).toList();
    }


    public void inserir(ProprietariosDTO proprietariosDTO){
        ProprietariosEntity proprietarios = new ProprietariosEntity(proprietariosDTO);
        proprietariosRepository.save(proprietarios);
    }

    public ProprietariosDTO alterar(ProprietariosDTO proprietariosDTO) {
        ProprietariosEntity proprietarios = new ProprietariosEntity(proprietariosDTO);
        return new ProprietariosDTO( proprietariosRepository.save(proprietarios));
    }

    public void excluir(Long id){
        ProprietariosEntity proprietarios = proprietariosRepository.findById(id).get();
        proprietariosRepository.delete(proprietarios);
    }
}

