package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dataATM.CardInformation;
import modelATM.Capital;
import modelATM.Login;
import viewATM.ViewLogin;
import viewATM.ViewCapital;

public class ControllerLogin {

	private ViewLogin viewLogin;
	private Login login;

	public ControllerLogin(ViewLogin viewLogin, Login login) {
		super();
		this.viewLogin = viewLogin;
		this.login = login;
		eventLogin();
	}

	public void eventLogin() {

		viewLogin.getCard().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				viewLogin.getCard().moveToTarget(viewLogin.getSlot().getX() + 10, viewLogin.getSlot().getY() + 10);
				viewLogin.getLblWelcome().setText("QUÝ KHÁCH VUI LÒNG NHẬP MÃ PIN");
				viewLogin.getLblWelcome1().setText("");
				viewLogin.getPasswordField().setVisible(true);
				viewLogin.getBtnCancel().setEnabled(true);
				viewLogin.getBtnClear().setEnabled(true);
				viewLogin.getBtnEnter().setEnabled(true);
				viewLogin.getBtnEight().setEnabled(true);
				viewLogin.getBtnFive().setEnabled(true);
				viewLogin.getBtnFour().setEnabled(true);
				viewLogin.getBtnNine().setEnabled(true);
				viewLogin.getBtnOne().setEnabled(true);
				viewLogin.getBtnSeven().setEnabled(true);
				viewLogin.getBtnSix().setEnabled(true);
				viewLogin.getBtnThree().setEnabled(true);
				viewLogin.getBtnThree().setEnabled(true);
				viewLogin.getBtnTwo().setEnabled(true);
				viewLogin.getBtnZero().setEnabled(true);
				viewLogin.getTextSTK().setText(login.getNumberC());
			}
		});

		viewLogin.getBtnZero().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "0");

			}
		});
		viewLogin.getBtnOne().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "1");

			}
		});
		viewLogin.getBtnTwo().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "2");

			}
		});
		viewLogin.getBtnThree().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "3");

			}
		});
		viewLogin.getBtnFour().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "4");

			}
		});

		viewLogin.getBtnFive().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "5");

			}
		});
		viewLogin.getBtnSix().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "6");

			}
		});
		viewLogin.getBtnSeven().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "7");

			}
		});
		viewLogin.getBtnEight().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "8");

			}
		});
		viewLogin.getBtnNine().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText() + "9");

			}
		});

		viewLogin.getBtnCancel().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		viewLogin.getBtnClear().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (viewLogin.getPasswordField().getText().length() > 0) {

					viewLogin.getPasswordField().setText(viewLogin.getPasswordField().getText().substring(0,
							viewLogin.getPasswordField().getText().length() - 1));
				}

			}
		});
		viewLogin.getBtnEnter().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (viewLogin.getPasswordField().getText().length() == 6) {

					if (login.checkPin(viewLogin.getPasswordField().getText())) {
						ViewCapital vcapital = new ViewCapital();
						vcapital.setVisible(true);
						Capital capital = new Capital(login.getAtm(), login.getCardInformation());
						ControllerCapital cCapital = new ControllerCapital(vcapital, capital);
						viewLogin.dispose();
					} else
						JOptionPane.showMessageDialog(viewLogin, "Mã Pin không đúng quý khách vui lòng nhập lại",
								"Error PIN", JOptionPane.ERROR_MESSAGE);

				} else
					JOptionPane.showMessageDialog(viewLogin, "Quý khách vui lòng nhập mã pin gồm 6 số ");

			}
		});
	}

	public void reset() {
		viewLogin.getCard().setBounds(0, 359, 60, 90);
		viewLogin.getTextSTK().setText("");
		viewLogin.getLblWelcome1().setText("   XIN K\u00CDNH CH\u00C0O QU\u00DD KH\u00C1CH ");
		viewLogin.getPasswordField().setText("");
		viewLogin.getLblWelcome().setText(" QUÝ KHÁCH VUI LÒNG ĐƯA THẺ VÀO");
		viewLogin.getPasswordField().setVisible(false);
		viewLogin.getBtnCancel().setEnabled(false);
		viewLogin.getBtnClear().setEnabled(false);
		viewLogin.getBtnEnter().setEnabled(false);
		viewLogin.getBtnEight().setEnabled(false);
		viewLogin.getBtnFive().setEnabled(false);
		viewLogin.getBtnFour().setEnabled(false);
		viewLogin.getBtnNine().setEnabled(false);
		viewLogin.getBtnOne().setEnabled(false);
		viewLogin.getBtnSeven().setEnabled(false);
		viewLogin.getBtnSix().setEnabled(false);
		viewLogin.getBtnThree().setEnabled(false);
		viewLogin.getBtnThree().setEnabled(false);
		viewLogin.getBtnTwo().setEnabled(false);
		viewLogin.getBtnZero().setEnabled(false);
		viewLogin.getPasswordField().setVisible(false);

	}

}
