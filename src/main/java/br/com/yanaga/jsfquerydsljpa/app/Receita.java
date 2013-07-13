package br.com.yanaga.jsfquerydsljpa.app;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

@Entity
public class Receita implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String nome;

	private Integer nota;

	@OneToMany(mappedBy = "receita")
	private List<Tipo> tipos = Lists.newLinkedList();

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public List<Tipo> getTipos() {
		return ImmutableList.copyOf(tipos);
	}

}