package viewATM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewChangePIN extends JPanel {

	private JPasswordField ancientPIN, newPIN, newPIN1;
	private JLabel lblAncientPIN, lblNewPIN, lblNewPIN1;
	private JTextPane txtpnChangePIN;
	private JButton btnChangePIN;
	private JButton btnBackPIN;
	private JLabel lbchangePIN;

	public ViewChangePIN() {
		setSize(183, 26);
		setLayout(null);

		setBorder(new LineBorder(new Color(0, 128, 128), 0));
		setBounds(0, 0, 337, 31);
		setBackground(new Color(176, 224, 230));
		setLayout(null);

		setBackground(new Color(255, 255, 255));
		setBounds(0, 32, 337, 245);

		setLayout(null);

		lblAncientPIN = new JLabel("    Mã PIN cũ");
		lblAncientPIN.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAncientPIN.setBounds(81, 37, 80, 20);
		add(lblAncientPIN);

		ancientPIN = new JPasswordField();
		ancientPIN.setEditable(false);
		ancientPIN.setBounds(171, 37, 80, 20);
		add(ancientPIN);

		lblNewPIN = new JLabel("    Mã PIN mới");
		lblNewPIN.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewPIN.setBounds(81, 76, 80, 20);
		add(lblNewPIN);

		newPIN = new JPasswordField();
		newPIN.setEditable(false);
		newPIN.setBounds(171, 76, 80, 20);
		add(newPIN);

		txtpnChangePIN = new JTextPane();
		txtpnChangePIN.setEditable(false);
		txtpnChangePIN.setText("Lưu ý : Mã PIN phải gồm 6 số\r\n");
		txtpnChangePIN.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtpnChangePIN.setBackground(new Color(211, 211, 211));
		txtpnChangePIN.setBounds(81, 138, 174, 30);
		add(txtpnChangePIN);

		lblNewPIN1 = new JLabel("    Mã PIN mới");
		lblNewPIN1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewPIN1.setBounds(81, 107, 80, 20);
		add(lblNewPIN1);

		newPIN1 = new JPasswordField();
		newPIN1.setEditable(false);
		newPIN1.setBounds(171, 107, 80, 20);
		add(newPIN1);

		btnChangePIN = new JButton("Tiếp tục");
		btnChangePIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChangePIN.setBounds(238, 198, 89, 23);
		add(btnChangePIN);

		btnBackPIN = new JButton("Quay lại");
		btnBackPIN.setBounds(23, 198, 89, 23);
		add(btnBackPIN);

		lbchangePIN = new JLabel("");
		lbchangePIN.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbchangePIN.setBounds(23, 179, 290, 14);
		add(lbchangePIN);

		JLabel lblDMP = new JLabel("Đổi mã PIN");
		lblDMP.setForeground(new Color(0, 128, 192));
		lblDMP.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDMP.setBounds(108, 12, 119, 14);
		add(lblDMP);
	}

	public JLabel getlbchangePIN() {
		return lbchangePIN;
	}

	public JPasswordField getAncientPIN() {
		return ancientPIN;
	}

	public JPasswordField getNewPIN() {
		return newPIN;
	}

	public JLabel getLblAncientPIN() {
		return lblAncientPIN;
	}

	public JLabel getLblNewPIN() {
		return lblNewPIN;
	}

	public JButton getBtnChangePIN() {
		return btnChangePIN;
	}

	public JTextPane getTxtpnChangePIN() {
		return txtpnChangePIN;
	}

	public JPasswordField getNewPIN1() {
		return newPIN1;
	}

	public JLabel getLblNewPIN1() {
		return lblNewPIN1;
	}

	public JButton getBtnBackPIN() {
		return btnBackPIN;
	}
}
