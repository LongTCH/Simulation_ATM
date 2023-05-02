package modelATM;

import dataATM.CardInformation;
import service.CardService;

public class ChangePIN implements ObserverATM {
	private SubjectATM atm;
	private String pin;
	private String numberCard;
	private Login login;

	public ChangePIN(SubjectATM atm) throws Throwable {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.updateATM();
		this.login = new Login(this.atm);

	}

	@Override
	public void updateATM() throws Throwable {
		this.numberCard = atm.getNumberCard();
		pin = new CardService().getPin(numberCard);
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

}
