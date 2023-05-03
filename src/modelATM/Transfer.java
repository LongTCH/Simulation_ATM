package modelATM;

import service.CardService;

public class Transfer implements ObserverATM {
	private WithDrawal withDrawal;
	private String numberCard, nameReceiver;
	private float money;
	private SubjectATM atm;
	private float feeTransfer = 3500;

	public Transfer(SubjectATM atm) throws Throwable {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.updateATM();
		this.withDrawal = new WithDrawal(this.atm);
	}

	@Override
	public void updateATM() throws Throwable {
		numberCard = this.atm.getNumberCard();
		money = new CardService().getMoney(numberCard);

	}

	// Số tiền còn lại sau khi chuyển
	public float transferMoney(float transferMoney, int people) {

		int remittersFee = 1;
		float resultMoney = 0;
		if (people == remittersFee) {

			resultMoney = this.money - (transferMoney + feeTransfer);
		} else {

			resultMoney = this.money - transferMoney;
		}
		return resultMoney;

	}

	// số tiền người nhận
	public float moneyReceiver(float transferMoney, String idCard, int people) throws Throwable {
		int receiverMoney = 0;
		float resultMoney = 0;

		if (people == receiverMoney) {
			resultMoney = new CardService().getMoney(idCard) + (transferMoney - feeTransfer);
		} else
			resultMoney = new CardService().getMoney(idCard) + transferMoney;

		return resultMoney;

	}

	// set lại số tiền trong tk sau khi chuyển or nhận
	public void setMoney(float restMoney, String nCard) throws Throwable {

		withDrawal.setMoney(restMoney, nCard);
	}

	// kiểm tra stk người nhận hợp lệ hay kh ?
	// if có set lại

	public boolean checkNumberCardReceiver(String numberCardReceiver) throws Throwable {
		nameReceiver = new CardService().getName(numberCardReceiver);
		return nameReceiver == null;
	}

	public float getMoney() {
		return money;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public SubjectATM getAtm() {
		return atm;
	}

	public float getFeeTransfer() {
		return feeTransfer;
	}

	public String getNameReceiver() {
		return nameReceiver;
	}

}
