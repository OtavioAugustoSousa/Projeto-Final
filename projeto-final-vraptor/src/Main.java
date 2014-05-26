import java.util.ArrayList;
import java.util.List;

import br.ufc.quixada.ds4web.otavio.dao.CriadorDeSessaoFabrica;
import br.ufc.quixada.ds4web.otavio.dao.GrupoDao;
import br.ufc.quixada.ds4web.otavio.dao.SessaoFabrica;
import br.ufc.quixada.ds4web.otavio.modelo.Grupo;
import br.ufc.quixada.ds4web.otavio.modelo.Participante;



public class Main {

	public static void main(String[] args) {
		
		
		Participante p= new Participante();
		p.setNome("Otávio");
		p.setEmail("otavioaugusto@alu.ufc.br");
		p.setSenha("1234");
		
		Participante p2= new Participante();
		p.setNome("augusto");
		p.setEmail("augusto@alu.ufc.br");
		p.setSenha("1234");
		
		List<Participante> participantes= new ArrayList<Participante>();
		participantes.add(p);
		participantes.add(p2);
		
		Grupo grupo= new Grupo();
		grupo.setIntegrantes(participantes);
		System.out.println(new CriadorDeSessaoFabrica().getInstance().openSession());
		GrupoDao grupoDao = new GrupoDao(new CriadorDeSessaoFabrica().getInstance().openSession());
		grupoDao.salvar(grupo);
		
		
/*		ParticipanteDAO pDao= new ParticipanteDAO();
		pDao.salvar(p);*/

	}

}
