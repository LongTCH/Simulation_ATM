package modelATM;

import java.util.ArrayList;

import dataATM.CardInformation;

public class Recharges implements ObserverATM {
	private String numberCard, nameReceiver;
	private float money;
	private SubjectATM atm;
	private ArrayList<CardInformation> cardInformation;
	private WithDrawal withDrawal;

	public Recharges(SubjectATM atm, ArrayList<CardInformation> cardInformation) {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.cardInformation = cardInformation;
		cardInformation = new ArrayList<CardInformation>();
		this.updateATM();
		this.withDrawal = new WithDrawal(this.atm, this.cardInformation);
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

// số tiền sau  khi được nạp vào 
	public float rechargeMoney(float money) {
		float result = 0;
		result = money + this.money;
		return result;
	}

//set lại số tiền sau khi được nạp
	public void setMoney(float restMoney, String nCard) {
	
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

	public ArrayList<CardInformation> getCardInformation() {
		return cardInformation;
	}

}
