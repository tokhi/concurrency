package thread.timer;

//displays current time – threaded execution
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class BasicClock extends TimerTask {
	final static long MILLISECONDS_PER_SECOND = 1000;
	private JFrame window = new JFrame("Basic Clock");
	private Timer timer = new Timer();
	private String clockFace = "";
	// constructor for clock
	public BasicClock() {
		// set up GUI
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200, 60);
		Container c = window.getContentPane();
		c.setBackground(Color.WHITE);
		window.setVisible(true);
		// update GUI every second beginning immediately
		timer.schedule(this, 0, 1 * MILLISECONDS_PER_SECOND);
	}
	// display updated clock
	public void run() {
		Date time = new Date();
		Graphics g = window.getContentPane().getGraphics();
		//g.setColor(Color.WHITE);
		g.drawString(clockFace, 10, 20);
		clockFace = time.toString();
		g.setColor(Color.BLUE);
		g.drawString(clockFace, 10, 20);
	}
	// main
	public static void main(String[] args) {
		new BasicClock();
	}
}
