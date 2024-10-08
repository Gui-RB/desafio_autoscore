package desafio.junior.autoscore.controller;


import desafio.junior.autoscore.DTO.ProprietariosDTO;
import desafio.junior.autoscore.entity.ProprietariosEntity;
import desafio.junior.autoscore.service.ProprietariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/proprietarios")
public class ProprietariosController {
    @Autowired
    public ProprietariosService proprietariosService;

    public ProprietariosEntity proprietarios = new ProprietariosEntity();


    @GetMapping
    public List<ProprietariosDTO> listarTodos() {
        return proprietariosService.listarTodos();
    }

    @PutMapping
    public ProprietariosDTO alterar(@RequestBody ProprietariosDTO proprietariosDTO) {
        return proprietariosService.alterar(proprietariosDTO);
    }

    @PostMapping
    public void inserir(@RequestBody ProprietariosDTO proprietariosDTO) {
        proprietariosService.inserir(proprietariosDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        proprietariosService.excluir(id);
        return ResponseEntity.ok().build();
    }


}
