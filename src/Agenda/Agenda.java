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
					listaPessoa.add(pessoa);
					i++;
					System.out.println("Deseja continuar?");
					continuar = s.nextLine();
					
			} while (continuar.equals("Sim"));
				
				return;
			
			} else if(opcao.equals("Listar")) {
				
				for(Pessoa pessoas:listaPessoa) {
						System.out.println("Nome: " + pessoa.nome + "\nEmail: " + pessoa.email+ "\nTelefone:" 
											+ pessoa.email
											+ "\nEndereco: " + pessoa.endereco
											+ "\nAniversario :" + pessoa.aniversario 
											+ "\nRedes sociais: " + pessoa.url);
				}
				
				return;
			
				
			} else if(opcao.equals("Excluir")) {
					
					System.out.println("Quem você deseja excluir?");
					excluir = s.next();
					System.out.println("Tem certeza? S (Sim) --- N (Não)");
					continuar1 = s.next();
					if(continuar1.equals("N")) {
						return;
					}else if(continuar1.equals("S")) {
						if(excluir.equals(pessoa.nome)) {
						listaPessoa.remove(excluir);
						System.out.println("Contato excluído.");
						} else {
							System.out.println("Contato não encontrado");
						}
						return;
					}
					
			else if(opcao.equals("Sair")) {
				System.out.println("Programa finalizado.");
				break;
			
			}else {
				System.out.println("Opcao invalida. Tente novamente");
				return;
					
				}
			
			}	}while (!opcao.equals("Sair"));
	}
}
	
