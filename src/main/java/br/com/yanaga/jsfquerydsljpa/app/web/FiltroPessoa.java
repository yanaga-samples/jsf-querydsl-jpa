package br.com.yanaga.jsfquerydsljpa.app.web;

import br.com.yanaga.jsfquerydsljpa.app.domain.Pessoa;
import br.com.yanaga.jsfquerydsljpa.app.domain.QPessoa;
import br.com.yanaga.jsfquerydsljpa.app.domain.args.Argumento;
import br.com.yanaga.jsfquerydsljpa.app.domain.args.ArgumentoFactory;
import com.mysema.query.BooleanBuilder;
import com.mysema.query.jpa.impl.JPAQuery;

import java.io.Serializable;
import java.util.List;

public class FiltroPessoa implements Serializable {

	private Argumento nome = ArgumentoFactory.newInstance();

	public Argumento getNome() {
		return nome;
	}

	public void setNome(Argumento nome) {
		this.nome = nome;
	}

	public List<Pessoa> filtrar(JPAQuery query) {
		QPessoa qPessoa = QPessoa.pessoa;
		BooleanBuilder builder = new BooleanBuilder();
		nome.append(builder, qPessoa.nome);
		return query.from(qPessoa)
				.where(builder)
				.distinct().limit(10).list(qPessoa);
	}
}
