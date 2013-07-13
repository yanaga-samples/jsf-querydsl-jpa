package br.com.yanaga.jsfquerydsljpa.app.filtro;

import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.path.StringPath;

public class EmptyArgumentoString implements ArgumentoString {

	private EmptyArgumentoString() {
	}

	public static EmptyArgumentoString newInstance() {
		return new EmptyArgumentoString();
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public void append(BooleanBuilder builder, StringPath path) {
	}

}