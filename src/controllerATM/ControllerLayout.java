package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import modelATM.ATM;
import modelATM.Login;
import viewATM.Static;
import viewATM.ViewIdle;
import viewATM.ViewLayout;
import viewATM.ViewLogin;

public class ControllerLayout {
    private ViewLayout viewLayout;
    private ATM atm;

    public ViewLayout getViewLayout() {
        return viewLayout;
    }

    public ControllerLayout(ViewLayout viewLayout, ATM atm) {
        this.viewLayout = viewLayout;
        this.atm = atm;
        setPanelScreen(new ViewIdle());
        viewLayout.getCard().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                try {
                    insertCard(atm);
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        });
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (viewLayout.getControllerScreen() == null)
                    return;
                if (e.getSource() == viewLayout.getBtnOne()) {
                    viewLayout.getControllerScreen().actionOnBtnOne();
                } else if (e.getSource() == viewLayout.getBtnTwo()) {
                    viewLayout.getControllerScreen().actionOnBtnTwo();
                } else if (e.getSource() == viewLayout.getBtnThree()) {
                    viewLayout.getControllerScreen().actionOnBtnThree();
                } else if (e.getSource() == viewLayout.getBtnFour()) {
                    viewLayout.getControllerScreen().actionOnBtnFour();
                } else if (e.getSource() == viewLayout.getBtnFive()) {
                    viewLayout.getControllerScreen().actionOnBtnFive();
                } else if (e.getSource() == viewLayout.getBtnSix()) {
                    viewLayout.getControllerScreen().actionOnBtnSix();
                } else if (e.getSource() == viewLayout.getBtnSeven()) {
                    viewLayout.getControllerScreen().actionOnBtnSeven();
                } else if (e.getSource() == viewLayout.getBtnEight()) {
                    viewLayout.getControllerScreen().actionOnBtnEight();
                } else if (e.getSource() == viewLayout.getBtnNine()) {
                    viewLayout.getControllerScreen().actionOnBtnNine();
                } else if (e.getSource() == viewLayout.getBtnZero()) {
                    viewLayout.getControllerScreen().actionOnBtnZero();
                } else if (e.getSource() == viewLayout.getBtnEnter()) {
                    viewLayout.getControllerScreen().actionOnBtnEnter();
                } else if (e.getSource() == viewLayout.getBtnClear()) {
                    viewLayout.getControllerScreen().actionOnBtnClear();
                } else if (e.getSource() == viewLayout.getBtnCancel()) {
                    viewLayout.getControllerScreen().actionOnBtnCancel();
                } else if (e.getSource() == viewLayout.getBtnLeftTop()) {
                    viewLayout.getControllerScreen().actionOnBtnLeftTop();
                } else if (e.getSource() == viewLayout.getBtnLeftMid()) {
                    viewLayout.getControllerScreen().actionOnBtnLeftMid();
                } else if (e.getSource() == viewLayout.getBtnLeftBot()) {
                    viewLayout.getControllerScreen().actionOnBtnLeftBot();
                } else if (e.getSource() == viewLayout.getBtnRightTop()) {
                    viewLayout.getControllerScreen().actionOnBtnRightTop();
                } else if (e.getSource() == viewLayout.getBtnRightMid()) {
                    viewLayout.getControllerScreen().actionOnBtnRightMid();
                } else if (e.getSource() == viewLayout.getBtnRightBot()) {
                    viewLayout.getControllerScreen().actionOnBtnRightBot();
                }
            }
        };
        viewLayout.getBtnOne().addActionListener(actionListener);
        viewLayout.getBtnTwo().addActionListener(actionListener);
        viewLayout.getBtnThree().addActionListener(actionListener);
        viewLayout.getBtnFour().addActionListener(actionListener);
        viewLayout.getBtnFive().addActionListener(actionListener);
        viewLayout.getBtnSix().addActionListener(actionListener);
        viewLayout.getBtnSeven().addActionListener(actionListener);
        viewLayout.getBtnEight().addActionListener(actionListener);
        viewLayout.getBtnNine().addActionListener(actionListener);
        viewLayout.getBtnZero().addActionListener(actionListener);
        viewLayout.getBtnEnter().addActionListener(actionListener);
        viewLayout.getBtnClear().addActionListener(actionListener);
        viewLayout.getBtnCancel().addActionListener(actionListener);
        viewLayout.getBtnLeftTop().addActionListener(actionListener);
        viewLayout.getBtnLeftMid().addActionListener(actionListener);
        viewLayout.getBtnLeftBot().addActionListener(actionListener);
        viewLayout.getBtnRightTop().addActionListener(actionListener);
        viewLayout.getBtnRightMid().addActionListener(actionListener);
        viewLayout.getBtnRightBot().addActionListener(actionListener);
    }

    public void insertCard(ATM atm) throws Throwable {
        viewLayout.getCard().moveToTarget(viewLayout.getSlot().getX() + 7, viewLayout.getSlot().getY() + 10);
        Login login = new Login(atm);
        ViewLogin viewLogin = new ViewLogin();
        viewLogin.setLogin(login);
        setPanelScreen(viewLogin);
        viewLayout.setControllerScreen(new ControllerLogin(viewLogin, login, this));
        viewLayout.getTextSTK().setText(atm.getNumberCard());
    }

    public void setPanelScreen(JPanel panel) {
        viewLayout.getPanelScreen().removeAll();
        panel.setBounds(10, 10, Static.getPanelScreenWeight, Static.getPanelScreenHeight);
        panel.setVisible(true);
        viewLayout.getPanelScreen().add(panel);
        viewLayout.repaint();
        viewLayout.revalidate();
    }
}
