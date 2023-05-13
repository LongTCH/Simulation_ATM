package controllerATM;

import modelATM.WithDrawal;
import viewATM.ViewWithDrawal2;
import viewATM.ViewYesNo;

public class ControllerWithDrawal2 extends ControllerScreen {
	private ViewWithDrawal2 viewWithDrawal2;
	private WithDrawal withDrawal;

	public WithDrawal getWithDrawal() {
		return withDrawal;
	}

	protected float restMoney, withMoney, money, fee;
	private ViewYesNo viewYesNo;
	private ControllerLayout controllerLayout;

	public ControllerLayout getControllerLayout() {
		return controllerLayout;
	}

	public ControllerWithDrawal2(ViewWithDrawal2 viewWithDrawal2, WithDrawal withDrawal,
			float withMoney, ControllerLayout controllerLayout) {
		this.viewWithDrawal2 = viewWithDrawal2;
		this.withDrawal = withDrawal;
		money = withDrawal.getMoney();
		fee = withDrawal.getFee();
		this.restMoney = withDrawal.withDrawalMoney(withMoney);
		this.withMoney = withMoney;
		this.controllerLayout = controllerLayout;
		viewWithDrawal2.getTxtMoney().setText(withDrawal.getAtm().formatMoney(money));
		viewWithDrawal2.getTxtFee().setText(withDrawal.getAtm().formatMoney(fee));
		viewWithDrawal2.getTextRest().setText(withDrawal.getAtm().formatMoney(restMoney));
		viewWithDrawal2.getTextWithDrawal2().setText(withDrawal.getAtm().formatMoney(withMoney));

	}

	public void doWithdraw() {
		try {
			getWithDrawal().setMoney(getRestMoney(),
					getWithDrawal().getNumberCard());
		} catch (Throwable e1) {
			e1.printStackTrace();
		}

		controllerLayout.endTransaction();
	}

	@Override
	public void actionOnBtnLeftBot() {
		viewYesNo = new ViewYesNo();
		controllerLayout.setPanelScreen(viewYesNo);
		controllerLayout.setControllerScreen(new ControllerYesNo(viewYesNo, this));
	}

	@Override
	public void actionOnBtnRightBot() {
		controllerLayout.endTransaction();
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
