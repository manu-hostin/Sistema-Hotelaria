# 🏨 Sistema de Gestão - Hotel Paraíso 🏨

---

## 📋 Descrição

Este sistema em Java permite o gerenciamento básico de hóspedes e funcionários do **Hotel Paraíso** por meio de um menu interativo no terminal. 

As funcionalidades incluem:

- Cadastro de hóspedes (nome, CPF e número do quarto)
- Cadastro de funcionários (nome, CPF e função)
- Listagem dos hóspedes e funcionários cadastrados
- Exclusão de hóspedes e funcionários pelo índice da lista
- Encerramento do sistema

---

## 🛠️ Tecnologias Utilizadas

- Java SE 8 ou superior
- Console (terminal) para interação com o usuário

---

## 🗂️ Estrutura do Projeto

| Pacote          | Descrição                                  |
|-----------------|--------------------------------------------|
| `br.com.hotel.model`   | Classes de modelo: Pessoa, Hospede, Funcionario |
| `br.com.hotel.view`    | Interface de interação com o usuário (`Atendente`) |
| `br.com.hotel.service` | Lógica de negócios e controle (`Gestao`)           |
| `br.com.hotel`         | Classe principal para iniciar o programa (`Main`)   |

---

## 🚀 Como Executar

1. Compile todos os arquivos `.java` no projeto.

2. Execute a classe principal:

java br.com.hotel.Main

3. Use o menu exibido no terminal para:

- Inserir hóspedes e funcionários;
- Listar os registros;
- Excluir hóspedes ou funcionários pelo índice;
- Sair do sistema digitando 0.

🎯 Menu de Opções
=== 🏨 MENU PRINCIPAL 🏨 ===
  ---  HOTEL PARAÍSO  --- 
 1. Cadastrar hóspede;
 2. Cadastrar funcionário;
 3. Listar;
 4. Excluir hóspede;
 5. Excluir funcionário;
---------------------------
 0. Sair.
============================


🙋‍♂️ Contato
Qualquer dúvida ou sugestão, entre em contato!
