package br.com.yanaga.jsfquerydsljpa.app.web;

import br.com.yanaga.jsfquerydsljpa.app.domain.args.Argumento;
import br.com.yanaga.jsfquerydsljpa.app.domain.args.ArgumentoFactory;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Argumento.class)
public class ArgumentoConverter implements Converter {
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return ArgumentoFactory.newInstance(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return ((Argumento)value).toString();
	}
}
