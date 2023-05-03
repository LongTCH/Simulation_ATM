package modelATM;

import service.CardService;

public class Recharges implements ObserverATM {
	private String numberCard, nameReceiver;
	private float money;
	private SubjectATM atm;
	private WithDrawal withDrawal;

	public Recharges(SubjectATM atm) throws Throwable {
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

	// số tiền sau khi được nạp vào
	public float rechargeMoney(float money) {
		float result = 0;
		result = money + this.money;
		return result;
	}

	// set lại số tiền sau khi được nạp
	public void setMoney(float restMoney, String nCard) throws Throwable {

		withDrawal.setMoney(restMoney, nCard);
	}

	public String getNumberCard() {
		return numberCard;
	}

	public float getMoney() {
		return money;
	}

	public SubjectATM getAtm() {
		return atm;
	}

}
