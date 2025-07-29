package br.com.hotel.view;

import java.util.Scanner;
import br.com.hotel.model.*;

public class Atendente {

	Scanner leia = new Scanner(System.in);

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public int menu() {
		System.out.println("=== 🏨 MENU PRINCIPAL 🏨 ===");
		System.out.println("  ---  HOTEL PARAÍSO  --- ");
		System.out.println(" 1. Cadastrar hóspede;");
		System.out.println(" 2. Cadastrar funcionário;");
		System.out.println(" 3. Listar;");
		System.out.println(" 4. Excluir hóspede;");
		System.out.println(" 5. Excluir funcionário;");
		System.out.println("---------------------------");
		System.out.println(" 0. Sair.");
		System.out.println("============================");
		System.out.print(" > ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}

	public String cadastrarHospede() {
		System.out.println("\n==== CADASTRAR HÓSPEDE ===");
		System.out.println("Digite o nome do hóspede: ");
		System.out.print(" > ");
		String nomeH = leia.nextLine();
		
		return nomeH;
	}

	public String cadastrarCPF() {
		System.out.println("\nDigite o CPF:");
		System.out.print(" > ");
		String cpf = leia.nextLine();
		return cpf;
	}

	public int cadastrarQuarto() {
		System.out.println("\nDigite o número do quarto: ");
		System.out.print(" > ");
		int quarto = leia.nextInt();
		leia.nextLine();
		return quarto;
	}

	public String cadastrarFunc() {
		System.out.println("\n=== CADASTRAR FUNCIONÁRIO ===");
		System.out.println("Digite o nome do funcionário:");
		System.out.print(" > ");
		String nomeF = leia.nextLine();
		return nomeF;
	}

	public String cadastrarFuncao() {
		System.out.println("\nDigite a função do funcionário:");
		System.out.print(" > ");
		String funcao = leia.nextLine();
		return funcao;
	}

	public void impHospede(Hospede hosp) {
		System.out.println("\n         HÓSPEDE");
		System.out.println(hosp);
	}

	public void impFunc(Funcionario func) {
		System.out.println("\n       FUNCIONÁRIO");
		System.out.println(func);
	}

	public int excluirHosp() {
		System.out.println("\n=== EXCLUIR HÓSPEDE ===");
		System.out.println("Digite o índice do hóspede que deseja excluir: ");
		System.out.print(" > ");
		int indice = leia.nextInt();
		return indice;
	}

	public int excluirFunc() {
		System.out.println("\n=== EXCLUIR FUNCIONÁRIO ===");
		System.out.println("Digite o índice do funcionário que deseja excluir: ");
		System.out.print(" > ");
		int indice = leia.nextInt();
		return indice;
	}
}
