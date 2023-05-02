package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelATM.Capital;
import modelATM.ChangePIN;
import modelATM.Login;
import viewATM.ViewCapital;
import viewATM.ViewChangePIN;
import viewATM.ViewLogin;

public class ControllerChangePIN {
	private ViewChangePIN viewChangePIN;
	private ChangePIN changePIN;

	public ControllerChangePIN(ViewChangePIN viewChangePIN, ChangePIN changePIN) {
		this.viewChangePIN = viewChangePIN;
		this.changePIN = changePIN;
		eventChangePIN();
	}

	public void eventChangePIN() {

		viewChangePIN.getBtnBackPIN().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewCapital vCapital = new ViewCapital();
				vCapital.setVisible(true);
				viewChangePIN.dispose();
				Capital capital = new Capital(changePIN.getAtm(), changePIN.getCardInformation());
				ControllerCapital cCapital = new ControllerCapital(vCapital, capital);

			}
		});
		viewChangePIN.getBtnChangePIN().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (changePIN.checkNumberPIN(viewChangePIN.getAncientPIN().getText())
						&& changePIN.checkNumberPIN(viewChangePIN.getNewPIN().getText())
						&& changePIN.checkNumberPIN(viewChangePIN.getNewPIN1().getText())) {

					if (viewChangePIN.getAncientPIN().getText().length() == 6
							&& viewChangePIN.getNewPIN().getText().length() == 6) {
						if (changePIN.checkPIN(viewChangePIN.getAncientPIN().getText())) {
							if (viewChangePIN.getNewPIN().getText().equals(viewChangePIN.getNewPIN1().getText())) {
								changePIN.setPIN(viewChangePIN.getNewPIN().getText());
								JOptionPane.showMessageDialog(viewChangePIN, "Mã PIN của bạn đã được đổi thành công",
										"Đổi Mã PIN", JOptionPane.PLAIN_MESSAGE);
								viewChangePIN.getAncientPIN().setText("");
								viewChangePIN.getNewPIN().setText("");
								viewChangePIN.getNewPIN1().setText("");
								ViewLogin vLogin = new ViewLogin();
								vLogin.setVisible(true);
								Login lo = new Login(changePIN.getAtm(), changePIN.getCardInformation());
								ControllerLogin cl = new ControllerLogin(vLogin, lo);
								viewChangePIN.dispose();

							} else
								JOptionPane.showMessageDialog(viewChangePIN,
										"Mã PIN mới Không trùng nhau. Quý khách vui lòng nhập lại");

						} else
							JOptionPane.showMessageDialog(viewChangePIN,
									"Mã Pin cũ không đúng quý khách vui lòng nhập lại", "Error PIN",
									JOptionPane.ERROR_MESSAGE);

					} else
						JOptionPane.showMessageDialog(viewChangePIN, "Quý khách vui lòng nhập mã pin gồm 6 số ");

				} else
					JOptionPane.showMessageDialog(viewChangePIN, "Mã PIN phải là số");
			}

		});

	}

}
