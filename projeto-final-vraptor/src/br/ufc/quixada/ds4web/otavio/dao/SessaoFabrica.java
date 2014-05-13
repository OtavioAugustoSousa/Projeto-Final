package br.ufc.quixada.ds4web.otavio.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;


@Component
public class SessaoFabrica implements ComponentFactory<Session>{
	
	private Session sessao;
	private final SessionFactory sessionFactory;
	
	public SessaoFabrica(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	@PostConstruct
	public void abre(){
		this.sessao= sessionFactory.openSession();
		
	}
	
	public Session getInstance() {
		
		return sessao;
		
	}
	
	@PreDestroy
	public void fecha(){
		this.sessao.close();
	}

}
