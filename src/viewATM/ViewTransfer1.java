package viewATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class ViewTransfer1 extends JFrame {

	private JPanel contentPane;
	private JTextField textReceiverSTK;
	private JButton btnOK;
	private JLabel lblSTKnguoiNhan;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTransfer1 frame = new ViewTransfer1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewTransfer1() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(286, 149);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblSTKnguoiNhan = new JLabel("Quý khách vui lòng nhập STK người nhận ");
		lblSTKnguoiNhan.setBackground(new Color(240, 255, 255));
		lblSTKnguoiNhan.setForeground(new Color(165, 42, 42));
		lblSTKnguoiNhan.setHorizontalAlignment(SwingConstants.CENTER);
		lblSTKnguoiNhan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSTKnguoiNhan.setBounds(0, 0, 270, 30);
		contentPane.add(lblSTKnguoiNhan);

		textReceiverSTK = new JTextField();
		textReceiverSTK.setBounds(85, 40, 100, 20);
		contentPane.add(textReceiverSTK);
		textReceiverSTK.setColumns(10);

		btnOK = new JButton("OK\r\n");
		btnOK.setBackground(new Color(32, 178, 170));
		btnOK.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnOK.setBounds(105, 80, 60, 30);
		contentPane.add(btnOK);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextReceiverSTK() {
		return textReceiverSTK;
	}

	public JButton getBtnOK() {
		return btnOK;
	}

	public JLabel getLblSTKnguoiNhan() {
		return lblSTKnguoiNhan;
	}

}
