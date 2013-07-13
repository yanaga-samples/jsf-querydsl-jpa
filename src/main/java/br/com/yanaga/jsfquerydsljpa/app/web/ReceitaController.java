package br.com.yanaga.jsfquerydsljpa.app.web;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.yanaga.jsfquerydsljpa.app.Receita;
import br.com.yanaga.jsfquerydsljpa.app.filtro.FiltroReceita;
import br.com.yanaga.jsfquerydsljpa.app.repository.ReceitaRepository;

@Scope("session")
@Controller
public class ReceitaController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ReceitaRepository receitaRepository;

	private FiltroReceita filtro = FiltroReceita.newInstance();

	public FiltroReceita getFiltro() {
		return filtro;
	}

	public List<Receita> getReceitas() {
		return receitaRepository.filtrar(filtro);
	}

}