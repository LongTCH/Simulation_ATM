package controllerATM;

import modelATM.Capital;
import modelATM.Login;
import viewATM.ViewCapital;
import viewATM.ViewLogin;

public class ControllerLogin extends ControllerScreen {

	private ViewLogin viewLogin;
	private Login login;
	private ControllerLayout controllerLayout;

	public ControllerLogin(ViewLogin viewLogin, Login login, ControllerLayout controllerLayout) {
		super();
		this.viewLogin = viewLogin;
		this.login = login;
		this.controllerLayout = controllerLayout;
	}

	public void appendPassword(String c) {
		if (viewLogin.getPasswordField().getText().length() < 6)
			viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + c);
	}

	public void clearPassword() {
		viewLogin.getPasswordField().setText("");
	}

	@Override
	public void actionOnBtnOne() {
		appendPassword("1");
	}

	@Override
	public void actionOnBtnTwo() {
		appendPassword("2");
	}

	@Override
	public void actionOnBtnThree() {
		appendPassword("3");
	}

	@Override
	public void actionOnBtnFour() {
		appendPassword("4");
	}

	@Override
	public void actionOnBtnFive() {
		appendPassword("5");
	}

	@Override
	public void actionOnBtnSix() {
		appendPassword("6");
	}

	@Override
	public void actionOnBtnSeven() {
		appendPassword("7");
	}

	@Override
	public void actionOnBtnEight() {
		appendPassword("8");
	}

	@Override
	public void actionOnBtnNine() {
		appendPassword("9");
	}

	@Override
	public void actionOnBtnZero() {
		appendPassword("0");
	}

	@Override
	public void actionOnBtnEnter() {
		if (login.checkPin(viewLogin.getPasswordField().getText())) {
			ViewCapital vcapital = new ViewCapital();
			controllerLayout.setPanelScreen(vcapital);
			Capital capital;
			try {
				capital = new Capital(login.getAtm());
				controllerLayout.setControllerScreen(new ControllerCapital(vcapital, capital, controllerLayout));
			} catch (Throwable e1) {
				e1.printStackTrace();
			}
		} else
			viewLogin.getLblError().setVisible(true);

	}

	@Override
	public void actionOnBtnClear() {
		viewLogin.getPasswordField().setText("");
	}

}
