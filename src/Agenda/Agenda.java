package Agenda;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Agenda {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		String opcao = "";
		String continuar = "";
		String continuar1 = "";
		String continuar2 = "";
		int i = 0;
		String excluir = "";
		
		do {
			System.out.println("Escolha a opção:\n Incluir ----------- Listar ----------- Excluir ----------- Sair");
			opcao = s.nextLine();
			
			if(opcao.equals("Incluir")) {
				do {
					
					System.out.println("Digite o nome");
					pessoa.nome = s.next();
					System.out.println("Digite o email");
					pessoa.email = s.next();
					System.out.println("Digite o telefone");
					pessoa.tel = s.next();
					System.out.println("Digite o endereco");
					pessoa.endereco = s.next();
					System.out.println("Digite o aniversario");
					pessoa.aniversario = s.next();
					System.out.println("Digite as redes sociais");
					pessoa.url = s.next();
					System.out.println("Deseja continuar?");
					continuar = s.nextLine();
					listaPessoa.add(pessoa);
					
					i++;
					
			} while (continuar.equals("Sim"));
			
			} else if(opcao.equals("Listar")) {
				
				for(Pessoa pessoas:listaPessoa) {
						System.out.println("Nome: " + pessoa.nome + "\nEmail: " + pessoa.email+ "\nTelefone:" + pessoa.email
											+ "\nEndereco: " + pessoa.endereco
													+ "\nAniversario :" + pessoa.aniversario + "\nRedes sociais: " + pessoa.url);
				}
			}

			else if(opcao.equals("Excluir")) {
				
				do {
					
					System.out.println("Quem você deseja excluir?");
					excluir = s.next();
					System.out.println("Tem certeza?");
				} while (continuar1.equals("Não"));
					if(excluir.equals(pessoa.nome)) {
						listaPessoa.remove(excluir);
						System.out.println("Contato excluído.");
					}
			else if(opcao.equals("Sair")) {
				System.out.println("Programa finalizado.");
				return;
			
			}else {
				System.out.println("Opcao invalida. Tente novamente");
				break;
					
				}
			
			}	}while (!opcao.equals("Sair"));
	}
}
	
