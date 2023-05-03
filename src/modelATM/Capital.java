package modelATM;

import service.CardService;

public class Capital implements ObserverATM {
	private String numberCard;
	private SubjectATM atm;
	private String name;

	public Capital(SubjectATM atm) throws Throwable {
		this.atm = atm;
		atm.registerObserverATM(this);
		this.updateATM();
	}

	@Override
	public void updateATM() throws Throwable {

		numberCard = this.atm.getNumberCard();
		name = new CardService().getName(numberCard);

	}

	public String getName() {
		return name;
	}

	public SubjectATM getAtm() {
		return atm;
	}

}
