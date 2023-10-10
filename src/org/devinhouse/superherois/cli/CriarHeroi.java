package org.devinhouse.superherois.cli;

import org.devinhouse.superherois.exception.OpcaoInvalidaException;
import org.devinhouse.superherois.model.Heroi;

import java.util.List;
import java.util.Scanner;

public class CriarHeroi {
    public static void criarHeroi(Scanner scanner, List<Heroi> herois) {

        int opcao;
        do {
            System.out.print("Nome do herói: ");
            String nome = scanner.nextLine();

            System.out.print("Poder do herói: ");
            String poder = scanner.nextLine();

            System.out.print("Nome secreto do herói: ");
            String nomeSecreto = scanner.nextLine();

            try {
                Heroi heroi = new Heroi(nome, poder, nomeSecreto);
                herois.add(heroi);
            }catch (OpcaoInvalidaException e){
                System.err.println(" Erro no cadastro de herói " + e.getMessage());
            }



            System.out.println("Cadastrar novo heroi?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            opcao = Integer.parseInt(scanner.nextLine());
        } while (opcao != 2);

    }
}
