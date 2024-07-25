package desafio.junior.autoscore.entity;

import desafio.junior.autoscore.DTO.VeiculosDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "GRB_Veículos")
public class VeiculosEntitiy {
    @Column
    private String marca;
    @Column
    private String modelo;
    @Column
    private String chassi;
    @Column
    private boolean lincenciado;

    public VeiculosEntitiy (VeiculosDTO veiculos){
        BeanUtils.copyProperties(veiculos,this);
    }

    public VeiculosEntitiy(){

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
