package viewATM;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ViewCapital extends JPanel {
	private JButton btnTransfer, btnWithdrawal, btnAccount, btnRecharge, btnChangePin, btnBack;

	public ViewCapital() {
		// setSize(Static.getPanelScreenWeight, Static.getPanelScreenHeight);
		setSize(336, 245);
		setLayout(null);
		Font font = new Font("Times New Roman", Font.PLAIN, 18);
		btnWithdrawal = new JButton("Rút Tiền");
		btnWithdrawal.setBackground(new Color(102, 205, 170));
		btnWithdrawal.setBounds(25, 143, 116, 40);
		add(btnWithdrawal);

		btnTransfer = new JButton("Chuyển tiền");
		btnTransfer.setBackground(new Color(102, 205, 170));
		btnTransfer.setBounds(25, 194, 116, 40);
		add(btnTransfer);

		btnAccount = new JButton("Tài khoản");
		btnAccount.setBackground(new Color(102, 205, 170));
		btnAccount.setBounds(25, 87, 116, 40);
		add(btnAccount);

		btnRecharge = new JButton("Nạp Tiền");
		btnRecharge.setBackground(new Color(102, 205, 170));
		btnRecharge.setBounds(192, 143, 116, 40);
		add(btnRecharge);

		btnChangePin = new JButton("Đổi PIN");
		btnChangePin.setBackground(new Color(102, 205, 170));
		btnChangePin.setBounds(192, 87, 116, 40);
		add(btnChangePin);

		btnBack = new JButton("Hủy giao dịch");
		btnBack.setBackground(new Color(102, 205, 170));
		btnBack.setBounds(192, 194, 116, 40);
		add(btnBack);
	}
}
