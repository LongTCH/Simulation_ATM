package viewATM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import modelATM.CardATM;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class ViewLogin extends JFrame {

	protected JPanel panelAbout, slot, panelLogo, panelNhapSTK, panelBanPhim, panelScreen;
	protected CardATM card;
	protected JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnRong,
			btnThongTin, btnEnter, btnClear, btnCancel, btnZero;
	protected JTextField textSTK;
	protected JLabel lblKlBank, lblSTK, lblWelcome1, lblWelcome, lblLogo;
	protected JTextPane txtpnaThVo;
	private JPasswordField passwordField;

	public ViewLogin() {
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 700);
		setLocationRelativeTo(null);

		view();
	}

	public void view() {
		getContentPane().setLayout(null);

		panelLogo = new JPanel();
		panelLogo.setBounds(0, 0, 584, 100);
		getContentPane().add(panelLogo);
		panelLogo.setLayout(null);

		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("src\\picture\\logoKienLong.png"));
		lblLogo.setBounds(0, 0, 140, 100);
		panelLogo.add(lblLogo);

		lblKlBank = new JLabel(" NG\u00C2N H\u00C0NG KI\u00CAN LONG BANK ");
		lblKlBank.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblKlBank.setForeground(Color.WHITE);
		lblKlBank.setBackground(new Color(47, 79, 79));
		lblKlBank.setBounds(139, 0, 445, 100);
		lblKlBank.setOpaque(true);
		panelLogo.add(lblKlBank);

		card = new CardATM();

		card.setBackground(new Color(139, 0, 0));
		card.setBounds(0, 359, 60, 90);
		getContentPane().add(card);

		slot = new JPanel();
		slot.setBackground(Color.GRAY);
		slot.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		slot.setBounds(448, 329, 81, 15);
		getContentPane().add(slot);

		panelNhapSTK = new JPanel();
		panelNhapSTK.setBounds(394, 221, 190, 56);
		panelNhapSTK.setBackground(new Color(169, 169, 169));
		panelNhapSTK.setBorder(
				BorderFactory.createTitledBorder(null, "CARD", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));

		getContentPane().add(panelNhapSTK);
		panelNhapSTK.setLayout(null);

		lblSTK = new JLabel("STK");
		lblSTK.setBounds(23, 21, 35, 23);
		lblSTK.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSTK.setForeground(new Color(139, 0, 0));
		panelNhapSTK.add(lblSTK);

		textSTK = new JTextField();
		textSTK.setEditable(false);
		textSTK.setHorizontalAlignment(SwingConstants.CENTER);
		textSTK.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textSTK.setBackground(Color.LIGHT_GRAY);
		textSTK.setBounds(58, 22, 121, 20);
		panelNhapSTK.add(textSTK);
		textSTK.setColumns(10);

		panelScreen = new JPanel();
		panelScreen.setBorder(new LineBorder(new Color(64, 64, 64), 10));
		panelScreen.setBackground(Color.WHITE);
		panelScreen.setBounds(36, 123, 356, 194);
		getContentPane().add(panelScreen);
		panelScreen.setLayout(null);

		lblWelcome1 = new JLabel("   XIN K\u00CDNH CH\u00C0O QU\u00DD KH\u00C1CH ");
		lblWelcome1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWelcome1.setForeground(new Color(46, 139, 87));
		lblWelcome1.setBounds(52, 11, 241, 38);
		panelScreen.add(lblWelcome1);

		lblWelcome = new JLabel(" QUÝ KHÁCH VUI LÒNG ĐƯA THẺ VÀO");
		lblWelcome.setForeground(new Color(139, 0, 0));
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblWelcome.setBounds(10, 55, 336, 45);
		panelScreen.add(lblWelcome);

		passwordField = new JPasswordField(4);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		passwordField.setEnabled(false);
		passwordField.setVisible(false);
		passwordField.setBounds(135, 111, 86, 20);
		panelScreen.add(passwordField);
		panelAbout = new JPanel();
		panelAbout.setBackground(SystemColor.windowBorder);
		panelAbout.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "About",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelAbout.setBounds(410, 377, 164, 231);
		getContentPane().add(panelAbout);
		panelAbout.setLayout(null);

		txtpnaThVo = new JTextPane();
		txtpnaThVo.setBackground(Color.LIGHT_GRAY);
		txtpnaThVo.setText(
				"Đưa thẻ vào ( Click Chuột trái vào hình chữ nhật màu đỏ bên tay trái) . Lưu ý khi nhập mã Pin gồm 6 số .");
		txtpnaThVo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnaThVo.setBounds(10, 26, 144, 179);
		panelAbout.add(txtpnaThVo);

		panelBanPhim = new JPanel();
		panelBanPhim.setBounds(87, 359, 266, 231);
		getContentPane().add(panelBanPhim);
		panelBanPhim.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panelBanPhim.setLayout(null);

		btnZero = new JButton("");
		btnZero.setEnabled(false);
		btnZero.setIcon(new ImageIcon("src\\picture\\zeros.png"));
		btnZero.setBounds(59, 166, 39, 32);
		panelBanPhim.add(btnZero);

		btnFive = new JButton("");
		btnFive.setEnabled(false);
		btnFive.setIcon(new ImageIcon("src\\picture\\five.png"));
		btnFive.setBounds(59, 62, 39, 32);
		panelBanPhim.add(btnFive);

		btnFour = new JButton("");
		btnFour.setEnabled(false);
		btnFour.setIcon(new ImageIcon("src\\picture\\four.png"));
		btnFour.setBounds(10, 62, 39, 32);
		panelBanPhim.add(btnFour);

		btnTwo = new JButton("");
		btnTwo.setEnabled(false);
		btnTwo.setIcon(new ImageIcon("src\\picture\\two.png"));
		btnTwo.setBounds(59, 10, 39, 32);
		panelBanPhim.add(btnTwo);

		btnThree = new JButton("");
		btnThree.setEnabled(false);
		btnThree.setIcon(new ImageIcon("src\\picture\\three.png"));
		btnThree.setBounds(108, 10, 39, 32);
		panelBanPhim.add(btnThree);

		btnSix = new JButton("");
		btnSix.setEnabled(false);
		btnSix.setIcon(new ImageIcon("src\\picture\\six.png"));
		btnSix.setBounds(108, 62, 39, 32);
		panelBanPhim.add(btnSix);

		btnSeven = new JButton("");
		btnSeven.setEnabled(false);
		btnSeven.setIcon(new ImageIcon("src\\picture\\seven.png"));
		btnSeven.setBounds(10, 114, 39, 32);
		panelBanPhim.add(btnSeven);

		btnEight = new JButton("");
		btnEight.setEnabled(false);
		btnEight.setIcon(new ImageIcon("src\\picture\\eight.png"));
		btnEight.setBounds(59, 114, 39, 32);
		panelBanPhim.add(btnEight);

		btnNine = new JButton("");
		btnNine.setEnabled(false);
		btnNine.setIcon(new ImageIcon("src\\picture\\nine.png"));
		btnNine.setBounds(108, 114, 39, 32);
		panelBanPhim.add(btnNine);

		btnOne = new JButton("");
		btnOne.setEnabled(false);
		btnOne.setIcon(new ImageIcon("src\\picture\\one.png"));
		btnOne.setBounds(10, 10, 39, 32);
		panelBanPhim.add(btnOne);

		btnEnter = new JButton("ENTER");
		btnEnter.setEnabled(false);
		btnEnter.setBackground(new Color(50, 205, 50));
		btnEnter.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnEnter.setBounds(157, 33, 80, 32);
		panelBanPhim.add(btnEnter);

		btnThongTin = new JButton("!\r\n");
		btnThongTin.setForeground(new Color(46, 139, 87));
		btnThongTin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnThongTin.setBounds(108, 166, 39, 32);
		panelBanPhim.add(btnThongTin);

		btnRong = new JButton("......");
		btnRong.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		btnRong.setBounds(10, 166, 39, 32);
		panelBanPhim.add(btnRong);

		btnClear = new JButton("CLEAR");
		btnClear.setEnabled(false);
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnClear.setBackground(Color.YELLOW);
		btnClear.setBounds(157, 88, 80, 32);
		panelBanPhim.add(btnClear);

		btnCancel = new JButton("CANCEL");
		btnCancel.setEnabled(false);
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnCancel.setBounds(157, 141, 80, 32);
		panelBanPhim.add(btnCancel);


	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin f = new ViewLogin();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JPanel getSlot() {
		return slot;
	}

	public JPanel getPanelLogo() {
		return panelLogo;
	}

	public JPanel getPanelNhapSTK() {
		return panelNhapSTK;
	}

	public JPanel getPanelBanPhim() {
		return panelBanPhim;
	}

	public JPanel getPanelScreen() {
		return panelScreen;
	}

	public CardATM getCard() {
		return card;
	}

	public JButton getBtnOne() {
		return btnOne;
	}

	public JButton getBtnTwo() {
		return btnTwo;
	}

	public JButton getBtnThree() {
		return btnThree;
	}

	public JButton getBtnFour() {
		return btnFour;
	}

	public JButton getBtnFive() {
		return btnFive;
	}

	public JButton getBtnSix() {
		return btnSix;
	}

	public JButton getBtnSeven() {
		return btnSeven;
	}

	public JButton getBtnEight() {
		return btnEight;
	}

	public JButton getBtnNine() {
		return btnNine;
	}

	public JButton getBtnRong() {
		return btnRong;
	}

	public JButton getBtnThongTin() {
		return btnThongTin;
	}

	public JButton getBtnEnter() {
		return btnEnter;
	}

	public JButton getBtnClear() {
		return btnClear;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public JButton getBtnZero() {
		return btnZero;
	}

	public JTextField getTextSTK() {
		return textSTK;
	}

	public JLabel getLblKlBank() {
		return lblKlBank;
	}

	public JLabel getLblSTK() {
		return lblSTK;
	}

	public JLabel getLblWelcome1() {
		return lblWelcome1;
	}

	public JLabel getLblWelcome() {
		return lblWelcome;
	}

	public JLabel getLblLogo() {
		return lblLogo;
	}
}
