package viewATM;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewIdle extends JPanel {
	protected JLabel lblKlBank, lblSTK, lblWelcome1, lblWelcome, lblLogo;

	public ViewIdle() {
		setLayout(null);
		setSize(Static.getPanelScreenWeight, Static.getPanelScreenHeight);
		lblWelcome1 = new JLabel("   XIN K\u00CDNH CH\u00C0O QU\u00DD KH\u00C1CH ");
		lblWelcome1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWelcome1.setForeground(new Color(46, 139, 87));
		lblWelcome1.setBounds(52, 11, 241, 38);
		this.add(lblWelcome1);

		lblWelcome = new JLabel(" QUÝ KHÁCH VUI LÒNG ĐƯA THẺ VÀO");
		lblWelcome.setForeground(new Color(139, 0, 0));
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblWelcome.setBounds(10, 55, 336, 45);
		this.add(lblWelcome);
	}

}
