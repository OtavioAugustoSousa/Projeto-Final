package br.ufc.quixada.ds4web.otavio.modelo;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Projeto {
	
	@Id
	@GeneratedValue
	private Long idProjeto;
	private String descricao;
	
	@ManyToMany
	private List<Participante> membros;
	
	@ManyToMany
	private List<Participante> administradores;
	
	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Participante> getMembros() {
		return membros;
	}

	public void setMembros(List<Participante> membros) {
		this.membros = membros;
	}

	public List<Participante> getAdministradores() {
		return administradores;
	}

	public void setAdministradores(List<Participante> administradores) {
		this.administradores = administradores;
	}

}
