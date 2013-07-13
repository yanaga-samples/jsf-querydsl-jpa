package br.com.yanaga.jsfquerydsljpa.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.yanaga.jsfquerydsljpa.app.QReceita;
import br.com.yanaga.jsfquerydsljpa.app.Receita;
import br.com.yanaga.jsfquerydsljpa.app.filtro.FiltroReceita;

import com.mysema.query.jpa.JPQLQuery;
import com.mysema.query.jpa.impl.JPAQuery;

@Repository
public class ReceitaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Receita> filtrar(FiltroReceita filtro) {
		JPQLQuery query = new JPAQuery(entityManager);
		QReceita qReceita = QReceita.receita;
		if (filtro.getNome() != null) {
			return query.from(qReceita).where(qReceita.nome.containsIgnoreCase(filtro.getNome()))
					.orderBy(qReceita.nome.asc()).list(qReceita);
		}
		else {
			return query.from(qReceita).orderBy(qReceita.nome.asc()).list(qReceita);
		}
	}

}