package modelATM;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ATM implements SubjectATM {
	private List<ObserverATM> observer;
	private String numberCard;

	public ATM() {

		observer = new ArrayList<ObserverATM>();
	}

	@Override
	public void registerObserverATM(ObserverATM o) {
		observer.add(o);
	}

	@Override
	public void removeObserverATM(ObserverATM o) {
		observer.remove(o);
	}

	@Override
	public void notifyATM() {
		for (ObserverATM o : observer) {
			o.updateATM();

		}

	}

	public void setATM(String numberCard) {
		this.numberCard = numberCard;
		notifyATM();
	}

	public String getNumberCard() {
		return numberCard;
	}

	// định dạng tiền Việt Nam
	@Override
	public String formatMoney(float money) {

		Locale localeVN = new Locale("vi", "VN");
		NumberFormat vn = NumberFormat.getInstance(localeVN);

		String str2 = vn.format(money);
		return str2.toString();
	}

}
