package org.devinhouse.superherois.cli;

import org.devinhouse.superherois.model.Heroi;
import org.devinhouse.superherois.model.Vilao;

import java.util.List;
import java.util.Scanner;

public class CriarVilao {
    public static void criarVilao(Scanner scanner, List<Vilao> viloes) {

        int opcao;
        do {
            System.out.print("Nome do vilão: ");
            String nome = scanner.nextLine();

            System.out.print("Poder do vilão: ");
            String poder = scanner.nextLine();

            System.out.print("Tempo de prisão: ");
            int tempoDePrisao = Integer.parseInt(scanner.nextLine());

            Vilao vilao = new Vilao(nome, poder, tempoDePrisao);
            System.out.println(" Cadastrar novo vilão? ");
            System.out.println(" 1. Sim ");
            System.out.println(" 2. Não ");
            opcao = Integer.parseInt(scanner.nextLine());
            System.out.println(opcao);
        } while (opcao != 2);
    }

}
