import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class RiskBoard {

	int[] Office = {500,500,520,500,500,520,520,520,500,540,520,540};
	int[] Bbuilding = {400,500,420,500,400,520,420,520,400,540,420,540};
	int[] Cbuilding = {300,500,320,500,300,520,320,520,300,540,320,540};
	int[] Dbuilding = {200,500,220,500,200,520,220,50,540,220,540};
	int[] Ebuilding = {150,450,170,450,150,470,170,470,150,490,170,490};
	int[] Fbuilding = {100,350,120,350,140,350,100,370,120,370,140,370};
	int[] Gbuilding = {100,300,120,300,140,300,100,320,120,320,140,320};
	int[] Hbuilding = {200,200,20,200,220,220,20,240,220,240};
	int[] Ibuilding = {250,125,270,125,290,125,250,145,270,145,290,145};
	int[] Jbuilding = {300,200,30,300,220,320,220,300,240,320,240};
	int[] Lbuilding = {350,125,370,125,390,125,350,145,370,145,390,145};
	int[] Mbuilding = {400,200,40,400,220,420,220,400,240,420,240};
	int[] Qbuilding = {650,500,670,500,690,500,650,520,670,520,690,520};
	int[] Q1building = {740,450,760,450,740,470,760,470,740,490,760,490};
	int[] Pbuilding = {650,200,670,200,650,220,670,220,650,240,670,240};
	
	ArrayList<Classroom> off;
	ArrayList<Classroom> B;
	ArrayList<Classroom> C;
	ArrayList<Classroom> D;
	ArrayList<Classroom> E;
	ArrayList<Classroom> F;
	ArrayList<Classroom> G;
	ArrayList<Classroom> H;
	ArrayList<Classroom> I;
	ArrayList<Classroom> J;
	ArrayList<Classroom> L;
	ArrayList<Classroom> M;
	ArrayList<Classroom> Q;
	ArrayList<Classroom> Q1;
	ArrayList<Classroom> P;
	ArrayList<Classroom> MPC;
	ArrayList<Classroom> PLGM;
	GraphicsPanel graph;
	
	
	
	
	public RiskBoard(GraphicsPanel graphicsPanel) {
		graph = graphicsPanel;
	    ArrayList<Classroom> Q= new ArrayList<Classroom>();
        ArrayList<Classroom> SLTH= new ArrayList<Classroom>();
        ArrayList<Classroom> B= new ArrayList<Classroom>();
        ArrayList<Classroom> C= new ArrayList<Classroom>();
        ArrayList<Classroom> D= new ArrayList<Classroom>();
        ArrayList<Classroom> E= new ArrayList<Classroom>();
        ArrayList<Classroom> F= new ArrayList<Classroom>();
        ArrayList<Classroom> G= new ArrayList<Classroom>();
        ArrayList<Classroom> H= new ArrayList<Classroom>();
        ArrayList<Classroom> I= new ArrayList<Classroom>();
        ArrayList<Classroom> J= new ArrayList<Classroom>();
        ArrayList<Classroom> K= new ArrayList<Classroom>();
        ArrayList<Classroom> L= new ArrayList<Classroom>();
        ArrayList<Classroom> M= new ArrayList<Classroom>();
        ArrayList<Classroom> P= new ArrayList<Classroom>();
        ArrayList<Classroom> off= new ArrayList<Classroom>();
        ArrayList<Classroom> MPC= new ArrayList<Classroom>();
        ArrayList<Classroom> PLGM= new ArrayList<Classroom>();
        ArrayList<Classroom>BND= new ArrayList<Classroom>();
        
                Q.add(new Classroom(2,548,512,"Q1","NT"));
                Q.add(new Classroom(2,549,537,"Q2","NT"));
                Q.add(new Classroom(2,574,511,"Q3","NT"));
                Q.add(new Classroom(2,575,543,"Q4","NT"));
                Q.add(new Classroom(2,599,512,"Q5","NT"));
                Q.add(new Classroom(2,598,541,"Q6","NT"));
                Q.add(new Classroom(2,648,545,"Q7","NT"));
                Q.add(new Classroom(2,671,526,"Q8","NT"));
                Q.add(new Classroom(2,671,486,"Q9","NT"));
                Q.add(new Classroom(2,691,506,"Q10","NT"));
                Q.add(new Classroom(2,692,465,"Q11","NT"));
                Q.add(new Classroom(2,713,485,"Q12","NT"));
                SLTH.add(new Classroom(2,451,392,"SLGM","NT"));
                SLTH.add(new Classroom(2,433,487,"THTR","NT"));
                off.add(new Classroom(2,336,458,"OFFC","NT"));
                B.add(new Classroom(2,264,537,"B1","NT"));
                B.add(new Classroom(2,263,516,"B2","NT"));
                B.add(new Classroom(2,262,498,"B3","NT"));
                B.add(new Classroom(2,264,459,"B4","NT"));
                B.add(new Classroom(2,263,440,"B5","NT"));
                B.add(new Classroom(2,262,422,"B6","NT"));
                B.add(new Classroom(2,263,403,"B7","NT"));
                B.add(new Classroom(2,262,384,"B8","NT"));
                C.add(new Classroom(2,197,535,"C1","NT"));
                C.add(new Classroom(2,196,518,"C2","NT"));
                C.add(new Classroom(2,196,497,"C3","NT"));
                C.add(new Classroom(2,197,449,"C4","NT"));
                C.add(new Classroom(2,197,415,"C5","NT"));
                C.add(new Classroom(2,197,388,"C6","NT"));
                D.add(new Classroom(2,150,389,"D1","NT"));
                D.add(new Classroom(2,150,417,"D2","NT"));
                D.add(new Classroom(2,150,448,"D3","NT"));
                D.add(new Classroom(2,127,447,"D4","NT"));
                D.add(new Classroom(2,128,419,"D5","NT"));
                D.add(new Classroom(2,127,388,"D6","NT"));
                D.add(new Classroom(2,149,490,"D7","NT"));
                D.add(new Classroom(2,129,490,"D8","NT"));
                D.add(new Classroom(2,127,517,"D9","NT"));
                E.add(new Classroom(2,87,404,"E1","NT"));
                E.add(new Classroom(2,88,462,"E2","NT"));
                E.add(new Classroom(2,61,457,"E3","NT"));
                E.add(new Classroom(2,61,414,"E4","NT"));
                E.add(new Classroom(2,87,381,"E5","NT"));
                MPC.add(new Classroom(2,42,289,"MP","NT"));
                MPC.add(new Classroom(2,116,288,"CONC","NT"));
                G.add(new Classroom(2,73,217,"G1","NT"));
                G.add(new Classroom(2,48,246,"G2","NT"));
                G.add(new Classroom(2,21,246,"G3","NT"));
                G.add(new Classroom(2,23,227,"G4","NT"));
                G.add(new Classroom(2,47,216,"G5","NT"));
                H.add(new Classroom(2,244,236,"H1","NT"));
                H.add(new Classroom(2,219,222,"H2","NT"));
                H.add(new Classroom(2,194,222,"H3","NT"));
                H.add(new Classroom(2,160,214,"H4","NT"));
                H.add(new Classroom(2,244,215,"H5","NT"));
                H.add(new Classroom(2,220,202,"H6","NT"));
                H.add(new Classroom(2,196,201,"H7","NT"));
                H.add(new Classroom(2,160,186,"H8","NT"));
                H.add(new Classroom(2,160,158,"H9","NT"));
                H.add(new Classroom(2,195,175,"H10","NT"));
                H.add(new Classroom(2,219,180,"H11","NT"));
                H.add(new Classroom(2,246,180,"H12","NT"));
                I.add(new Classroom(2,294,139,"I1","NT"));
                I.add(new Classroom(2,274,140,"I2","NT"));
                I.add(new Classroom(2,254,140,"I3","NT"));
                I.add(new Classroom(2,235,140,"I4","NT"));
                I.add(new Classroom(2,208,140,"I5","NT"));
                I.add(new Classroom(2,208,126,"I6","NT"));
                I.add(new Classroom(2,227,125,"I7","NT"));
                I.add(new Classroom(2,249,126,"I8","NT"));
                I.add(new Classroom(2,268,126,"I9","NT"));
                I.add(new Classroom(2,288,126,"I10","NT"));
                J.add(new Classroom(2,304,180,"J1","NT"));
                J.add(new Classroom(2,327,179,"J2","NT"));
                J.add(new Classroom(2,348,179,"J3","NT"));
                J.add(new Classroom(2,371,180,"J4","NT"));
                J.add(new Classroom(2,370,206,"J5","NT"));
                J.add(new Classroom(2,371,233,"J6","NT"));
                J.add(new Classroom(2,370,255,"J7","NT"));
                J.add(new Classroom(2,370,278,"J8","NT"));
                L.add(new Classroom(2,405,144,"L1","NT"));
                L.add(new Classroom(2,374,145,"L2","NT"));
                L.add(new Classroom(2,344,144,"L3","NT"));
                L.add(new Classroom(2,344,127,"L4","NT"));
                L.add(new Classroom(2,374,127,"L5","NT"));
                L.add(new Classroom(2,406,129,"L6","NT"));
                M.add(new Classroom(2,472,210,"M1","NT"));
                M.add(new Classroom(2,446,210,"M2","NT"));
                M.add(new Classroom(2,424,210,"M3","NT"));
                M.add(new Classroom(2,410,222,"M4","NT"));
                M.add(new Classroom(2,410,200,"M5","NT"));
                M.add(new Classroom(2,411,179,"M6","NT"));
                M.add(new Classroom(2,426,179,"M7","NT"));
                M.add(new Classroom(2,446,176,"M8","NT"));
                M.add(new Classroom(2,472,180,"M9","NT"));
                BND.add(new Classroom(2,448,126,"CHR","NT"));
                BND.add(new Classroom(2,493,127,"BND","NT"));
                P.add(new Classroom(2,656,156,"P1","NT"));
                P.add(new Classroom(2,631,156,"P2","NT"));
                P.add(new Classroom(2,606,156,"P3","NT"));
                P.add(new Classroom(2,581,156,"P4","NT"));
                P.add(new Classroom(2,557,156,"P5","NT"));
                P.add(new Classroom(2,556,123,"P6","NT"));
                P.add(new Classroom(2,581,123,"P7","NT"));
                P.add(new Classroom(2,606,123,"P8","NT"));
                PLGM.add(new Classroom(2,557,189,"LGM","NT"));
                PLGM.add(new Classroom(2,531,287,"POOL","NT"));
                
                
	}
	
	

	public void draw(Graphics g){
//		int y = 1;
//		for(int i = 0; i<off.size();i++){
//			
//		}
		//y=1;
		for(int x = 0; x<B.size();x++){
			B.get(x).drawB(g);
		}
//		}
//		y=1;
//		for(int x = 0; x<C.size();x++){
//			C.get(x).drawClassroom(g, Cbuilding[x], Cbuilding[x+1]);
//			g.drawString("C"+y,Cbuilding[x], Cbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<D.size();x++){
//			D.get(x).drawClassroom(g, Dbuilding[x], Dbuilding[x+1]);
//			g.drawString("D"+y,Dbuilding[x], Dbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<E.size();x++){
//			E.get(x).drawClassroom(g, Ebuilding[x], Ebuilding[x+1]);
//			g.drawString("E"+y,Ebuilding[x], Ebuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<F.size();x++){
//			F.get(x).drawClassroom(g, Fbuilding[x], Fbuilding[x+1]);
//			g.drawString("F"+y,Fbuilding[x], Fbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<G.size();x++){
//			G.get(x).drawClassroom(g, Gbuilding[x], Gbuilding[x+1]);
//			g.drawString("G"+y,Gbuilding[x], Gbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<H.size();x++){
//			H.get(x).drawClassroom(g, Hbuilding[x], Hbuilding[x+1]);
//			g.drawString("H"+y,Hbuilding[x], Hbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<I.size();x++){
//			I.get(x).drawClassroom(g, Ibuilding[x], Ibuilding[x+1]);
//			g.drawString("I"+y,Ibuilding[x], Ibuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<J.size();x++){
//			J.get(x).drawClassroom(g, Jbuilding[x], Jbuilding[x+1]);
//			g.drawString("J"+y,Jbuilding[x], Jbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<L.size();x++){
//			L.get(x).drawClassroom(g, Lbuilding[x], Lbuilding[x+1]);
//			g.drawString("L"+y,Lbuilding[x], Lbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<M.size();x++){
//			M.get(x).drawClassroom(g, Mbuilding[x], Mbuilding[x+1]);
//			g.drawString("M"+y,Mbuilding[x], Mbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<Q.size();x++){
//			Q.get(x).drawClassroom(g, Qbuilding[x], Qbuilding[x+1]);
//			g.drawString("Q"+y,Qbuilding[x], Qbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<Q1.size();x++){
//			Q1.get(x).drawClassroom(g, Q1building[x], Q1building[x+1]);
//			g.drawString("Q"+y,Qbuilding[x], Qbuilding[x+1]+20);
//			y++;
//			x++;
//		}
//		y=1;
//		for(int x = 0; x<P.size();x++){
//			P.get(x).drawClassroom(g, Pbuilding[x], Pbuilding[x+1]);
//			g.drawString("P"+y,Pbuilding[x], Pbuilding[x+1]+20);
//			y++;
//			x++;
//		}
	}
	
	public void Clickloc(Graphics g, int tX, int tY) {
		if(graph.isPressed() == true){
			for(int x = 0; x<off.size()-1;x++){
				if(graph.getmouseX() <=Office[x]+20 && graph.getmouseX() >=Office[x] 
						&& graph.getmouseY() >= Office[x+1] &&graph.getmouseY() <= Office[x+1]+20){
					off.get(x).click(g, Office[x], Office[x+1]);
					System.out.println("Office Building");
					x++;
				}

			}
			for(int x = 0; x<B.size()-1;x++){
				if(graph.getmouseX() <=Bbuilding[x]+20 && graph.getmouseX() >=Bbuilding[x] 
						&& graph.getmouseY() >= Bbuilding[x+1] &&graph.getmouseY() <= Bbuilding[x+1]+20){
					B.get(x).click(g, Bbuilding[x], Bbuilding[x+1]);
					System.out.println("B Building");

					x++;
				}

			}
			for(int x = 0; x<C.size()-1;x+=2){
				if(graph.getmouseX() <=Cbuilding[x]+20 && graph.getmouseX() >=Cbuilding[x] 
						&& graph.getmouseY() >= Cbuilding[x+1] &&graph.getmouseY() <= Cbuilding[x+1]+20){
					C.get(x).click(g, Cbuilding[x], Cbuilding[x+1]);
					System.out.println("C Building");
					x++;
				}

			}
			for(int x = 0; x<D.size()-1;x++){
				if(graph.getmouseX() <=Dbuilding[x]+20 && graph.getmouseX() >=Dbuilding[x] 
						&& graph.getmouseY() >= Dbuilding[x+1] &&graph.getmouseY() <= Dbuilding[x+1]+20){
					D.get(x).click(g, Dbuilding[x], Dbuilding[x+1]);
					System.out.println("D Building");
					x++;
				}

			}
			for(int x = 0; x<E.size()-1;x++){
				if(graph.getmouseX() <=Ebuilding[x]+20 && graph.getmouseX() >=Ebuilding[x] 
						&& graph.getmouseY() >= Ebuilding[x+1] &&graph.getmouseY() <= Ebuilding[x+1]+20){
					E.get(x).click(g, Ebuilding[x], Ebuilding[x+1]);
					System.out.println("E Building");
					x++;
				}

			}
			for(int x = 0; x<F.size()-1;x++){
				if(graph.getmouseX() <=Fbuilding[x]+20 && graph.getmouseX() >=Fbuilding[x] 
						&& graph.getmouseY() >= Fbuilding[x+1] &&graph.getmouseY() <= Fbuilding[x+1]+20){
					F.get(x).click(g, Fbuilding[x], Fbuilding[x+1]);
					System.out.println("F Building");
					x++;
				}

			}
			for(int x = 0; x<G.size()-1;x++){
				if(graph.getmouseX() <=Gbuilding[x]+20 && graph.getmouseX() >=Gbuilding[x] 
						&& graph.getmouseY() >= Gbuilding[x+1] &&graph.getmouseY() <= Gbuilding[x+1]+20){
					G.get(x).click(g, Gbuilding[x], Gbuilding[x+1]);
					System.out.println("G Building");
					x++;
				}

			}
			for(int x = 0; x<H.size()-1;x++){
				if(graph.getmouseX() <=Hbuilding[x]+20 && graph.getmouseX() >=Hbuilding[x] 
						&& graph.getmouseY() >= Hbuilding[x+1] &&graph.getmouseY() <= Hbuilding[x+1]+20){
					H.get(x).click(g, Hbuilding[x], Hbuilding[x+1]);
					System.out.println("H Building");
					x++;
				}

			}
			for(int x = 0; x<I.size()-1;x++){
				if(graph.getmouseX() <=Ibuilding[x]+20 && graph.getmouseX() >=Ibuilding[x] 
						&& graph.getmouseY() >= Ibuilding[x+1] &&graph.getmouseY() <= Ibuilding[x+1]+20){
					I.get(x).click(g, Ibuilding[x], Ibuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<J.size()-1;x++){
				if(graph.getmouseX() <=Jbuilding[x]+20 && graph.getmouseX() >=Jbuilding[x] 
						&& graph.getmouseY() >= Jbuilding[x+1] &&graph.getmouseY() <= Jbuilding[x+1]+20){
					J.get(x).click(g, Jbuilding[x], Jbuilding[x+1]);
					System.out.println("J Building");
					x++;
				}

			}
			for(int x = 0; x<L.size()-1;x++){
				if(graph.getmouseX() <=Lbuilding[x]+20 && graph.getmouseX() >=Lbuilding[x] 
						&& graph.getmouseY() >= Lbuilding[x+1] &&graph.getmouseY() <= Lbuilding[x+1]+20){
					L.get(x).click(g, Lbuilding[x], Lbuilding[x+1]);
					System.out.println("L Building");
					x++;
				}

			}
			for(int x = 0; x<M.size()-1;x++){
				if(graph.getmouseX() <=Mbuilding[x]+20 && graph.getmouseX() >=Mbuilding[x] 
						&& graph.getmouseY() >= Mbuilding[x+1] &&graph.getmouseY() <= Mbuilding[x+1]+20){
					M.get(x).click(g, Mbuilding[x], Mbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<Q.size()-1;x++){
				if(graph.getmouseX() <=Qbuilding[x]+20 && graph.getmouseX() >=Qbuilding[x] 
						&& graph.getmouseY() >= Qbuilding[x+1] &&graph.getmouseY() <= Qbuilding[x+1]+20){
					Q.get(x).click(g, Qbuilding[x], Qbuilding[x+1]);
					x++;
				}

			}
			for(int x = 0; x<Q1.size()-1;x++){
				if(graph.getmouseX() <=Q1building[x]+20 && graph.getmouseX() >=Q1building[x] 
						&& graph.getmouseY() >= Q1building[x+1] &&graph.getmouseY() <= Q1building[x+1]+20){
					Q1.get(x).click(g, Q1building[x], Q1building[x+1]);
					x++;
				}

			}
			for(int x = 0; x<P.size()-1;x++){
				if(graph.getmouseX() <=Pbuilding[x]+20 && graph.getmouseX() >=Pbuilding[x] 
						&& graph.getmouseY() >= Pbuilding[x+1] &&graph.getmouseY() <= Pbuilding[x+1]+20){
					P.get(x).click(g, Pbuilding[x], Pbuilding[x+1]);
					x++;
				}

			}
			
		}
	}

	

}