package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Predador;

public class Tubarao extends Peixe implements Nadador, Predador{

    public Tubarao(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um cardume de peixes");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no mar");
    }
    
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um peixe-bolha no mar");
	}
}