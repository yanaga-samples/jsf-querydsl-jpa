package br.com.yanaga.jsfquerydsljpa.app.filtro;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.common.base.Strings;
import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.path.StringPath;

public class ContainsIgnoreCaseArgumentoString implements ArgumentoString {

	private final String argumento;

	private ContainsIgnoreCaseArgumentoString(String argumento) {
		this.argumento = argumento;
	}

	public static ContainsIgnoreCaseArgumentoString newInstance(String argumento) {
		checkArgument(!Strings.isNullOrEmpty(argumento));
		return new ContainsIgnoreCaseArgumentoString(argumento);
	}

	@Override
	public void append(BooleanBuilder builder, StringPath path) {
		builder.and(path.containsIgnoreCase(argumento));
	}

	@Override
	public String toString() {
		return argumento;
	}

}