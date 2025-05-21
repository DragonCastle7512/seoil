import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class GraphicFrame04 extends Frame implements Runnable {
	int x = 0;
	public GraphicFrame04() {
		setBackground(new Color(0, 0, 0));
		setSize(370, 150);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			repaint();
			x += 5;
		}
	}
	@Override
	public void paint(Graphics g) {
		Dimension d = getSize();
		g.setColor(Color.orange);
		g.drawString("JAVA", x, d.height/2);
		if(x > d.width) x = 0;
 	}
}
public class ThreadEx04 {

	public static void main(String[] args) {

		GraphicFrame04 f = new GraphicFrame04();
		Thread th = new Thread(f);
		th.start();
	}

}
