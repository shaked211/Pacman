package pacman;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(2, 2, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground( Color.black );
		frame.setResizable(false);
		
		JLabel pic = new JLabel("");
		pic.setIcon(new ImageIcon(Main.class.getResource("/pacman/fit.png")));
		pic.setBackground(Color.BLACK);
		pic.setBounds(808, 181, 384, 218);
		frame.getContentPane().add(pic);
		 
		pic.setHorizontalAlignment(JLabel.CENTER);
		pic.setLocation((frame.getWidth()-pic.getWidth())/2,250);
		
		JLabel lblNewLabel = new JLabel("Pacman");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 98));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(765, 100, 395, 140);
		lblNewLabel.setLocation((frame.getWidth()-lblNewLabel.getWidth())/2,100);
		frame.getContentPane().add(lblNewLabel);
		
		
		JButton startbtn = new JButton("Start");
		startbtn.setFont(new Font("Segoe Print", Font.BOLD, 56));
		startbtn.setBounds(289, 381, 202, 126);
		frame.getContentPane().add(startbtn);
		startbtn.setBorderPainted(false);
		startbtn.setBorder( BorderFactory.createLoweredBevelBorder());
		startbtn.setBackground(Color.BLACK);
		startbtn.setForeground(Color.white);
		startbtn.setLocation((frame.getWidth()-startbtn.getWidth())/2,500);
		
		
		startbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Instructions sw=new Instructions();
				sw.getFrame().setVisible(true);
			}
		});
		
	
	}
}
