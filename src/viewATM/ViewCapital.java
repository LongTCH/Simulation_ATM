package viewATM;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ViewCapital extends JPanel {
	private JPanel btnTransfer, btnWithdrawal, btnAccount, btnRecharge, btnChangePin, btnBack;

	public ViewCapital() {
		// setSize(Static.getPanelScreenWeight, Static.getPanelScreenHeight);
		setSize(336, 245);
		setLayout(null);
		Font font = new Font("Times New Roman", Font.PLAIN, 18);
		JLabel t;
		btnWithdrawal = new JPanel();
		t = new JLabel("Rút Tiền");
		t.setFont(font);
		btnWithdrawal.setBackground(new Color(102, 205, 170));
		btnWithdrawal.setBounds(25, 143, 116, 40);
		btnWithdrawal.add(t);
		add(btnWithdrawal);

		btnTransfer = new JPanel();
		t = new JLabel("Chuyển khoản");
		t.setFont(font);
		btnTransfer.add(t);
		btnTransfer.setBackground(new Color(102, 205, 170));
		btnTransfer.setBounds(25, 194, 116, 40);
		add(btnTransfer);

		btnAccount = new JPanel();
		t = new JLabel("Tài khoản");
		t.setFont(font);
		btnAccount.add(t);
		btnAccount.setBackground(new Color(102, 205, 170));
		btnAccount.setBounds(25, 87, 116, 40);
		add(btnAccount);

		btnRecharge = new JPanel();
		t = new JLabel("Nạp Tiền");
		t.setHorizontalAlignment(SwingConstants.RIGHT);
		t.setFont(font);
		btnRecharge.add(t);
		btnRecharge.setBackground(new Color(102, 205, 170));
		btnRecharge.setBounds(192, 143, 116, 40);
		add(btnRecharge);

		btnChangePin = new JPanel();
		t = new JLabel("Đổi PIN");
		t.setHorizontalAlignment(SwingConstants.RIGHT);
		t.setFont(font);
		btnChangePin.add(t);
		btnChangePin.setBackground(new Color(102, 205, 170));
		btnChangePin.setBounds(192, 87, 116, 40);
		add(btnChangePin);

		btnBack = new JPanel();
		t = new JLabel("Quay Lại");
		t.setHorizontalAlignment(SwingConstants.RIGHT);
		t.setFont(font);
		btnBack.add(t);
		btnBack.setBackground(new Color(102, 205, 170));
		btnBack.setBounds(192, 194, 116, 40);
		add(btnBack);
	}
}
