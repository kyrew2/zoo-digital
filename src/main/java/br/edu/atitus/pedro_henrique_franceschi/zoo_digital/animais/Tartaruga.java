package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Nadador;

public class Tartaruga extends Reptil implements Corredor, Nadador {
	
	public Tartaruga(String nome, int idade, String cor) {
		super(nome, idade, cor);
	}
	
	@Override
	public void correr() {
		System.out.println(getNome() + "está correndo de volta para o oceano");

	}
	@Override
	public void emitirSom() {
		System.out.println(getNome() + "esta fazendo gemendo");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + "esta se alimentando de algas no oceano");

	}
	@Override
	public void nadar() {
		System.out.println(getNome() + "esta nadando com seus filhotes");
		
	}
}