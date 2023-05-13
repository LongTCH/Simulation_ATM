package controllerATM;

import javax.swing.JOptionPane;

import modelATM.Capital;
import modelATM.WithDrawal;
import viewATM.ViewCapital;
import viewATM.ViewWithDrawal;
import viewATM.ViewWithDrawal1;
import viewATM.ViewWithDrawal2;

public class ControllerWithDrawal extends ControllerScreen {
	private ViewWithDrawal viewWithDrawal;
	private WithDrawal withDrawal;
	private float wMoney;
	private ControllerLayout controllerLayout;

	public ControllerWithDrawal(ViewWithDrawal viewWithDrawal, WithDrawal withDrawal,
			ControllerLayout controllerLayout) {
		this.viewWithDrawal = viewWithDrawal;
		this.withDrawal = withDrawal;
		this.controllerLayout = controllerLayout;
		viewWithDrawal.getTxtMoney().setText(withDrawal.getAtm().formatMoney(withDrawal.getMoney()));
	}

	public void money(float wMoney) {
		if (wMoney + withDrawal.getFee() < withDrawal.getMoney()) {
			if (withDrawal.getMoney() > wMoney + withDrawal.getFee() + withDrawal.getCardMaintenanceMoney()) {
				ViewWithDrawal2 v = new ViewWithDrawal2();
				controllerLayout.setPanelScreen(v);
				controllerLayout.setControllerScreen(new ControllerWithDrawal2(v, withDrawal,
						wMoney, controllerLayout));
			} else
				JOptionPane.showMessageDialog(viewWithDrawal, "Quý khách vui lòng giữ lại 50.000 VND để duy trì thẻ");

		} else
			JOptionPane.showMessageDialog(viewWithDrawal, "Số tiền trong tài khoản của bạn không đủ ");
	}

	@Override
	public void actionOnBtnLeftTop() {
		wMoney = 100000;
		money(wMoney);
	}

	@Override
	public void actionOnBtnLeftMid() {
		wMoney = 200000;
		money(wMoney);
	}

	@Override
	public void actionOnBtnLeftBot() {
		ViewWithDrawal1 vWD1 = new ViewWithDrawal1();
		controllerLayout.setPanelScreen(viewWithDrawal);
		controllerLayout.setControllerScreen(new ControllerWithDrawal1(vWD1, withDrawal, controllerLayout));
	}

	@Override
	public void actionOnBtnRightTop() {
		wMoney = 500000;
		money(wMoney);
	}

	@Override
	public void actionOnBtnRightMid() {
		wMoney = 1000000;
		money(wMoney);
	}

	@Override
	public void actionOnBtnRightBot() {
		try {
			ViewCapital vCapital = new ViewCapital();
			controllerLayout.setPanelScreen(vCapital);
			Capital capital = new Capital(withDrawal.getAtm());
			controllerLayout.setControllerScreen(new ControllerCapital(vCapital, capital, controllerLayout));
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
