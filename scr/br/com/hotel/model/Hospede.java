package br.com.hotel.model;

public class Hospede extends Pessoa {

	protected int quarto;

	public Hospede(String nome, String cpf, int quarto) {
		super(nome, cpf);
		this.quarto = quarto;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " |CPF: " + cpf + "\nNúmero do quarto: " + quarto;
	}
}
