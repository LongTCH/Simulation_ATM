package controllerATM;

import modelATM.Capital;
import modelATM.User;
import modelATM.WithDrawal;
import viewATM.ViewCapital;
import viewATM.ViewUser;
import viewATM.ViewWithDrawal;

public class ControllerCapital extends ControllerScreen {
	private ViewCapital viewCapital;
	private Capital capital;
	private ControllerLayout controllerLayout;

	public ControllerCapital(ViewCapital viewCapital, Capital capital, ControllerLayout controllerLayout) {
		this.viewCapital = viewCapital;
		this.capital = capital;
		this.controllerLayout = controllerLayout;
		eventCapital();

	}

	public void eventCapital() {

		// viewCapital.getTxtpnUser().setText(" Chào!" + "\n" + " " +
		// capital.getName());
		// quay lại
		// viewCapital.getBtnBack().addActionListener(new ActionListener() {

		// @Override
		// public void actionPerformed(ActionEvent e) {
		// ViewLogin vLogin = new ViewLogin();
		// vLogin.setVisible(true);
		// Login lo;
		// try {
		// lo = new Login(capital.getAtm());
		// ControllerLogin cl = new ControllerLogin(vLogin, lo, controllerLayout);
		// } catch (Throwable e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		// }
		// });
		// // đổi mật khẩu
		// viewCapital.getBtnChangePin().addActionListener(new ActionListener() {

		// @Override
		// public void actionPerformed(ActionEvent e) {
		// ViewChangePIN vChangePIN = new ViewChangePIN();
		// vChangePIN.setVisible(true);
		// ChangePIN changePIN;
		// try {
		// changePIN = new ChangePIN(capital.getAtm());
		// ControllerChangePIN cChangePIN = new ControllerChangePIN(vChangePIN,
		// changePIN, controllerLayout);
		// } catch (Throwable e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		// }
		// });
		// // Thông tin Tài Khoản
		// viewCapital.getBtnAccount().addActionListener(new ActionListener() {

		// @Override
		// public void actionPerformed(ActionEvent e) {
		// ViewUser vUser = new ViewUser();
		// vUser.setVisible(true);
		// User user;
		// try {
		// user = new User(capital.getAtm());
		// ControllerUser cUser = new ControllerUser(vUser, user, controllerLayout);
		// } catch (Throwable e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		// }
		// });
		// // rút tiền
		// viewCapital.getBtnWithdrawal().addActionListener(new ActionListener() {

		// }
		// });
		// // Chuyển tiền
		// viewCapital.getBtnTransfer().addActionListener(new ActionListener() {

		// @Override
		// public void actionPerformed(ActionEvent e) {
		// ViewTransfer vR = new ViewTransfer();
		// vR.setVisible(true);
		// Transfer recharge;
		// try {
		// recharge = new Transfer(capital.getAtm());
		// ControllerTransfer cR = new ControllerTransfer(vR, recharge,
		// controllerLayout);
		// } catch (Throwable e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		// }
		// });
		// viewCapital.getBtnRecharge().addActionListener(new ActionListener() {

		// @Override
		// public void actionPerformed(ActionEvent e) {
		// ViewRecharge re = new ViewRecharge();
		// re.setVisible(true);
		// Recharges recharge;
		// try {
		// recharge = new Recharges(capital.getAtm());
		// ControllerRecharges c = new ControllerRecharges(re, recharge,
		// controllerLayout);
		// } catch (Throwable e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		// }
		// });
	}

	@Override
	public void actionOnBtnEnter() {
	}

	@Override
	public void actionOnBtnClear() {
	}

	@Override
	public void actionOnBtnCancel() {
	}

	@Override
	public void actionOnBtnLeftTop() {
		// Thông tin Tài Khoản
		ViewUser vUser = new ViewUser();
		controllerLayout.setPanelScreen(vUser);
		User user;
		try {
			user = new User(capital.getAtm());
			controllerLayout.getViewLayout().setControllerScreen(new ControllerUser(vUser, user, controllerLayout));
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void actionOnBtnLeftMid() {
		try {
			ViewWithDrawal vWithDrawal = new ViewWithDrawal();
			controllerLayout.setPanelScreen(vWithDrawal);
			WithDrawal withDrawal;
			withDrawal = new WithDrawal(capital.getAtm());
			controllerLayout.getViewLayout().setControllerScreen(new ControllerWithDrawal(vWithDrawal,
					withDrawal,
					controllerLayout));
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void actionOnBtnLeftBot() {
	}

	@Override
	public void actionOnBtnRightTop() {
	}

	@Override
	public void actionOnBtnRightMid() {
	}

	@Override
	public void actionOnBtnRightBot() {
		controllerLayout.endTransaction();
	}

}
