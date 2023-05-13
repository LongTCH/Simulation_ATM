package viewATM;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import modelATM.Login;

public class ViewLogin extends JPanel {
	private Login login;
	private JPasswordField passwordField;

	public void setLogin(Login login) {
		this.login = login;
	}

	public ViewLogin() {
		setLayout(null);
		setSize(Static.getPanelScreenWeight, Static.getPanelScreenHeight);
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

	public JPasswordField getPasswordField() {
		return passwordField;
	}
}
