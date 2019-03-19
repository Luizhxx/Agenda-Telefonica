package agendatelefonica;

import java.util.List;
import java.util.Scanner;

import contato.Contato;
import validation.Validation;

public class ConsultaContato {

	private static Scanner input = new Scanner(System.in);

	public static void consultaContato(List<Contato> agenda) {
		String backMenu = "0";
		do {
			try {
				System.out.println("\t*---- Consulta de Contatos ----*");
				System.out.println("\t| 1 - Listar todos os contatos |");
				System.out.println("\t| 2 - Listar contato pelo ID   |");
				System.out.println("\t| 3 - Voltar para o menu       |");
				System.out.println("\t*------------------------------*");

				String consulta = input.next();
				Validation.isAValidInputForConsult(consulta);
				switch (consulta) {
				case "1":
					listarTodosContatos(agenda);
					break;

				case "2":
					System.out.println("Digite o ID do contato ");
					int id = input.nextInt();
					System.out.println(agenda.get(id));
					break;

				case "3":
					backMenu = "1";
				}
			} catch (NumberFormatException | IndexOutOfBoundsException e) {
				System.err.println("Invalid input");
				e.getMessage();
				continue;
			}
		} while (backMenu != "1");
	}

	public static void listarTodosContatos(List<Contato> agenda) {
		for (Contato contato : agenda) {
			System.out.println(contato);
		}
	}
}
