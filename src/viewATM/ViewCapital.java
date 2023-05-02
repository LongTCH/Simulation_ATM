package viewATM;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;

public class ViewCapital extends JFrame {

	private JPanel contentPane, panelUser, panelCapital;
	private JLabel lblLogoCard, lblUser;
	private JTextPane txtpnUser;
	private JButton btnTransfer, btnWithdrawal, btnAccount, btnRecharge, btnChangePin, btnBack;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCapital frame = new ViewCapital();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewCapital() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\picture\\logoKienLong.png"));

		setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(500, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelUser = new JPanel();
		panelUser.setBackground(new Color(0, 128, 128));
		panelUser.setBounds(0, 0, 484, 130);
		contentPane.add(panelUser);
		panelUser.setLayout(null);

		lblLogoCard = new JLabel("");
		lblLogoCard.setIcon(new ImageIcon("src\\picture\\card0.png"));
		lblLogoCard.setBounds(0, 0, 90, 50);
		panelUser.add(lblLogoCard);

		lblUser = new JLabel("");
		lblUser.setIcon(new ImageIcon("src\\picture\\users.png"));
		lblUser.setBounds(217, 0, 50, 50);
		panelUser.add(lblUser);

		txtpnUser = new JTextPane();
		txtpnUser.setEnabled(false);
		txtpnUser.setText("\r\n");
		txtpnUser.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtpnUser.setForeground(Color.WHITE);
		txtpnUser.setBackground(new Color(0, 128, 128));
		txtpnUser.setBounds(166, 61, 150, 49);
		panelUser.add(txtpnUser);

		panelCapital = new JPanel();
		panelCapital.setBackground(new Color(224, 255, 255));
		panelCapital.setBounds(0, 129, 484, 282);
		contentPane.add(panelCapital);
		panelCapital.setLayout(null);

		btnWithdrawal = new JButton("        Rút Tiền   ");
		btnWithdrawal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnWithdrawal.setBackground(new Color(102, 205, 170));
		btnWithdrawal.setIcon(new ImageIcon("src\\picture\\RutTien.png"));
		btnWithdrawal.setBounds(40, 120, 160, 40);
		panelCapital.add(btnWithdrawal);

		btnTransfer = new JButton(" Chuyển khoản");
		btnTransfer.setIcon(new ImageIcon("src\\picture\\ChuyenKhoan.png"));
		btnTransfer.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnTransfer.setBackground(new Color(102, 205, 170));
		btnTransfer.setBounds(40, 200, 160, 40);
		panelCapital.add(btnTransfer);

		btnAccount = new JButton("       Tài khoản  ");
		btnAccount.setIcon(new ImageIcon("src\\picture\\User1.png"));
		btnAccount.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnAccount.setBackground(new Color(102, 205, 170));
		btnAccount.setBounds(40, 40, 160, 40);
		panelCapital.add(btnAccount);

		btnRecharge = new JButton("    Nạp Tiền  ");
		btnRecharge.setIcon(new ImageIcon("src\\picture\\NapTien.png"));
		btnRecharge.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnRecharge.setBackground(new Color(102, 205, 170));
		btnRecharge.setBounds(284, 120, 160, 40);
		panelCapital.add(btnRecharge);

		btnChangePin = new JButton("     Đổi PIN   ");
		btnChangePin.setIcon(new ImageIcon("src\\picture\\PIN.png"));
		btnChangePin.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnChangePin.setBackground(new Color(102, 205, 170));
		btnChangePin.setBounds(284, 40, 160, 40);
		panelCapital.add(btnChangePin);

		btnBack = new JButton("     Quay Lại  ");
		btnBack.setIcon(new ImageIcon("src\\picture\\back.png"));
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnBack.setBackground(new Color(102, 205, 170));
		btnBack.setBounds(284, 200, 160, 40);
		panelCapital.add(btnBack);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanelUser() {
		return panelUser;
	}

	public JPanel getPanelCapital() {
		return panelCapital;
	}

	public JLabel getLblLogoCard() {
		return lblLogoCard;
	}

	public JLabel getLblUser() {
		return lblUser;
	}

	public JTextPane getTxtpnUser() {
		return txtpnUser;
	}

	public JButton getBtnTransfer() {
		return btnTransfer;
	}

	public JButton getBtnWithdrawal() {
		return btnWithdrawal;
	}

	public JButton getBtnAccount() {
		return btnAccount;
	}

	public JButton getBtnRecharge() {
		return btnRecharge;
	}

	public JButton getBtnChangePin() {
		return btnChangePin;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

}
