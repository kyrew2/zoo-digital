package br.edu.atitus.pedro_henrique_franceschi.zoo_digital.animais;

public abstract class Reptil extends Animal {
	private String cor;
	public Reptil(String nome, int idade, String cor) {
		super(nome, "Reptil", idade);
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void camuflar() {
		System.out.println(this.getNome() + "esta se camuflando no ambiente");
	}
}