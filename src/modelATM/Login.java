package modelATM;

import service.CardService;

public class Login implements ObserverATM {
	private String numberCard;
	private SubjectATM atm;
	private String pin;

	public Login(SubjectATM atm) throws Throwable {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.updateATM();

	}

	public SubjectATM getAtm() {
		return atm;
	}

	@Override
	public void updateATM() throws Throwable {

		numberCard = this.atm.getNumberCard();
		pin = new CardService().getPin(numberCard);
	}

	// Kiểm tra xem mã PIN có hợp lệ hay không
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
