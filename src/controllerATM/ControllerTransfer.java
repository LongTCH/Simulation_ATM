package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JOptionPane;

import modelATM.Capital;
import modelATM.Login;
import modelATM.Transfer;
import viewATM.ViewCapital;
import viewATM.ViewLogin;
import viewATM.ViewTransfer;
import viewATM.ViewTransfer1;
import viewATM.ViewYesNo;

public class ControllerTransfer {
	private ViewTransfer viewTransfer;
	private Transfer transfer;
	private ViewTransfer1 viewTransfer1;
	private int people = 1;
	private float transferMoney, restMoneyTransfer, restMoneyReceier;
	private ViewYesNo viewTransfer3;
	private ControllerLayout controllerLayout;

	public ControllerTransfer(ViewTransfer viewTransfer, Transfer recharge, ControllerLayout controllerLayout) {
		super();
		this.viewTransfer = viewTransfer;
		this.transfer = recharge;
		this.controllerLayout = controllerLayout;
		eventTransfer();
	}

	public void eventTransfer() {
		viewTransfer.getLblRemittersCard().setText(transfer.getNumberCard());
		viewTransfer.getLblRemittersMoney().setText(transfer.getAtm().formatMoney(transfer.getMoney()));
		viewTransfer.getBtnBack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewCapital vCapital = new ViewCapital();
				vCapital.setVisible(true);

				Capital capital;
				try {
					capital = new Capital(transfer.getAtm());
					ControllerCapital cCapital = new ControllerCapital(vCapital, capital, controllerLayout);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				viewTransfer.dispose();
			}
		});
		viewTransfer.getBtnReceiver().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				viewTransfer1 = new ViewTransfer1();
				viewTransfer1.setVisible(true);
				viewTransfer1.getBtnOK().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							if (transfer.checkNumberCardReceiver(viewTransfer1.getTextReceiverSTK().getText())) {
								// set lại tên người thụ hưởng
								viewTransfer.getLblReceiverName().setText(transfer.getNameReceiver());
								// set lại stk người thụ hưởng
								viewTransfer.getLblReceiverCard().setText(viewTransfer1.getTextReceiverSTK().getText());
								viewTransfer.getBtnReceiver().setVisible(false);
								viewTransfer.getLblReceiverCard().setVisible(true);
								viewTransfer.getLblReceiverName().setVisible(true);
								viewTransfer1.dispose();

							} else
								JOptionPane.showMessageDialog(viewTransfer1,
										"Số Tài Khoản không hợp lệ ! " + "\n" + "Quý khách vui lòng nhập lại.");
						} catch (Throwable e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}
				});
			}
		});
		viewTransfer.getRdbtnReceiver().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewTransfer.getRdbtnRemitters().setSelected(false);
				people = 0;

			}
		});
		viewTransfer.getRdbtnRemitters().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewTransfer.getRdbtnReceiver().setSelected(false);
				people = 1;

			}
		});
		viewTransfer.getTextPaneContent().addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (viewTransfer.getTextPaneContent().getText().length() == 0) {
					viewTransfer.getTextPaneContent().setText("Chuyển Tiền");
				}

			}

			@Override
			public void focusGained(FocusEvent e) {

				viewTransfer.getTextPaneContent().setText("");
			}
		});
		viewTransfer.getBtnTransfer().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (viewTransfer.getLblReceiverName().getText().length() != 0) {

					if (viewTransfer.getTextTransferMoney().getText().length() != 0) {
						if (Float.valueOf(viewTransfer.getTextTransferMoney().getText()) >= 30000) {

							if (Float.valueOf(viewTransfer.getTextTransferMoney().getText()) <= 30000000) {
								if (transfer.getMoney() > Float
										.valueOf(viewTransfer.getTextTransferMoney().getText())) {
									if (transfer.getMoney() > Float
											.valueOf(viewTransfer.getTextTransferMoney().getText()) + 50000) {

										eventTransfer3();
									} else
										JOptionPane.showMessageDialog(viewTransfer,
												"Bạn phải giữu 50.000 VND để duy trì thẻ");
								} else
									JOptionPane.showMessageDialog(viewTransfer,
											"Số tiền trong tài khoản bạn không đủ ");
							} else
								JOptionPane.showMessageDialog(viewTransfer,
										"Số tiền chuyển không được vượt quá 30.000.000 VND");
						} else
							JOptionPane.showMessageDialog(viewTransfer, "Số tiền chuyển phải lớn hơn 30000 VND");
					} else
						JOptionPane.showMessageDialog(viewTransfer, "Quý khách vui lòng nhập số tiền cần chuyển");
				} else
					JOptionPane.showMessageDialog(viewTransfer, "Quý Khách vui lòng chọn người thụ hưởng");
			}

		});

	}

	public void eventTransfer3() {
		transferMoney = Float.valueOf(viewTransfer.getTextTransferMoney().getText());

		viewTransfer3 = new ViewYesNo();
		viewTransfer3.setVisible(true);

		viewTransfer3.getBtnYes().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {// số tiền còn lại của người chuyển
					restMoneyTransfer = transfer.transferMoney(transferMoney, people);
					// số tiền sau khi nhận của người nhận
					restMoneyReceier = transfer.moneyReceiver(transferMoney,
							viewTransfer1.getTextReceiverSTK().getText(),
							people);
					// set lại số tiền trong tk của người nhận sau khi nhận tiền
					transfer.setMoney(restMoneyReceier, viewTransfer1.getTextReceiverSTK().getText());
					// set lại số tiền trong tài khoản sau khi chuyển của người chuyển
					transfer.setMoney(restMoneyTransfer, transfer.getNumberCard());
					viewTransfer.dispose();
					JOptionPane.showMessageDialog(viewTransfer3,
							"Bạn đã chuyển thành công cho " + transfer.getNameReceiver() + "\n" + "Số Tiền là : "
									+ transfer.getAtm().formatMoney(transferMoney) + " VNĐ từ tài khoản của bạn" + "\n"
									+ "Với Nội Dung là : " + viewTransfer.getTextPaneContent().getText());

					ViewLogin vLogin = new ViewLogin();
					vLogin.setVisible(true);
					Login lo;

					lo = new Login(transfer.getAtm());
					ControllerLogin cl = new ControllerLogin(vLogin, lo, controllerLayout);
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		viewTransfer3.getBtnNo().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
}
