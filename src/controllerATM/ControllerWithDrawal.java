package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelATM.Capital;
import modelATM.Login;
import modelATM.WithDrawal;
import viewATM.ViewCapital;
import viewATM.ViewLogin;
import viewATM.ViewWithDrawal;
import viewATM.ViewWithDrawal1;
import viewATM.ViewWithDrawal2;

public class ControllerWithDrawal {
	private ViewWithDrawal viewWithDrawal;
	private WithDrawal withDrawal;
	private float wMoney;

	public ControllerWithDrawal(ViewWithDrawal viewWithDrawal, WithDrawal withDrawal) {
		this.viewWithDrawal = viewWithDrawal;
		this.withDrawal = withDrawal;
		eventWithDrawal();

	}

	public void eventWithDrawal() {
		viewWithDrawal.getTextNumberCardWithDrawal().setText(withDrawal.getNumberCard());
		viewWithDrawal.getBtn100().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wMoney = 100000;
				money(wMoney);

			}
		});
		viewWithDrawal.getBtn200().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wMoney = 200000;
				money(wMoney);

			}
		});
		viewWithDrawal.getBtn500().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wMoney = 500000;
				money(wMoney);

			}
		});
		viewWithDrawal.getBtn2000().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wMoney = 2000000;
				money(wMoney);

			}
		});
		viewWithDrawal.getBtnOther().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewWithDrawal1 vWD1 = new ViewWithDrawal1();
				vWD1.setVisible(true);
				ControllerWithDrawal1 c1 = new ControllerWithDrawal1(vWD1, withDrawal);
				viewWithDrawal.dispose();

			}
		});
		viewWithDrawal.getBtnCancelWithDrawal().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewLogin vLogin = new ViewLogin();
				vLogin.setVisible(true);
				Login lo = new Login(withDrawal.getAtm(), withDrawal.getCardInformation());
				ControllerLogin cl = new ControllerLogin(vLogin, lo);

				viewWithDrawal.dispose();

			}
		});
		viewWithDrawal.getBtnBackWithDrawal().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewCapital vCapital = new ViewCapital();
				vCapital.setVisible(true);
				viewWithDrawal.dispose();
				Capital capital = new Capital(withDrawal.getAtm(), withDrawal.getCardInformation());
				ControllerCapital cCapital = new ControllerCapital(vCapital, capital);

			}
		});
	}

	public void money(float wMoney) {
		if (wMoney + withDrawal.getFee() < withDrawal.getMoney()) {
			if (withDrawal.getMoney() > wMoney + withDrawal.getFee() + withDrawal.getCardMaintenanceMoney()) {

				ViewWithDrawal2 v = new ViewWithDrawal2();
				v.setVisible(true);
				ControllerWithDrawal2 cWithDrawal2 = new ControllerWithDrawal2(v, withDrawal,
						withDrawal.withDrawalMoney(wMoney), wMoney);
				viewWithDrawal.dispose();
			} else
				JOptionPane.showMessageDialog(viewWithDrawal, "Quý khách vui lòng giữ lại 50.000 VND để duy trì thẻ");

		} else

			JOptionPane.showMessageDialog(viewWithDrawal, "Số tiền trong tài khoản của bạn không đủ ");
	}

	public void disposeViewWithDrawal() {
		viewWithDrawal.dispose();
	}
}
