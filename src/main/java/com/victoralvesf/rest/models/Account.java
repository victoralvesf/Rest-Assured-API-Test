package com.victoralvesf.rest.models;

public class Account {
    private Integer id;
    private String nome;
    private Integer usuario_id;
    private Boolean visivel;

    public Account(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getUsuarioId() {
        return usuario_id;
    }

    public void setUsuarioId(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Boolean getVisivel() {
        return visivel;
    }

    public void setVisivel(Boolean visivel) {
        this.visivel = visivel;
    }
}
