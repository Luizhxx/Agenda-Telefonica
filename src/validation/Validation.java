package validation;

import java.util.List;

import contato.Contato;

public class Validation {

	public static void isValidInputForMenu(String menuInput) {
		int sla = Integer.parseInt(menuInput);
		if (sla > 4 || sla < 1) {
			throw new NumberFormatException("Invalid Input");
		}
	}
	
	public static void isAValidInputForExclusionMenu(int exclusionInput, List<Contato> agenda) {
		if(exclusionInput >= agenda.size() || exclusionInput < 0) {
			throw new IndexOutOfBoundsException("Id does not exist on List os Contacts");
		}
	}
	
	public static void isAValidInputForConsult(String menuConsulta) {
		int sla = Integer.parseInt(menuConsulta);
		if (sla > 4 || sla < 1) {
			throw new NumberFormatException("Invalid Input");
		}
	}
	
	public static void confirmacaoExclusao(int escolha) {
		if (escolha < 1 || escolha > 2) {
			throw new NumberFormatException("Invalid input");
		}
	}
	
	public static void isAValidTelephoneType(String tipoTelefone) {
		if (!(tipoTelefone.equalsIgnoreCase("fixo") || tipoTelefone.equalsIgnoreCase("celular"))) {
			throw new NumberFormatException("Invalid input");
		}
	}
	
	public static void isAValidDDD(int ddd) {
		if (ddd <= 0) {
			throw new IllegalArgumentException("The ddd can't not be a negative number");
		}
	}
	
	public static void isAValidTelefoneNumber(String telefone) {
		if ((Long.parseLong(telefone)) <= 1000000 || (Long.parseLong(telefone)) > 99999999999L) {
			throw new IllegalArgumentException("The ddd can't not be a negative number or a invalid number for a phone");
		}
	}
}