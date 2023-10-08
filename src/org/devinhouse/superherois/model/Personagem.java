package org.devinhouse.superherois.model;

import java.util.Objects;

public abstract class Personagem {
    private String nome;
    private String superpoder;

    public Personagem () { };

    public Personagem(String nome, String superpoder) {
        this.nome = nome;
        this.superpoder = superpoder;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personagem that)) return false;
        return getNome().equals(that.getNome()) && getSuperpoder().equals(that.getSuperpoder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSuperpoder());
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", superpoder='" + superpoder + '\'' +
                '}';
    }
}