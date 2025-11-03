package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Predador;

public class Cobra extends Reptil implements Predador, Corredor {
	
	public Cobra(String nome, int idade, String cor) {
		super(nome, idade, cor);
	}
	
	@Override
	public void correr() {
		System.out.println(getNome() + "está correndo de volta para a mata");

	}

	@Override
	public void cacar() {
		System.out.println(getNome() + "esta cacando uma raposa sorrateiramente");

	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + "esta fazendo 'Sssss..'");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + "esta se alimentando de sua caça");

	}
}