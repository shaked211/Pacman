package pacman;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Map {
	
	public Canvas c;
	int locationx=580;
	int locationy=630;

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map window = new Map();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public Map() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1360, 760);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		JLabel score = new JLabel("Score:");
		score.setFont(new Font("Tahoma", Font.PLAIN, 20));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setBounds(1250, 35, 85, 31);
		frame.getContentPane().add(score);
		
		JLabel points = new JLabel("");
		points.setBounds(1304, 77, 46, 14);
		frame.getContentPane().add(points);
		
		//pacman
		JLabel pacmanlbl = new JLabel();
		c = new Canvas();
		c.setSize(1380, 760);
		Pair pacLocation = new Pair(580,630);
		pacmanlbl.setLocation(pacLocation.x,pacLocation.y);
		pacmanlbl.setSize(50,52);
		ImageIcon icon = new ImageIcon(Main.class.getResource("/pacman/paci00001.png"));
		pacmanlbl.setIcon(icon);
		frame.getContentPane().add(pacmanlbl);
		
		
		Ghost red= new Ghost();
		JLabel redlbl = new JLabel();
		red.Ghostlbl=redlbl;
		red.icon = new ImageIcon(Main.class.getResource("/pacman/RedRight.png"));
		red.Ghostlbl.setIcon(red.icon);
		red.Ghostlbl.setBounds(580, 270, 50, 50);
		frame.getContentPane().add(redlbl);
		
		Chase ch = new Chase();
	    ch.start();
		
		
		
		//c = new Canvas();
		c.setSize(1380, 760);
		frame.getContentPane().add(c);
		
		//Ghosts
		
		/*Ghost blue= new Ghost();
		Ghost pink= new Ghost();
		Ghost orange= new Ghost();*/
			
		
		frame.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent go) {
			if (go.getKeyCode() == KeyEvent.VK_RIGHT ){
				
				if (locationy==330 && locationx==1180){
					pacmanlbl.setLocation(60,330);
					locationx= 60;
					c.pacLocation.x = locationx;
					c.map[c.pacIndex.y][c.pacIndex.x] = 0;
					c.pacIndex.x=1;
					c.map[c.pacIndex.y][c.pacIndex.x] = 9;
					c.printMap();
					System.out.println("rig");
				}
				if (c.checkRight()){	
						locationx+=10;
						if((locationx-40)%60 == 0 && c.pacLocation.x < locationx ){
							c.map[c.pacIndex.y][c.pacIndex.x] = 0;
							c.pacLocation.x += 60;
							c.pacIndex.x+=1;
							c.map[c.pacIndex.y][c.pacIndex.x] = 9;
						}
						pacmanlbl.setBounds(locationx, locationy,50,50);
						pacmanlbl.setIcon(new ImageIcon(Main.class.getResource("/pacman/paci00001.png")));	
				}
			}
			
			if (go.getKeyCode() == KeyEvent.VK_LEFT ) {
					if (locationy==330 && locationx==40){
						pacmanlbl.setLocation(1180,330);
						locationx=1180;
						c.pacLocation.x = locationx;
						c.map[c.pacIndex.y][c.pacIndex.x] = 0;
						c.pacIndex.x=20;
						c.map[c.pacIndex.y][c.pacIndex.x] = 9;
						c.printMap();
						System.out.println("left");
					}
					else {
						if(c.checkLeft()){
							locationx=locationx-10;
							if((locationx - 40)%60 == 0 && c.pacLocation.x > locationx ){
								c.map[c.pacIndex.y][c.pacIndex.x] = 0;
								c.pacLocation.x -= 60;
								c.pacIndex.x-=1;
								c.map[c.pacIndex.y][c.pacIndex.x] = 9;
							}
						}
						pacmanlbl.setBounds(locationx, locationy, 50, 50);
						pacmanlbl.setIcon(new ImageIcon(Main.class.getResource("/pacman/pacileft.png")));
					}
				}
			
			if (go.getKeyCode() == KeyEvent.VK_UP ) {
				if (c.checkUp()){
						locationy=locationy-10;
						if((locationy - 30)%60 == 0 && c.pacLocation.y > locationy ){
							c.map[c.pacIndex.y][c.pacIndex.x] = 0;
							c.pacLocation.y -= 60;
							c.pacIndex.y-=1;
							c.map[c.pacIndex.y][c.pacIndex.x] = 9;
						}
					pacmanlbl.setBounds(locationx, locationy, 50, 50);
					pacmanlbl.setIcon(new ImageIcon(Main.class.getResource("/pacman/paciup.png")));
				}
			} 
			
			if (go.getKeyCode() == KeyEvent.VK_DOWN ) {
				if(c.checkDown()){
					locationy=locationy+10;
					if((locationy - 30)%60 == 0 && c.pacLocation.y < locationy ){
						c.map[c.pacIndex.y][c.pacIndex.x] = 0;
						c.pacLocation.y += 60;
						c.pacIndex.y+=1;
						c.map[c.pacIndex.y][c.pacIndex.x] = 9;
					}
					pacmanlbl.setBounds(locationx, locationy, 50, 50);
					pacmanlbl.setIcon(new ImageIcon(Main.class.getResource("/pacman/pacidown.png")));
					}
				}
			}
		});
		
	}

}
class Chase extends Thread {
    Chase() {}
    public void run() {
    	try {
			Thread.sleep(4500);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	while(true){
    		
    	}
    }
}





