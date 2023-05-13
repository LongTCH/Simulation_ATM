package viewATM;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ViewUser extends JPanel {

	private JButton btnBack;
	private JLabel lblNumberCard, lblName, lblMoneyInCard, lblUser;

	private JTextField textName, textNumberCard, textMoneyInCard;
	private JLabel lblNewLabel;;

	public ViewUser() {
		setSize(Static.getPanelScreenWeight, Static.getPanelScreenHeight);
		setSize(336, 245);
		setLayout(null);

		btnBack = new JButton("");
		btnBack.setBackground(new Color(0, 128, 128));
		btnBack.setIcon(new ImageIcon("src\\picture\\back.png"));
		btnBack.setBounds(296, 204, 30, 30);
		add(btnBack);

		lblName = new JLabel("   Tên Chủ Thẻ :");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblName.setBounds(38, 61, 100, 30);
		add(lblName);

		textName = new JTextField();
		textName.setHorizontalAlignment(SwingConstants.CENTER);
		textName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textName.setEditable(false);
		textName.setBounds(138, 61, 171, 30);
		add(textName);
		textName.setColumns(10);

		lblNumberCard = new JLabel("  Số Tài Khoản :");
		lblNumberCard.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNumberCard.setBounds(38, 107, 100, 30);
		add(lblNumberCard);

		lblMoneyInCard = new JLabel("Số Tiền Trong Thẻ :");
		lblMoneyInCard.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMoneyInCard.setBounds(10, 148, 127, 30);
		add(lblMoneyInCard);

		textNumberCard = new JTextField();
		textNumberCard.setHorizontalAlignment(SwingConstants.CENTER);
		textNumberCard.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textNumberCard.setEditable(false);
		textNumberCard.setColumns(10);
		textNumberCard.setBounds(138, 107, 171, 30);
		add(textNumberCard);

		textMoneyInCard = new JTextField();
		textMoneyInCard.setHorizontalAlignment(SwingConstants.CENTER);
		textMoneyInCard.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textMoneyInCard.setEditable(false);
		textMoneyInCard.setColumns(10);
		textMoneyInCard.setBounds(137, 148, 127, 30);
		add(textMoneyInCard);

		lblNewLabel = new JLabel("  VNĐ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(263, 148, 46, 30);
		add(lblNewLabel);
	}

	public JLabel getLblNumberCard() {
		return lblNumberCard;
	}

	public JLabel getLblName() {
		return lblName;
	}

	public JLabel getLblMoneyInCard() {
		return lblMoneyInCard;
	}

	public JLabel getLblUser() {
		return lblUser;
	}

	public JTextField getTextName() {
		return textName;
	}

	public JTextField getTextNumberCard() {
		return textNumberCard;
	}

	public JTextField getTextMoneyInCard() {
		return textMoneyInCard;
	}
}
