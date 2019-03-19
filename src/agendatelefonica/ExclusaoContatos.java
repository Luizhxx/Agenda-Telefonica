package agendatelefonica;

import java.util.List;
import java.util.Scanner;

import contato.Contato;
import validation.Validation;

public class ExclusaoContatos {

	private static Scanner input = new Scanner(System.in);

	public static void excluirContato(List<Contato> agenda) {
		String controleExclusao = "1";
		do {
			try {
				System.out.println("\t*----- Exclusão de contatos ------*");
				System.out.println("\t| 1 - Listar todos os contatos    |");
				System.out.println("\t| 2 - Excluir contato pelo ID     |");
				System.out.println("\t| 3 - para voltar ao menu         |");
				System.out.println("\t*---------------------------------*");
				controleExclusao = input.next();

				switch (controleExclusao) {
				case "1":
					ConsultaContato.listarTodosContatos(agenda);
					excluirContato(agenda);
				case "2":
					System.out.println("Digite o Id do contato que deseja excluir: ");
					int idContato = input.nextInt();
					Validation.isAValidInputForExclusionMenu(idContato, agenda);

					System.out.println("Voçe deseja excluir o seguinte contato");
					System.out.println(agenda.get(idContato));
					System.out.println("Sim(1) ou Não(2)");
					int confirmacaoExclusao = input.nextInt();
					Validation.confirmacaoExclusao(confirmacaoExclusao);
					if (confirmacaoExclusao == 1) {
						agenda.remove(idContato);
						System.out.println("Contato excluido!");
					}
				case "3":
					controleExclusao = "0";
					break;
				}
			} catch (IndexOutOfBoundsException | NumberFormatException e) {
				e.getMessage();
				System.err.println("Invalid Input");
				continue;
			}
		} while (controleExclusao == "0");
	}
}
