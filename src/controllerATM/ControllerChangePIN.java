package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.w3c.dom.Text;

import modelATM.Capital;
import modelATM.ChangePIN;
import modelATM.Login;
import viewATM.ViewCapital;
import viewATM.ViewChangePIN;
import viewATM.ViewLogin;

public class ControllerChangePIN extends ControllerScreen{
	private ViewChangePIN viewChangePIN;
	private ChangePIN changePIN;
	private ControllerLayout controllerLayout;
	private int guard = 0;

	public ControllerChangePIN(ViewChangePIN viewChangePIN, ChangePIN changePIN, ControllerLayout controllerLayout) {
		this.viewChangePIN = viewChangePIN;
		this.changePIN = changePIN;
		this.controllerLayout = controllerLayout;
		
	}
	
	
	private void doChangeText(String c) {
		if (guard == 0 && viewChangePIN.getAncientPIN().getText().length()<6) {
			viewChangePIN.getAncientPIN().setText(viewChangePIN.getAncientPIN().getText() + c);
		}
		if(guard == 1 && viewChangePIN.getNewPIN().getText().length()<6){
			viewChangePIN.getNewPIN().setText(viewChangePIN.getNewPIN().getText() + c);}

		if (guard == 2 && viewChangePIN.getNewPIN1().getText().length()<6) {

			viewChangePIN.getNewPIN1().setText(viewChangePIN.getNewPIN1().getText() + c);
		}


	}

	@Override
	public void actionOnBtnOne() {
		doChangeText("1");
	}

	@Override
	public void actionOnBtnTwo() {
		doChangeText("2");
	}

	@Override
	public void actionOnBtnThree() {
		doChangeText("3");
	}

	@Override
	public void actionOnBtnFour() {
		doChangeText("4");
	}

	@Override
	public void actionOnBtnFive() {
		doChangeText("5");
	}

	@Override
	public void actionOnBtnSix() {
		doChangeText("6");
	}

	@Override
	public void actionOnBtnSeven() {
		doChangeText("7");
	}

	@Override
	public void actionOnBtnEight() {
		doChangeText("8");
	}

	@Override
	public void actionOnBtnNine() {
		doChangeText("9");
	}

	@Override
	public void actionOnBtnZero() {
		doChangeText("0");
	}

	@Override
	public void actionOnBtnEnter() {
		if (changePIN()) {
			doChangePIN();
		}
	}

	@Override
	public void actionOnBtnClear() {
		viewChangePIN.getAncientPIN().setText("");
		viewChangePIN.getNewPIN().setText("");
		viewChangePIN.getNewPIN1().setText("");
		guard = 0;
		viewChangePIN.getlbchangePIN()
				.setText(" ");

	}

