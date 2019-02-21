package pacman;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ghost extends JLabel {
	JLabel Ghostlbl;
	ImageIcon icon;
	Pair target;

	
	public Ghost (JLabel Ghostlbl, ImageIcon icon, Pair target){
		this.Ghostlbl=Ghostlbl;
		this.icon=icon;
		this.target=target;
	}
	public Ghost (){
		this.Ghostlbl=new JLabel();
		this.icon=new ImageIcon(Main.class.getResource("/pacman/paci00001.png"));
		this.target=new Pair(0,0);
	}
	public JLabel getGhostlbl() {
		return Ghostlbl;
	}
	public void setGhostlbl(JLabel ghostlbl) {
		Ghostlbl = ghostlbl;
	}
	public ImageIcon getIcon() {
		return icon;
	}
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	public Pair getTarget() {
		return target;
	}
	public void setTarget(Pair target) {
		this.target = target;
	}
	
}
