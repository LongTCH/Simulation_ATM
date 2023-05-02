package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelATM.Capital;
import modelATM.ChangePIN;
import modelATM.Login;
import modelATM.Recharges;
import modelATM.Transfer;
import modelATM.User;
import modelATM.WithDrawal;
import viewATM.ViewCapital;
import viewATM.ViewChangePIN;
import viewATM.ViewLogin;
import viewATM.ViewRecharge;
import viewATM.ViewTransfer;
import viewATM.ViewUser;
import viewATM.ViewWithDrawal;

public class ControllerCapital {
	private ViewCapital viewCapital;
	private Capital capital;

	public ControllerCapital(ViewCapital viewCapital, Capital capital) {
		this.viewCapital = viewCapital;
		this.capital = capital;
		eventCapital();

	}

	public void eventCapital() {

		viewCapital.getTxtpnUser().setText("             Chào!" + "\n" + "      " + capital.getName());
		// quay lại
		viewCapital.getBtnBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewLogin vLogin = new ViewLogin();
				vLogin.setVisible(true);
				Login lo = new Login(capital.getAtm(), capital.getCardInformation());
				ControllerLogin cl = new ControllerLogin(vLogin, lo);

				viewCapital.dispose();

			}
		});
		// đổi mật khẩu
		viewCapital.getBtnChangePin().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewChangePIN vChangePIN = new ViewChangePIN();
				vChangePIN.setVisible(true);
				ChangePIN changePIN = new ChangePIN(capital.getAtm(), capital.getCardInformation());
				viewCapital.dispose();
				ControllerChangePIN cChangePIN = new ControllerChangePIN(vChangePIN, changePIN);

			}
		});
		// Thông tin Tài Khoản
		viewCapital.getBtnAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUser vUser = new ViewUser();
				vUser.setVisible(true);
				User user = new User(capital.getAtm(), capital.getCardInformation());
				viewCapital.dispose();
				ControllerUser cUser = new ControllerUser(vUser, user);

			}
		});
		// rút tiền
		viewCapital.getBtnWithdrawal().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewWithDrawal vWithDrawal = new ViewWithDrawal();
				vWithDrawal.setVisible(true);
				viewCapital.dispose();
				WithDrawal withDrawal = new WithDrawal(capital.getAtm(), capital.getCardInformation());
				ControllerWithDrawal cWithDrawal = new ControllerWithDrawal(vWithDrawal, withDrawal);

			}
		});
		// Chuyển tiền
		viewCapital.getBtnTransfer().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewTransfer vR = new ViewTransfer();
				vR.setVisible(true);
				Transfer recharge = new Transfer(capital.getAtm(), capital.getCardInformation());
				ControllerTransfer cR = new ControllerTransfer(vR, recharge);
				viewCapital.dispose();

			}
		});
		viewCapital.getBtnRecharge().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewRecharge re = new ViewRecharge();
				re.setVisible(true);
				Recharges recharge = new Recharges(capital.getAtm(), capital.getCardInformation());
				ControllerRecharges c = new ControllerRecharges(re, recharge);
				viewCapital.dispose();
			}
		});
	}
}
