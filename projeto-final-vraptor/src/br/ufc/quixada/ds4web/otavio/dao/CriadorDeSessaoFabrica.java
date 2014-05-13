package br.ufc.quixada.ds4web.otavio.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@SuppressWarnings("deprecation")

@Component
@ApplicationScoped
public class CriadorDeSessaoFabrica implements
		ComponentFactory<SessionFactory> {
	private SessionFactory fabrica;
	
	@PostConstruct
	public void abre(){
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		 this.fabrica = configuration.buildSessionFactory();

	}
	
	public SessionFactory getInstance() {
		
				return this.fabrica;
	}
	@PreDestroy
	public void fecha(){
		this.fabrica.close();
	}
	
}