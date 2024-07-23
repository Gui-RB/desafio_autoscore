package desafio.junior.autoscore.entity;

import desafio.junior.autoscore.DTO.ProprietariosDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@Entity
@Table(name = "GRB_Proprietarios")
public class ProprietariosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String proprietario;
    @Column(nullable = false, unique = true)
    private String cpf;
    @Column(nullable = false,unique = true)
    private String placa;
    @Column
    private String marca;
    @Column
    private String modelo;
    @Column
    private String chassi;
    @Column
    private boolean lincenciado;

    public ProprietariosEntity(ProprietariosDTO propreitarios){
        BeanUtils.copyProperties(propreitarios , this);
    }

    public ProprietariosEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProprietariosEntity that = (ProprietariosEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
