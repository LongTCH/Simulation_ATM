package modelATM;

import java.util.ArrayList;

import dataATM.CardInformation;

public class Capital implements ObserverATM {
	private String numberCard;
	private SubjectATM atm;
	private ArrayList<CardInformation> cardInformation;
	private String name;

	public Capital(SubjectATM atm, ArrayList<CardInformation> cardInformation) {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.cardInformation = cardInformation;
		cardInformation = new ArrayList<CardInformation>();
		this.updateATM();
	}

	@Override
	public void updateATM() {

		numberCard = this.atm.getNumberCard();
		for (CardInformation cardInformation : cardInformation) {
			if (cardInformation.getDataNumberCard().equals(numberCard)) {
				name = cardInformation.getName();

			}
		}

	}

	public String getName() {
		return name;
	}

	public SubjectATM getAtm() {
		return atm;
	}

	public ArrayList<CardInformation> getCardInformation() {
		return cardInformation;
	}


	
}
