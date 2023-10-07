package org.devinhouse.superherois.model;

public class Vilao extends Personagem {
    private Integer tempoDePrisao;

    public Vilao(String nome, String superpoder, Integer tempoDePrisao) {
        super(nome, superpoder);
        this.tempoDePrisao = tempoDePrisao;
    }

    public Integer getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(Integer tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }
    public void apresentarVilao(){
        System.out.println( " Vilão: ");
        System.out.println( " Nome: " + getNome());
        System.out.println( " Superpoder: " + getSuperpoder());
        System.out.println( " Tempo de prisão: " + getTempoDePrisao() + " anos.");

    }
}
