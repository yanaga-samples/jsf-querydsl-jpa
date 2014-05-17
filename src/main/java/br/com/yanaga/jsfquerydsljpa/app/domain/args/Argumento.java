package br.com.yanaga.jsfquerydsljpa.app.domain.args;

import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.path.StringPath;

import java.util.Objects;

public interface Argumento {

	public void append(BooleanBuilder builder, StringPath path);

}
