package com.finder.address.model;

import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

public class AddressLog {

    @Id
    private Long id;

    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;

    private LocalDateTime consultaEm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getConsultaEm() {
        return consultaEm;
    }

    public void setConsultaEm(LocalDateTime consultaEm) {
        this.consultaEm = consultaEm;
    }
}
