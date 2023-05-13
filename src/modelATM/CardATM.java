package modelATM;

import java.util.function.Function;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CardATM extends JPanel {

	int x, y, width, height;
	int ix, iy, iwidth, iheight;
	int targetX, targetY;

	Timer timer;

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
		ix = x = getX();
		iy = y = getY();

		iwidth = width = getWidth();
		iheight = height = getHeight();
		timer = new Timer(1, (e) -> update());
		timer.start();
	}

	private boolean isWaiting;

	public void reject(Function<Void, Void> rejecting, Function<Void, Void> rejected) {
		isWaiting = false;
		targetX = ix;
		targetY = iy;
		timer = new Timer(1, (e) -> {

			if (height >= iheight) {
				isWaiting = false;
				rejected.apply(null);
				if (x > targetX)
					x = x - 10;
				if (y < targetY)
					y = y + 1;

				setLocation(x, y);
				if (x <= ix && y >= iy) {
					timer.stop();
				}
			} else {
				if (isWaiting == false) {
					rejecting.apply(null);
					isWaiting = true;
				}
				height++;
				setSize(width, height);
			}
		});
		timer.start();

	}
}
