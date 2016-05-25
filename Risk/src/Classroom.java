import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Classroom {
	int troop;
	int x, y;
	String name;
	String owner;
	Image io; 
	public Classroom(int troops, int x2, int y2, String names, String f) {
		name = names;
		troop = troops;
		x = x2;
		y = y2;
		name = names;
		owner = f;
//		URL url = getClass().getResource("arrow.png");
//		System.out.println(url);
//		try {
//			io=(BufferedImage) ImageIO.read(url);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public void addtroop() {
		troop++;
	}

	public void addtroop(int added) {
		if (owner == "NT" || owner == "EN"){
			System.out.println("This is not your country");	
		}
		else{
			troop += added; 
		}
	}

	public int gettroop() {
		return troop;
	}

	public String getowner(){
		return owner; 
	}
	public void settroop(int x) {
		troop = x;
	}

	public String getname() {
		return name;
	}

	public int addTroops() {
		return gettroop();
	}

	public void drawQ(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 26, 25);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 26, 25);
	}

	public void drawB(Graphics g) {
		g.drawRect(x, y, 26, 25);
		g.setColor(Color.GRAY);
		g.fillRect(x,y, 35, 18);
		g.setColor(Color.BLACK);
		
	}
	public void drawC(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 37, 20);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 37, 20);
	}
	public void drawD(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 20, 27);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 20, 27);
	}
	public void drawE(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 27, 27);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 27, 27);
	}
	public void drawConcession(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 21, 25);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 21, 25);
	}
	public void drawG(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 20, 28);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 20, 28);
	}
	public void drawH(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 24, 24);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 24, 24);
	}
	public void drawP(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 25, 20);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 25, 20);
	}
	public void drawJ(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 21, 27);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 21, 27);
	}



	// public void drawSidewaysBuilding(Graphics g, int i, int j){
	// g.setColor(Color.GRAY);
	// g.fillRect(i, j, 60, 40);
	// }

	public void changeColor(Graphics g, int i, int j, Color color) {
		g.setColor(color);
		g.fillRect(i, j, 20, 20);
	}

	// public void drawLargeBuild(Graphics g, int i, int j){
	// g.setColor(Color.GRAY);
	// g.fillRect(i, j, 80, 60);
	// }

	public void click(Graphics g, int tX, int tY) {
		// Building tempfrontCard = pile.get();
		Classroom b1 = new Classroom(tY, tY, tY, name, name);
		highlight(b1, g, tX, tY);
	}

	private void highlight(Classroom buildsMe, Graphics g, int x, int y) {
		//we need a way to check if the clicker is in a building (this might go as an if statement in board) if clicker clicks on a building (we have to check if it does) then queue highlight method
		buildsMe.changeColor(g, x, y, Color.CYAN);
	}

	public int getX() {
		return x;
	}

	public int gety() {
		return y;
	}

	public void attackorreinforce(Classroom r,int numtroops) {
		if(r.getowner()=="NT" || r.getowner()=="EN"){
			if (r.gettroop()  > troop) {
				r.settroop(r.gettroop() - troop);
				owner = "YS";
			} else if (troop > r.gettroop() ) {
				this.settroop(this.gettroop() - r.gettroop());
			} else {
				r.settroop(1);
			}
		}
		else{
			r.addtroop(troop);
		}
	}




	// public void clickSide(Graphics g, int i, int j) {
	// // TODO Auto-generated method stub
	// Classroom b1 = new Classroom(j, j, j, name);
	// clickedDrawSIDE(b1, g,i, j);
	// }
	//
	// private void clickedDrawSIDE(Classroom b1, Graphics g, int i, int j) {
	// // TODO Auto-generated method stub
	// b1.changeSideColor(g, i,j);
	// }
	//
	// private void changeSideColor(Graphics g, int i, int j) {
	// // TODO Auto-generated method stub
	// g.setColor(Color.BLUE);
	// g.fillRect(i, j, 60, 40);
	// }

}


