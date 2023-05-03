import controllerATM.ControllerLogin;
import modelATM.ATM;
import modelATM.Login;
import viewATM.ViewLogin;

public class App {
    public static void main(String[] args) throws Throwable {
        ViewLogin vLogin = new ViewLogin();
        vLogin.setVisible(true);

        ATM atm = new ATM();
        atm.setATM("45320000558");

        Login login = new Login(atm);
        //
        ControllerLogin cLogin = new ControllerLogin(vLogin, login);
    }
}
