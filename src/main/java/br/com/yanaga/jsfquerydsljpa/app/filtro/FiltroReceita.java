package br.com.yanaga.jsfquerydsljpa.app.filtro;

import java.io.Serializable;

public class FiltroReceita implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;

	private FiltroReceita() {
	}

	public static FiltroReceita newInstance() {
		return new FiltroReceita();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}