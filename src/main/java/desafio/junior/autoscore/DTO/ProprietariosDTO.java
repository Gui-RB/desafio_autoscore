package desafio.junior.autoscore.DTO;

import desafio.junior.autoscore.entity.ProprietariosEntity;
import org.springframework.beans.BeanUtils;

public class ProprietariosDTO {
    private Long id;
    private String proprietario;
    private String cpf;
    private String placa;
    private String marca;
    private String modelo;
    private String chassi;


    public ProprietariosDTO(ProprietariosEntity proprietarios){
        BeanUtils.copyProperties(proprietarios, this);
    }

    public ProprietariosDTO(){

    }

    public boolean isLincenciado() {
        return lincenciado;
    }

    public void setLincenciado(boolean lincenciado) {
        this.lincenciado = lincenciado;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private boolean lincenciado ;
}
