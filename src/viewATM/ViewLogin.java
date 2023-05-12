package viewATM;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import modelATM.Login;
import service.PanelScreen;

public class ViewLogin extends PanelScreen {
	private Login login;
	private JPasswordField passwordField;

	public void setLogin(Login login) {
		this.login = login;
	}

	public ViewLogin() {
		setLayout(null);
		passwordField = new JPasswordField(4);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		passwordField.setBounds(135, 111, 86, 20);
		passwordField.setEditable(false);
		add(passwordField);

		JLabel lblNewLabel = new JLabel("QUÝ KHÁCH VUI LÒNG NHẬP MÃ PIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(42, 52, 261, 48);
		add(lblNewLabel);
	}

	public void appendPassword(String c) {
		if (passwordField.getText().length() < 6)
			passwordField.setText(passwordField.getText() + c);
	}

	public void clearPassword() {
		passwordField.setText("");
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
}
