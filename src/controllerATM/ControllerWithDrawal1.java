package controllerATM;

import modelATM.WithDrawal;
import viewATM.ViewWithDrawal1;
import viewATM.ViewWithDrawal2;

public class ControllerWithDrawal1 extends ControllerScreen {
	private ViewWithDrawal1 viewWithDrawal1;
	private WithDrawal withDrawal;
	private float withMoney;
	private float totalMoney;
	private ControllerLayout controllerLayout;

	public ControllerWithDrawal1(ViewWithDrawal1 viewWithDrawal1, WithDrawal withDrawal,
			ControllerLayout controllerLayout) {
		this.viewWithDrawal1 = viewWithDrawal1;
		this.withDrawal = withDrawal;
		this.controllerLayout = controllerLayout;
		totalMoney = withDrawal.getMoney();
		viewWithDrawal1.getTxtMoney().setText(withDrawal.getAtm().formatMoney(totalMoney));
	}

	private void doChangeText(String c) {
		String money = viewWithDrawal1.getMoney() + c;
		if (Float.parseFloat(money) > totalMoney)
			return;
		viewWithDrawal1.setMoney(money);
		viewWithDrawal1.getTextNumberMoney()
				.setText(withDrawal.getAtm().formatMoney(Float.parseFloat(viewWithDrawal1.getMoney())));
	}

	@Override
	public void actionOnBtnOne() {
		doChangeText("1");
	}

	@Override
	public void actionOnBtnTwo() {
		doChangeText("2");
	}

	@Override
	public void actionOnBtnThree() {
		doChangeText("3");
	}

	@Override
	public void actionOnBtnFour() {
		doChangeText("4");
	}

	@Override
	public void actionOnBtnFive() {
		doChangeText("5");
	}

	@Override
	public void actionOnBtnSix() {
		doChangeText("6");
	}

	@Override
	public void actionOnBtnSeven() {
		doChangeText("7");
	}

	@Override
	public void actionOnBtnEight() {
		doChangeText("8");
	}

	@Override
	public void actionOnBtnNine() {
		doChangeText("9");
	}

	@Override
	public void actionOnBtnZero() {
		doChangeText("0");
	}

	@Override
	public void actionOnBtnEnter() {
		if (checkValid()) {
			doWithdraw();
		}
	}

	@Override
	public void actionOnBtnClear() {
		viewWithDrawal1.setMoney("");
		viewWithDrawal1.getTextNumberMoney().setText("");
	}

	@Override
	public void actionOnBtnCancel() {
		controllerLayout.endTransaction();
	}

	private boolean checkValid() {
		withMoney = Float.valueOf(viewWithDrawal1.getMoney());
		if (viewWithDrawal1.getMoney().length() != 0) {
			// Số tiền rút phải là bội của 50000
			if (withMoney % 50000 == 0) {
				// Số tiền rút phải nhỏ hơn 5tr VND
				if (withMoney <= 5000000) {
					// Số Tiền rút không được lớn hơn số tiền trong tk
					if (withMoney + withDrawal.getFee() < withDrawal.getMoney()) {
						// duy trì thẻ
						if (withDrawal.getMoney() > withMoney + withDrawal.getFee()
								+ withDrawal.getCardMaintenanceMoney()) {
							return true;
						} else
							viewWithDrawal1.getLblError()
									.setText("Quý khách vui lòng giữ lại 50.000 VND để duy trì thẻ");
					} else
						viewWithDrawal1.getLblError()
								.setText("Số tiền trong tài khoản của bạn không đủ ");
				} else
					viewWithDrawal1.getLblError()
							.setText("Số Tiền rút không được vượt quá 5.000.000 VNĐ");
			} else
				viewWithDrawal1.getLblError()
						.setText("Số tiền rút phải là bội của 50000");
		} else
			viewWithDrawal1.getLblError()
					.setText("Vui lòng nhập số tiền cần rút");
		return false;
	}

	private void doWithdraw() {
		ViewWithDrawal2 v = new ViewWithDrawal2();
		controllerLayout.setPanelScreen(v);
		controllerLayout.setControllerScreen(new ControllerWithDrawal2(v, withDrawal,
				withMoney, controllerLayout));
	}

}
