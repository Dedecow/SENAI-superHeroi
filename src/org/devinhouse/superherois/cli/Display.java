package org.devinhouse.superherois.cli;

import org.devinhouse.superherois.model.Heroi;
import org.devinhouse.superherois.model.Vilao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.devinhouse.superherois.cli.CriarHeroi.criarHeroi;
import static org.devinhouse.superherois.cli.CriarVilao.criarVilao;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Heroi> herois = new ArrayList<>();
        List<Vilao> viloes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Herói");
            System.out.println("2 - Cadastrar Vilão");
            System.out.println("3 - Listar");
            System.out.println("4 - Sair");

            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 1:
                    criarHeroi(scanner, herois);
                    break;
                case 2:
                    criarVilao(scanner, viloes);
                    break;
            }
        }while (opcao!= 4);
        System.out.println(herois);
        System.out.println(viloes);
    }
}
