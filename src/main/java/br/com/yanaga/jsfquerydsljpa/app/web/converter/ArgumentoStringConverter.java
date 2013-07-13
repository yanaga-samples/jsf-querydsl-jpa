package br.com.yanaga.jsfquerydsljpa.app.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import br.com.yanaga.jsfquerydsljpa.app.filtro.ContainsIgnoreCaseArgumentoString;
import br.com.yanaga.jsfquerydsljpa.app.filtro.EmptyArgumentoString;

import com.google.common.base.Strings;

public class ArgumentoStringConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (Strings.isNullOrEmpty(value)) {
			return EmptyArgumentoString.newInstance();
		}
		else {
			return ContainsIgnoreCaseArgumentoString.newInstance(value);
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return value.toString();
	}

}
