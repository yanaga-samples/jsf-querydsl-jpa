package br.com.yanaga.jsfquerydsljpa.app.filtro;

import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.path.StringPath;

public interface ArgumentoString {

	public void append(BooleanBuilder builder, StringPath path);

}