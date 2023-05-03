package modelATM;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CardATM extends JPanel {

	int x, y, width, height;

	int targetX, targetY;

	Timer timer = new Timer(1, (e) -> update());

	public CardATM() {
		setLayout(null);
	}

	private void update() {

		if (x < targetX)
			x = x + 10;
		if (y > targetY)
			y = y - 1;

		setLocation(x, y);
		repaint();

		if (x >= targetX && y <= targetY) {

			height--;

			setSize(width, height);

			if (height <= 0)
				timer.stop();
		}
	}

	public void moveToTarget(int tx, int ty) {

		targetX = tx;
		targetY = ty;

		x = getX();
		y = getY();

		width = getWidth();
		height = getHeight();

		timer.start();
	}

}
