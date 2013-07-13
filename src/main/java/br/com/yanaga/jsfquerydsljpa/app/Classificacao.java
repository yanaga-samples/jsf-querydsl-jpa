package br.com.yanaga.jsfquerydsljpa.app;

import com.mysema.query.BooleanBuilder;

public enum Classificacao {
	TODAS("Todas"), DESTAQUES("Destaques") {
		@Override
		public void append(BooleanBuilder builder) {
			builder.and(QReceita.receita.nota.goe(4));
		}
	},
	BOAS("Boas") {
		@Override
		public void append(BooleanBuilder builder) {
			builder.and(QReceita.receita.nota.goe(3));
		}
	};

	private final String descricao;

	private Classificacao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void append(BooleanBuilder builder) {
	}

}