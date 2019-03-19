package agendatelefonica;

import java.util.List;
import java.util.Scanner;

import contato.Contato;
import validation.Validation;

public class Menu {
	private static Scanner input = new Scanner(System.in);

	public static void menu(List<Contato> agenda) {
		String controleIteracao = "0";
		do {
			try {

				System.out.flush();

				System.out.println("\t*------ Agenda Telefonica ------*");
				System.out.println("\t| 1 - Cadastrar um novo contato |");
				System.out.println("\t| 2 - Consultar contatos        |");
				System.out.println("\t| 3 - Excluir contato           |");
				System.out.println("\t| 4 - Sair                      |");
				System.out.println("\t*-------------------------------*");

				controleIteracao = input.next();
				
				Validation.isValidInputForMenu(controleIteracao);

				switch (controleIteracao) {
				case "1":
					CadastroContatos.cadastrarNovoContato(agenda);
					break;
				case "2":
					ConsultaContato.consultaContato(agenda);
					break;
				case "3":
					ExclusaoContatos.excluirContato(agenda);
					break;
				case "4":
					System.exit(0);
					break;
				default:
					System.err.println("Invalid option of input");
				}

			} catch (NumberFormatException e) {
				e.getMessage();
				System.err.println("Invalid option of input");
			}

		} while (!controleIteracao.equals("4"));
	}
}
