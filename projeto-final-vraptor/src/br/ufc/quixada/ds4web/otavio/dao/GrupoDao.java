package br.ufc.quixada.ds4web.otavio.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.ufc.quixada.ds4web.otavio.modelo.Grupo;

@Component
public class GrupoDao {
	
	private Session session;
	
	public GrupoDao(Session session) {
		
		 this.session=session;
	}
	public void salvar(Grupo grupo) {
		
		Transaction tx = session.beginTransaction();
		session.save(grupo);
		tx.commit();
		
	}
	public void remover(Grupo grupo) {
		
		Transaction tx = session.beginTransaction();
		session.delete(grupo);
		tx.commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Grupo> listaTudo() {
	 	return this.session.createCriteria(Grupo.class).list();
	}

	public Grupo carregar(Long id) {
		return (Grupo) this.session.load(Grupo.class,id);
	}

	public void atuaizar(Grupo grupo) {
		Transaction tx = session.beginTransaction();
		session.update(grupo);
		tx.commit();
		
	}

}
