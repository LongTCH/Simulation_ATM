package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelATM.Capital;
import modelATM.User;
import viewATM.ViewCapital;
import viewATM.ViewUser;

public class ControllerUser {
	private ViewUser viewUser;
	private User user;

	public ControllerUser(ViewUser viewUser, User user) {
		this.viewUser = viewUser;
		this.user = user;
		eventUser();
	}

	public void eventUser() {
		// get tên chủ tài khoản
		viewUser.getTextName().setText(user.getName());
		// lấy STK
		viewUser.getTextNumberCard().setText(user.getNumberCard());
		// get money trong tk dùng formatMoney Định dạng tiền
		viewUser.getTextMoneyInCard().setText(user.getAtm().formatMoney(user.getMoney()));
		viewUser.getBtnBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewCapital vCapital = new ViewCapital();
				vCapital.setVisible(true);
				viewUser.dispose();
				Capital capital = new Capital(user.getAtm(), user.getCardInformation());
				ControllerCapital cCapital = new ControllerCapital(vCapital, capital);

			}
		});

	}
}
