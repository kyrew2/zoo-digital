package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Predador;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Voador;

public class Aguia extends Ave implements Voador, Predador{

    public Aguia(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um peixe que caçou");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " saiu voando depois de pegar um peixe");
    }

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando peixes no rio");
	}
    
}