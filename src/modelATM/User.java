package modelATM;

import service.CardService;

public class User implements ObserverATM {
	private String name, numberCard;
	private float money;
	private SubjectATM atm;

	public User(SubjectATM atm) throws Throwable {
		this.atm = atm;
		this.updateATM();

	}

	@Override
	public void updateATM() throws Throwable {
		numberCard = atm.getNumberCard();

		money = new CardService().getMoney(numberCard);
		name = new CardService().getName(numberCard);

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

}
