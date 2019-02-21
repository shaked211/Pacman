package pacman;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Instructions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	/*public JFrame getFrame() {
		return frame;
	}*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instructions window = new Instructions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Instructions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(2, 2, 1280, 720);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground( Color.black );
		frame.getContentPane().setLayout(null);
		
		JButton playbtn = new JButton("Press here to play");
		playbtn.setFont(new Font("Segoe Print", Font.BOLD, 50));
		playbtn.setBounds(727, 627, 466, 108);
		frame.getContentPane().add(playbtn);
		playbtn.setBorderPainted(false);
		playbtn.setBorder( BorderFactory.createLoweredBevelBorder());
		playbtn.setBackground(Color.BLACK);
		playbtn.setForeground(Color.white);
		playbtn.setLocation((frame.getWidth()-playbtn.getWidth())/2,600);
		playbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game sg=new Game();
				sg.getFrame().setVisible(true);
			}
		});
	}
	public JFrame getFrame() {
		return frame;
	}
}
