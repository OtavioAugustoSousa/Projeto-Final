package br.ufc.quixada.ds4web.otavio.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.ufc.quixada.ds4web.otavio.dao.GrupoDao;
import br.ufc.quixada.ds4web.otavio.modelo.Grupo;

@Resource
public class GruposController {
	private GrupoDao dao;
	private Result result;
	
	public GruposController(GrupoDao dao, Result result) {
		this.dao=dao;
		this.result=result;
	}
	
	@Post("/grupos")
	public void adiciona(Grupo grupo){	
		dao.salvar(grupo);
		result.redirectTo(this).lista();
	}
	
	@Get("grupos")
	public List<Grupo> lista() {
		return dao.listaTudo();
	}
	
	@Get("/grupo/{id}")
	public Grupo edita(Long id){
		return dao.carregar(id);
	}
	
	@Get("/grupo/novo")
	public void formulario() {
	}

	@Put("/grupo/{grupo.id}")
	public void altera(Grupo grupo) {
		dao.atuaizar(grupo);
		result.redirectTo(this).lista();
	}
}
