package br.com.yanaga.jsfquerydsljpa.app.domain.args;

import com.google.common.base.Preconditions;
import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.path.StringPath;

import java.io.Serializable;

public class ArgumentoContains implements Serializable, Argumento {

	private final String value;

	ArgumentoContains(String value) {
		this.value = value;
	}

	public static Argumento newInstance(String value) {
		Preconditions.checkNotNull(value);
		return new ArgumentoContains(value);
	}

	@Override
	public void append(BooleanBuilder builder, StringPath path) {
		builder.and(path.containsIgnoreCase(value));
	}

	@Override
	public String toString() {
		return value;
	}
}
