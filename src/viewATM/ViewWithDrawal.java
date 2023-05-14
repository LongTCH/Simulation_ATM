package viewATM;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ViewWithDrawal extends JPanel {

	private JPanel panel1;
	private JLabel lblNumberCardWithDrawal, lblWithDrawal, lblText;
	private JButton btn100, btn200, btn500, btn1000, btnCancelWithDrawal, btnOther;
	private JTextField txtMoney;
	private JLabel lblError;

	public JLabel getLblError() {
		return lblError;
	}

	public JTextField getTxtMoney() {
		return txtMoney;
	}

	public ViewWithDrawal() {
		setSize(336, 245);
		setLayout(null);
		panel1 = new JPanel();
		panel1.setBackground(new Color(176, 224, 230));

		panel1.setBounds(0, 0, 336, 34);
		add(panel1);
		panel1.setLayout(null);

		lblWithDrawal = new JLabel("Rút Tiền");
		lblWithDrawal.setForeground(new Color(0, 0, 0));
		lblWithDrawal.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWithDrawal.setBounds(128, 2, 80, 30);
		panel1.add(lblWithDrawal);

		btn100 = new JButton("100.000");
		btn100.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn100.setBounds(10, 126, 130, 25);
		add(btn100);

		btn200 = new JButton("200.000");
		btn200.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn200.setBounds(10, 162, 130, 25);
		add(btn200);

		btnOther = new JButton("Số Khác");
		btnOther.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnOther.setBounds(10, 198, 130, 25);
		add(btnOther);

		btn500 = new JButton("500.000");
		btn500.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn500.setBounds(196, 126, 130, 25);
		add(btn500);

		btn1000 = new JButton("1.000.000");
		btn1000.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn1000.setBounds(196, 162, 130, 25);
		add(btn1000);

		btnCancelWithDrawal = new JButton("Quay lại");
		btnCancelWithDrawal.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnCancelWithDrawal.setBounds(196, 198, 130, 25);
		add(btnCancelWithDrawal);

		lblNumberCardWithDrawal = new JLabel("  Số Tài Khoản :");
		lblNumberCardWithDrawal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNumberCardWithDrawal.setBounds(105, 1, 100, 20);
		add(lblNumberCardWithDrawal);

		lblText = new JLabel("   Quý Khách Vui Lòng Chọn Số Tiền Rút :");
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setForeground(new Color(0, 128, 128));
		lblText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblText.setBounds(42, 73, 255, 20);
		add(lblText);

		JLabel lblSTinHin = new JLabel("Số tiền hiện có");
		lblSTinHin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSTinHin.setForeground(new Color(0, 128, 128));
		lblSTinHin.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSTinHin.setBounds(42, 37, 255, 20);
		add(lblSTinHin);

		txtMoney = new JTextField();
		txtMoney.setEditable(false);
		txtMoney.setBounds(90, 56, 162, 20);
		add(txtMoney);
		txtMoney.setColumns(10);

		lblError = new JLabel("");
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setForeground(Color.RED);
		lblError.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblError.setBounds(28, 100, 294, 20);
		add(lblError);
	}
}
