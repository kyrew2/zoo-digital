package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Predador;

public class Crocodilo extends Reptil implements Predador, Nadador, Corredor {
	
	public Crocodilo(String nome, int idade, String cor) {
		super(nome, idade, cor);
	}
	
	@Override
	public void correr() {
		System.out.println(getNome() + "está correndo de volta para o lago");

	}

	@Override
	public void nadar() {
		System.out.println(getNome() + "esta nadando sorrateiramente");
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + "esta cacando uma capivara sorrateiramente");

	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + "esta rugindo");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + "esta se alimentando de sua caça");

	}

}