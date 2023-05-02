package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelATM.Capital;
import modelATM.Login;
import modelATM.Recharges;
import viewATM.ViewCapital;
import viewATM.ViewLogin;
import viewATM.ViewRecharge;
import viewATM.ViewYesNo;

public class ControllerRecharges {
	private ViewRecharge viewRecharge;
	private Recharges recharge;
	private ViewYesNo viewYesNo;

	public ControllerRecharges(ViewRecharge viewRecharge, Recharges recharge) {
		super();
		this.viewRecharge = viewRecharge;
		this.recharge = recharge;
		eventRecharge();

	}

	public void eventRecharge() {
		viewRecharge.getBtnBackRecharge().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewCapital vCapital = new ViewCapital();
				vCapital.setVisible(true);
				viewRecharge.dispose();
				Capital capital = new Capital(recharge.getAtm(), recharge.getCardInformation());
				ControllerCapital cCapital = new ControllerCapital(vCapital, capital);

			}
		});
		viewRecharge.getBtnNext().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				enventYesNo();

			}
		});
		viewRecharge.getBtnCancel().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewLogin vLogin = new ViewLogin();
				vLogin.setVisible(true);
				Login lo = new Login(recharge.getAtm(), recharge.getCardInformation());
				ControllerLogin cl = new ControllerLogin(vLogin, lo);

				viewRecharge.dispose();

			}
		});
	}

	public void enventYesNo() {
		viewYesNo = new ViewYesNo();
		viewYesNo.setVisible(true);
		viewYesNo.getBtnYes().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (viewRecharge.getTextRecharge().getText().length() != 0) {
					if (Float.valueOf(viewRecharge.getTextRecharge().getText()) >= 50000) {
						float rechargeMoney = Float.valueOf(viewRecharge.getTextRecharge().getText());
						float restMoney = recharge.rechargeMoney(rechargeMoney);
						recharge.setMoney(restMoney, recharge.getNumberCard());
						viewYesNo.dispose();
						JOptionPane.showMessageDialog(viewYesNo,
								"Quý khách đã nộp thành công số tiền là : "
										+ recharge.getAtm().formatMoney(rechargeMoney) + "VND" + "\n"
										+ "      Xin chân thành cảm ơn!");
						viewRecharge.dispose();

						ViewLogin vLogin = new ViewLogin();
						vLogin.setVisible(true);
						Login lo = new Login(recharge.getAtm(), recharge.getCardInformation());
						ControllerLogin cl = new ControllerLogin(vLogin, lo);

						viewRecharge.dispose();
					} else
						JOptionPane.showMessageDialog(viewYesNo, "Quý khách vui lòng nhập số tiền cần nộp");

				} else
					JOptionPane.showMessageDialog(viewYesNo, "Quý khách vui lòng nộp số tiền từ 50.000 VND trở lên ");

			}
		});
		viewYesNo.getBtnNo().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewYesNo.dispose();
			}
		});

	}
}
