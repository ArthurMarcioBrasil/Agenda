package Agenda;

import java.util.Scanner;
import java.util.ArrayList;


public class Agenda {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		Pessoa p = new Pessoa();
		String opcao = "";
		String continuar = "";
		String continuar1 = "";
		String excluir = "";
		
		do {
			System.out.println("Escolha a opção:\n Incluir ----------- Listar ----------- Excluir ----------- Sair");
			opcao = s.nextLine();
			
			switch (opcao) {
			
				case "Incluir":
				do {
					System.out.print("Digite o nome: ");
					p.nome = s.next();
					System.out.print("Digite o email: ");
					p.email = s.next();
					System.out.print("Digite o telefone: ");
					p.tel = s.next();
					System.out.print("Digite o endereco: ");
					p.endereco = s.next();
					System.out.print("Digite o aniversario: ");
					p.aniversario = s.next();
					System.out.print("Digite as redes sociais: ");
					p.url = s.next();
					listaPessoa.add(p);
					System.out.print("Deseja continuar? ");
					continuar = s.next();
				} while (continuar.equals("Sim"));

				break;
			

				case "Listar":
					for(int i = 0; i < listaPessoa.size(); i++) {
						System.out.println("Nome: " + p.nome + "\nEmail: " 
							+ p.email+ "\nTelefone: " 
							+ p.email
							+ "\nEndereco: " + p.endereco
							+ "\nAniversario: " + p.aniversario 
							+ "\nRedes sociais: " + p.url);
						}
					
					break;
				
					
				case "Excluir":
					System.out.println("Quem você deseja excluir?");
					excluir = s.next();
					System.out.println("Tem certeza? S (Sim) --- N (Não)");
					continuar1 = s.next();
					if(continuar1.equals("N")) {
						return;
					}else if(continuar1.equals("S")) {
						if(excluir.equals(excluir)) {
						listaPessoa.remove(p);
						System.out.println("Contato excluído.");
						} else {
							System.out.println("Contato não encontrado");
							}
						}
					
					break;
				
					
				case "Sair":
					System.out.println("Programa finalizado.");
					return;
				
				
				case "a":
					System.out.println(p.nome);
					System.out.println(p.email);
					break;


				default:
					System.out.println("Opcao invalida. Tente novamente");
					break;
						
					}

					
			}while (!opcao.equals("Sair"));
	}
}

	
