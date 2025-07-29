package br.com.hotel;

import br.com.hotel.service.Gestao;
import br.com.hotel.view.Atendente;

public class Main {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		int opcao = 0;
		Gestao gestao = new Gestao();

		do {

			opcao = atendente.menu();
			gestao.gerenciar(atendente, opcao);

		} while (opcao != 0);
	}

}
