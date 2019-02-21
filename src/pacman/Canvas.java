package pacman;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	
	int[][] map = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,0,1,1,1,0,0,1,1,0,0,1,1,1,0,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,1,1,1,0,0,0,0,0,0,1,1,1,0,1,0,0,1},
			{1,1,1,1,0,0,1,0,0,0,2,2,0,0,0,1,0,0,1,1,1,1},
			{1,0,0,0,0,0,0,0,1,1,2,2,1,1,0,0,0,0,0,0,0,1},
			{1,1,1,1,0,0,1,0,0,0,2,2,0,0,0,1,0,0,1,1,1,1},
			{1,0,0,1,0,1,1,1,0,0,0,0,0,0,1,1,1,0,1,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,0,1,1,1,0,1,1,1,1,0,1,1,1,0,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,9,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	};
	
	Pair pacLocation;
	Pair pacIndex;
	
	int sizex =60;
	int sizey =60;
	
	public int[][] getMap() {
		return map;
	}
	public void setMap(int[][] map) {
		this.map = map;
	}
	public Pair getPacIndex() {
		return pacIndex;
	}
	public void setPacIndex(Pair pacIndex) {
		this.pacIndex = pacIndex;
	}
	public Pair getPacLocation()
	{
		return pacLocation;
	}
	public void setPacLocation(Pair pacLocation) {
		this.pacLocation = pacLocation;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawRect(40, 30, 1200, 660);
		g.drawRect(39,29 ,1202 ,662 );
		g.drawRect(580, 270, 120, 180);
		for(int i = 1; i < 12; i++){  
			for(int j=1; j < 21; j++){
				if(map[i][j] == 1){
					g.fillRect(j*sizex-20, i*sizey-30, sizex, sizey);
				}
				if(map[i][j] == 9){
					pacLocation = new Pair(j*sizex-20, i*sizey-30);
					pacIndex = new Pair(j,i);
					System.out.println(pacIndex.x+" y: "+pacIndex.y);
				}
				
			}
		}
	}

	public void drawSquare (int x, int y, Graphics g) {
		g.fillRect(x, y, sizex, sizey);
	}
	
	public Boolean checkRight(){
		if(map[pacIndex.y][pacIndex.x+1] == 1 || map[pacIndex.y][pacIndex.x+1] == 2){
			return false;
		}
		return true;
	}
	public Boolean checkLeft(){
		if(map[pacIndex.y][pacIndex.x-1] == 1 || map[pacIndex.y][pacIndex.x-1] == 2){
			return false;
		}
		return true;
	}
	public Boolean checkUp(){
		if(map[pacIndex.y-1][pacIndex.x] == 1 || map[pacIndex.y-1][pacIndex.x] == 2){
			return false;
		}
		return true;
	}
	public Boolean checkDown(){
		if(map[pacIndex.y+1][pacIndex.x] == 1 || map[pacIndex.y+1][pacIndex.x] == 2){
			return false;
		}
		return true;
	}
	
	public void printMap(){
		for(int i=0; i < 12; i++){
			for(int j=0; j < 21; j++){
				System.out.print(map[i][j]);
			}
			System.out.println("\n");
		}
	}
}
