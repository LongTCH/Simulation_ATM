package controllerATM;

import modelATM.Login;
import viewATM.ViewLogin;

public class ControllerLogin {

	private ViewLogin viewLogin;
	private Login login;

	public ControllerLogin(ViewLogin viewLogin, Login login) {
		super();
		this.viewLogin = viewLogin;
		this.login = login;

	}

}
