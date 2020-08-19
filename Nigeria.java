import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Nigeria extends JFrame {
	private JPanel contentPane;
	public NigerianFlagCanvas nigerianFlagCanvas = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nigeria frame = new Nigeria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Nigeria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		nigerianFlagCanvas = new NigerianFlagCanvas();
		contentPane.add(nigerianFlagCanvas);
		this.repaint();
	}

}
class NigerianFlagCanvas extends Canvas {
	public static final long serialVersionUID = 1L;
	
	
	/**
	 * A method to paint the flag and draw String.
	 * 
	 * @param g
	 * 			Graphics
	 */
	public void paint(Graphics g) {

		super.paint(g);

		int R = 0;
		int G = 135;
		int B = 81;
		Color rectColor1 = new Color(R, G, B);
		g.setColor(rectColor1);
		g.fillRect(10,10, 200, 350);
		int R1 = 255;
		int G1 = 255;
		int B1 = 255;
		Color rectColor2 = new Color(R1, G1, B1);
		g.setColor(rectColor2);

		g.fillRect(210, 10, 200, 350);
		
		int R2 = 0;
		int G2 = 135;
		int B2 = 81;
		Color rectColor3 = new Color(R2, G2, B2);
		g.setColor(rectColor3);
		g.fillRect(410,10, 200, 350);

		Font myFont = new Font("Monospaced", Font.PLAIN, 20);
		g.setFont(myFont);
		g.setColor(Color.BLUE);
		g.drawString("National Flag of Nigeria", 30, 400);

	}
}

