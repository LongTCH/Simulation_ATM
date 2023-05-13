package controllerATM;

import modelATM.Capital;
import modelATM.User;
import viewATM.ViewCapital;
import viewATM.ViewUser;

public class ControllerUser extends ControllerScreen {
	private ViewUser viewUser;
	private User user;
	private ControllerLayout controllerLayout;

	public ControllerUser(ViewUser viewUser, User user, ControllerLayout controllerLayout) {
		this.viewUser = viewUser;
		this.user = user;
		this.controllerLayout = controllerLayout;
		eventUser();
	}

	public void eventUser() {
		// get tên chủ tài khoản
		viewUser.getTextName().setText(user.getName());
		// lấy STK
		viewUser.getTextNumberCard().setText(user.getNumberCard());
		// get money trong tk dùng formatMoney Định dạng tiền
		viewUser.getTextMoneyInCard().setText(user.getAtm().formatMoney(user.getMoney()));
	}

	@Override
	public void actionOnBtnRightBot() {
		try {
			ViewCapital vCapital = new ViewCapital();
			controllerLayout.setPanelScreen(vCapital);
			Capital capital;
			capital = new Capital(user.getAtm());
			controllerLayout.setControllerScreen(new ControllerCapital(vCapital, capital,
					controllerLayout));
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
