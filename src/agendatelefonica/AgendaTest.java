package agendatelefonica;

import java.util.ArrayList;
import java.util.List;

import contato.Contato;
import telefone.Telefone;

public class AgendaTest {
	
	public static void main(String[] args) {
		List<Contato> agendaContatos = new ArrayList<Contato>();
		List<Telefone> telefones = new ArrayList<Telefone>();
		telefones.add(new Telefone((short) 19, "Celular", "84932175985"));
		agendaContatos.add(new Contato(agendaContatos.size(), "Yuri", telefones));
		
		Menu.menu(agendaContatos);
	}
}
