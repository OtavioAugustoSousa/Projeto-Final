package br.ufc.quixada.ds4web.otavio.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ufc.quixada.ds4web.otavio.modelo.Participante;

public class ParticipanteDAO {
	private Session session;

	public ParticipanteDAO() {
		session = SessaoFabrica.getSession();
	}

	public void salvar(Participante participante) {

		Transaction tx = session.beginTransaction();
		session.save(participante);
		tx.commit();
	}

	public void remover(Participante participante) {
		
		Transaction tx = session.beginTransaction();
		session.delete(participante);
		tx.commit();
	}
	
	public Participante buscar(){
		return null;
	}
	
	public void atuaizar(Participante participante) {
		Transaction tx = session.beginTransaction();
		session.update(participante);
		tx.commit();
	}

}
