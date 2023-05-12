package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import modelATM.ATM;
import viewATM.ViewLayout;

public class ControllerLayout {
    private ViewLayout viewLayout;
    private ATM atm;

    public ControllerLayout(ViewLayout viewLayout, ATM atm) {
        this.viewLayout = viewLayout;
        this.atm = atm;
        viewLayout.getCard().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                try {
                    viewLayout.insertCard(atm);
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        });
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == viewLayout.getBtnOne()) {
                    viewLayout.getPanelScreen().actionOnBtnOne();
                } else if (e.getSource() == viewLayout.getBtnTwo()) {
                    viewLayout.getPanelScreen().actionOnBtnTwo();
                } else if (e.getSource() == viewLayout.getBtnThree()) {
                    viewLayout.getPanelScreen().actionOnBtnThree();
                } else if (e.getSource() == viewLayout.getBtnFour()) {
                    viewLayout.getPanelScreen().actionOnBtnFour();
                } else if (e.getSource() == viewLayout.getBtnFive()) {
                    viewLayout.getPanelScreen().actionOnBtnFive();
                } else if (e.getSource() == viewLayout.getBtnSix()) {
                    viewLayout.getPanelScreen().actionOnBtnSix();
                } else if (e.getSource() == viewLayout.getBtnSeven()) {
                    viewLayout.getPanelScreen().actionOnBtnSeven();
                } else if (e.getSource() == viewLayout.getBtnEight()) {
                    viewLayout.getPanelScreen().actionOnBtnEight();
                } else if (e.getSource() == viewLayout.getBtnNine()) {
                    viewLayout.getPanelScreen().actionOnBtnNine();
                } else if (e.getSource() == viewLayout.getBtnZero()) {
                    viewLayout.getPanelScreen().actionOnBtnZero();
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
    }
}
