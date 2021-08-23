package com.example.tde01_devweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class Produto {

    private int id;

    private String nome;

    private int anoFabricacao;

    private long ean;

    public Produto() {
    }

    public Produto(int id, String nome, int anoFabricacao, long ean) {
        this.id = id;
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.ean = ean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public long getEan() {
        return ean;
    }

    public void setEan(long ean) {
        this.ean = ean;
    }


}
