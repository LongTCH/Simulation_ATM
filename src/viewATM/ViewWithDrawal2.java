package viewATM;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ViewWithDrawal2 extends JPanel {

	private JTextField textWithDrawal2, textRest;
	private JLabel lblWithDrawal2, lblRest, lblVND, lblVND1;
	private JButton btnWithDrawal2, btnCancelWithDrawal2;
	private JLabel lblVND1_1;
	private JTextField txtMoney;

	public JTextField getTxtMoney() {
		return txtMoney;
	}

	private JLabel lblSHinC;
	private JLabel lblPh;
	private JTextField txtFee;

	public JTextField getTxtFee() {
		return txtFee;
	}

	private JLabel lblVND1_2;

	public ViewWithDrawal2() {
		setSize(336, 245);
		setLayout(null);

		lblWithDrawal2 = new JLabel("Số Tiền Cần Rút :");
		lblWithDrawal2.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblWithDrawal2.setBounds(22, 61, 110, 20);
		add(lblWithDrawal2);

		lblRest = new JLabel("Số Tiền Còn Lại :");
		lblRest.setHorizontalAlignment(SwingConstants.CENTER);
		lblRest.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblRest.setBounds(22, 130, 110, 20);
		add(lblRest);

		textWithDrawal2 = new JTextField();
		textWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textWithDrawal2.setEditable(false);
		textWithDrawal2.setColumns(10);
		textWithDrawal2.setBounds(142, 61, 128, 20);
		add(textWithDrawal2);

		textRest = new JTextField();
		textRest.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textRest.setEditable(false);
		textRest.setColumns(10);
		textRest.setBounds(142, 130, 128, 20);
		add(textRest);

		lblVND1 = new JLabel("VNĐ");
		lblVND1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND1.setBounds(270, 61, 30, 20);
		add(lblVND1);

		lblVND = new JLabel("VNĐ");
		lblVND.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND.setBounds(270, 130, 30, 20);
		add(lblVND);

		btnWithDrawal2 = new JButton("Rút Tiền   ");
		btnWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnWithDrawal2.setBackground(new Color(102, 205, 170));
		btnWithDrawal2.setBounds(22, 201, 121, 33);
		add(btnWithDrawal2);

		btnCancelWithDrawal2 = new JButton("Hủy Giao Dịch");
		btnCancelWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCancelWithDrawal2.setBackground(new Color(102, 205, 170));
		btnCancelWithDrawal2.setBounds(190, 201, 121, 33);
		add(btnCancelWithDrawal2);

		lblVND1_1 = new JLabel("VNĐ");
		lblVND1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND1_1.setBounds(270, 30, 30, 20);
		add(lblVND1_1);

		txtMoney = new JTextField();
		txtMoney.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtMoney.setEditable(false);
		txtMoney.setColumns(10);
		txtMoney.setBounds(142, 30, 128, 20);
		add(txtMoney);

		lblSHinC = new JLabel("Số Tiền Hiện Có:");
		lblSHinC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSHinC.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSHinC.setBounds(22, 30, 110, 20);
		add(lblSHinC);

		lblPh = new JLabel("Phí");
		lblPh.setHorizontalAlignment(SwingConstants.CENTER);
		lblPh.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPh.setBounds(22, 99, 110, 20);
		add(lblPh);

		txtFee = new JTextField();
		txtFee.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFee.setEditable(false);
		txtFee.setColumns(10);
		txtFee.setBounds(142, 99, 128, 20);
		add(txtFee);

		lblVND1_2 = new JLabel("VNĐ");
		lblVND1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND1_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND1_2.setBounds(270, 99, 30, 20);
		add(lblVND1_2);
	}

	public JTextField getTextWithDrawal2() {
		return textWithDrawal2;
	}

	public JTextField getTextRest() {
		return textRest;
	}

	public JLabel getLblWithDrawal2() {
		return lblWithDrawal2;
	}

	public JLabel getLblRest() {
		return lblRest;
	}

	public JLabel getLblVND() {
		return lblVND;
	}

	public JLabel getLblVND1() {
		return lblVND1;
	}

	public JButton getBtnWithDrawal2() {
		return btnWithDrawal2;
	}

	public JButton getBtnCancelWithDrawal2() {
		return btnCancelWithDrawal2;
	}

}
