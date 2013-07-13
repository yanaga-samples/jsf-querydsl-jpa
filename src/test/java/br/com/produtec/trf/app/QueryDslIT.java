package br.com.produtec.trf.app;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.yanaga.jsfquerydsljpa.app.QReceita;
import br.com.yanaga.jsfquerydsljpa.app.Receita;
import br.com.yanaga.jsfquerydsljpa.configuration.root.AppConfig;

import com.mysema.query.jpa.JPQLQuery;
import com.mysema.query.jpa.impl.JPAQuery;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@Transactional
public class QueryDslIT {

	@PersistenceContext
	private EntityManager entityManager;

	@Test
	public void test() {
		Receita receita = new Receita();
		receita.setNome("Bolo de chocolate");
		entityManager.persist(receita);

		JPQLQuery query = new JPAQuery(entityManager);
		QReceita qReceita = QReceita.receita;
		List<Receita> receitas = query.from(qReceita).where(qReceita.nome.startsWith("Bolo")).list(qReceita);
		assertTrue(!receitas.isEmpty());
	}

}