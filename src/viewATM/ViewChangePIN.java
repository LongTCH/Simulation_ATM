package viewATM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Toolkit;

public class ViewChangePIN extends JFrame {

	private JPanel contentPane, panelPIN, panelChangePIN;
	private JPasswordField ancientPIN, newPIN, newPIN1;
	private JLabel lblAncientPIN, lblNewPIN, lblPIN, lblNewPIN1;
	private JButton btnChangePIN, btnBackPIN;
	private JTextPane txtpnChangePIN;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewChangePIN frame = new ViewChangePIN();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewChangePIN() {

		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(386, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelPIN = new JPanel();
		panelPIN.setBorder(new LineBorder(new Color(0, 128, 128), 0));
		panelPIN.setBounds(0, 0, 370, 31);
		panelPIN.setBackground(new Color(176, 224, 230));
		contentPane.add(panelPIN);
		panelPIN.setLayout(null);

		btnBackPIN = new JButton("");
		btnBackPIN.setIcon(new ImageIcon("src\\picture\\back.png"));
		btnBackPIN.setBounds(2, 2, 31, 28);
		panelPIN.add(btnBackPIN);

		lblPIN = new JLabel("    Đổi Mã PIN");
		lblPIN.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblPIN.setBounds(135, 2, 80, 26);
		panelPIN.add(lblPIN);

		panelChangePIN = new JPanel();
		panelChangePIN.setBackground(new Color(255, 255, 255));
		panelChangePIN.setBounds(0, 31, 370, 380);
		contentPane.add(panelChangePIN);
		panelChangePIN.setLayout(null);

		btnChangePIN = new JButton("Đổi Mã PIN");
		btnChangePIN.setForeground(Color.WHITE);
		btnChangePIN.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnChangePIN.setBackground(new Color(0, 128, 128));
		btnChangePIN.setBounds(135, 339, 100, 30);
		panelChangePIN.add(btnChangePIN);

		lblAncientPIN = new JLabel("    Mã PIN cũ");
		lblAncientPIN.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAncientPIN.setBounds(104, 62, 80, 30);
		panelChangePIN.add(lblAncientPIN);

		ancientPIN = new JPasswordField();
		ancientPIN.setBounds(185, 62, 70, 30);
		panelChangePIN.add(ancientPIN);

		lblNewPIN = new JLabel("    Mã PIN mới");
		lblNewPIN.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewPIN.setBounds(104, 213, 80, 30);
		panelChangePIN.add(lblNewPIN);

		newPIN = new JPasswordField();
		newPIN.setBounds(185, 213, 70, 30);
		panelChangePIN.add(newPIN);

		txtpnChangePIN = new JTextPane();
		txtpnChangePIN.setEditable(false);
		txtpnChangePIN.setText("Lưu ý :\r\n- Mã PIN phải gồm 6 số\r\n");
		txtpnChangePIN.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtpnChangePIN.setBackground(new Color(211, 211, 211));
		txtpnChangePIN.setBounds(105, 123, 150, 59);
		panelChangePIN.add(txtpnChangePIN);

		lblNewPIN1 = new JLabel("    Mã PIN mới");
		lblNewPIN1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewPIN1.setBounds(104, 270, 80, 30);
		panelChangePIN.add(lblNewPIN1);

		newPIN1 = new JPasswordField();
		newPIN1.setBounds(185, 270, 70, 30);
		panelChangePIN.add(newPIN1);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanelPIN() {
		return panelPIN;
	}

	public JPanel getPanelChangePIN() {
		return panelChangePIN;
	}

	public JPasswordField getAncientPIN() {
		return ancientPIN;
	}

	public JPasswordField getNewPIN() {
		return newPIN;
	}

	public JLabel getLblAncientPIN() {
		return lblAncientPIN;
	}

	public JLabel getLblNewPIN() {
		return lblNewPIN;
	}

	public JLabel getLblPIN() {
		return lblPIN;
	}

	public JButton getBtnChangePIN() {
		return btnChangePIN;
	}

	public JTextPane getTxtpnChangePIN() {
		return txtpnChangePIN;
	}

	public JPasswordField getNewPIN1() {
		return newPIN1;
	}

	public JLabel getLblNewPIN1() {
		return lblNewPIN1;
	}

	public JButton getBtnBackPIN() {
		return btnBackPIN;
	}

}
