package viewATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Color;

public class ViewYesNo extends JFrame {

	private JPanel contentPane;
	private JLabel lblWithDrawal3;
	private JButton btnYes, btnNo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewYesNo frame = new ViewYesNo();
	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewYesNo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(266, 125);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblWithDrawal3 = new JLabel("  Bạn có chắc thực hiện giao dịch này hay không ?");
		lblWithDrawal3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblWithDrawal3.setBounds(0, 24, 250, 27);
		contentPane.add(lblWithDrawal3);

		btnYes = new JButton("Có");
		btnYes.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnYes.setBounds(38, 56, 70, 30);
		contentPane.add(btnYes);

		btnNo = new JButton("không");
		btnNo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNo.setBounds(136, 56, 70, 30);
		contentPane.add(btnNo);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getLblWithDrawal3() {
		return lblWithDrawal3;
	}

	public JButton getBtnYes() {
		return btnYes;
	}

	public JButton getBtnNo() {
		return btnNo;
	}

}
