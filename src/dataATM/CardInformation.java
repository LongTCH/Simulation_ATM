package dataATM;

public class CardInformation {
protected String dataNumberCard;
protected String pin; 
protected String name; 
protected String numberIdentification;
protected String phone;
private float money;

public CardInformation(String dataNumberCard, String pin, String name, String numberIdentification, String phone,float money) {
	super();
	this.dataNumberCard = dataNumberCard;
	this.pin = pin;
	this.name = name;
	this.numberIdentification = numberIdentification;
	this.phone = phone;
	this.money = money;
}

public float getMoney() {
	return money;
}

public void setMoney(float money) {
	this.money = money;
}

public String getDataNumberCard() {
	return dataNumberCard;
}

public void setDataNumberCard(String dataNumberCard) {
	this.dataNumberCard = dataNumberCard;
}

public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumberIdentification() {
	return numberIdentification;
}
public void setNumberIdentification(String numberIdentification) {
	this.numberIdentification = numberIdentification;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}
