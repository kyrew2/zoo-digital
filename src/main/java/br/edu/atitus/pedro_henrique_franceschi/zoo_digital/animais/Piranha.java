package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Predador;

public class Piranha extends Peixe implements Nadador, Predador{

    public Piranha(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo jundiás");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no lago");
    }
    
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando em cardume no lago");
	}
}