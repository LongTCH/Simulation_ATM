package viewATM;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewYesNo extends JPanel {

	private JLabel lblWithDrawal3;
	private JButton btnYes, btnNo;

	public ViewYesNo() {
		setSize(336, 245);
		setLayout(null);

		lblWithDrawal3 = new JLabel("Bạn có muốn in hóa đơn");
		lblWithDrawal3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWithDrawal3.setBounds(63, 64, 177, 27);
		add(lblWithDrawal3);

		btnYes = new JButton("Có");
		btnYes.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnYes.setBounds(10, 142, 124, 30);
		add(btnYes);

		btnNo = new JButton("Không");
		btnNo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNo.setBounds(180, 142, 146, 30);
		add(btnNo);

		JButton btnHyGiaoDch = new JButton("Hủy giao dịch");
		btnHyGiaoDch.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnHyGiaoDch.setBounds(180, 204, 146, 30);
		add(btnHyGiaoDch);
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
