package br.ufc.quixada.ds4web.otavio.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ufc.quixada.ds4web.otavio.modelo.Projeto;

public class ProjetoDao {
	
	private Session session;
	
	public ProjetoDao(Session session) {		
		 this.session=session;
	}
	public void salvar(Projeto projeto) {
		
		Transaction tx = session.beginTransaction();
		session.save(projeto);
		tx.commit();
		
	}
	public void remover(Projeto projeto) {
		
		Transaction tx = session.beginTransaction();
		session.delete(projeto);
		tx.commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Projeto> listaTudo() {
	 	return this.session.createCriteria(Projeto.class).list();
	}

	public Projeto carregar(Long id) {
		return (Projeto) this.session.load(Projeto.class,id);
	}

	public void atuaizar(Projeto projeto) {
		Transaction tx = session.beginTransaction();
		session.update(projeto);
		tx.commit();
		
	}

}