package br.ufc.quixada.ds4web.otavio.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")

public class SessaoFabrica {

	public static Session getSession() {
		AnnotationConfiguration configuracao = new AnnotationConfiguration();
		configuracao.configure();
		SessionFactory sessionFactory = configuracao.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}

}
