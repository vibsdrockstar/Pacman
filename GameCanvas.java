import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;


public final class GameCanvas extends JComponent{
	private static final Dimension PREFERRED_SIZE=new Dimension(500,400);
	private static final int PACMAN_RADIUS=25;
	private int pacmanX;
	private int pacmanY;
	
	public GameCanvas(){
		pacmanX=200;
		pacmanY=200;
		//register listeners
		addMouseListener(new MouseAdapter(){
			public void mousePressed(final MouseEvent ev){
				System.out.println("pressed-"+Thread.currentThread());
				
			}
			});
			addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseMoved(final MouseEvent ev){
				System.out.println("moved-"+Thread.currentThread());
				pacmanX=ev.getX();
				pacmanY=ev.getY();
				repaint();
			}
			public void mouseDragged(final MouseEvent ev){
				System.out.println("dragged-"+Thread.currentThread());
			}
			});	
		}
	
	
	public Dimension getPreferredSize() {
		System.out.println("getPreferredSize -"+Thread.currentThread());
		return  PREFERRED_SIZE;
	}
	public void paintComponent(final Graphics g){
		System.out.println("paintComponent -"+Thread.currentThread());
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(),getHeight());
		g.setColor(Color.GREEN);
	g.drawLine(0,0,getWidth(),getHeight());
	g.setColor(Color.BLUE);
	g.fillArc(pacmanX-PACMAN_RADIUS, pacmanY-PACMAN_RADIUS,2*PACMAN_RADIUS, 2*PACMAN_RADIUS, 20, 320);
	
	}

}