	@Override
	public void actionOnBtnCancel() {
		controllerLayout.endTransaction();
	}
	@Override
	public void actionOnBtnLeftBot() {
		try {
			ViewCapital vCapital = new ViewCapital();
			controllerLayout.setPanelScreen(vCapital);
			Capital capital = new Capital(changePIN.getAtm());
			controllerLayout.setControllerScreen(new ControllerCapital(vCapital, capital, controllerLayout));
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void actionOnBtnRightBot() {
		guard = (guard + 1) % 3;
		
	}
	private boolean changePIN() {
		if (changePIN.checkNumberPIN(viewChangePIN.getAncientPIN().getText())
				&& changePIN.checkNumberPIN(viewChangePIN.getNewPIN().getText())
				&& changePIN.checkNumberPIN(viewChangePIN.getNewPIN1().getText())) {

			if (viewChangePIN.getAncientPIN().getText().length() == 6
					&& viewChangePIN.getNewPIN().getText().length() == 6) {
				if (changePIN.checkPIN(viewChangePIN.getAncientPIN().getText())) {
					if (viewChangePIN.getNewPIN().getText().equals(viewChangePIN.getNewPIN1().getText())) {
						try {
							changePIN.setPIN(viewChangePIN.getNewPIN().getText());
						} catch (Throwable e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						viewChangePIN.getlbchangePIN()
								.setText("Mã PIN của bạn đã được đổi thành công");

						viewChangePIN.getAncientPIN().setText("");
						viewChangePIN.getNewPIN().setText("");
						viewChangePIN.getNewPIN1().setText("");
						ViewLogin vLogin = new ViewLogin();
						vLogin.setVisible(true);
						Login lo;
						try {
							lo = new Login(changePIN.getAtm());
							ControllerLogin cl = new ControllerLogin(vLogin, lo, controllerLayout);
						} catch (Throwable e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					} else
						viewChangePIN.getlbchangePIN()
								.setText("Mã PIN mới Không trùng nhau. ");
				
				} else
					viewChangePIN.getlbchangePIN()
							.setText("Mã Pin cũ không đúng quý khách vui lòng nhập lại");
			

			} else
				viewChangePIN.getlbchangePIN()
						.setText("Quý khách vui lòng nhập mã pin gồm 6 số ");
				

		} else
			viewChangePIN.getlbchangePIN()
					.setText("Vui lòng nhập đủ mã PIN");
	
		

		return false;
	}
	
	private void doChangePIN() {
		ViewChangePIN viewChangePIN = new ViewChangePIN();

		controllerLayout.setPanelScreen(viewChangePIN);
		controllerLayout.setControllerScreen(new ControllerChangePIN(viewChangePIN, changePIN, controllerLayout));
	}

	// public void eventChangePIN() {

	// 	viewChangePIN.getBtnBackPIN().addActionListener(new ActionListener() {

	// 		@Override
	// 		public void actionPerformed(ActionEvent e) {
	// 			ViewCapital vCapital = new ViewCapital();
	// 			vCapital.setVisible(true);

	// 			Capital capital;
	// 			try {
	// 				capital = new Capital(changePIN.getAtm());
	// 				ControllerCapital cCapital = new ControllerCapital(vCapital, capital, controllerLayout);
	// 			} catch (Throwable e1) {
	// 				// TODO Auto-generated catch block
	// 				e1.printStackTrace();
	// 			}

	// 		}
	// 	});
		//viewChangePIN.getBtnChangePIN().addActionListener(new ActionListener() {

	//		@Override
	// 		public void actionPerformed(ActionEvent e) {
	// 			if (changePIN.checkNumberPIN(viewChangePIN.getAncientPIN().getText())
	// 					&& changePIN.checkNumberPIN(viewChangePIN.getNewPIN().getText())
	// 					&& changePIN.checkNumberPIN(viewChangePIN.getNewPIN1().getText())) {

	// 				if (viewChangePIN.getAncientPIN().getText().length() == 6
	// 						&& viewChangePIN.getNewPIN().getText().length() == 6) {
	// 					if (changePIN.checkPIN(viewChangePIN.getAncientPIN().getText())) {
	// 						if (viewChangePIN.getNewPIN().getText().equals(viewChangePIN.getNewPIN1().getText())) {
	// 							try {
	// 								changePIN.setPIN(viewChangePIN.getNewPIN().getText());
	// 							} catch (Throwable e1) {
	// 								// TODO Auto-generated catch block
	// 								e1.printStackTrace();
	// 							}
	// 							viewChangePIN.getlbchangePIN()
	// 									.setText("Mã PIN của bạn đã được đổi thành công");

	// 							viewChangePIN.getAncientPIN().setText("");
	// 							viewChangePIN.getNewPIN().setText("");
	// 							viewChangePIN.getNewPIN1().setText("");
	// 							ViewLogin vLogin = new ViewLogin();
	// 							vLogin.setVisible(true);
	// 							Login lo;
	// 							try {
	// 								lo = new Login(changePIN.getAtm());
	// 								ControllerLogin cl = new ControllerLogin(vLogin, lo, controllerLayout);
	// 							} catch (Throwable e1) {
	// 								// TODO Auto-generated catch block
	// 								e1.printStackTrace();
	// 							}

	// 						} else
	// 							viewChangePIN.getlbchangePIN()
	// 									.setText("Mã PIN mới Không trùng nhau. Quý khách vui lòng nhập lại");

	// 					} else
	// 						viewChangePIN.getlbchangePIN()
	// 								.setText("Mã Pin cũ không đúng quý khách vui lòng nhập lại");

	// 				} else
	// 					viewChangePIN.getlbchangePIN()
	// 							.setText("Quý khách vui lòng nhập mã pin gồm 6 số ");

	// 			} else
	// 				viewChangePIN.getlbchangePIN()
	// 						.setText("Mã PIN phải là số");

	// 		}

	// 	});

	// }
	
	
}
