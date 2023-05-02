package viewATM;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ViewRecharge extends JFrame {

	private JPanel contentPane, panelRecharge;
	private JTextField textRecharge;
	private JLabel lblRecharge, lblRecharge1, lblVND;
	private JButton btnBackRecharge, btnNext, btnCancel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewRecharge frame = new ViewRecharge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewRecharge() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(326, 210);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textRecharge = new JTextField();
		textRecharge.setBounds(90, 90, 120, 20);
		contentPane.add(textRecharge);
		textRecharge.setColumns(10);

		panelRecharge = new JPanel();
		panelRecharge.setBackground(new Color(176, 224, 230));
		panelRecharge.setBounds(0, 0, 310, 30);
		contentPane.add(panelRecharge);
		panelRecharge.setLayout(null);

		lblRecharge = new JLabel("Nộp Tiền");
		lblRecharge.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecharge.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRecharge.setBounds(100, 0, 100, 30);
		panelRecharge.add(lblRecharge);

		btnBackRecharge = new JButton("");
		btnBackRecharge.setIcon(new ImageIcon("src\\picture\\back.png"));
		btnBackRecharge.setBounds(2, 2, 30, 25);
		panelRecharge.add(btnBackRecharge);

		lblRecharge1 = new JLabel("Quý khách vui lòng nhập số tiền cần nạp :");
		lblRecharge1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecharge1.setForeground(new Color(139, 0, 0));
		lblRecharge1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblRecharge1.setBounds(10, 45, 290, 25);
		contentPane.add(lblRecharge1);

		btnNext = new JButton("Tiếp Tục");
		btnNext.setBackground(new Color(32, 178, 170));
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNext.setBounds(10, 145, 120, 25);
		contentPane.add(btnNext);

		btnCancel = new JButton("Hủy Giao Dịch\r\n\r\n\r\n");
		btnCancel.setBackground(new Color(32, 178, 170));
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancel.setBounds(180, 145, 120, 25);
		contentPane.add(btnCancel);

		lblVND = new JLabel("VNĐ");
		lblVND.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND.setBounds(210, 90, 30, 20);
		contentPane.add(lblVND);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanelRecharge() {
		return panelRecharge;
	}

	public JTextField getTextRecharge() {
		return textRecharge;
	}

	public JLabel getLblRecharge() {
		return lblRecharge;
	}

	public JLabel getLblRecharge1() {
		return lblRecharge1;
	}

	public JLabel getLblVND() {
		return lblVND;
	}

	public JButton getBtnBackRecharge() {
		return btnBackRecharge;
	}

	public JButton getBtnNext() {
		return btnNext;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

}
