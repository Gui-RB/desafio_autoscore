package desafio.junior.autoscore.controller;


import desafio.junior.autoscore.DTO.ProprietariosDTO;
import desafio.junior.autoscore.DTO.VeiculosDTO;
import desafio.junior.autoscore.entity.VeiculosEntity;
import desafio.junior.autoscore.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculosController {

    @Autowired
    public VeiculosService veiculosService;

    public VeiculosEntity veiculos = new VeiculosEntity();

    @ResponseBody
    @GetMapping(value = "/{placa}")
    public ResponseEntity<VeiculosDTO> consultaPlaca(@PathVariable("placa") String placa ){
        VeiculosDTO veiculosDTO = veiculosService.consultaPlaca(placa);
        return new ResponseEntity<VeiculosDTO>(veiculosDTO, HttpStatus.OK);
    }











//
//    @GetMapping({"/{placa}"})
//    public VeiculosDTO consultaPlaca(@PathVariable("placa") String placa) {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<VeiculosDTO> resp =
//                restTemplate.getForEntity(
//                        String.format("https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=%s", placa),
//                       VeiculosDTO.class);
//        return resp.getBody();
//    }
//
//    @PostMapping
//    public VeiculosDTO inserir(@PathVariable("placa") String placa){
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<VeiculosDTO> resp =
//                restTemplate.getForEntity(
//                        String.format("https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=%s", placa),
//                        VeiculosDTO.class);
//        return resp.getBody();
//
//
//    }


}
