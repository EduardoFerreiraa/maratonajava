package academy.javacore.Oexception.exception.dominio;

@SuppressWarnings("serial")
public class LoginInvalidoException extends Exception {
	public LoginInvalidoException() {
		super("Login inválido");
	}

	public LoginInvalidoException(String message) {
		super(message);
	}

}
