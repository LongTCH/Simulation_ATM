package modelATM;

public interface SubjectATM {

	public void registerObserverATM(ObserverATM o);

	public void removeObserverATM(ObserverATM o);

	public void notifyATM() throws Throwable;

	public String getNumberCard();

	public String formatMoney(float money);

}
