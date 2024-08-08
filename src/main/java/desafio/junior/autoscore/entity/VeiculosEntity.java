package desafio.junior.autoscore.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import desafio.junior.autoscore.DTO.VeiculosDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "GRB_Veículos")
public class VeiculosEntity {
    @Id
    private Long id;
    @Column
    private String marca;
    @Column
    private String modelo;
    @Column
    private String chassi;
    @Column
    private boolean lincenciado;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    @JoinColumn(name = "palca_id")
    private ProprietariosEntity proprietarios;


    public VeiculosEntity(VeiculosDTO veiculos){
        BeanUtils.copyProperties(veiculos,this);
    }

    public VeiculosEntity(){

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProprietariosEntity getProprietarios() {
        return proprietarios;
    }

    public void setProprietarios(ProprietariosEntity proprietarios) {
        this.proprietarios = proprietarios;
    }
}
