package main;

import java.util.ArrayList;

import controllerATM.ControllerLogin;
import dataATM.CardInformation;
import modelATM.ATM;
import modelATM.Login;
import viewATM.ViewLogin;

public class mainATM {
	public static void main(String[] args) {
		CardInformation c = new CardInformation("45320000558", "000000", "Vũ Văn Minh", "13579", "09174041457",
				3000000);
		CardInformation c1 = new CardInformation("4532068889", "111111", "Triệu Huệ Mẫn", "57373", "0949575829",
				14000000);
		CardInformation c2 = new CardInformation("45320869555", "444444", "Nguyễn Thành Lộc", "45678", "098585858",
				5000000);
		ArrayList<CardInformation> card = new ArrayList<CardInformation>();
		card.add(c);
		card.add(c1);
		card.add(c2);

		ViewLogin vLogin = new ViewLogin();
		vLogin.setVisible(true);

		ATM atm = new ATM();
		atm.setATM("4532068889");

		Login login = new Login(atm, card);
//	
		ControllerLogin cLogin = new ControllerLogin(vLogin, login);
		
//	
	}
}
