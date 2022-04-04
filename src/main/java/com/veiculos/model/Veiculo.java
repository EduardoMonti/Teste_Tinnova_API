package com.veiculos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private Integer ano;

    @Column(nullable = true)
    private String descricao;

    @Column(nullable = false)
    private boolean vendido;

    @Column(nullable = true)
    private Date criado;

    @Column(nullable = true)
    private Date atualizado;

    public Veiculo() {
    }

    public Veiculo(Long id, String nome, String marca, Integer ano, String descricao, boolean vendido, Date criado, Date atualizado) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.descricao = descricao;
        this.vendido = vendido;
        this.criado = criado;
        this.atualizado = atualizado;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isVendido() {
        return vendido;
    }
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    public Date getCriado() {
        return criado;
    }
    public void setCriado(Date criado) {
        this.criado = criado;
    }
    public Date getAtualizado() {
        return atualizado;
    }
    public void setAtualizado(Date atualizado) {
        this.atualizado = atualizado;
    }


}
