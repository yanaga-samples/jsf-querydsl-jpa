package br.com.yanaga.jsfquerydsljpa.app.domain.args;

public class ArgumentoFactory {

	public static Argumento newInstance(String value) {
		if (value == null) {
			return new ArgumentoNulo();
		}
		else {
			return new ArgumentoContains(value);
		}
	}

	public static Argumento newInstance() {
		return new ArgumentoNulo();
	}
}
