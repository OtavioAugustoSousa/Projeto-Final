package br.ufc.quixada.ds4web.otavio.modelo;
import br.ufc.quixada.ds4web.otavio.dao.ParticipanteDAO;

public class Main {

	public static void main(String[] args) {
		
		
		Participante p= new Participante();
		p.setNome("Otávio");
		p.setEmail("otavioaugusto@alu.ufc.br");
		p.setSenha("1234");
		
		ParticipanteDAO pDao= new ParticipanteDAO();
		pDao.salvar(p);

	}

}
