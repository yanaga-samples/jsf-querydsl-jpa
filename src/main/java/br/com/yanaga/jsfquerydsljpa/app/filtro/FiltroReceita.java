package br.com.yanaga.jsfquerydsljpa.app.filtro;

import java.io.Serializable;

import br.com.yanaga.jsfquerydsljpa.app.QReceita;

import com.mysema.query.BooleanBuilder;

public class FiltroReceita implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArgumentoString nome = EmptyArgumentoString.newInstance();

	private FiltroReceita() {
	}

	public static FiltroReceita newInstance() {
		return new FiltroReceita();
	}

	public BooleanBuilder toPredicate() {
		BooleanBuilder builder = new BooleanBuilder();
		nome.append(builder, QReceita.receita.nome);
		return builder;
	}

	public ArgumentoString getNome() {
		return nome;
	}

	public void setNome(ArgumentoString nome) {
		this.nome = nome;
	}

}