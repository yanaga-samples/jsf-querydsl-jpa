package br.com.yanaga.jsfquerydsljpa.app.filtro;

import java.io.Serializable;

import br.com.yanaga.jsfquerydsljpa.app.Classificacao;
import br.com.yanaga.jsfquerydsljpa.app.QReceita;

import com.mysema.query.BooleanBuilder;

public class FiltroReceita implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArgumentoString nome = EmptyArgumentoString.newInstance();

	private Classificacao classificacao = Classificacao.TODAS;

	private FiltroReceita() {
	}

	public static FiltroReceita newInstance() {
		return new FiltroReceita();
	}

	public BooleanBuilder toPredicate() {
		BooleanBuilder builder = new BooleanBuilder();
		nome.append(builder, QReceita.receita.nome);
		classificacao.append(builder);
		return builder;
	}

	public ArgumentoString getNome() {
		return nome;
	}

	public void setNome(ArgumentoString nome) {
		this.nome = nome;
	}

	public Classificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}

}