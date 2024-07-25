package desafio.junior.autoscore.DTO;

import desafio.junior.autoscore.entity.VeiculosEntitiy;
import org.springframework.beans.BeanUtils;

public class VeiculosDTO {
    private String marca;
    private String modelo;
    private String chassi;
    private boolean lincenciado;

    public VeiculosDTO(VeiculosEntitiy veiculos){
        BeanUtils.copyProperties(veiculos, this);
    }

    public VeiculosDTO(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public boolean isLincenciado() {
        return lincenciado;
    }

    public void setLincenciado(boolean lincenciado) {
        this.lincenciado = lincenciado;
    }
}
