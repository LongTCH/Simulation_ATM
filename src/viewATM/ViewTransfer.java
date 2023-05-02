package viewATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import java.awt.Toolkit;

public class ViewTransfer extends JFrame {

	private JPanel contentPane, panelRemitters, panelBack, panelInformation, panelPeopleFee, panelContent,
			panelReceiver;
	private JLabel lblRemittersCard, lblRemittersMoney, lblReceiverName, lblReceiverCard;
	private JLabel lblRemitters, lblChuyenTien, lblMoney, lblVND, lblReceiver;
	private JButton btnBack, btnTransfer;
	private JTextPane textPaneContent;
	private JRadioButton rdbtnRemitters, rdbtnReceiver;
	private JButton btnReceiver;

	private JTextField textTransferMoney;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTransfer frame = new ViewTransfer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewTransfer() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("src\\picture\\logoKienLong.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(386, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelRemitters = new JPanel();
		panelRemitters.setBorder(new LineBorder(new Color(32, 178, 170), 3));
		panelRemitters.setBackground(new Color(240, 255, 255));
		panelRemitters.setBounds(0, 32, 300, 47);
		contentPane.add(panelRemitters);
		panelRemitters.setLayout(null);

		lblRemitters = new JLabel("");
		lblRemitters.setIcon(new ImageIcon("src\\picture\\chuyenkhoan1.png"));
		lblRemitters.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemitters.setBounds(5, 5, 30, 30);
		panelRemitters.add(lblRemitters);

		lblRemittersCard = new JLabel();
		lblRemittersCard.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblRemittersCard.setBackground(new Color(224, 255, 255));
		lblRemittersCard.setBounds(35, 3, 85, 18);
		panelRemitters.add(lblRemittersCard);

		lblRemittersMoney = new JLabel();
		lblRemittersMoney.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblRemittersMoney.setBackground(new Color(224, 255, 255));
		lblRemittersMoney.setBounds(35, 21, 85, 18);
		panelRemitters.add(lblRemittersMoney);

		panelBack = new JPanel();
		panelBack.setBackground(new Color(176, 224, 230));
		panelBack.setBounds(0, 0, 370, 30);
		contentPane.add(panelBack);
		panelBack.setLayout(null);

		btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon("src\\picture\\back.png"));
		btnBack.setBounds(2, 2, 30, 25);
		panelBack.add(btnBack);

		lblChuyenTien = new JLabel("Chuyển Tiền");
		lblChuyenTien.setHorizontalAlignment(SwingConstants.CENTER);
		lblChuyenTien.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblChuyenTien.setBounds(140, 2, 90, 26);
		panelBack.add(lblChuyenTien);

		panelInformation = new JPanel();
		panelInformation.setBackground(new Color(240, 255, 255));
		panelInformation.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Th\u00F4ng Tin Giao D\u1ECBch", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelInformation.setBounds(0, 130, 370, 231);
		contentPane.add(panelInformation);
		panelInformation.setLayout(null);

		lblMoney = new JLabel("Số Tiền ");
		lblMoney.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoney.setBounds(40, 35, 100, 25);
		panelInformation.add(lblMoney);

		textTransferMoney = new JTextField();
		textTransferMoney.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textTransferMoney.setHorizontalAlignment(SwingConstants.CENTER);
		textTransferMoney.setBounds(140, 35, 120, 25);
		panelInformation.add(textTransferMoney);
		textTransferMoney.setColumns(10);

		lblVND = new JLabel("VND");
		lblVND.setHorizontalAlignment(SwingConstants.CENTER);
		lblVND.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblVND.setBounds(260, 35, 35, 25);
		panelInformation.add(lblVND);

