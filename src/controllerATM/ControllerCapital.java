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
				Login lo;
				try {
					lo = new Login(capital.getAtm());
					ControllerLogin cl = new ControllerLogin(vLogin, lo);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				viewCapital.dispose();

			}
		});
		// đổi mật khẩu
		viewCapital.getBtnChangePin().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewChangePIN vChangePIN = new ViewChangePIN();
				vChangePIN.setVisible(true);
				ChangePIN changePIN;
				try {
					changePIN = new ChangePIN(capital.getAtm());
					ControllerChangePIN cChangePIN = new ControllerChangePIN(vChangePIN, changePIN);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				viewCapital.dispose();

			}
		});
		// Thông tin Tài Khoản
		viewCapital.getBtnAccount().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUser vUser = new ViewUser();
				vUser.setVisible(true);
				User user;
				try {
					user = new User(capital.getAtm());
					ControllerUser cUser = new ControllerUser(vUser, user);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				viewCapital.dispose();

			}
		});
		// rút tiền
		viewCapital.getBtnWithdrawal().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewWithDrawal vWithDrawal = new ViewWithDrawal();
				vWithDrawal.setVisible(true);
				viewCapital.dispose();
				WithDrawal withDrawal;
				try {
					withDrawal = new WithDrawal(capital.getAtm());
					ControllerWithDrawal cWithDrawal = new ControllerWithDrawal(vWithDrawal, withDrawal);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		// Chuyển tiền
		viewCapital.getBtnTransfer().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewTransfer vR = new ViewTransfer();
				vR.setVisible(true);
				Transfer recharge;
				try {
					recharge = new Transfer(capital.getAtm());
					ControllerTransfer cR = new ControllerTransfer(vR, recharge);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				viewCapital.dispose();

			}
		});
		viewCapital.getBtnRecharge().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewRecharge re = new ViewRecharge();
				re.setVisible(true);
				Recharges recharge;
				try {
					recharge = new Recharges(capital.getAtm());
					ControllerRecharges c = new ControllerRecharges(re, recharge);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				viewCapital.dispose();
			}
		});
	}
}
