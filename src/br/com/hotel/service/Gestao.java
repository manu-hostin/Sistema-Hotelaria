package br.com.hotel.service;

import br.com.hotel.model.*;
import br.com.hotel.service.*;
import br.com.hotel.view.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Gestao {

	Scanner leia = new Scanner(System.in);

	List<Pessoa> lista;

	public Gestao() {
		lista = new ArrayList<>();
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public void gerenciar(Atendente atendente, int opcao) {

		switch (opcao) {

		case 0:
			System.out.println("Saindo...");
			System.out.println("Obrigada por usar nosso sistema, até a próxima! ;)");
			break;

		case 1:
			String nomeH = atendente.cadastrarHospede();
			String cpfH = atendente.cadastrarCPF();
			int quarto = atendente.cadastrarQuarto();

			Pessoa hospede = new Hospede(nomeH, cpfH, quarto);
			lista.add(hospede);

			System.out.println("\nHóspede adicionado com sucesso!\n");
			break;

		case 2:
			String nomeF = atendente.cadastrarFunc();
			String cpfF = atendente.cadastrarCPF();
			String funcao = atendente.cadastrarFuncao();

			Pessoa func = new Funcionario(nomeF, cpfF, funcao);
			lista.add(func);

			System.out.println("\nFuncionário adicionado com sucesso!\n");
			break;

		case 3:

			for (int i = 0; i < lista.size(); i++) {
				Pessoa pessoa = lista.get(i);
				System.out.println("\n---------------------------");
				System.out.println("         Número " + i);

				if (pessoa instanceof Hospede hosp) {
					atendente.impHospede(hosp);
					System.out.println();

				} else if (pessoa instanceof Funcionario funci) {
					atendente.impFunc(funci);
					System.out.println();
				}
			}
			break;

		case 4:
			int indice = atendente.excluirHosp();

			if (indice < lista.size() && indice >= 0 && lista.get(indice) instanceof Hospede) {
				lista.remove(indice);
				System.out.println("Hóspede removido com sucesso! :)\n");

			} else {
				System.out.println("Hóspede não encontrado. :(\n");
			}
			break;

		case 5:
			int i = atendente.excluirFunc();

			if (i < lista.size() && i >= 0 && lista.get(i) instanceof Funcionario) {
				lista.remove(i);
				System.out.println("Funcionário removido com sucesso! :)\n");
			} else {
				System.out.println("Funcionário não encontrado. :(\n");
			}
		}
	}

}
