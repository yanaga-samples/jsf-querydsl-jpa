package br.com.yanaga.jsfquerydsljpa.app.domain.args;

import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.path.StringPath;

import java.io.Serializable;

public class ArgumentoNulo implements Serializable, Argumento {
	@Override
	public void append(BooleanBuilder builder, StringPath path) {
	}

	@Override
	public String toString() {
		return "";
	}
}
