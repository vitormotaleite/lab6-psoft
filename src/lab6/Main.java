package lab6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Governo governo = new Governo(60);
		governo.addComobirdade("diabetes");
		governo.addComobirdade("obesidade");
		governo.addComobirdade("cancer");
		governo.addProfissao("medico");
		governo.addProfissao("politico");
		governo.addProfissao("terapeuta");
		
		Pessoa pessoa = new Pessoa();
		int escolha = 0;
		
		
		while(escolha != 9) {
			
			System.out.println(Util.imprimeCabecalho());
			escolha = sc.nextInt();
			
			if(escolha == 1) {
				System.out.println("NOME COMPLETO: ");
				sc.next();
				String nome = sc.nextLine();
				System.out.println("CPF: ");
				String cpf = sc.next();
				System.out.println("ENDERECO: ");
				sc.next();
				String endereco = sc.nextLine();
				System.out.println("CARTAO SUS: ");
				String sus = sc.next();
				System.out.println("TELEFONE: ");
				String telefone = sc.next();
				System.out.println("EMAIL: ");
				String email =sc.next();
				System.out.println("PROFISSAO: ");
				String profissao = sc.next();
				System.out.println("IDADE: ");
				int idade = sc.nextInt();
				pessoa = new Pessoa(nome, cpf, endereco, sus, telefone, email, profissao, idade);
				pessoa.setEstadoVacinacao(new NaoHabilitado(pessoa, governo));
				System.out.println("cadastro concluido!");
			}
			else if(escolha == 2) {
				System.out.println(pessoa.getEstadoVacinacao().habilitarPrimeiraDose());
			}
			else if(escolha == 3) {
				System.out.println(pessoa.getEstadoVacinacao().primeiraDose());
			}
			else if(escolha == 4) {
				System.out.println("digite ha quantos dias voce tomou a primeira dose :");
				int dias = sc.nextInt();
				pessoa.setDiasPrimeiraDose(dias);
			}
			else if(escolha == 5) {
				System.out.println(pessoa.getEstadoVacinacao().habilitarSegundaDose());
			}
			else if(escolha == 6) {
				System.out.println(pessoa.getEstadoVacinacao().segundaDose());
			}
			else if(escolha == 7) {
				System.out.println("digite uma comobirdade: ");
				String comobirdade = sc.next();
				pessoa.addComobirdade(comobirdade);
			}
			else if(escolha == 8) {
				System.out.println("NOME COMPLETO: ");
				sc.next();
				String nome = sc.nextLine();
				System.out.println("CPF: ");
				String cpf = sc.next();
				System.out.println("ENDERECO: ");
				sc.next();
				String endereco = sc.nextLine();
				System.out.println("CARTAO SUS: ");
				String sus = sc.next();
				System.out.println("TELEFONE: ");
				String telefone = sc.next();
				System.out.println("EMAIL: ");
				String email =sc.next();
				System.out.println("PROFISSAO: ");
				String profissao = sc.next();
				System.out.println("IDADE: ");
				int idade = sc.nextInt();
				pessoa.setNome(nome);
				pessoa.setCpf(cpf);
				pessoa.setEndereco(endereco);
				pessoa.setCartaoSus(sus);
				pessoa.setTelefone(telefone);
				pessoa.setEmail(email);
				pessoa.setProfissao(profissao);
				pessoa.setIdade(idade);
			}
			else if (escolha > 9){
				System.out.println("opcao invalida");
			}
		}
		sc.close();

	}

}
