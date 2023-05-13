package viewATM;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class ViewWithDrawal1 extends JPanel {

	private JTextField textNumberMoney;
	private JLabel lblNumberMoney, lblVND, lblError;
	private String money = "";

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public JLabel getLblError() {
		return lblError;
	}

	private JTextPane txtLuuY;
	private JTextField txtMoney;

	public JTextField getTxtMoney() {
		return txtMoney;
	}

	public ViewWithDrawal1() {
		setSize(336, 245);
		setLayout(null);

		lblNumberMoney = new JLabel("Nhập số tiền cần rút :");
		lblNumberMoney.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNumberMoney.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberMoney.setBounds(68, 157, 136, 20);
		add(lblNumberMoney);

		textNumberMoney = new JTextField();
		textNumberMoney.setHorizontalAlignment(SwingConstants.RIGHT);
		textNumberMoney.setEditable(false);
		textNumberMoney.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textNumberMoney.setBounds(48, 182, 156, 20);
		add(textNumberMoney);
		textNumberMoney.setColumns(10);

		txtLuuY = new JTextPane();
		txtLuuY.setEditable(false);
		txtLuuY.setText(
				"Lưu ý :\r\n- Số Tiền phải là bội chung của 50.000 \r\n- Số Tiền tối đa trong 1 lần rút là 5.000.000 VNĐ");
		txtLuuY.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtLuuY.setBackground(new Color(192, 192, 192));
		txtLuuY.setBounds(29, 16, 220, 70);
		add(txtLuuY);

		lblVND = new JLabel("VNĐ");
		lblVND.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND.setBounds(210, 182, 30, 20);
		add(lblVND);

		lblError = new JLabel("");
		lblError.setForeground(Color.RED);
		lblError.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblError.setBounds(29, 209, 278, 20);
		add(lblError);

		JLabel lblTinTrongTi = new JLabel("Tiền trong tài khoản");
		lblTinTrongTi.setHorizontalAlignment(SwingConstants.CENTER);
		lblTinTrongTi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTinTrongTi.setBounds(59, 102, 145, 20);
		add(lblTinTrongTi);

		txtMoney = new JTextField();
		txtMoney.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMoney.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtMoney.setEditable(false);
		txtMoney.setColumns(10);
		txtMoney.setBounds(48, 127, 156, 20);
		add(txtMoney);

		JLabel lblVND_1 = new JLabel("VNĐ");
		lblVND_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND_1.setBounds(210, 127, 30, 20);
		add(lblVND_1);
	}

	public JTextField getTextNumberMoney() {
		return textNumberMoney;
	}

	public JLabel getLblNumberMoney() {
		return lblNumberMoney;
	}

	public JTextPane getTxtLuuY() {
		return txtLuuY;
	}
}
