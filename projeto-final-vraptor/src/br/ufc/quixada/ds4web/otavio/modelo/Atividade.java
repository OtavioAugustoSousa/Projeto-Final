package br.ufc.quixada.ds4web.otavio.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Atividade {
	@Id 
	@GeneratedValue
	private Long idAtividade;
	
	private String descricao;
	
	@ManyToOne
	private List<Participante> resposaveis;

	@ManyToOne 
	private Projeto projeto;
	
	public Long getIdAtividade() {
		return idAtividade;
	}

	public void setIdAtividade(Long idAtividade) {
		this.idAtividade = idAtividade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Participante> getResposaveis() {
		return resposaveis;
	}

	public void setResposaveis(List<Participante> resposaveis) {
		this.resposaveis = resposaveis;
	}
	
	
}
