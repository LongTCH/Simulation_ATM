package viewATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ViewUser extends JFrame {

	private JPanel contentPane, panel, panel1;
	private JButton btnBack;
	private JLabel lblNumberCard, lblName, lblMoneyInCard, lblUser;

	private JTextField textName, textNumberCard, textMoneyInCard;
	private JLabel lblNewLabel;;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewUser frame = new ViewUser();
		
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewUser() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(376, 491);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(2, 2, 356, 34);
		contentPane.add(panel);
		panel.setLayout(null);

		lblUser = new JLabel("");
		lblUser.setIcon(new ImageIcon("src\\picture\\user2.png"));
		lblUser.setBounds(163, 2, 30, 30);
		panel.add(lblUser);

		btnBack = new JButton("");
		btnBack.setBackground(new Color(0, 128, 128));
		btnBack.setIcon(new ImageIcon("src\\picture\\back.png"));
		btnBack.setBounds(2, 2, 30, 30);
		panel.add(btnBack);

		panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(0, 37, 358, 415);
		contentPane.add(panel1);
		panel1.setLayout(null);

		lblName = new JLabel("   Tên Chủ Thẻ :");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblName.setBounds(70, 90, 100, 30);
		panel1.add(lblName);

		textName = new JTextField();
		textName.setHorizontalAlignment(SwingConstants.CENTER);
		textName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textName.setEditable(false);
		textName.setBounds(170, 90, 100, 30);
		panel1.add(textName);
		textName.setColumns(10);

		lblNumberCard = new JLabel("  Số Tài Khoản :");
		lblNumberCard.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNumberCard.setBounds(70, 170, 100, 30);
		panel1.add(lblNumberCard);

		lblMoneyInCard = new JLabel("Số Tiền Trong Thẻ :");
		lblMoneyInCard.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMoneyInCard.setBounds(43, 250, 127, 30);
		panel1.add(lblMoneyInCard);

		textNumberCard = new JTextField();
		textNumberCard.setHorizontalAlignment(SwingConstants.CENTER);
		textNumberCard.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textNumberCard.setEditable(false);
		textNumberCard.setColumns(10);
		textNumberCard.setBounds(170, 170, 100, 30);
		panel1.add(textNumberCard);

		textMoneyInCard = new JTextField();
		textMoneyInCard.setHorizontalAlignment(SwingConstants.CENTER);
		textMoneyInCard.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textMoneyInCard.setEditable(false);
		textMoneyInCard.setColumns(10);
		textMoneyInCard.setBounds(170, 250, 100, 30);
		panel1.add(textMoneyInCard);
		
		lblNewLabel = new JLabel("  VNĐ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(270, 251, 46, 30);
		panel1.add(lblNewLabel);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public JButton getBtnBack() {
		return btnBack;
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
