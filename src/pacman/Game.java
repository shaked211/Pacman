package pacman;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

public class Game {

	private JFrame frame;
	public Canvas c;
	int locationx=0;
	int locationy=0;
	/**
	 * Launch the application.
	 */
	public JFrame getFrame() {
		return frame;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
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
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		//c = new Canvas();
		
		
		frame = new JFrame();
		frame.setBounds(2, 2, 1280, 720);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.toBack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		frame.add(new Canvas());
		frame.setVisible(true);
		
		c = new Canvas();
		frame.add(c);
		frame.setVisible(true);
		
		frame.getContentPane().add(c);
		//map
		/*JLabel map=new JLabel();
		ImageIcon icon1 = new ImageIcon(Main.class.getResource("/pacman/map2.png"));
		map.setBounds(0, 0, 1920, 1040);
		frame.getContentPane().add(map);
		map.setIcon(icon1);*/
		
		//pacman
		JLabel pacmanlbl = new JLabel();
		pacmanlbl.setLocation(0, 0);
		pacmanlbl.setSize(50, 52);
		ImageIcon icon = new ImageIcon(Main.class.getResource("/pacman/paci00001.png"));
		//JOptionPane.showMessageDialog(null, "ff");
		frame.getContentPane().add(pacmanlbl);
		pacmanlbl.setIcon(icon);
		
		frame.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent go) {
				if (go.getKeyCode() == KeyEvent.VK_RIGHT ){
					if (locationx!=1220){	
						locationx+=20;
						pacmanlbl.setLocation(locationx, locationy);
						pacmanlbl.setIcon(new ImageIcon(Main.class.getResource("/pacman/paci00001.png")));
					}
				}
				if (go.getKeyCode() == KeyEvent.VK_LEFT ) {
					if (locationx!=0){
						locationx=locationx-20;
						pacmanlbl.setBounds(locationx, locationy, 50, 50);
						pacmanlbl.setIcon(new ImageIcon(Main.class.getResource("/pacman/pacileft.png")));
					}
				}  
				if (go.getKeyCode() == KeyEvent.VK_UP ) {
					if (locationy!=0){
						locationy=locationy-20;
						pacmanlbl.setBounds(locationx, locationy, 50, 50);
						pacmanlbl.setIcon(new ImageIcon(Main.class.getResource("/pacman/paciup.png")));
					}
				} 
				if (go.getKeyCode() == KeyEvent.VK_DOWN ) {
					if(locationy!=640){
						locationy=locationy+20;
						pacmanlbl.setBounds(locationx, locationy, 50, 50);
						pacmanlbl.setIcon(new ImageIcon(Main.class.getResource("/pacman/pacidown.png")));
					}
				}
			}
		});
		
		
		
	}

}
