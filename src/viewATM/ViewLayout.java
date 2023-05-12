package viewATM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import modelATM.ATM;
import modelATM.CardATM;
import modelATM.Login;
import service.PanelScreen;

public class ViewLayout extends JFrame {

	protected JPanel panelAbout, slot, panelLogo, panelNhapSTK, panelBanPhim;
	private PanelScreen panelScreen;
	protected CardATM card;
	protected JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnRong,
			btnThongTin, btnEnter, btnClear, btnCancel, btnZero;
	protected JTextField textSTK;
	protected JLabel lblKlBank, lblSTK, lblLogo;
	protected JTextPane txtpnaThVo;

	public ViewLayout() {
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("src\\picture\\logoBIDV.png"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 700);
		setLocationRelativeTo(null);

		view();
	}

	public void setPanelScreen(JPanel panel) {
		panelScreen.removeAll();
		panel.setBounds(10, 10, 336, 245);
		panel.setVisible(true);
		panelScreen.add(panel);
		repaint();
		revalidate();
	}

	public void view() {

		getContentPane().setLayout(null);

		panelLogo = new JPanel();
		panelLogo.setBounds(0, 0, 584, 100);
		getContentPane().add(panelLogo);
		panelLogo.setLayout(null);

		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("src\\picture\\logoBIDV.png"));
		lblLogo.setBounds(0, 0, 140, 100);
		panelLogo.add(lblLogo);

		lblKlBank = new JLabel(" BIDV BANK ");
		lblKlBank.setFont(new Font("Times New Roman", Font.PLAIN, 34));
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
		panelBanPhim.setBounds(89, 399, 266, 231);
		getContentPane().add(panelBanPhim);
		panelBanPhim.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panelBanPhim.setLayout(null);

		btnZero = new JButton("0");
		btnZero.setBounds(59, 166, 45, 38);
		panelBanPhim.add(btnZero);

		btnFive = new JButton("5");
		btnFive.setBounds(59, 62, 45, 38);
		panelBanPhim.add(btnFive);

		btnFour = new JButton("4");
		btnFour.setBounds(10, 62, 45, 38);
		panelBanPhim.add(btnFour);

		btnTwo = new JButton("2");
		btnTwo.setBounds(59, 10, 45, 38);
		panelBanPhim.add(btnTwo);

		btnThree = new JButton("3");
		btnThree.setBounds(108, 10, 45, 38);
		panelBanPhim.add(btnThree);

		btnSix = new JButton("6");
		btnSix.setBounds(108, 62, 45, 38);
		panelBanPhim.add(btnSix);

		btnSeven = new JButton("7");
		btnSeven.setBounds(10, 114, 45, 38);
		panelBanPhim.add(btnSeven);

		btnEight = new JButton("8");
		btnEight.setBounds(59, 114, 45, 38);
		panelBanPhim.add(btnEight);

		btnNine = new JButton("9");
		btnNine.setBounds(108, 114, 45, 38);
		panelBanPhim.add(btnNine);

		btnOne = new JButton("1");
		btnOne.setBounds(10, 10, 45, 38);
		panelBanPhim.add(btnOne);

		btnEnter = new JButton("ENTER");
		btnEnter.setBackground(new Color(50, 205, 50));
		btnEnter.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnEnter.setBounds(157, 33, 80, 32);
		panelBanPhim.add(btnEnter);

		btnThongTin = new JButton("!\r\n");
		btnThongTin.setForeground(new Color(46, 139, 87));
		btnThongTin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnThongTin.setBounds(108, 166, 45, 38);
		panelBanPhim.add(btnThongTin);

		btnRong = new JButton("......");
		btnRong.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		btnRong.setBounds(10, 166, 45, 38);
		panelBanPhim.add(btnRong);

		btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnClear.setBackground(Color.YELLOW);
		btnClear.setBounds(157, 88, 80, 32);
		panelBanPhim.add(btnClear);

		btnCancel = new JButton("CANCEL");
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnCancel.setBounds(157, 141, 80, 32);
		panelBanPhim.add(btnCancel);

		panelScreen = new PanelScreen();
		panelScreen.setLayout(null);
		panelScreen.setBorder(new LineBorder(new Color(64, 64, 64), 10));
		panelScreen.setBackground(Color.WHITE);
		panelScreen.setBounds(36, 123, 356, 265);
		getContentPane().add(panelScreen);
		setPanelScreen(new ViewIdle());
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLayout f = new ViewLayout();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void insertCard(ATM atm) throws Throwable {
		card.moveToTarget(slot.getX() + 10, slot.getY() + 10);
		Login login = new Login(atm);
		ViewLogin viewLogin = new ViewLogin();
		viewLogin.setLogin(login);
		setPanelScreen(viewLogin);
		getTextSTK().setText(atm.getNumberCard());
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

	public PanelScreen getPanelScreen() {
		PanelScreen a = (PanelScreen) panelScreen.getComponent(0);
		return a;
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

	public JLabel getLblLogo() {
		return lblLogo;
	}
}
