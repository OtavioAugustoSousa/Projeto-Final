package br.ufc.quixada.ds4web.otavio.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.ufc.quixada.ds4web.otavio.modelo.Participante;

@Component
public class ParticipanteDAO {
	private Session session;

	public ParticipanteDAO(Session session) {
		this.session=session;
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
	@SuppressWarnings("unchecked")
	public List<Participante> listaTudo() {
		return this.session.createCriteria(Participante.class).list();
		}

	public Participante carregar(Long id) {
		 return (Participante) this.session.load(Participante.class,id);
	}

}
