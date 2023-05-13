package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelATM.Login;
import modelATM.WithDrawal;
import viewATM.ViewLogin;
import viewATM.ViewWithDrawal;
import viewATM.ViewWithDrawal2;
import viewATM.ViewYesNo;

public class ControllerWithDrawal2 extends ControllerScreen {
	private ViewWithDrawal2 viewWithDrawal2;
	private WithDrawal withDrawal;
	protected float restMoney, withMoney;
	private ViewYesNo viewYesNo;
	private ControllerLayout controllerLayout;

	public ControllerWithDrawal2(ViewWithDrawal2 viewWithDrawal2, WithDrawal withDrawal, float restMoney,
			float withMoney, ControllerLayout controllerLayout) {
		this.viewWithDrawal2 = viewWithDrawal2;
		this.withDrawal = withDrawal;
		this.restMoney = restMoney;
		this.withMoney = withMoney;
		this.controllerLayout = controllerLayout;
		eventWithDrawal2();

	}

	public void eventWithDrawal2() {
		viewWithDrawal2.getTextNumberCardWithDrawal2().setText(withDrawal.getNumberCard());
		viewWithDrawal2.getTextRest().setText(withDrawal.getAtm().formatMoney(restMoney));
		viewWithDrawal2.getTextWithDrawal2().setText(withDrawal.getAtm().formatMoney(withMoney));
		viewWithDrawal2.getBtnBackW2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewWithDrawal vWD = new ViewWithDrawal();
				vWD.setVisible(true);
				viewWithDrawal2.dispose();
				ControllerWithDrawal cWD = new ControllerWithDrawal(vWD, withDrawal, controllerLayout);

			}
		});
		viewWithDrawal2.getBtnWithDrawal2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				eventViewYesNo();
			}
		});
		viewWithDrawal2.getBtnCancelWithDrawal2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewLogin vLogin = new ViewLogin();
				vLogin.setVisible(true);
				Login lo;
				try {
					lo = new Login(withDrawal.getAtm());
					ControllerLogin cl = new ControllerLogin(vLogin, lo, controllerLayout);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				viewWithDrawal2.dispose();

			}
		});

	}

	public void eventViewYesNo() {
		viewYesNo = new ViewYesNo();
		viewYesNo.setVisible(true);
		viewYesNo.getBtnYes().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// set lại số tiền trong tài khoản sau khi rút
				try {
					withDrawal.setMoney(restMoney, withDrawal.getNumberCard());
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				viewYesNo.dispose();

				JOptionPane.showMessageDialog(viewYesNo,
						"Bạn đã rút thành công " + withDrawal.getAtm().formatMoney(withMoney)
								+ " VNĐ từ tài khỏa của bạn" + "\n" + " Số dư trong tài khoản : "
								+ withDrawal.getAtm().formatMoney(restMoney) + " VND" + "\n"
								+ "                    Xin chân thành cảm ơn!");
				viewWithDrawal2.dispose();
				ViewLogin vLogin = new ViewLogin();
				vLogin.setVisible(true);
				Login lo;
				try {
					lo = new Login(withDrawal.getAtm());
					ControllerLogin cl = new ControllerLogin(vLogin, lo, controllerLayout);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		viewYesNo.getBtnNo().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				viewYesNo.dispose();

			}
		});
	}

	public float getRestMoney() {
		return restMoney;
	}

	public float getWithMoney() {
		return withMoney;
	}

	public void setRestMoney(float restMoney) {
		this.restMoney = restMoney;
	}

	public void setWithMoney(float withMoney) {
		this.withMoney = withMoney;
	}
}
