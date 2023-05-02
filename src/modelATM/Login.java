package modelATM;

import java.util.ArrayList;
import java.util.List;

import dataATM.CardInformation;

public class Login implements ObserverATM {
	private String numberCard;
	private SubjectATM atm;
	private ArrayList<CardInformation> cardInformation;
	private String pin;

	public Login(SubjectATM atm, ArrayList<CardInformation> cardInformation) {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.cardInformation = cardInformation;
		cardInformation = new ArrayList<CardInformation>();
		this.updateATM();
		

	}

	public SubjectATM getAtm() {
		return atm;
	}

	public ArrayList<CardInformation> getCardInformation() {
		return cardInformation;
	}

	@Override
	public void updateATM() {

		numberCard = this.atm.getNumberCard();
		for (CardInformation cardInformation : cardInformation) {
			if (cardInformation.getDataNumberCard().equals(numberCard)) {
				pin = cardInformation.getPin();

			}
		}

	}

	//Kiểm tra xem mã PIN có hợp lệ hay không
	public boolean checkPin(String textPin) {
		boolean checkPin = false;
		if (textPin.equals(pin)) {
			checkPin = true;

		}

		return checkPin;

	}
	

	public String getPin() {
		return pin;
	}

	public String getNumberC() {
		return numberCard;
	}

}
