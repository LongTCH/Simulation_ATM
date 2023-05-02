package modelATM;

import java.util.ArrayList;

import dataATM.CardInformation;

public class User implements ObserverATM {
	private String name, numberCard;
	private float money;
	private SubjectATM atm;
	private ArrayList<CardInformation> cardInformation;

	public User(SubjectATM atm, ArrayList<CardInformation> cardInformation) {
		this.atm = atm;
		this.cardInformation = cardInformation;
		cardInformation = new ArrayList<CardInformation>();
		this.updateATM();

	}

	@Override
	public void updateATM() {
		numberCard = atm.getNumberCard();
		for (CardInformation cardInformation2 : cardInformation) {
			if (numberCard.equals(cardInformation2.getDataNumberCard())) {
				money = cardInformation2.getMoney();
				name = cardInformation2.getName();

			}
		}

	}

	public String getName() {
		return name;
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
