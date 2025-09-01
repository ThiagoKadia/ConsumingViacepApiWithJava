package org.example;

import lombok.Getter;

@Getter
public class Address {
    private String cep;
    private String logradouro;
    private String complemento;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private int ddd;
    private String siafi;

    public Address(String cep,
                   String logradouro,
                   String complemento,
                   String localidade,
                   String uf,
                   String estado,
                   String regiao,
                   String ibge,
                   String gia,
                   int ddd,
                   String siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.localidade = localidade;
        this.uf = uf;
        this.estado = estado;
        this.regiao = regiao;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }
}