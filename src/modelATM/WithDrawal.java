package modelATM;

import java.util.ArrayList;

import dataATM.CardInformation;

public class WithDrawal implements ObserverATM {
	private String numberCard;
	private SubjectATM atm;
	private ArrayList<CardInformation> cardInformation;
	private float fee = 1500;
	private float money;
	private float cardMaintenanceMoney = 50000;

	public float getCardMaintenanceMoney() {
		return cardMaintenanceMoney;
	}

	public WithDrawal(SubjectATM atm, ArrayList<CardInformation> cardInformation) {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.cardInformation = cardInformation;
		cardInformation = new ArrayList<CardInformation>();
		this.updateATM();
	}

	@Override
	public void updateATM() {
		numberCard = this.atm.getNumberCard();
		for (CardInformation cardInformation2 : cardInformation) {
			if (cardInformation2.getDataNumberCard().equals(numberCard)) {
				money = cardInformation2.getMoney();
			}
		}

	}

	// Số tiền còn lại sau khi rút
	public float withDrawalMoney(float money) {
		float result = 0;
		result = this.money - (money + fee);

		return result;
	}

	// set lại số tiền trong tk sau khi rút
	public void setMoney(float restMoney, String nCard) {
		for (CardInformation cardInformation2 : cardInformation) {
			if (cardInformation2.getDataNumberCard().equals(nCard)) {
				cardInformation2.setMoney(restMoney);
			}
		}
	}

	public float getMoney() {
		return money;
	}

	public double getFee() {
		return fee;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public SubjectATM getAtm() {
		return atm;
	}

	public ArrayList<CardInformation> getCardInformation() {
		return cardInformation;
	}
}
