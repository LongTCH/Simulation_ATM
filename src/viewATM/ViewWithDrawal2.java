package viewATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ViewWithDrawal2 extends JFrame {

	private JPanel contentPane;
	private JTextField textNumberCardWithDrawal2, textWithDrawal2, textRest;
	private JLabel lblNumberCardWithDrawal2, lblWithDrawal2, lblRest, lblVND, lblVND1;
	private JButton btnWithDrawal2, btnCancelWithDrawal2, btnBackW2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewWithDrawal2 frame = new ViewWithDrawal2();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewWithDrawal2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(426, 250);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNumberCardWithDrawal2 = new JLabel("   Số Tài Khoản :");
		lblNumberCardWithDrawal2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberCardWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNumberCardWithDrawal2.setBounds(60, 30, 110, 20);
		contentPane.add(lblNumberCardWithDrawal2);

		lblWithDrawal2 = new JLabel("Số Tiền Cần Rút :");
		lblWithDrawal2.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblWithDrawal2.setBounds(60, 78, 110, 20);
		contentPane.add(lblWithDrawal2);

		lblRest = new JLabel("Số Tiền Còn Lại :");
		lblRest.setHorizontalAlignment(SwingConstants.CENTER);
		lblRest.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblRest.setBounds(60, 129, 110, 20);
		contentPane.add(lblRest);

		textNumberCardWithDrawal2 = new JTextField();
		textNumberCardWithDrawal2.setEditable(false);
		textNumberCardWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textNumberCardWithDrawal2.setBounds(170, 31, 100, 20);
		contentPane.add(textNumberCardWithDrawal2);
		textNumberCardWithDrawal2.setColumns(10);

		textWithDrawal2 = new JTextField();
		textWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textWithDrawal2.setEditable(false);
		textWithDrawal2.setColumns(10);
		textWithDrawal2.setBounds(170, 79, 100, 20);
		contentPane.add(textWithDrawal2);

		textRest = new JTextField();
		textRest.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textRest.setEditable(false);
		textRest.setColumns(10);
		textRest.setBounds(170, 130, 100, 20);
		contentPane.add(textRest);

		lblVND1 = new JLabel("VNĐ");
		lblVND1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND1.setBounds(270, 79, 30, 20);
		contentPane.add(lblVND1);

		lblVND = new JLabel("VNĐ");
		lblVND.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND.setBounds(270, 130, 30, 20);
		contentPane.add(lblVND);

		btnWithDrawal2 = new JButton("Rút Tiền   ");
		btnWithDrawal2.setHorizontalAlignment(SwingConstants.LEFT);
		btnWithDrawal2.setIcon(new ImageIcon("src\\picture\\money.png"));
		btnWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnWithDrawal2.setBackground(new Color(102, 205, 170));
		btnWithDrawal2.setBounds(35, 178, 146, 33);
		contentPane.add(btnWithDrawal2);

		btnCancelWithDrawal2 = new JButton("Hủy Giao Dịch");
		btnCancelWithDrawal2.setIcon(new ImageIcon("src\\picture\\Cancel.png"));
		btnCancelWithDrawal2.setHorizontalAlignment(SwingConstants.LEFT);
		btnCancelWithDrawal2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCancelWithDrawal2.setBackground(new Color(102, 205, 170));
		btnCancelWithDrawal2.setBounds(226, 178, 146, 33);
		contentPane.add(btnCancelWithDrawal2);

		btnBackW2 = new JButton("");
		btnBackW2.setIcon(new ImageIcon("src\\picture\\back.png"));
		btnBackW2.setBounds(0, 0, 30, 20);
		contentPane.add(btnBackW2);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextNumberCardWithDrawal2() {
		return textNumberCardWithDrawal2;
	}

	public JTextField getTextWithDrawal2() {
		return textWithDrawal2;
	}

	public JTextField getTextRest() {
		return textRest;
	}

	public JLabel getLblNumberCardWithDrawal2() {
		return lblNumberCardWithDrawal2;
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

	public JButton getBtnBackW2() {
		return btnBackW2;
	}

}
