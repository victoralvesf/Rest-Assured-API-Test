package com.victoralvesf.rest.models;

public class Transaction {
    private Integer id;
    private String descricao;
    private String envolvido;
    private String tipo;
    private String data_transacao;
    private String data_pagamento;
    private Float valor;
    private Boolean status;
    private Integer conta_id;
    private Integer usuario_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEnvolvido() {
        return envolvido;
    }

    public void setEnvolvido(String envolvido) {
        this.envolvido = envolvido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataTransacao() {
        return data_transacao;
    }

    public void setDataTransacao(String data_transacao) {
        this.data_transacao = data_transacao;
    }

    public String getDataPagamento() {
        return data_pagamento;
    }

    public void setDataPagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getContaId() {
        return conta_id;
    }

    public void setContaId(Integer conta_id) {
        this.conta_id = conta_id;
    }

    public Integer getUsuarioId() {
        return usuario_id;
    }

    public void setUsuarioId(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }
}
