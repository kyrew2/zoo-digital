package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Animal;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Cachorro;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Calopsita;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Cobra;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Crocodilo;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Gato;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Golfinho;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Lagarto;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Pato;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.PeixeMorcego;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Pinguim;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Piranha;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Tartaruga;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Traira;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Tubarao;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais.Urso;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Predador;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Voador;

public class ZooDigitalApp {
    static Scanner sc = new Scanner(System.in);
    List<Animal> animais = new ArrayList<>();

    public void cadastrarAnimal() {
        System.out.println("Que tipo de animal deseja cadastrar? [1 - Mamifero, 2 - Ave, 3 - Peixe, 4 - Reptil]");
        int tipo = sc.nextInt();
        sc.nextLine();
        Animal novoAnimal = null;
        String nome, especie;
        int idade;
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        especie = "";
        if (tipo == 1) {
            System.out.println("Qual mamifero deseja cadastrar? [1 - Cachorro, 2 - Gato, 3 - Urso]");
            int animal = sc.nextInt();
            sc.nextLine();
            especie = (animal == 1) ? "Cachorro" : (animal == 2) ? "Gato" : (animal == 3) ? "Urso" : "";
            switch (animal) {
                case 1: novoAnimal = new Cachorro(nome, idade, "SRD"); break;
                case 2: novoAnimal = new Gato(nome, idade, "SRD"); break;
                case 3: novoAnimal = new Urso(nome, idade, "Pardo"); break;
            }
        } else if (tipo == 2) {
            System.out.println("Qual ave deseja cadastrar? [1 - Calopsita, 2 - Pato, 3 - Pinguim]");
            int animal = sc.nextInt();
            sc.nextLine();
            especie = (animal == 1) ? "Calopsita" : (animal == 2) ? "Pato" : (animal == 3) ? "Pinguim" : "";
            switch (animal) {
                case 1: novoAnimal = new Calopsita(nome, idade, "Amarela"); break;
                case 2: novoAnimal = new Pato(nome, idade, "Branca"); break;
                case 3: novoAnimal = new Pinguim(nome, idade, "Preta"); break;
            }
        } else if (tipo == 3) {
            System.out.println("Qual peixe deseja cadastrar? [1 - Golfinho, 2 - Peixe Morcego, 3 - Piranha, 4 - Traira, 5 - Tubarao]");
            int animal = sc.nextInt();
            sc.nextLine();
            especie = (animal == 1) ? "Golfinho" : (animal == 2) ? "Peixe Morcego" : (animal == 3) ? "Piranha" : (animal == 4) ? "Traira" : (animal == 5) ? "Tubarao" : "";
            switch (animal) {
                case 1: novoAnimal = new Golfinho(nome, idade); break;
                case 2: novoAnimal = new PeixeMorcego(nome, idade); break;
                case 3: novoAnimal = new Piranha(nome, idade); break;
                case 4: novoAnimal = new Traira(nome, idade); break;
                case 5: novoAnimal = new Tubarao(nome, idade); break;
            }
        } else if (tipo == 4) {
            System.out.println("Qual reptil deseja cadastrar? [1 - Cobra, 2 - Crocodilo, 3 - Lagarto, 4 - Tartaruga]");
            int animal = sc.nextInt();
            sc.nextLine();
            especie = (animal == 1) ? "Cobra" : (animal == 2) ? "Crocodilo" : (animal == 3) ? "Lagarto" : (animal == 4) ? "Tartaruga" : "";
            switch (animal) {
                case 1: novoAnimal = new Cobra(nome, idade, "Verde"); break;
                case 2: novoAnimal = new Crocodilo(nome, idade, "Verde"); break;
                case 3: novoAnimal = new Lagarto(nome, idade, "Verde"); break;
                case 4: novoAnimal = new Tartaruga(nome, idade, "Verde"); break;
            }
        }
        if (novoAnimal != null) {
            novoAnimal.setEspecie(especie);
            animais.add(novoAnimal);
            System.out.println("Animal cadastrado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public void listarTodosAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            System.out.println("Animais cadastrados:");
            for (Animal a : animais) {
                System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade() + ", Espécie: " + a.getEspecie());
                a.emitirSom();
                a.comer();
                System.out.println();
            }
        }
    }

    public void listarCorredores() {
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Corredor) {
                encontrou = true;
                System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade() + ", Espécie: " + a.getEspecie());
                ((Corredor)a).correr();
                System.out.println();
            }
        }
        if (!encontrou) System.out.println("Nenhum animal corredor cadastrado.");
    }

    public void listarNadadores() {
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Nadador) {
                encontrou = true;
                System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade() + ", Espécie: " + a.getEspecie());
                ((Nadador)a).nadar();
                System.out.println();
            }
        }
        if (!encontrou) System.out.println("Nenhum animal nadador cadastrado.");
    }

    public void listarVoadores() {
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Voador) {
                encontrou = true;
                System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade() + ", Espécie: " + a.getEspecie());
                ((Voador)a).voar();
                System.out.println();
            }
        }
        if (!encontrou) System.out.println("Nenhum animal voador cadastrado.");
    }

    public void listarPredadores() {
        boolean encontrou = false;
        for (Animal a : animais) {
            if (a instanceof Predador) {
                encontrou = true;
                System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade() + ", Espécie: " + a.getEspecie());
                ((Predador)a).cacar();
                System.out.println();
            }
        }
        if (!encontrou) System.out.println("Nenhum animal predador cadastrado.");
    }

    public void exibirTotalAnimais() {
        System.out.println("Total de animais cadastrados: " + Animal.getContador());
    }

    public static void main(String[] args) {
        ZooDigitalApp app = new ZooDigitalApp();
        int opcao = 0;
        do {
            System.out.println("\n===== MENU ZOO DIGITAL =====");
            System.out.println("1 - Cadastrar animal");
            System.out.println("2 - Listar todos os animais");
            System.out.println("3 - Listar animais corredores");
            System.out.println("4 - Listar animais nadadores");
            System.out.println("5 - Listar animais voadores");
            System.out.println("6 - Listar animais predadores");
            System.out.println("7 - Exibir total de animais");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("Digite um número válido: ");
            }
            opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                    app.cadastrarAnimal();
                    break;
                case 2:
                    app.listarTodosAnimais();
                    break;
                case 3:
                    app.listarCorredores();
                    break;
                case 4:
                    app.listarNadadores();
                    break;
                case 5:
                    app.listarVoadores();
                    break;
                case 6:
                    app.listarPredadores();
                    break;
                case 7:
                    app.exibirTotalAnimais();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 8);
    }
}