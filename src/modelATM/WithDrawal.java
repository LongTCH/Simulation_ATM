package modelATM;

import service.CardService;

public class WithDrawal implements ObserverATM {
	private String numberCard;
	private SubjectATM atm;
	private float fee = 1500;
	private float money;
	private float cardMaintenanceMoney = 50000;

	public float getCardMaintenanceMoney() {
		return cardMaintenanceMoney;
	}

	public WithDrawal(SubjectATM atm) throws Throwable {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.updateATM();
	}

	@Override
	public void updateATM() throws Throwable {
		numberCard = this.atm.getNumberCard();
		money = new CardService().getMoney(numberCard);

	}

	// Số tiền còn lại sau khi rút
	public float withDrawalMoney(float money) {
		float result = 0;
		result = this.money - (money + fee);

		return result;
	}

	// set lại số tiền trong tk sau khi rút
	public void setMoney(float restMoney, String nCard) throws Throwable {
		new CardService().setMoney(nCard, restMoney);
	}

	public float getMoney() {
		return money;
	}

	public float getFee() {
		return fee;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public SubjectATM getAtm() {
		return atm;
	}
}
