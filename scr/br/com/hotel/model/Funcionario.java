package br.com.hotel.model;

public class Funcionario extends Pessoa {

	protected String funcao;

	public Funcionario(String nome, String cpf, String funcao) {
		super(nome, cpf);
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " | CPF: " + cpf + "\nFunção: " + funcao;
	}
}
