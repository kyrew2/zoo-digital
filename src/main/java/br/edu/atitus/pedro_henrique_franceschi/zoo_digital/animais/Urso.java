package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.pedro_henrique_franceschi.zoo_digital.comportamentos.Predador;

public class Urso extends Mamifero implements Corredor, Nadador, Predador {

    private String raca;

    public Urso(String nome, int idade, String raca) {
        super(nome, idade, true);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo o cervo que caçou");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo das abelhas");
    }
    
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um cervo na floresta");
	}
	
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando para atravessar o rio");
    }


    public String getRaca() {
        return raca;
    }
}