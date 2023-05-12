import controllerATM.ControllerLayout;
import modelATM.ATM;
import viewATM.ViewLayout;

public class App {
    public static void main(String[] args) throws Throwable {
        ViewLayout vLayout = new ViewLayout();
        vLayout.setVisible(true);
        ATM atm = new ATM();
        atm.setATM("8500772003");
        new ControllerLayout(vLayout, atm);
    }
}
