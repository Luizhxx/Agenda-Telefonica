package agendatelefonica;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import contato.Contato;
import telefone.Telefone;
import validation.Validation;

public class CadastroContatos {
	private static Scanner input = new Scanner(System.in);

	public static void cadastrarNovoContato(List<Contato> agenda) {
		int controleCadastroContato = 0;
		do {
			List<Telefone> novoTelefone = new ArrayList<Telefone>();
			System.out.println("\tDigite o nome do contato");
			String nome = input.next();
			
			int controleCadastroTelefones = 0;
				do {
					try {
						System.out.println("\tDigite o tipo do telefone: Fixo ou Celular ");
						String tipoTelefone = input.next();
						Validation.isAValidTelephoneType(tipoTelefone);
						
						System.out.println("\tDigite o ddd do numero ");
						short ddd = input.nextShort();
						Validation.isAValidDDD(ddd);
						
						System.out.println("\tDigite o numero do telefone");
						String numeroTelefone = input.next();
						Validation.isAValidTelefoneNumber(numeroTelefone);
						
						Telefone telefone = new Telefone(ddd, tipoTelefone, numeroTelefone);
						novoTelefone.add(telefone);
						
						System.out.println("Dejesa adicionar outro numero?\n1 - para sim\n2 - para não ");
						if (input.nextInt() == 2) {
							break;
						}		
					} catch (IllegalArgumentException | InputMismatchException e) {
						System.err.println(e.getMessage() + "\n");
						continue;
					}
				}while (controleCadastroTelefones ==0);
			
			agenda.add(new Contato(agenda.size(), nome, novoTelefone));
			System.out.println("Deseja adicionar outro contato?\n1 - para sim\n2 - para não ");
			if (input.nextInt() == 2) {
				break;
			}
			
		} while (controleCadastroContato == 0);
	}
}

