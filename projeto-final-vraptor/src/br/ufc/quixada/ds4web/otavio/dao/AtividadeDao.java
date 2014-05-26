package br.ufc.quixada.ds4web.otavio.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.ufc.quixada.ds4web.otavio.modelo.Atividade;

public class AtividadeDao {
	private Session session;

	public AtividadeDao(Session session) {

		this.session = session;
	}

	public void salvar(Atividade atividade) {

		Transaction tx = session.beginTransaction();
		session.save(atividade);
		tx.commit();

	}

	public void remover(Atividade atividade) {

		Transaction tx = session.beginTransaction();
		session.delete(atividade);
		tx.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Atividade> listaTudo() {
		return this.session.createCriteria(Atividade.class).list();
	}

	public Atividade carregar(Long id) {
		return (Atividade) this.session.load(Atividade.class, id);
	}

	public void atuaizar(Atividade atividade) {
		Transaction tx = session.beginTransaction();
		session.update(atividade);
		tx.commit();
	}
}
