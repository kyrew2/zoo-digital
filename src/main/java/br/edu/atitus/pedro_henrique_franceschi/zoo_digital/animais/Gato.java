package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Predador;

public class Gato extends Mamifero implements Corredor, Predador {

    private String raca;

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, true);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está miando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma ave que caçou");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo para fugir da água");
    }
    
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando furtivamente");
	}


    public String getRaca() {
        return raca;
    }
}