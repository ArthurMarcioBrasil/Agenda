package Agenda;

import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		String opcao = "";
		String continuar = "";
		int i = 0;
		
		do {
			System.out.println("Escolha a opção:\n Incluir --- Listar --- Excluir --- Sair");
			opcao = s.nextLine();
			
			if(opcao.equals("Incluir")) {
				do {
					
					System.out.println("Digite o nome");
					pessoa.nome = s.next();
					System.out.println("Digite o email");
					pessoa.email = s.next();
					System.out.println("Digite o telefone");
					pessoa.tel = s.nextLong();
					System.out.println("Digite o endere�o");
					pessoa.endereco = s.next();
					System.out.println("Digite o anivers�rio");
					pessoa.aniversario = s.next();
					System.out.println("Digite as redes sociais");
					pessoa.url = s.next();
					System.out.println("Deseja continuar?");
					continuar = s.nextLine();
					listaPessoa.add(pessoa);
					
					i++;
					
			} while (continuar.equals("Sim"));
			
			} else if(op�ao.equals("Listar")) {
				
				for(int j = 0; j < 100; j++) {
					System.out.println("Nome: " + nome[j] + "Email: " + email[j]+ "Telefone:" + tel[j]
										+ "Endere�o: " + endere�o[i]
												+ "Anivers�rio :" + aniversario[j] + "Redes sociais: " + url[j]);
				}
			}

			else if(op�ao.equals("Excluir")) {
				
				for()
			}
			
			else if(op�ao.equals("Sair")) {
				System.out.println("Programa finalizado.");
				return;
			
			}else {
				System.out.println("Op��o inv�lida. Tente novamente");
				break;
					
				}
			
		} while (!op�ao.equals("Sair"));
	}
}