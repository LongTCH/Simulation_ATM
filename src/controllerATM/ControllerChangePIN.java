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
	private ControllerLayout controllerLayout;

	public ControllerChangePIN(ViewChangePIN viewChangePIN, ChangePIN changePIN, ControllerLayout controllerLayout) {
		this.viewChangePIN = viewChangePIN;
		this.changePIN = changePIN;
		this.controllerLayout = controllerLayout;
		eventChangePIN();
	}

	public void eventChangePIN() {

		viewChangePIN.getBtnBackPIN().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewCapital vCapital = new ViewCapital();
				vCapital.setVisible(true);
				viewChangePIN.dispose();
				Capital capital;
				try {
					capital = new Capital(changePIN.getAtm());
					ControllerCapital cCapital = new ControllerCapital(vCapital, capital, controllerLayout);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

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
								try {
									changePIN.setPIN(viewChangePIN.getNewPIN().getText());
								} catch (Throwable e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								JOptionPane.showMessageDialog(viewChangePIN, "Mã PIN của bạn đã được đổi thành công",
										"Đổi Mã PIN", JOptionPane.PLAIN_MESSAGE);
								viewChangePIN.getAncientPIN().setText("");
								viewChangePIN.getNewPIN().setText("");
								viewChangePIN.getNewPIN1().setText("");
								ViewLogin vLogin = new ViewLogin();
								vLogin.setVisible(true);
								Login lo;
								try {
									lo = new Login(changePIN.getAtm());
									ControllerLogin cl = new ControllerLogin(vLogin, lo, controllerLayout);
								} catch (Throwable e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
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