		panelPeopleFee = new JPanel();
		panelPeopleFee.setBorder(new TitledBorder(null, "Ng\u01B0\u1EDDi ch\u1ECBu ph\u00ED", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panelPeopleFee.setBounds(60, 60, 235, 55);
		panelInformation.add(panelPeopleFee);
		panelPeopleFee.setLayout(null);

		rdbtnRemitters = new JRadioButton("Người Chuyển");
		rdbtnRemitters.setSelected(true);
		rdbtnRemitters.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRemitters.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnRemitters.setBounds(6, 25, 109, 23);
		panelPeopleFee.add(rdbtnRemitters);

		rdbtnReceiver = new JRadioButton("Người Nhận");
		rdbtnReceiver.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnReceiver.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnReceiver.setBounds(120, 25, 109, 23);
		panelPeopleFee.add(rdbtnReceiver);

		panelContent = new JPanel();
		panelContent.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"N\u1ED9i dung", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelContent.setBounds(60, 120, 235, 60);
		panelInformation.add(panelContent);
		panelContent.setLayout(null);

		textPaneContent = new JTextPane();
		textPaneContent.setText("Chuyển Tiền");
		textPaneContent.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textPaneContent.setBounds(10, 21, 215, 29);
		panelContent.add(textPaneContent);

		btnTransfer = new JButton("Chuyển");
		btnTransfer.setBackground(new Color(32, 178, 170));
		btnTransfer.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnTransfer.setBounds(129, 191, 100, 29);
		panelInformation.add(btnTransfer);

		panelReceiver = new JPanel();
		panelReceiver.setBorder(new LineBorder(new Color(32, 178, 170), 3));
		panelReceiver.setLayout(null);
		panelReceiver.setBackground(new Color(240, 255, 255));
		panelReceiver.setBounds(70, 80, 300, 47);
		contentPane.add(panelReceiver);

		lblReceiver = new JLabel("");
		lblReceiver.setIcon(new ImageIcon("src\\picture\\chuyenkhoan1.png"));
		lblReceiver.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceiver.setBounds(265, 5, 30, 30);
		panelReceiver.add(lblReceiver);

		btnReceiver = new JButton("Người thụ hưởng");
		btnReceiver.setBackground(new Color(224, 255, 255));
		btnReceiver.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnReceiver.setBounds(139, 8, 120, 30);
		panelReceiver.add(btnReceiver);

		lblReceiverName = new JLabel();
		lblReceiverName.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceiverName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblReceiverName.setVisible(false);
		lblReceiverName.setBackground(Color.CYAN);
		lblReceiverName.setBounds(146, 3, 114, 20);
		panelReceiver.add(lblReceiverName);

		lblReceiverCard = new JLabel();
		lblReceiverCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceiverCard.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblReceiverCard.setVisible(false);
		lblReceiverCard.setBackground(Color.CYAN);
		lblReceiverCard.setBounds(165, 24, 85, 20);
		panelReceiver.add(lblReceiverCard);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanelRemitters() {
		return panelRemitters;
	}

	public JPanel getPanelBack() {
		return panelBack;
	}

	public JPanel getPanelInformation() {
		return panelInformation;
	}

	public JPanel getPanelPeopleFee() {
		return panelPeopleFee;
	}

	public JPanel getPanelContent() {
		return panelContent;
	}

	public JPanel getPanelReceiver() {
		return panelReceiver;
	}

	

	public JTextField getTextRechargeMoney() {
		return textTransferMoney;
	}

	public JLabel getLblRemitters() {
		return lblRemitters;
	}

	public JLabel getLblChuyenTien() {
		return lblChuyenTien;
	}

	public JLabel getLblMoney() {
		return lblMoney;
	}

	public JLabel getLblVND() {
		return lblVND;
	}

	public JLabel getLblReceiver() {
		return lblReceiver;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public JButton getBtnTransfer() {
		return btnTransfer;
	}

	public JTextPane getTextPaneContent() {
		return textPaneContent;
	}

	public JRadioButton getRdbtnRemitters() {
		return rdbtnRemitters;
	}

	public JRadioButton getRdbtnReceiver() {
		return rdbtnReceiver;
	}

	public JButton getBtnReceiver() {
		return btnReceiver;
	}

	public JLabel getLblRemittersCard() {
		return lblRemittersCard;
	}

	public JLabel getLblRemittersMoney() {
		return lblRemittersMoney;
	}

	public JLabel getLblReceiverName() {
		return lblReceiverName;
	}

	public JLabel getLblReceiverCard() {
		return lblReceiverCard;
	}

	public JTextField getTextTransferMoney() {
		return textTransferMoney;
	}

	

}
