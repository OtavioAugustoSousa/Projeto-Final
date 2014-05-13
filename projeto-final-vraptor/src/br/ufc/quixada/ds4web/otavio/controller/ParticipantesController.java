package br.ufc.quixada.ds4web.otavio.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.ufc.quixada.ds4web.otavio.dao.ParticipanteDAO;
import br.ufc.quixada.ds4web.otavio.modelo.Participante;

@Resource
public class ParticipantesController {
	private ParticipanteDAO dao;
	private Result result;
	//private Validator validator;
	
	
	
	public ParticipantesController(ParticipanteDAO dao,Result result, Validator validator) {
		this.dao=dao;
		this.result= result;
		//this.validator= validator;
	}
	
	@Post("/participantes")
	public void adiciona(final Participante participante){
	/*	validator.checking(new Validations(){{
			//Validar Nome
			that(participante.getNome() != null && participante.getNome().length()>=3,"participante.nome","nome.obrigatorio");
			
			//Validar Email
			Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"); 
		    Matcher m = p.matcher(participante.getEmail()); 
			that(m.find(),"participante.email","email.obrigatorio");
			
			//senha
			that(participante.getSenha() != null,"participante.senha","senha.obrigatorio");
		
		
		
		}});*/
		
		
		
		
		dao.salvar(participante);
		result.redirectTo(ParticipantesController.class).lista();
	}
	@Get("participantes")
	public List<Participante> lista() {
		return dao.listaTudo();
	}
	
	@Get("/participante/{id}")
	public Participante edita(Long id){
		return dao.carregar(id);
	} 
	@Get("/participantes/novo")
	public void formulario() {
	}
	
	@Put("/participante/{participante.id}")
	public void altera(Participante participante) {
		dao.atuaizar(participante);
		result.redirectTo(this).lista();
	}
	
}

