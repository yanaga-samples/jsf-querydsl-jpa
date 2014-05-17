package br.com.yanaga.jsfquerydsljpa.app.web;

import br.com.yanaga.jsfquerydsljpa.app.domain.Pessoa;
import com.mysema.query.jpa.impl.JPAQuery;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Scope("session")
@Controller
public class PessoaController implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager entityManager;

	private Pessoa pessoa = new Pessoa();

	private FiltroPessoa filtro = new FiltroPessoa();

	public List<Pessoa> filtrar() {
		JPAQuery query = new JPAQuery(entityManager);
		return filtro.filtrar(query);
	}

	@Transactional
	public void salvar() {
		entityManager.persist(pessoa);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso", null));
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public FiltroPessoa getFiltro() {
		return filtro;
	}
}
