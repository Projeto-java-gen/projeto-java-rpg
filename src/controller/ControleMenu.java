package controller;


import entities.Arcano;
import entities.Cacador;
import entities.Guerreiro;
import entities.Heroi;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static views.MenuView.*;

public class ControleMenu {
	 
	 Heroi heroi;


    public static void controleInicial() {

        Scanner sc = new Scanner(System.in);
        int op = 0;
        

        introLore();

        while (op == 0) {
            inicialMenu();
            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Errou !! (Fausto silva). Vamos começar mesmo assim!");
                op = 1;
            }

            switch (op) {
                case 1 -> iniciarJogo();
                case 2 -> iniciarJogo();
                case 3 -> iniciarJogo();
                default -> {
                    System.out.println("Opção inválida! Vamos novamente...");
                    sc.nextLine();
                    op = 0;
                }
            }

        }
    }

    // Metodo para iniciar jogo.
    public static void iniciarJogo() {
        loreInicial();
        condicaoDeClasse();
    }

    public static void condicaoDeClasse() {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        

        while (op == 0) {
            escolhaDeClasse();

            try {
                op = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nEscolha uma classe! Vamos tentar de novo...");
                sc.nextLine();
                op = 0;
            }

            switch (op) {
                case 1 -> escolhaDoNomeERaca(sc, op);
                case 2 -> escolhaDoNomeERaca(sc, op);
                case 3 -> escolhaDoNomeERaca(sc, op);
                default -> {
                    System.out.println("Opção inválida! Vamos novamente...");
                    op = 0;
                }
            }
        }
    }

    public static int rolarDados() {
        return new Random().nextInt(1, 20);
    }

    public static Heroi escolhaDoNomeERaca(Scanner sc, int op) {

        String nome, raca, tipoClasse = (op == 1) ? "Guerreiro" : (op == 2) ? "Arcano" : "Caçador", genero;
        float altura;
        int esc;

        System.out.println("\nClasse selecionada: " + tipoClasse);
        int conf = 0;

        switch (op) {
            case 1 -> {
                loreGuerreiro();
                while (conf == 0) {
                    System.out.println("""
                            Deseja confirmar?
                            1 - Sim.
                            2 - Escolher outra classe.
                            """);
                    try {
                        conf = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("\nConfirme ou escolha outra classe para continuar...");
                        sc.nextLine();
                        conf = 0;
                    }
                    if (conf>2 || conf<0){
                        System.out.println("Opção inválida, vamos de novo!");
                        conf = 0;
                    }
                }
                if (conf == 2) {
                    condicaoDeClasse();
                }
            }
            case 2 -> {
                loreArcanista();
                while (conf == 0) {
                    System.out.println("""
                            Deseja confirmar?
                            1 - Sim.
                            2 - Escolher outra classe.
                            """);
                    try {
                        conf = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("\nConfirme ou escolha outra classe para continuar...");
                        sc.nextLine();
                        conf = 0;
                    }
                    if (conf>2 || conf<0){
                        System.out.println("Opção inválida, vamos de novo!");
                        conf = 0;
                    }
                }
                if (conf == 2) {
                    condicaoDeClasse();
                }
            }
            case 3 -> {
                loreCacador();
                while (conf == 0) {
                    System.out.println("""
                            Deseja confirmar?
                            1 - Sim.
                            2 - Escolher outra classe.
                            """);
                    try {
                        conf = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("\nConfirme ou escolha outra classe para continuar...");
                        sc.nextLine();
                        conf = 0;
                    }
                    if (conf>2 || conf<0){
                        System.out.println("Opção inválida, vamos de novo!");
                        conf = 0;
                    }
                }
                if (conf == 2) {
                    condicaoDeClasse();
                }
            }
        }

        System.out.print("Escolha seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua altura: ");
        altura = sc.nextFloat();
        escolhaDeRaca();

        esc = sc.nextInt();
        sc.nextLine();

        raca = (esc == 1) ? "Humano" : (esc == 2) ? "Orc" : "Elfo";

        escolhaDeGenero();

        esc = sc.nextInt();
        sc.nextLine();

        genero = (esc == 1) ? "Masculino" : "Feminino";

         return (op == 1) ? new Guerreiro(nome, 2000, altura, genero, raca) :
                (op == 2) ? new Arcano(nome, 1000, altura, genero, raca) :
                        new Cacador(nome, 1500, altura, genero, raca);
        
        
        
    }

    public static void continuacao (Heroi heroi) {
    	inicioJornada();
    	int op;
    	Scanner sc = new Scanner(System.in);
    	
    }
    
}
