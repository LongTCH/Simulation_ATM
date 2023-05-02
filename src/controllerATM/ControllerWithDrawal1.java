package controllerATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import modelATM.WithDrawal;
import viewATM.ViewWithDrawal;
import viewATM.ViewWithDrawal1;
import viewATM.ViewWithDrawal2;

public class ControllerWithDrawal1 {
	private ViewWithDrawal1 viewWithDrawal1;
	private WithDrawal withDrawal;
	private float withMoney;

	public ControllerWithDrawal1(ViewWithDrawal1 viewWithDrawal1, WithDrawal withDrawal) {
		this.viewWithDrawal1 = viewWithDrawal1;
		this.withDrawal = withDrawal;
		eventWithDrawal1();

	}

	public void eventWithDrawal1() {
		viewWithDrawal1.getBtnBackWithDrawal1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewWithDrawal vWD = new ViewWithDrawal();
				vWD.setVisible(true);
				ControllerWithDrawal c = new ControllerWithDrawal(vWD, withDrawal);
				viewWithDrawal1.dispose();

			}
		});
		viewWithDrawal1.getBtnWithDrawal1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// số tiền cần rút withMoney
				withMoney = Float.valueOf(viewWithDrawal1.getTextNumberMoney().getText());
				if (viewWithDrawal1.getTextNumberMoney().getText().length() != 0) {
					// Số tiền rút phải là bội của 50000
					if (withMoney % 50000 == 0) {
						// Số tiền rút phải nhỏ hơn 5tr VND
						if (withMoney <= 5000000) {
							// Số Tiền rút không được lớn hơn số tiền trong tk
							if (withMoney + withDrawal.getFee() < withDrawal.getMoney()) {
								// duy trì thẻ
								if (withDrawal.getMoney() > withMoney + withDrawal.getFee()
										+ withDrawal.getCardMaintenanceMoney()) {

									ViewWithDrawal2 v = new ViewWithDrawal2();
									v.setVisible(true);
									ControllerWithDrawal2 cWithDrawal2 = new ControllerWithDrawal2(v, withDrawal,
											withDrawal.withDrawalMoney(withMoney), withMoney);

									viewWithDrawal1.dispose();
								} else
									JOptionPane.showMessageDialog(viewWithDrawal1,
											"Quý khách vui lòng giữ lại 50.000 VND để duy trì thẻ");
							} else
								JOptionPane.showMessageDialog(viewWithDrawal1,
										"Số tiền trong tài khoản của bạn không đủ ");
						} else
							JOptionPane.showMessageDialog(viewWithDrawal1,
									"Số Tiền rút không được vượt quá 5.000.000 VNĐ");
					} else
						JOptionPane.showMessageDialog(viewWithDrawal1, "Số tiền rút phải là bội chung của 50000");
				} else
					JOptionPane.showMessageDialog(viewWithDrawal1, "Vui lòng nhập số tiền cần rút");
			}
		});
	}
}
