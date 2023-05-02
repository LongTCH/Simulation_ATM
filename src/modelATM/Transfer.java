package modelATM;

import java.util.ArrayList;

import dataATM.CardInformation;

public class Transfer implements ObserverATM {
	private WithDrawal withDrawal;
	private String numberCard, nameReceiver;
	private float money;
	private SubjectATM atm;
	private ArrayList<CardInformation> cardInformation;
	private float feeTransfer = 3500;

	public Transfer(SubjectATM atm, ArrayList<CardInformation> cardInformation) {
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

	// Số tiền còn lại sau khi chuyển
	public float transferMoney(float transferMoney, int people) {

		int remittersFee = 1;
		float resultMoney = 0;
		if (people == remittersFee) {

			resultMoney = this.money - (transferMoney + feeTransfer);
		} else {

			resultMoney = this.money - transferMoney;
		}
		return resultMoney;

	}

	// số tiền người nhận
	public float moneyReceiver(float transferMoney, String idCard, int people) {
		int receiverMoney = 0;
		float resultMoney = 0;

		for (CardInformation cardInformation2 : cardInformation) {
			if (cardInformation2.getDataNumberCard().equals(idCard)) {
				if (people == receiverMoney) {
					resultMoney = cardInformation2.getMoney() + (transferMoney - feeTransfer);
				} else
					resultMoney = cardInformation2.getMoney() + transferMoney;

			}

		}
		return resultMoney;
	}

	// set lại số tiền trong tk sau khi chuyển or nhận
	public void setMoney(float restMoney, String nCard) {

		withDrawal.setMoney(restMoney, nCard);
	}

	// kiểm tra stk người nhận hợp lệ hay kh ?
	// if có set lại

	public boolean checkNumberCardReceiver(String numberCardReceiver) {
		for (CardInformation cardInformation2 : cardInformation) {

			if (cardInformation2.getDataNumberCard().equals(numberCardReceiver)) {
				nameReceiver = cardInformation2.getName();
				return true;

			}
		}
		return false;
	}

	public float getMoney() {
		return money;
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

	public float getFeeTransfer() {
		return feeTransfer;
	}

	public String getNameReceiver() {
		return nameReceiver;
	}

}
