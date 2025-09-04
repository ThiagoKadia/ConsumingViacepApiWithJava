package org.example;

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

    //Getters
    public String getCep() {
        return cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getLocalidade() {
        return localidade;
    }
    public String getUf() {
        return uf;
    }
    public String getEstado() {
        return estado;
    }
    public String getRegiao() {
        return regiao;
    }
    public String getIbge() {
        return ibge;
    }
    public String getGia() {
        return gia;
    }
    public int getDdd() {
        return ddd;
    }
    public String getSiafi() {
        return siafi;
    }
}