package org.devinhouse.superherois.model;

public class TesteBatalha {
    public static void main(String[] args) {
        try {
            Heroi heroi = new Heroi("Superman","Superforça", "Clark");
            Vilao vilao = new Vilao(" General zoid", "Visão de calor", 30);
            System.out.println("Apresentando: ");
            heroi.apresentarHeroi();
            vilao.apresentarVilao();
        } catch (ValorAtributosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
