package viewATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class ViewWithDrawal1 extends JFrame {

	private JPanel contentPane;
	private JTextField textNumberMoney;
	private JLabel lblNumberMoney, lblVND;
	private JButton btnBackWithDrawal1, btnWithDrawal1;
	private JTextPane txtLuuY;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewWithDrawal1 frame = new ViewWithDrawal1();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewWithDrawal1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(378, 213);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNumberMoney = new JLabel("Nhập số Tiền :");
		lblNumberMoney.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNumberMoney.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberMoney.setBounds(20, 30, 100, 20);
		contentPane.add(lblNumberMoney);

		textNumberMoney = new JTextField();
		textNumberMoney.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textNumberMoney.setBounds(120, 31, 100, 20);
		contentPane.add(textNumberMoney);
		textNumberMoney.setColumns(10);

		txtLuuY = new JTextPane();
		txtLuuY.setEditable(false);
		txtLuuY.setText(
				"Lưu ý :\r\n- Số Tiền phải là bội chung của 50.000 \r\n- Số Tiền tối đa trong 1 lần rút là 5.000.000 VNĐ");
		txtLuuY.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtLuuY.setBackground(new Color(192, 192, 192));
		txtLuuY.setBounds(32, 80, 220, 70);
		contentPane.add(txtLuuY);

		btnWithDrawal1 = new JButton("Rút");
		btnWithDrawal1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnWithDrawal1.setHorizontalAlignment(SwingConstants.LEFT);
		btnWithDrawal1.setIcon(new ImageIcon("src\\picture\\money.png"));
		btnWithDrawal1.setBounds(262, 25, 101, 33);
		contentPane.add(btnWithDrawal1);

		lblVND = new JLabel("VNĐ");
		lblVND.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND.setBounds(222, 31, 30, 20);
		contentPane.add(lblVND);

		btnBackWithDrawal1 = new JButton("");
		btnBackWithDrawal1.setIcon(new ImageIcon("src\\picture\\back.png"));
		btnBackWithDrawal1.setBounds(0, 0, 30, 25);
		contentPane.add(btnBackWithDrawal1);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextNumberMoney() {
		return textNumberMoney;
	}

	public JLabel getLblNumberMoney() {
		return lblNumberMoney;
	}

	public JLabel getLblVND() {
		return lblVND;
	}

	public JButton getBtnBackWithDrawal1() {
		return btnBackWithDrawal1;
	}

	public JButton getBtnWithDrawal1() {
		return btnWithDrawal1;
	}

	public JTextPane getTxtLuuY() {
		return txtLuuY;
	}

}
