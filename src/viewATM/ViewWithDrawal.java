package viewATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class ViewWithDrawal extends JFrame {

	private JPanel contentPane, panel1, panel2;
	private JLabel lblNumberCardWithDrawal, lblWithDrawal, lblText;
	private JButton btn100, btn200, btn500, btn2000, btnBackWithDrawal, btnCancelWithDrawal, btnOther;
	private JTextField textNumberCardWithDrawal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewWithDrawal frame = new ViewWithDrawal();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewWithDrawal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(426, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel1 = new JPanel();
		panel1.setBackground(new Color(176, 224, 230));
		;
		panel1.setBounds(0, 0, 410, 34);
		contentPane.add(panel1);
		panel1.setLayout(null);

		lblWithDrawal = new JLabel("   Rút Tiền");
		lblWithDrawal.setForeground(new Color(0, 0, 0));
		lblWithDrawal.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWithDrawal.setBounds(160, 2, 80, 30);
		panel1.add(lblWithDrawal);

		btnBackWithDrawal = new JButton("");
		btnBackWithDrawal.setIcon(new ImageIcon("src\\picture\\back.png"));
		btnBackWithDrawal.setBounds(2, 2, 30, 30);
		panel1.add(btnBackWithDrawal);

		panel2 = new JPanel();
		panel2.setBackground(new Color(240, 255, 240));
		panel2.setBounds(0, 35, 410, 226);
		contentPane.add(panel2);
		panel2.setLayout(null);

		btn100 = new JButton("100.000");
		btn100.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn100.setIcon(new ImageIcon("src\\picture\\money.png"));
		btn100.setHorizontalAlignment(SwingConstants.LEFT);
		btn100.setBounds(40, 60, 130, 25);
		panel2.add(btn100);

		btn200 = new JButton("200.000");
		btn200.setIcon(new ImageIcon("src\\picture\\money.png"));
		btn200.setHorizontalAlignment(SwingConstants.LEFT);
		btn200.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn200.setBounds(40, 115, 130, 25);
		panel2.add(btn200);

		btnOther = new JButton("   Số Khác");
		btnOther.setIcon(new ImageIcon("src\\picture\\TimKiem.png"));
		btnOther.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnOther.setBounds(40, 170, 135, 25);
		panel2.add(btnOther);

		btn500 = new JButton("500.000");
		btn500.setHorizontalAlignment(SwingConstants.LEFT);
		btn500.setIcon(new ImageIcon("src\\picture\\money.png"));
		btn500.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn500.setBounds(240, 60, 130, 25);
		panel2.add(btn500);

		btn2000 = new JButton("2.000.000");
		btn2000.setHorizontalAlignment(SwingConstants.LEFT);
		btn2000.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn2000.setIcon(new ImageIcon("src\\picture\\money.png"));
		btn2000.setBounds(240, 115, 130, 25);
		panel2.add(btn2000);

		btnCancelWithDrawal = new JButton("Hủy Giao Dich");
		btnCancelWithDrawal.setHorizontalAlignment(SwingConstants.LEFT);
		btnCancelWithDrawal.setIcon(new ImageIcon("src\\picture\\Cancel.png"));
		btnCancelWithDrawal.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnCancelWithDrawal.setBounds(235, 170, 135, 25);
		panel2.add(btnCancelWithDrawal);

		lblNumberCardWithDrawal = new JLabel("  Số Tài Khoản :");
		lblNumberCardWithDrawal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNumberCardWithDrawal.setBounds(105, 1, 100, 20);
		panel2.add(lblNumberCardWithDrawal);

		textNumberCardWithDrawal = new JTextField();
		textNumberCardWithDrawal.setHorizontalAlignment(SwingConstants.CENTER);
		textNumberCardWithDrawal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textNumberCardWithDrawal.setBackground(new Color(192, 192, 192));
		textNumberCardWithDrawal.setEditable(false);
		textNumberCardWithDrawal.setBounds(205, 1, 100, 20);
		panel2.add(textNumberCardWithDrawal);
		textNumberCardWithDrawal.setColumns(10);

		lblText = new JLabel("   Quý Khách Vui Lòng Chọn Số Tiền Rút :");
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setForeground(new Color(0, 128, 128));
		lblText.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblText.setBounds(90, 30, 230, 20);
		panel2.add(lblText);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public JPanel getPanel2() {
		return panel2;
	}

	public JLabel getLblNumberCardWithDrawal() {
		return lblNumberCardWithDrawal;
	}

	public JLabel getLblWithDrawal() {
		return lblWithDrawal;
	}

	public JLabel getLblText() {
		return lblText;
	}

	public JButton getBtn100() {
		return btn100;
	}

	public JButton getBtn200() {
		return btn200;
	}

	public JButton getBtn500() {
		return btn500;
	}

	public JButton getBtn2000() {
		return btn2000;
	}

	public JButton getBtnBackWithDrawal() {
		return btnBackWithDrawal;
	}

	public JButton getBtnCancelWithDrawal() {
		return btnCancelWithDrawal;
	}

	public JButton getBtnOther() {
		return btnOther;
	}

	public JTextField getTextNumberCardWithDrawal() {
		return textNumberCardWithDrawal;
	}

}
