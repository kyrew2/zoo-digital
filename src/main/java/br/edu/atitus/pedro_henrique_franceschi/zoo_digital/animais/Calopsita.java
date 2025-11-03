package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Predador;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Voador;

public class Calopsita extends Ave implements Voador, Predador{

    public Calopsita(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está piando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma minhoca que pegou na terra");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " saiu voando depois de pegar uma minhoca");
    }

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando minhocas na terra");
	}
    
}