package modelATM;

import java.util.ArrayList;

import dataATM.CardInformation;

public class ChangePIN implements ObserverATM {
	private SubjectATM atm;
	private ArrayList<CardInformation> cardInformation;
	private String pin;
	private String numberCard;
	private Login login;

	public ChangePIN(SubjectATM atm, ArrayList<CardInformation> cardInformation) {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.cardInformation = cardInformation;
		cardInformation = new ArrayList<CardInformation>();
		this.updateATM();
		this.login = new Login(this.atm, this.cardInformation);

	}

	@Override
	public void updateATM() {
		this.numberCard = atm.getNumberCard();
		for (CardInformation cardInformation2 : cardInformation) {
			if (cardInformation2.getDataNumberCard().equals(numberCard)) {
				pin = cardInformation2.getPin();
			}
		}
	}

	public boolean checkPIN(String textPin) {

		return login.checkPin(textPin);
	}

	// set lại mã PIN mới
	public void setPIN(String newPIN) {
		for (CardInformation cardInformation2 : cardInformation) {
			if (cardInformation2.getPin().equals(pin)) {
				cardInformation2.setPin(newPIN);

			}
		}
	}

	// Kiểm tra mã PIN có đúng định dạng số hay không
	public boolean checkNumberPIN(String text) {
		try {
			Double.parseDouble(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public SubjectATM getAtm() {
		return atm;
	}

	public ArrayList<CardInformation> getCardInformation() {
		return cardInformation;
	}

}
